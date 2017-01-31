package com.heni.admin.flavorsdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class SplashActivity extends AppCompatActivity implements View.OnClickListener {

    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        button=(Button)findViewById(R.id.button1);
        button.setOnClickListener(this);
        button.setText(R.string.app_name);
    }

    @Override
    public void onClick(View v) {
        Intent intent=new Intent(this,HomeActivity.class);
        startActivity(intent);
    }


}
