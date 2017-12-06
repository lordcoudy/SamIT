package com.lordcoudy.projectforsamsung;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;


public class Main extends Activity {





    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        Button random = findViewById(R.id.Random);
        Button clear = findViewById(R.id.clear);
        MyDraw myDraw = findViewById(R.id.myDraw1);
        random.setOnClickListener(myDraw);
        clear.setOnClickListener(myDraw);
    }
}