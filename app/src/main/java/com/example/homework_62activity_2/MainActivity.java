package com.example.homework_62activity_2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private int ActivityNumber = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String fotoMessage = String.valueOf(new Random().nextInt(100));
        if (ActivityNumber == 0) {
            ActivityNumber = Integer.parseInt(fotoMessage);
        }

        TextView fotoText = findViewById(R.id.textView_foto);
        fotoText.setText(fotoMessage);

        findViewById(R.id.button_back).setOnClickListener(buttonsClickListener);
        findViewById(R.id.button_go).setOnClickListener(buttonsClickListener);

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Lifecycle", ActivityNumber + "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Lifecycle", ActivityNumber + "onResume");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Lifecycle", ActivityNumber + "onPause");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Lifecycle", ActivityNumber + "onStop");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Lifecycle", ActivityNumber + "onDestroy");

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("Lifecycle", ActivityNumber + "onRestart");

    }


    private View.OnClickListener buttonsClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.button_back:
                    finish();
                    break;
                case R.id.button_go:
                    startNewActivity();
                    break;

            }
        }
    };

    private void startNewActivity() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
