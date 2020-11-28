package com.example.ticwatche2;

import android.content.Intent;
import android.os.Bundle;
import android.support.wearable.activity.WearableActivity;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

public class P111 extends WearableActivity {

    private Button p111y;
    private Button p111n;
    private int hintCount;
    private int hintNumber;

    private int requestCode = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p111);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);

        Intent getIntent = getIntent();
        hintCount = (int) getIntent.getSerializableExtra("hintCount");

        p111y = findViewById(R.id.p111y);
        p111y.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), P121.class);
                intent.putExtra("hintCount", hintCount);
                startActivityForResult(intent, requestCode);
            }
        });

        p111n = findViewById(R.id.p111n);
        p111n.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), P112.class);
                intent.putExtra("hintCount", hintCount);
                startActivityForResult(intent, requestCode);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        hintCount = (int) data.getSerializableExtra("hintCount");
        Log.d("hintCount", String.valueOf(hintCount));
        hintNumber = (int) data.getSerializableExtra("hintNumber");
        Log.d("hintNumber", String.valueOf(hintNumber));

        Intent intent = new Intent();
        intent.putExtra("hintCount", hintCount);
        intent.putExtra("hintNumber", hintNumber);
        setResult(RESULT_OK, intent);
        finish();
    }
}