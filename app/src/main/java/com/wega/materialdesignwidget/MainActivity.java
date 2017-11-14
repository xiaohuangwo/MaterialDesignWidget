package com.wega.materialdesignwidget;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.btn_toolbar).setOnClickListener(this);
        findViewById(R.id.btn_NestedScrollView).setOnClickListener(this);
        findViewById(R.id.btn_TabLayout).setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent();
        switch (v.getId()){


            case R.id.btn_toolbar:
                intent.setClass(this,ToolbarActivity.class);

                break;

            case R.id.btn_NestedScrollView:
                intent.setClass(this,NestedScrollViewActivity.class);

                break;
            case R.id.btn_TabLayout:
                intent.setClass(this,TabLayoutActivity.class);

                break;
        }

        startActivity(intent);
    }
}
