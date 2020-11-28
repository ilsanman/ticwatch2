package com.example.ticwatche2;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.wearable.activity.WearableActivity;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends WearableActivity {

    private TextView timerTextView;
    private TextView hintEditText;
    private TextView hintCountTextView;

    private long countDownTime;
    CountDownTimer countDownTimer;

    private String roomCode = "1401";
    private String managerCode = "1402";
    private String p1Code = "8886";
    private String p2Code = "6259";
    private String p3Code = "8094";
    private String p4Code = "7632";
    private String p5Code = "6342";

    private int requestEnter = 0;
    private int requestAuto = 1;

    private int hintCount;
    private int hintNumber;
    private ArrayList hintArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);

        Intent getIntent = getIntent();
        countDownTime = (long) getIntent.getSerializableExtra("countDownTime");
        hintCount = (int) getIntent.getSerializableExtra("hintCount");
        hintNumber = (int) getIntent.getSerializableExtra("hintNumber");
        hintArrayList = (ArrayList) getIntent.getSerializableExtra("hintArrayList");

        Log.d("logMainCountDownTime", String.valueOf(countDownTime));
        Log.d("logMainHintNumber", String.valueOf(hintNumber));

        timerTextView = findViewById(R.id.timerTextView);
        countDownTimer(countDownTime);

        hintEditText = findViewById(R.id.hintEditText);
        hintEditText.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                if(keyCode == event.KEYCODE_ENTER) {
                    if (hintEditText.getText().toString().equals(roomCode)) {
                        Intent intent = new Intent(getApplicationContext(), RoomCode.class);
                        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                        startActivity(intent);
                        finish();
                    } else if (hintEditText.getText().toString().equals(p1Code)) {
                        Intent intent;
                        switch (hintNumber) {
                            case 11:
                                intent = new Intent(getApplicationContext(), P121.class);
                                intent.putExtra("countDownTime", countDownTime);
                                intent.putExtra("hintCount", hintCount);
                                intent.putExtra("hintArrayList", hintArrayList);
                                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                                startActivity(intent);
                                finish();
                                break;
                            case 12:
                                intent = new Intent(getApplicationContext(), P131.class);
                                intent.putExtra("countDownTime", countDownTime);
                                intent.putExtra("hintCount", hintCount);
                                intent.putExtra("hintArrayList", hintArrayList);
                                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                                startActivity(intent);
                                finish();
                                break;
                            case 13:
                                intent = new Intent(getApplicationContext(), P141.class);
                                intent.putExtra("countDownTime", countDownTime);
                                intent.putExtra("hintCount", hintCount);
                                intent.putExtra("hintArrayList", hintArrayList);
                                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                                startActivity(intent);
                                finish();
                                break;
                            case 14:
                                intent = new Intent(getApplicationContext(), P151.class);
                                intent.putExtra("countDownTime", countDownTime);
                                intent.putExtra("hintCount", hintCount);
                                intent.putExtra("hintArrayList", hintArrayList);
                                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                                startActivity(intent);
                                finish();
                                break;
                            case 15:
                                intent = new Intent(getApplicationContext(), P111.class);
                                intent.putExtra("countDownTime", countDownTime);
                                intent.putExtra("hintCount", hintCount);
                                intent.putExtra("hintArrayList", hintArrayList);
                                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                                startActivity(intent);
                                finish();
                                break;
                            default:
                                intent = new Intent(getApplicationContext(), P111.class);
                                intent.putExtra("countDownTime", countDownTime);
                                intent.putExtra("hintCount", hintCount);
                                intent.putExtra("hintArrayList", hintArrayList);
                                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                                startActivity(intent);
                                finish();
                                break;
                        }
                    } else if(hintEditText.getText().toString().equals(p2Code)) {
                        Intent intent;
                        switch (hintNumber) {
                            case 21:
                                intent = new Intent(getApplicationContext(), P221.class);
                                intent.putExtra("countDownTime", countDownTime);
                                intent.putExtra("hintCount", hintCount);
                                intent.putExtra("hintArrayList", hintArrayList);
                                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                                startActivity(intent);
                                finish();
                                break;
                            case 22:
                                intent = new Intent(getApplicationContext(), P231.class);
                                intent.putExtra("countDownTime", countDownTime);
                                intent.putExtra("hintCount", hintCount);
                                intent.putExtra("hintArrayList", hintArrayList);
                                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                                startActivity(intent);
                                finish();
                                break;
                            case 23:
                                intent = new Intent(getApplicationContext(), P241.class);
                                intent.putExtra("countDownTime", countDownTime);
                                intent.putExtra("hintCount", hintCount);
                                intent.putExtra("hintArrayList", hintArrayList);
                                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                                startActivity(intent);
                                finish();
                                break;
                            case 24:
                                intent = new Intent(getApplicationContext(), P211.class);
                                intent.putExtra("countDownTime", countDownTime);
                                intent.putExtra("hintCount", hintCount);
                                intent.putExtra("hintArrayList", hintArrayList);
                                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                                startActivity(intent);
                                finish();
                                break;
                            default:
                                intent = new Intent(getApplicationContext(), P211.class);
                                intent.putExtra("countDownTime", countDownTime);
                                intent.putExtra("hintCount", hintCount);
                                intent.putExtra("hintArrayList", hintArrayList);
                                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                                startActivity(intent);
                                finish();
                                break;
                        }
                    } else if(hintEditText.getText().toString().equals(p3Code)) {
//                        Intent intent = new Intent(getApplicationContext(), P3.class);
//                        intent.putExtra("countDownTime", countDownTime);
//                        intent.putExtra("hintCount", hintCount);
//                        intent.putExtra("hintArrayList", hintArrayList);
//                        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
//                        startActivity(intent);
//                        finish();
                    } else if(hintEditText.getText().toString().equals(p4Code)) {
                        Intent intent;
                        switch (hintNumber) {
                            case 41:
                                intent = new Intent(getApplicationContext(), P421.class);
                                intent.putExtra("countDownTime", countDownTime);
                                intent.putExtra("hintCount", hintCount);
                                intent.putExtra("hintArrayList", hintArrayList);
                                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                                startActivity(intent);
                                finish();
                                break;
                            case 42:
                                intent = new Intent(getApplicationContext(), P431.class);
                                intent.putExtra("countDownTime", countDownTime);
                                intent.putExtra("hintCount", hintCount);
                                intent.putExtra("hintArrayList", hintArrayList);
                                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                                startActivity(intent);
                                finish();
                                break;
                            case 43:
                                intent = new Intent(getApplicationContext(), P441.class);
                                intent.putExtra("countDownTime", countDownTime);
                                intent.putExtra("hintCount", hintCount);
                                intent.putExtra("hintArrayList", hintArrayList);
                                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                                startActivity(intent);
                                finish();
                                break;
                            case 44:
                                intent = new Intent(getApplicationContext(), P451.class);
                                intent.putExtra("countDownTime", countDownTime);
                                intent.putExtra("hintCount", hintCount);
                                intent.putExtra("hintArrayList", hintArrayList);
                                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                                startActivity(intent);
                                finish();
                                break;
                            case 45:
                                intent = new Intent(getApplicationContext(), P411.class);
                                intent.putExtra("countDownTime", countDownTime);
                                intent.putExtra("hintCount", hintCount);
                                intent.putExtra("hintArrayList", hintArrayList);
                                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                                startActivity(intent);
                                finish();
                                break;
                            default:
                                intent = new Intent(getApplicationContext(), P411.class);
                                intent.putExtra("countDownTime", countDownTime);
                                intent.putExtra("hintCount", hintCount);
                                intent.putExtra("hintArrayList", hintArrayList);
                                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                                startActivity(intent);
                                finish();
                                break;
                        }
                    } else if(hintEditText.getText().toString().equals(p5Code)) {
//                        Intent intent = new Intent(getApplicationContext(), P5.class);
//                        intent.putExtra("countDownTime", countDownTime);
//                        intent.putExtra("hintCount", hintCount);
//                        intent.putExtra("hintArrayList", hintArrayList);
//                        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
//                        startActivity(intent);
//                        finish();
                    } else if(hintEditText.getText().toString().equals(managerCode)) {
                        Intent intent = new Intent(getApplicationContext(), TimeOver.class);
                        intent.putExtra("countDownTime", countDownTime);
                        intent.putExtra("hintCount", hintCount);
                        intent.putExtra("hintArrayList", hintArrayList);
                        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                        startActivity(intent);
                        finish();
                    } else {
                        return false;
                    }
                    return true;
                } else {
                    return false;
                }
            }
        });

        hintCountTextView = findViewById(R.id.hintCountTextView);
        hintCountTextView.setText("힌트 " + hintCount + "번");
    }

    public void countDownTimer(long millisInFuture) {
        countDownTimer= new CountDownTimer(millisInFuture, 1000) {
            public void onTick(long millisUntilFinished) {
                long getHour = millisUntilFinished / (60 * 60 * 1000) ;
                String hour = String.valueOf(getHour);
                long getMin = (millisUntilFinished - (getHour * 60 * 60 * 1000)) / (60 * 1000);
                String min = String.valueOf(getMin);
                long getSecond = (millisUntilFinished - (getHour * 60 * 60 * 1000) - (getMin * 60 * 1000)) / 1000;
                String second = String.valueOf(getSecond);

                if (hour.length() == 1) {
                    hour = "0" + hour;
                }
                if (min.length() == 1) {
                    min = "0" + min;
                }
                if (second.length() == 1) {
                    second = "0" + second;
                }

                countDownTime = millisUntilFinished;
                timerTextView.setText(hour + ":" + min + ":" + second);
            }

            public void onFinish() {
                Intent intent = new Intent(getApplicationContext(), TimeOver.class);
                intent.putExtra("countDownTime", countDownTime);
                intent.putExtra("hintCount", hintCount);
                intent.putExtra("hintArrayList", hintArrayList);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
                finish();
            }
        }.start();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
//        Log.d("logMain", "die");
    }
}