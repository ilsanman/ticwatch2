package com.example.ticwatche2;

import android.content.Intent;
import android.os.Bundle;
import android.support.wearable.activity.WearableActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

public class P412 extends WearableActivity {

    private Button p412o;
    private int hintCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p412);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);

        Intent getIntent = getIntent();
        hintCount = (int) getIntent.getSerializableExtra("hintCount");
        hintCount++;

        p412o = findViewById(R.id.p412o);
        p412o.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.putExtra("hintCount", hintCount);
                intent.putExtra("hintNumber", 41);
                setResult(RESULT_OK, intent);
                finish();
            }
        });
    }
}