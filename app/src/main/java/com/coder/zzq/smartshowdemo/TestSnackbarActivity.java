package com.coder.zzq.smartshowdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.coder.zzq.smartshow.snackbar.SmartSnackbar;


public class TestSnackbarActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_snackbar);
    }

    public void onNextPageClick(View view) {
        startActivity(new Intent(this, TestSnackbarActivity.class));
    }

    public void onIndefiniteClick(View view) {
        SmartSnackbar.get(this).showIndefinite("为该库Start一下好么", "好的",
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(TestSnackbarActivity.this, "Thank you", Toast.LENGTH_SHORT).show();
                    }
                });

    }

    public void onLongClick(View view) {
        SmartSnackbar.get(this).showLong("香蕉");
    }

    public void onShortClick(View view) {
        SmartSnackbar.get(this).show("苹果");
    }


}
