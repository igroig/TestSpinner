package com.example.gadeishvili.testproject.animationsForNextScreen;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.gadeishvili.testproject.R;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
//        overridePendingTransition(R.anim.static_state, R.anim.scale_out_from_zero_up);

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.left_to_roght, R.anim.right_to_right);
    }

    public void goTo(View v){
        startActivity(new Intent(this, ThierdActivity.class));

    }
}
