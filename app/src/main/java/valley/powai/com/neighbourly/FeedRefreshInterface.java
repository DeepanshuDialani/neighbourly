package valley.powai.com.neighbourly;

import java.util.List;

import valley.powai.com.neighbourly.models.Issue;

/**
 * Created by deepanshudialani on 18/07/15.
 */
public interface FeedRefreshInterface {

    void fetchIssuesFeed();

    public void refreshFeed(List<Issue> issues);
}
