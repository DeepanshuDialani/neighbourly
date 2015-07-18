package valley.powai.com.neighbourly;

import android.app.Application;

import com.squareup.okhttp.OkHttpClient;

/**
 * Created by deepanshudialani on 18/07/15.
 */
public class MainApplication extends Application {

    private OkHttpClient client;

    private MainApplication() {
    }

    @Override
    public void onCreate() {
        super.onCreate();
        client = new OkHttpClient();
    }

    private static class InstanceHolder {
        private static final MainApplication instance = new MainApplication();
    }

    public static MainApplication getInstance() {
        return InstanceHolder.instance;
    }

    public OkHttpClient getNetworkClient() {
        return client;
    }
}
