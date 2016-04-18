package com.nanodegree.android.project0;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void showToast(View view) {
        Context c = getApplicationContext();
        CharSequence s = "";
        switch (view.getId()) {
            case R.id.id_pMovies:
                s="This button will launch my popular movies app";
                break;
            case R.id.id_sHawk:
                s="This button will launch my stock hawk app";
                break;
            case R.id.id_bBigger:
                s="This button will launch my build it bigger app";
                break;
            case R.id.id_mAppMaterial:
                s="This button will launch my make my app material app";
                break;
            case R.id.id_gUbiquitous:
                s="This button will launch my go ubiquitous app";
                break;
            case R.id.id_capstone:
                s="This button will launch my capstone app";
                break;
        }

        Toast.makeText(c,s,Toast.LENGTH_LONG).show();
    }
}
