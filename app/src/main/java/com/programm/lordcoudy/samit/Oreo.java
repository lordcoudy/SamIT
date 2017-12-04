package com.programm.lordcoudy.samit;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.view.MotionEvent;

/**
 * Created by lordcoudy on 04.12.2017.
 */

public class Oreo extends Fly implements Touchable, Drawable {

    float x, y, vx, vy,sx, sy = 0.2f;
    Bitmap pic;

    Oreo(Bitmap pic) {
        this.x = (float) (Math.random() * 700);
        this.y = (float) (Math.random() * 700);
        this.vx = (float) (Math.random() * 11) - 5;
        this.vy = (float) (Math.random() * 11) - 5;
        this.pic = pic;
    }

    @Override
    void fly() {
        this.x += this.vx;
        this.y += this.vy;
    }

    Paint paint = new Paint();
    Matrix matrix = new Matrix();

    @Override
    public void draw(Canvas canvas) {
        matrix.setScale(sx, sy);
        matrix.postTranslate(x, y);
        paint.setAlpha(255);
        canvas.drawBitmap(pic, matrix, paint);
    }

    @Override
    public void onTouch(MotionEvent event) {
        this.sx += 0.01f;
        this.sy += 0.01f;
    }
}