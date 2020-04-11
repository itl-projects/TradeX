package com.example.tradex;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class TradeXLoginPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trade_x_login_page);
    }

    public void signUpButton(View view) {
        Intent intent=new Intent(TradeXLoginPage.this,Home.class);
        startActivity(intent);
        finish();
    }

    public void loginButton(View view) {
        Intent intent=new Intent(TradeXLoginPage.this,Home.class);
        startActivity(intent);
        finish();
    }

    public void facebook(View view) {
        Intent intent=new Intent(TradeXLoginPage.this,Home.class);
        startActivity(intent);
        finish();
    }

    public void google(View view) {
        Intent intent=new Intent(TradeXLoginPage.this,Home.class);
        startActivity(intent);
        finish();
    }
}
