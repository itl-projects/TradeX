package com.example.tradex;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MobileAuthentication extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mobile_authentication);
    }
    public void ContinueMobile(View view) {
        Intent intent=new Intent(MobileAuthentication.this,Home.class);
        startActivity(intent);
        finish();
    }
}
