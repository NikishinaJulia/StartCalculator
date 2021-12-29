package ru.gb.startcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textStart;
    private Button buttonStart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textStart = findViewById(R.id.text_start);
        buttonStart = findViewById(R.id.button_start);

        buttonStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("example://intent");
                Intent buttonStartIntent = new Intent(Intent.ACTION_VIEW, uri);
                @SuppressLint("WrongConstant")
                ActivityInfo activityInfo =
                        buttonStartIntent.resolveActivityInfo(getPackageManager(),
                                buttonStartIntent.getFlags());
                if (activityInfo != null) {
                    startActivity(buttonStartIntent);
                }


            }
        });


    }
}