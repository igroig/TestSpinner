package com.example.gadeishvili.testproject;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class slideTextViewActivity extends AppCompatActivity {

    private TextView tvSLide;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slide_text_view);
        initView();
    }

    private void initView() {
        tvSLide = (TextView) findViewById(R.id.tvSLide);
    }


}
