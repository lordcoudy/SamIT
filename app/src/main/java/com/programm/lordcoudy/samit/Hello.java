package com.programm.lordcoudy.samit;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by lordcoudy on 04.12.2017.
 */

public class Hello extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hello);

    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.GotoMain){
            Intent GoTo = new Intent(this, MainActivity.class);
            startActivity(GoTo);
        }
    }
}
