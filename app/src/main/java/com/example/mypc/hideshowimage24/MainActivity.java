package com.example.mypc.hideshowimage24;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button mButtonOne;
    private Button mButtonTwo;
    private TextView txtview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mButtonOne = (Button) findViewById(R.id.btnHide);
        mButtonOne.setOnClickListener(this);

        mButtonTwo = (Button) findViewById(R.id.btnShow);
        mButtonTwo.setOnClickListener(this);

        txtview = (TextView) findViewById(R.id.imgcnt);
    }

    @Override
    public void onClick(View v) {
        txtview.setVisibility((txtview.getVisibility() == View.VISIBLE)
                ? View.GONE : View.VISIBLE);
        mButtonOne.setVisibility((mButtonOne.getVisibility() == View.VISIBLE)
                ? View.GONE : View.VISIBLE);

        mButtonTwo.setVisibility((mButtonOne.getVisibility() == View.VISIBLE)
                ? View.GONE : View.VISIBLE);


    }
}
