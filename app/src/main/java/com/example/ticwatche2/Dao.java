package com.example.ticwatche2;

import android.icu.text.SimpleDateFormat;
import android.os.AsyncTask;

import java.util.Date;

public class Dao {

    String time;
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss");

    class MyAsyncTask extends AsyncTask<Integer, Integer, Integer> {
        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            time = simpleDateFormat.format(new Date(System.currentTimeMillis()));
            //setText(time);
        }

        @Override
        protected Integer doInBackground(Integer... integers) {
            while (isCancelled() == false) {
                time = simpleDateFormat.format(new Date(System.currentTimeMillis()));
                publishProgress();
                try {
                } catch (Exception exception) {
                }
            }
            return null;
        }

        @Override
        protected void onProgressUpdate(Integer... values) {
            super.onProgressUpdate(values);
            //setText(time);
        }
    }

    public void runTime() {
        MyAsyncTask asyncTask = new MyAsyncTask();
        asyncTask.execute();
    }
}
