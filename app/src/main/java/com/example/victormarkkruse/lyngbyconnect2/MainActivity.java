package com.example.victormarkkruse.lyngbyconnect2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, MapsActivity.class));
            }
        });
        findViewById(R.id.button2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Main2Activity.class));
            }
        });
    }

    Button button;
    Button button2;
    Button button3;
    Button button4;

    public Button getButton() {

        button = (Button) findViewById(R.id.button);
        //button.setOnClickListener(this, );
        button.setText("Around");

        button2 = (Button) findViewById(R.id.button2);
       // button2.setOnClickListener(this);
        button2.setText("List");

        button3 = (Button) findViewById(R.id.button3);
        //button3.setOnClickListener(this);
        button3.setText("Connect");

        button4 = (Button) findViewById(R.id.button4);
       // button4.setOnClickListener(this);
        button4.setText("About");

        return button;
    }
}
