package valley.powai.com.neighbourly.login;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import valley.powai.com.neighbourly.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class LoginHomescreenFragment extends Fragment {


    public LoginHomescreenFragment() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_login_homescreen, container, false);
    }


}
