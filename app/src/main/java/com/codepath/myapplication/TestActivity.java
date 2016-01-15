package com.codepath.myapplication;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.widget.Button;

/**
 * Created by mallikarao on 1/14/16.
 */
public class TestActivity extends Activity{

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Context context = getApplicationContext();
        setContentView(R.layout.activity_main);
        Button test_button = (Button) findViewById(R.id.btnAddItem);

    }

}
