package com.lordcoudy.projectforsamsung;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Greeting extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.greeting);

    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.GotoMain){
            Intent GoTo = new Intent(this, Main.class);
            startActivity(GoTo);
        }
    }
}
