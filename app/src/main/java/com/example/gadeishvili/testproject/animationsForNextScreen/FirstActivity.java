package com.example.gadeishvili.testproject.animationsForNextScreen;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.DisplayMetrics;
import android.view.View;

import com.example.gadeishvili.testproject.R;

public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);




    }

    public void goTo(View view){
        DisplayMetrics displaymetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displaymetrics);
        int height = displaymetrics.heightPixels;

        startActivity(new Intent(this, SecondActivity.class));

        if (view.getY()<height/4) {
            overridePendingTransition(R.anim.scale_out_from_zero_up, R.anim.static_state);
        }
        else if (view.getY()>height*0.75){
            overridePendingTransition(R.anim.scale_out_from_zero_down, R.anim.static_state);
        }
        else {
            overridePendingTransition(R.anim.scale_out_from_zero, R.anim.static_state);
        }


    }
}
