package valley.powai.com.neighbourly;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import valley.powai.com.neighbourly.adapters.FeedAdapter;
import valley.powai.com.neighbourly.models.Issue;
import valley.powai.com.neighbourly.tasks.FeedFetcherTask;
import valley.powai.com.neighbourly.utils.Utils;


public class FeedActivity extends ActionBarActivity implements FeedRefreshInterface{

    private List<Issue> issues = new ArrayList<Issue>();

    private FeedAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feed);

        fetchIssuesFeed();

        ListView listView = (ListView) findViewById(R.id.feed_list);

        adapter = new FeedAdapter(issues);
        listView.setAdapter(adapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_feed, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void fetchIssuesFeed() {
        FeedFetcherTask task = new FeedFetcherTask(this);
        Utils.startAsyncTask(task);
    }

    @Override
    public void refreshFeed(List<Issue> issues) {
        this.issues = issues;
        adapter.notifyDataSetChanged();
    }
}
