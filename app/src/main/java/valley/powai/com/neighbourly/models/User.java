package valley.powai.com.neighbourly.models;

/**
 * Created by deepanshudialani on 18/07/15.
 */
public class User {

    private String username;

    private String imageUrl;

    public User(String username) {
        this.username = username;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getUsername() {
        return username;
    }
}
