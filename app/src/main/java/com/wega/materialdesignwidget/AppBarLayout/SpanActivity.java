package com.wega.materialdesignwidget.AppBarLayout;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.wega.materialdesignwidget.R;


public class SpanActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_span);

        Toolbar mToolbar =   findViewById(R.id.toolbar);
        mToolbar.setTitle("Scroll|span");
        setSupportActionBar(mToolbar);


    }
}
