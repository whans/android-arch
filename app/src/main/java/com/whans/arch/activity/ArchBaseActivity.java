package com.whans.arch.activity;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * @author whans
 * @date 11/27/15
 */
public class ArchBaseActivity extends AppCompatActivity {
    protected Context appContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        appContext = getApplicationContext();

    }
}
