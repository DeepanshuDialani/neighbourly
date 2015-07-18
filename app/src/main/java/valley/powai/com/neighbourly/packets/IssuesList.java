package valley.powai.com.neighbourly.packets;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import valley.powai.com.neighbourly.models.Issue;

/**
 * Created by deepanshudialani on 18/07/15.
 */
public class IssuesList {

    @SerializedName("issues")
    private List<Issue> issues;

    public List<Issue> getIssuesList() {
        return issues;
    }
}
