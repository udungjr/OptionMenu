package com.example.jowyblight.optionmenu;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by JowyBlight on 12/3/2017.
 */

public class HelpActivity extends Activity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TextView textView = new TextView(this);
        textView.setText("Help Layout");
        setContentView(textView);
    }
}
