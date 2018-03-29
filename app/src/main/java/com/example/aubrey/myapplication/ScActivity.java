package com.example.aubrey.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import de.greenrobot.event.EventBus;

/**
 * Created by Aubrey on 2018/3/29.
 */

public class ScActivity extends AppCompatActivity implements View.OnClickListener {
    private Button but;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_m);
        but = (Button) findViewById(R.id.but);
        but.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        EventBus.getDefault().post(new MyEs("chuan'出嗲嗲十多个我啊扫地杆inin "));
        finish();

    }

}
