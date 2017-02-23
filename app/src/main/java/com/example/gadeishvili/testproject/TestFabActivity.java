
package com.example.gadeishvili.testproject;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputMethodManager;

import static android.content.ContentValues.TAG;


public class TestFabActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_fab);

//        hideKeyBoard();

        for (int i = 0; i < 10 ; i++) {
            Intent intent = new Intent(this, MyIntentService.class);
            intent.putExtra("a" , i);
            startService(intent);
        }
        Log.d(TAG , "onHandleIntent: " + "done");


    }


    public void hideKeyBoard() {
        View view = this.getCurrentFocus();
        if (view != null) {
            InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
            imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

}
