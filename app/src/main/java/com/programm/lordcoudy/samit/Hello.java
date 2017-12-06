package com.programm.lordcoudy.samit;

        import android.app.Activity;
        import android.content.Intent;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;

/**
 * Created by lordcoudy on 04.12.2017.
 */

public class Hello extends Activity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hello);
        Button play = (Button) findViewById(R.id.play);
        play.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent_hello = new Intent(this, Hello.class);
        startActivity(intent_hello);
    }
}

