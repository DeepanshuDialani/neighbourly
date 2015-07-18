package valley.powai.com.neighbourly.tasks;

import android.os.AsyncTask;
import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

import java.io.IOException;
import java.util.List;

import valley.powai.com.neighbourly.FeedRefreshInterface;
import valley.powai.com.neighbourly.MainApplication;
import valley.powai.com.neighbourly.models.Issue;
import valley.powai.com.neighbourly.packets.IssuesList;
import valley.powai.com.neighbourly.utils.Constants;

/**
 * Created by deepanshudialani on 18/07/15.
 */
public class FeedFetcherTask extends AsyncTask<Void, Void, List<Issue>> {

    private final String TAG = "FeedFetcherTask";

    private FeedRefreshInterface activity;

    public FeedFetcherTask(FeedRefreshInterface activity) {
        this.activity = activity;
    }

    @Override
    protected List<Issue> doInBackground(Void... params) {
        List<Issue> issues;

        OkHttpClient client = MainApplication.getInstance().getNetworkClient();
        Request request = new Request.Builder()
                .url(Constants.ISSUES_FETCH_URL)
                .build();

        Response response = null;
        try {
            response = client.newCall(request).execute();
            Gson gson = new Gson();
            IssuesList issuesList = gson.fromJson(response.body().toString(), IssuesList.class);
            return issuesList.getIssuesList();
        } catch (JsonSyntaxException je) {
            je.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    protected void onPostExecute(List<Issue> issues) {
        if (issues != null) {
            Log.d(TAG, "Response : " + issues);
            if (activity != null) {
                activity.refreshFeed(issues);
            } else {
                Log.d(TAG, "Activity was null");
            }
        } else {
            Log.d(TAG, "Response was null");
        }
        super.onPostExecute(issues);
    }
}
