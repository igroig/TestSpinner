package com.example.gadeishvili.testproject.drag;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.RelativeLayout;

import com.example.gadeishvili.testproject.R;

public class GioMenuActivity extends AppCompatActivity {

    private RelativeLayout rlRoot;
    private RelativeLayout rlAbove;


    private boolean goLeft = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gio_menu);

        initView();
    }

    private void initView() {
        rlRoot = (RelativeLayout) findViewById(R.id.rlRoot);

        rlAbove = (RelativeLayout) findViewById(R.id.rlAbove);
        rlAbove.setOnTouchListener(new View.OnTouchListener() {

            float oldX;

            @Override
            public boolean onTouch(View view, MotionEvent event) {

                switch (event.getAction()){

                    case MotionEvent.ACTION_DOWN:
                        oldX = event.getRawX();
                        break;

                    case MotionEvent.ACTION_UP :
                            if(event.getRawX()<oldX && goLeft)
                            {
                                slideLeft(view);
                                oldX = event.getRawX();
                            } else if(event.getRawX()>oldX && !goLeft) {
                                slideRight(view);
                                oldX = event.getRawX();

                            }
                        break;

                }

                return true;
            }
        });

    }

    public void bMenuClicked(View view){
        if(goLeft){
            slideLeft(rlAbove);
        }
        else {
            slideRight(rlAbove);
        }
    }


    private void slideLeft(View view) {
        view.animate().x(-600).y(100).setDuration(350);
        goLeft=false;
    }

    private void slideRight(View view) {
        view.animate().x(0).y(0).setDuration(350);
        goLeft=true;
    }

}
