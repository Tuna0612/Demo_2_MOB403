package com.tuna.demo_2_mob403;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void get(View view) {

        GetTask getTask = new GetTask();
        getTask.execute("http://asian.dotplays.com/wp-json/wp/v2/categories?page=1&per_page=10");
    }

    public void post(View view) {
        PostTask postTask = new PostTask();
        postTask.execute("http://dotplays.com/android/login.php");
    }
}
