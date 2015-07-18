package valley.powai.com.neighbourly.adapters;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.List;

import valley.powai.com.neighbourly.models.Issue;

/**
 * Created by deepanshudialani on 18/07/15.
 */
public class FeedAdapter extends BaseAdapter {

    private List<Issue> issues;

    public FeedAdapter(List<Issue> issues) {
        this.issues = issues;
    }

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return null;
    }
}
