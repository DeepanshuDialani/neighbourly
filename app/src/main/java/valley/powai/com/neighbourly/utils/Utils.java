package valley.powai.com.neighbourly.utils;

import android.os.AsyncTask;

/**
 * Created by deepanshudialani on 18/07/15.
 */
public class Utils {

    public static void startAsyncTask(AsyncTask asyncTask) {
        asyncTask.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR);
    }
}
