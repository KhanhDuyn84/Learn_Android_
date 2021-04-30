package com.nkd.geoquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button mTrueButton;
    private Button mFalseButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTrueButton = (Button)findViewById(R.id.true_button);
        mFalseButton = (Button)findViewById(R.id.false_button);
        mTrueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast correctToast = Toast.makeText(MainActivity.this, R.string.correct_toast, Toast.LENGTH_SHORT);
                if(Build.VERSION.SDK_INT < Build.VERSION_CODES.R)
                    correctToast.setGravity(Gravity.TOP, 0 ,0);
                correctToast.show();
            }
        });
        mFalseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast inCorrectToast = Toast.makeText(MainActivity.this, R.string.incorrect_toast, Toast.LENGTH_SHORT);
                if(Build.VERSION.SDK_INT < Build.VERSION_CODES.R)
                    inCorrectToast.setGravity(Gravity.TOP, 0 ,0);
                inCorrectToast.show();
            }
        });
    }
}