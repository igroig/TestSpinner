package com.example.gadeishvili.testproject.drag;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;

import com.example.gadeishvili.testproject.R;



public class DragActivity extends AppCompatActivity {

    private ImageView imageView;
    int height;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drag);
        initView();

        DisplayMetrics displaymetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displaymetrics);
        height = displaymetrics.heightPixels;
    }

    private void initView() {
        imageView = (ImageView) findViewById(R.id.imageView);
        imageView.setOnTouchListener(new View.OnTouchListener() {

            float dX, dY, aa, firstEventGetRawX;

            @Override
            public boolean onTouch(View view, MotionEvent event) {

                switch (event.getAction()) {

                    case MotionEvent.ACTION_DOWN:



                        firstEventGetRawX = event.getRawX();
                        view.getY();
                        view.getTop();

                        dX =  event.getRawX() -view.getX();

                        dY = event.getRawY() - view.getY() ;

                        break;

                    case MotionEvent.ACTION_MOVE:


                        if((event.getRawX()-firstEventGetRawX)>0){
                            ((ImageView)view).setImageResource(R.drawable.images);
                        }
                        else {
                            ((ImageView)view).setImageResource(R.drawable.example_appwidget_preview);

                        }

                        firstEventGetRawX = event.getRawX();

                            view.animate()
                                    .x(event.getRawX() - dX)
                                    .y(event.getRawY() - dY)
                                    .setDuration(0)
                                    .start();
                        break;

                    case MotionEvent.ACTION_UP:
//                        view.animate()
//                                .x(event.getRawX() - dX)
//                                .y(event.getRawY() - dY)
//                                .setDuration(300)
//                                .start();
                    break;
                    default:
                        return false;
                }
                return true;
            }

        });
    }
}

