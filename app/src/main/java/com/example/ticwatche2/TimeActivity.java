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

public class TimeActivity extends WearableActivity {

    private TextView timerTextView;
    private TextView hintEditText;
    private TextView hintCountTextView;

    CountDownTimer countDownTimer;

    private String roomCode = "1401";
    private String p1Code = "8886";
    private String p2Code = "6259";
    private String p3Code = "8094";
    private String p4Code = "7632";
    private String p5Code = "6342";

    private int requestCode = 1;

    private int hintCount = 0;
    private int hintNumber;
    private ArrayList hintArrayList = new ArrayList();

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        hintCount = (int) data.getSerializableExtra("hintCount");
        hintNumber = (int) data.getSerializableExtra("hintNumber");
        Log.d("hintNumber2", String.valueOf(hintNumber));
        hintArrayList.add(hintNumber);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);

        timerTextView = (TextView) findViewById(R.id.timerTextView);
        countDownTimer();

        hintEditText = findViewById(R.id.hintEditText);
        hintEditText.setHint("room code");
        hintEditText.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                if(keyCode == event.KEYCODE_ENTER) {
                    if (hintEditText.getText().toString().equals(roomCode)) {
                        Intent intent = new Intent(getApplicationContext(), RoomCode.class);
                        startActivity(intent);
                        finish();
                        return true;
                    } else if (hintEditText.getText().toString().equals(p1Code)) {
                        if (hintNumber == 11) {
                            Intent intent = new Intent(getApplicationContext(), P121.class);
                            intent.putExtra("hintCount", hintCount);
                            startActivityForResult(intent, requestCode);
                            return true;
                        } else if (hintNumber == 12) {
                            Intent intent = new Intent(getApplicationContext(), P131.class);
                            intent.putExtra("hintCount", hintCount);
                            startActivityForResult(intent, requestCode);
                            return true;
                        } else if (hintNumber == 13) {
                            Intent intent = new Intent(getApplicationContext(), P141.class);
                            intent.putExtra("hintCount", hintCount);
                            startActivityForResult(intent, requestCode);
                            return true;
                        } else if (hintNumber == 14) {
                            Intent intent = new Intent(getApplicationContext(), P151.class);
                            intent.putExtra("hintCount", hintCount);
                            startActivityForResult(intent, requestCode);
                            return true;
                        } else if (hintNumber == 15) {
                            Intent intent = new Intent(getApplicationContext(), P111.class);
                            intent.putExtra("hintCount", hintCount);
                            startActivityForResult(intent, requestCode);
                            return true;
                        } else if (hintNumber == 10) {
                            Intent intent = new Intent(getApplicationContext(), P111.class);
                            intent.putExtra("hintCount", hintCount);
                            startActivityForResult(intent, requestCode);
                            return true;
                        } else {
                            Intent intent = new Intent(getApplicationContext(), P111.class);
                            intent.putExtra("hintCount", hintCount);
                            startActivityForResult(intent, requestCode);
                            return true;
                        }
                    } else if(hintEditText.getText().toString().equals(p2Code)) {
                        if (hintNumber == 21) {
                            Intent intent = new Intent(getApplicationContext(), P221.class);
                            intent.putExtra("hintCount", hintCount);
                            startActivityForResult(intent, requestCode);
                            return true;
                        } else if (hintNumber == 22) {
                            Intent intent = new Intent(getApplicationContext(), P231.class);
                            intent.putExtra("hintCount", hintCount);
                            startActivityForResult(intent, requestCode);
                            return true;
                        } else if (hintNumber == 23) {
                            Intent intent = new Intent(getApplicationContext(), P241.class);
                            intent.putExtra("hintCount", hintCount);
                            startActivityForResult(intent, requestCode);
                            return true;
                        } else if (hintNumber == 24) {
                            Intent intent = new Intent(getApplicationContext(), P211.class);
                            intent.putExtra("hintCount", hintCount);
                            startActivityForResult(intent, requestCode);
                            return true;
                        } else if (hintNumber == 20) {
                            Intent intent = new Intent(getApplicationContext(), P211.class);
                            intent.putExtra("hintCount", hintCount);
                            startActivityForResult(intent, requestCode);
                            return true;
                        } else {
                            Intent intent = new Intent(getApplicationContext(), P211.class);
                            intent.putExtra("hintCount", hintCount);
                            startActivityForResult(intent, requestCode);
                            return true;
                        }
                    } else if(hintEditText.getText().toString().equals(p3Code)) {
                        Intent intent = new Intent(getApplicationContext(), P3.class);
                        intent.putExtra("hintCount", hintCount);
                        startActivityForResult(intent, requestCode);
                        return true;
                    } else if(hintEditText.getText().toString().equals(p4Code)) {
                        if (hintNumber == 41) {
                            Intent intent = new Intent(getApplicationContext(), P421.class);
                            intent.putExtra("hintCount", hintCount);
                            startActivityForResult(intent, requestCode);
                            return true;
                        } else if (hintNumber == 42) {
                            Intent intent = new Intent(getApplicationContext(), P431.class);
                            intent.putExtra("hintCount", hintCount);
                            startActivityForResult(intent, requestCode);
                            return true;
                        } else if (hintNumber == 43) {
                            Intent intent = new Intent(getApplicationContext(), P441.class);
                            intent.putExtra("hintCount", hintCount);
                            startActivityForResult(intent, requestCode);
                            return true;
                        } else if (hintNumber == 44) {
                            Intent intent = new Intent(getApplicationContext(), P451.class);
                            intent.putExtra("hintCount", hintCount);
                            startActivityForResult(intent, requestCode);
                            return true;
                        } else if (hintNumber == 45) {
                            Intent intent = new Intent(getApplicationContext(), P411.class);
                            intent.putExtra("hintCount", hintCount);
                            startActivityForResult(intent, requestCode);
                            return true;
                        } else if (hintNumber == 40) {
                            Intent intent = new Intent(getApplicationContext(), P411.class);
                            intent.putExtra("hintCount", hintCount);
                            startActivityForResult(intent, requestCode);
                            return true;
                        } else {
                            Intent intent = new Intent(getApplicationContext(), P411.class);
                            intent.putExtra("hintCount", hintCount);
                            startActivityForResult(intent, requestCode);
                            return true;
                        }
                    } else if(hintEditText.getText().toString().equals(p5Code)) {
                        Intent intent = new Intent(getApplicationContext(), P5.class);
                        intent.putExtra("hintCount", hintCount);
                        startActivityForResult(intent, requestCode);
                        return true;
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
            }
        });

        hintCountTextView = findViewById(R.id.hintCountTextView);
        hintCountTextView.setText("힌트 " + hintCount + "번");
    }

    private String  time;

    public void countDownTimer() {
        countDownTimer= new CountDownTimer(3600000, 1000) {
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

                time = hour + ":" + min + ":" + second;
                timerTextView.setText(time);
            }

            public void onFinish() {
                Intent intent = new Intent(getApplicationContext(), TimeOver.class);
                intent.putExtra("time", time);
                intent.putExtra("hintCount", hintCount);
                intent.putExtra("hintArrayList", hintArrayList);
                startActivity(intent);
                finish();
            }
        }.start();
    }

    /*@Override
    public void onBackPressed() {
        //super.onBackPressed();

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("게임을 종료하겠습니까?");

        builder.setPositiveButton("네", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                finish();
            }
        });
        builder.setNegativeButton("아니오", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        });

        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }*/
}