package com.example.ticwatche2;

import android.content.Intent;
import android.os.Bundle;
import android.support.wearable.activity.WearableActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

public class P441 extends WearableActivity {

    private Button p441y;
    private Button p441n;
    private int hintCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p441);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);

        Intent getIntent = getIntent();
        hintCount = (int) getIntent.getSerializableExtra("hintCount");

        p441y = findViewById(R.id.p441y);
        p441y.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), P451.class);
                intent.putExtra("hintCount", hintCount);
                startActivity(intent);
                finish();
            }
        });

        p441n = findViewById(R.id.p441n);
        p441n.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), P442.class);
                intent.putExtra("hintCount", hintCount);
                startActivity(intent);
                finish();
            }
        });
    }
}