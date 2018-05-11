package com.example.ppc.tictactoe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public TextView ganador,turnillo;
    public Button bt1,bt2,bt3,bt4,bt5,bt6,bt7,bt8,bt9;
    public int turno=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bt1=(Button)findViewById(R.id.btn1);
        bt2=(Button)findViewById(R.id.btn2);
        bt3=(Button)findViewById(R.id.btn3);
        bt4=(Button)findViewById(R.id.btn4);
        bt5=(Button)findViewById(R.id.btn5);
        bt6=(Button)findViewById(R.id.btn6);
        bt7=(Button)findViewById(R.id.btn7);
        bt8=(Button)findViewById(R.id.btn8);
        bt9=(Button)findViewById(R.id.btn9);
        ganador=(TextView)findViewById(R.id.winner);
        turnillo=(TextView)findViewById(R.id.Turno);


    }
}

