package com.example.eslamelmishtawy.qemarkets;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /**
         * English Text View on Click
         */
        TextView englishTextView = (TextView) findViewById(R.id.englishText);
        englishTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent homescreenIntent = new Intent(MainActivity.this, HomeScreen.class);
                startActivity(homescreenIntent);
            }
        });
    }
}
