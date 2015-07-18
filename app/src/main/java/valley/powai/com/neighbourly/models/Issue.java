package valley.powai.com.neighbourly.models;

/**
 * Created by deepanshudialani on 18/07/15.
 */
public class Issue {
    private String imageUrl;

    private User user;

    private String title;

    private String description;

    private String authority;

    private long upvoteCount;

    private long timestamp;

    private String location;

    public Issue(String imageUrl, User user, String title, String authority) {
        this.imageUrl = imageUrl;
        this.user = user;
        this.title = title;
        this.authority = authority;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setUpvoteCount(long upvoteCount) {
        this.upvoteCount = upvoteCount;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public long getUpvoteCount() {
        return upvoteCount;
    }

    public String getAuthority() {
        return authority;
    }

    public String getDescription() {
        return description;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getLocation() {
        return location;
    }

    public String getTitle() {
        return title;
    }

    public User getUser() {
        return user;
    }
}
