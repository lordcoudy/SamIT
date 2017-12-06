package com.programm.lordcoudy.samit;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent = this.getIntent();
        MyDraw myDraw = (MyDraw) findViewById(R.id.myDraw1);
        Button gugl = (Button) findViewById(R.id.gugl);
        Button appl = (Button) findViewById(R.id.appl);
        Button oreo = (Button) findViewById(R.id.oreo);
        Button clear = (Button) findViewById(R.id.clear);
        gugl.setOnClickListener(myDraw);
        appl.setOnClickListener(myDraw);
        oreo.setOnClickListener(myDraw);
        clear.setOnClickListener(myDraw);
    }
}