package com.example.gadeishvili.testproject.animationsForNextScreen;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.gadeishvili.testproject.R;

public class SixthActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sixth);

        overridePendingTransition(R.anim.down_to_up, R.anim.static_state);

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.static_state, R.anim.up_to_down);
    }

    public void goTo(View view) {
        startActivity(new Intent(this, SeventhActivity.class));
    }
}
