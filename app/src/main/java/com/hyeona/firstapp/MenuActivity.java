package com.hyeona.firstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    public void onBackButtonclicked(View view) {
        Toast.makeText(getApplicationContext(), "돌아가기 버튼이 눌림", Toast.LENGTH_LONG).show();
        finish();
    }
}
