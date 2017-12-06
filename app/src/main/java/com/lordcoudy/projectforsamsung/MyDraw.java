package com.lordcoudy.projectforsamsung;


import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;

public class MyDraw extends View implements View.OnClickListener{


    ArrayList objects = new ArrayList();


    protected MyDraw(Context context, AttributeSet attrs) {
        super(context, attrs);

        this.oreo1 = new OreoFly(BitmapFactory.decodeResource(getResources(), R.drawable.oreo));
        this.oreo2 = new OreoFly(BitmapFactory.decodeResource(getResources(), R.drawable.oreo));
        this.google1 = new GoogleFly(BitmapFactory.decodeResource(getResources(), R.drawable.google));
        this.google2 = new GoogleFly(BitmapFactory.decodeResource(getResources(), R.drawable.google));
        this.circle1 = new Circle();
        this.circle2 = new Circle();
        this.apple1 = new AppleFly(BitmapFactory.decodeResource(getResources(), R.drawable.apple));
        this.apple2 = new AppleFly(BitmapFactory.decodeResource(getResources(), R.drawable.apple));

        objects.add(oreo1);
        objects.add(oreo2);
        objects.add(circle1);
        objects.add(circle2);
        objects.add(apple1);
        objects.add(apple2);
        objects.add(google1);
        objects.add(google2);
    }

    OreoFly oreo1, oreo2, oreoN;
    Circle circle1, circle2, circleN;
    AppleFly apple1, apple2, appleN;
    GoogleFly google1 ,google2, googleN;


    @Override
    public boolean onTouchEvent(MotionEvent event) {
        for(Object thing : objects){
            if( thing instanceof Touchable)
                ((Touchable)thing).onTouch(event);
        }
        return super.onTouchEvent(event);
    }




    @Override

    protected void onDraw(final Canvas canvas) {


        for (Object thing : objects) {
            if (thing instanceof Drawable)
                ((Drawable) thing).draw(canvas);
        }

        for (Object thing : objects) { // For move using abstract class
            if (thing instanceof move)
                ((move) thing).move();
        }

        // Request for ReDraw screen
        invalidate();
    }




    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.Random) {
            random();
        } else if (v.getId() == R.id.clear) {
            clear();
        }
    }



    private void random(){      // using private type
        int object = (int)(Math.random()* 4);
        switch (object){
            case 0: this.circleN = new Circle();
            objects.add(circleN);
            break;
            case 1: this.oreoN = new OreoFly(BitmapFactory.decodeResource(getResources(), R.drawable.oreo));
            objects.add(oreoN);
            break;
            case 2: this.appleN = new AppleFly(BitmapFactory.decodeResource(getResources(), R.drawable.apple));
            objects.add(appleN);
            break;
            case 3:  this.googleN = new GoogleFly(BitmapFactory.decodeResource(getResources(), R.drawable.google));
            objects.add(googleN);
            break;
        }
    }

    private void clear(){ // using private type
        objects.clear();
    }
}

