package com.example.yetti.epamandroidtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b = (Button) findViewById(R.id.btnHello);
        View.OnClickListener btnHelloOnClick = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showHello();
            }
        };
        b.setOnClickListener(btnHelloOnClick);
    }
    private void showHello(){
        Toast toast = Toast.makeText(getApplicationContext(), "Hello EPAM!", Toast.LENGTH_LONG);
        toast.show();
    }
}
