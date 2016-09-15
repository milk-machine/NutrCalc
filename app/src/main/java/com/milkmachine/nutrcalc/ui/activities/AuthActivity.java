package com.milkmachine.nutrcalc.ui.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import com.milkmachine.nutrcalc.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class AuthActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auth);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.login_button)
    public void signIn() {
        Intent goToMainActivity = new Intent(this,MainActivity.class);
        startActivity(goToMainActivity);
    }

}