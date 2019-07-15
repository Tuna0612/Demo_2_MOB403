package com.tuna.demo_2_mob403;

import android.os.AsyncTask;
import android.util.Log;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class GetTask extends AsyncTask<String,Long,String> {
    @Override
    protected String doInBackground(String... strings) {
        try {
            URL url = new URL(strings[0]);

            HttpURLConnection httpURLConnection= (HttpURLConnection) url.openConnection();

            InputStream inputStream = httpURLConnection.getInputStream();

            Scanner sc = new Scanner(inputStream);

            String data = "";

            while (sc.hasNext()){
                data = data+sc.nextLine();
            }
            sc.close();

            return data;

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    protected void onPostExecute(String s) {
        super.onPostExecute(s);

        Log.e("data",s);
    }
}
