package com.example.ticwatche2;

import android.content.Intent;
import android.os.Bundle;
import android.support.wearable.activity.WearableActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

public class P222 extends WearableActivity {

    private Button p222o;
    private int hintCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p222);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);

        Intent getIntent = getIntent();
        hintCount = (int) getIntent.getSerializableExtra("hintCount");
        hintCount++;

        p222o = findViewById(R.id.p222o);
        p222o.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.putExtra("hintCount", hintCount);
                intent.putExtra("hintNumber", 22);
                setResult(RESULT_OK, intent);
                finish();
            }
        });
    }
}