package valley.powai.com.neighbourly.login;

import android.app.Activity;
import android.os.Bundle;

import valley.powai.com.neighbourly.R;

public class LoginActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        LoginHomescreenFragment loginHomescreenFragment = new LoginHomescreenFragment();
        getFragmentManager().beginTransaction()
                .add(R.id.main_frame_layout, loginHomescreenFragment).commit();
    }
}
