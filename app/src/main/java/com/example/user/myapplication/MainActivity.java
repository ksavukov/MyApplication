package com.example.user.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView textView3;
    Button button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView3 = (TextView) findViewById(R.id.textView3);
        button3 = (Button) findViewById(R.id.button3);

        button3.setOnClickListener(new View.OnClickListener()
        {
        public void onClick(View view) {

            textView3.setText("123131231231313123123131231231233121231323");
            Toast toast = Toast.makeText(MainActivity.this, "Привет", Toast.LENGTH_LONG);
            toast.setGravity(Gravity.CENTER,0,0);
        }


    });
}
}
