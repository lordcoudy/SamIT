package com.lordcoudy.projectforsamsung;


import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.MotionEvent;

public class Circle extends move implements Drawable, Touchable{

    private float x, y,vx,vy, r = 20;

    private Paint paint = new Paint();

    Circle(){
        this.x = (float)(Math.random()*700);
        this.y = (float)(Math.random()*700);
        this.vx = (float)(Math.random()*11)-5;
        this.vy = (float)(Math.random()*11)-5;
    }

    public void draw(Canvas canvas) {
        canvas.drawCircle(x, y, r, paint);
        paint.setColor(Color.RED);
    }
    public void onTouch(MotionEvent event){
        this.r += 10;
    }

    public void move(){  // For move using abstract class
        this.x += this.vx;
        this.y += this.vy;
    }


}
