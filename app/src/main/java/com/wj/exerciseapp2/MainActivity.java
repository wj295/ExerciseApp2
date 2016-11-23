package com.wj.exerciseapp2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonClick(View view) {

        //button = (Button) findViewById(R.id.button);
        TextView textView = (TextView) findViewById(R.id.textView2);

        Toast toast = Toast.makeText(this, R.string.buttonOnClickMessage + textView.getText().toString(), Toast.LENGTH_SHORT);
        toast.show();
    }
}
