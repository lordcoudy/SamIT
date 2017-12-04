package com.programm.lordcoudy.samit;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;

public class MyDraw extends View implements View.OnClickListener {


    ArrayList objects = new ArrayList();


    protected MyDraw(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.google1 = new Google(BitmapFactory.decodeResource(getResources(),R.mipmap.google));
        this.apple1 = new Apple(BitmapFactory.decodeResource(getResources(),R.mipmap.apple));
        this.oreo1 = new Oreo(BitmapFactory.decodeResource(getResources(),R.mipmap.oreo));

        objects.add(google1);
        objects.add(apple1);
        objects.add(oreo1);

    }

    Google google1, googleN;
    Apple apple1, appleN;
    Oreo oreo1, oreoN;

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        for(Object object : objects){
            if(object instanceof Touchable)
                ((Touchable)object).onTouch(event);
        }
        return super.onTouchEvent(event);
    }

    @Override
    protected void onDraw(final Canvas canvas) {


        for (Object object : objects) {
            if (object instanceof Drawable)
                ((Drawable) object).draw(canvas);
        }

        for (Object object : objects) {
            if (object instanceof Fly)
                ((Fly) object).fly();
        }



        invalidate();
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.gugl) {
            google();
        }else if (v.getId() == R.id.appl) {
            apple();
        } else if (v.getId() == R.id.oreo) {
            oreo();
        } else if (v.getId() == R.id.clear) {
            clear();
        }
    }



    private void google(){
        this.googleN = new Google(BitmapFactory.decodeResource(getResources(),R.mipmap.google));
        objects.add(googleN);
    }

    private void apple(){
        this.appleN = new Apple(BitmapFactory.decodeResource(getResources(),R.mipmap.apple));
        objects.add(appleN);
    }
    private void oreo(){
        this.oreoN = new Oreo(BitmapFactory.decodeResource(getResources(),R.mipmap.oreo));
        objects.add(oreoN);
    }
    private void clear(){ // using private type
        objects.clear();
    }
}

