package com.programm.lordcoudy.samit;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button gugl = (Button) findViewById(R.id.gugl);
        Button appl = (Button) findViewById(R.id.appl);
        Button oreo = (Button) findViewById(R.id.oreo);
        Button clear = (Button) findViewById(R.id.clear);
        MyDraw myDraw = (MyDraw) findViewById(R.id.myDraw1);
        gugl.setOnClickListener(myDraw);
        appl.setOnClickListener(myDraw);
        oreo.setOnClickListener(myDraw);
        clear.setOnClickListener(myDraw);
    }
}
