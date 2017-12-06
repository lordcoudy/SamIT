package com.lordcoudy.projectforsamsung;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.view.MotionEvent;



public class GoogleFly extends move implements Drawable, Touchable{

    private float x, y, vx, vy,sx = 0.2f,sy = 0.2f;
    private Bitmap pic;

    GoogleFly(Bitmap pic){
        this.x = (float)(Math.random()*700);
        this.y = (float)(Math.random()*700);
        this.vx = (float)(Math.random()*11)-5;
        this.vy = (float)(Math.random()*11)-5;
        this.pic = pic;
    }

    public void move(){  // For move using abstract class
        this.x += this.vx;
        this.y += this.vy;
    }

    private Paint paint = new Paint();
    private Matrix matrix = new Matrix();

    public void draw(Canvas canvas){
        matrix.setScale(sx, sy);
        matrix.postTranslate(x, y);
        paint.setAlpha(255);
        canvas.drawBitmap(pic, matrix, paint);
    }

    public void onTouch(MotionEvent event){
        this.sx += 0.01f;
        this.sy += 0.01f;
    }
}