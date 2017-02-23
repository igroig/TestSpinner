package com.example.gadeishvili.testproject.animationsForNextScreen;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import com.example.gadeishvili.testproject.R;

public class FifthActivity extends AppCompatActivity {

    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifth);
        initView();

        overridePendingTransition(R.anim.scale_out, R.anim.scale_in);

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.scale_out, R.anim.scale_in);

    }

    private void initView() {
    }

    public void goTo(View view){

        startActivity(new Intent(this, SixthActivity.class));
    }
}
