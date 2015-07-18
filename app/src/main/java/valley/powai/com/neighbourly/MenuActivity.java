package valley.powai.com.neighbourly;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import valley.powai.com.neighbourly.login.LoginActivity;


public class MenuActivity extends Activity implements View.OnClickListener {

    private Button homeButton;
    private Button loginButton;
    private Button feedButton;
    private Button detailButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        homeButton = (Button) findViewById(R.id.homescreen);
        loginButton = (Button) findViewById(R.id.login);
        feedButton = (Button) findViewById(R.id.feed);
        detailButton = (Button) findViewById(R.id.detail);

        homeButton.setOnClickListener(this);
        loginButton.setOnClickListener(this);
        feedButton.setOnClickListener(this);
        detailButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.homescreen) {

        } else if (view.getId() == R.id.login) {
            Intent intent = new Intent(this, LoginActivity.class);
            startActivity(intent);
        } else if (view.getId() == R.id.feed) {
            Intent intent = new Intent(this, FeedActivity.class);
            startActivity(intent);
        } else if (view.getId() == R.id.detail) {

        }
    }
}
