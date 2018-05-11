package com.example.ppc.tictactoe;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public TextView ganador,turnillo;
    public Button bt1,bt2,bt3,bt4,bt5,bt6,bt7,bt8,bt9,reset;
    public int turno=1,finjuego=0,turnos=0;
    public int casillas1[]=new int[9];
    public int casillas2[]=new int[9];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        reset=(Button)findViewById(R.id.reset);
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Restart(view);
            }
        });
        bt1=(Button)findViewById(R.id.btn1);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                press1(view);
            }
        });
        bt2=(Button)findViewById(R.id.btn2);
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                press2(view);
            }
        });
        bt3=(Button)findViewById(R.id.btn3);
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                press3(view);
            }
        });
        bt4=(Button)findViewById(R.id.btn4);
        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                press4(view);
            }
        });
        bt5=(Button)findViewById(R.id.btn5);
        bt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                press5(view);
            }
        });
        bt6=(Button)findViewById(R.id.btn6);
        bt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                press6(view);
            }
        });
        bt7=(Button)findViewById(R.id.btn7);
        bt7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                press7(view);
            }
        });
        bt8=(Button)findViewById(R.id.btn8);
        bt8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                press8(view);
            }
        });
        bt9=(Button)findViewById(R.id.btn9);
        bt9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                press9(view);
            }
        });
        ganador=(TextView)findViewById(R.id.Winner);
        turnillo=(TextView)findViewById(R.id.Turno);
        turnillo.setText("X");
        bt1.setText(" ");
        bt1.setBackgroundColor(Color.parseColor("#9E9E9E"));
        bt2.setText(" ");
        bt2.setBackgroundColor(Color.parseColor("#9E9E9E"));
        bt3.setText(" ");
        bt3.setBackgroundColor(Color.parseColor("#9E9E9E"));
        bt4.setText(" ");
        bt4.setBackgroundColor(Color.parseColor("#9E9E9E"));
        bt5.setText(" ");
        bt5.setBackgroundColor(Color.parseColor("#9E9E9E"));
        bt6.setText(" ");
        bt6.setBackgroundColor(Color.parseColor("#9E9E9E"));
        bt7.setText(" ");
        bt7.setBackgroundColor(Color.parseColor("#9E9E9E"));
        bt8.setText(" ");
        bt8.setBackgroundColor(Color.parseColor("#9E9E9E"));
        bt9.setText(" ");
        bt9.setBackgroundColor(Color.parseColor("#9E9E9E"));
    }

    public void Restart(View view){
        ganador.setText(" ");
        turnillo.setText(" ");
        bt1.setText(" ");
        bt1.setBackgroundColor(Color.parseColor("#9E9E9E"));
        bt2.setText(" ");
        bt2.setBackgroundColor(Color.parseColor("#9E9E9E"));
        bt3.setText(" ");
        bt3.setBackgroundColor(Color.parseColor("#9E9E9E"));
        bt4.setText(" ");
        bt4.setBackgroundColor(Color.parseColor("#9E9E9E"));
        bt5.setText(" ");
        bt5.setBackgroundColor(Color.parseColor("#9E9E9E"));
        bt6.setText(" ");
        bt6.setBackgroundColor(Color.parseColor("#9E9E9E"));
        bt7.setText(" ");
        bt7.setBackgroundColor(Color.parseColor("#9E9E9E"));
        bt8.setText(" ");
        bt8.setBackgroundColor(Color.parseColor("#9E9E9E"));
        bt9.setText(" ");
        bt9.setBackgroundColor(Color.parseColor("#9E9E9E"));
        turnos=0;
        for(int i=0;i<9;i++){
            casillas2[i]=0;
            casillas1[i]=0;
        }
        finjuego=0;
        turno=1;
    }
    public void press1(View view){
        if(casillas1[0]!=1&&casillas2[0]!=1&&finjuego!=1) {
            if (turno == 1) {
                bt1.setText("X");
                bt1.setBackgroundColor(Color.parseColor("#F44336"));
                turnillo.setText("O");
                casillas1[0] = 1;
                turno=2;
            } else {
                bt1.setText("O");
                bt1.setBackgroundColor(Color.parseColor("#2196f3"));
                turnillo.setText("X");
                casillas2[0] = 1;
                turno=1;
            }
            turnos++;
        }
        if(turnos==9){
            ganador.setText("EMPATE");
            ganador.setTextColor(Color.parseColor("#4CAF50"));
            finjuego=1;
        }
        if(gana1()){
            ganador.setText("X");
            ganador.setTextColor(Color.parseColor("#F44336"));
            finjuego=1;
        }
        if(gana2()){
            ganador.setText("O");
            ganador.setTextColor(Color.parseColor("#2196f3"));
            finjuego=1;
        }
    }
    public void press2(View view){
        if(casillas1[1]!=1&&casillas2[1]!=1&&finjuego!=1) {
            if (turno == 1) {
                bt2.setText("X");
                bt2.setBackgroundColor(Color.parseColor("#F44336"));
                turnillo.setText("O");
                casillas1[1] = 1;
                turno=2;
            } else {
                bt2.setText("O");
                bt2.setBackgroundColor(Color.parseColor("#2196f3"));
                turnillo.setText("X");
                casillas2[1] = 1;
                turno=1;
            }
            turnos++;
        }
        if(turnos==9){
            ganador.setText("EMPATE");
            ganador.setTextColor(Color.parseColor("#4CAF50"));
            finjuego=1;
        }
        if(gana1()){
            ganador.setText("X");
            ganador.setTextColor(Color.parseColor("#F44336"));
            finjuego=1;
        }
        if(gana2()){
            ganador.setText("O");
            ganador.setTextColor(Color.parseColor("#2196f3"));
            finjuego=1;
        }
    }

    public void press3(View view){
        if(casillas1[2]!=1&&casillas2[2]!=1&&finjuego!=1) {
            if (turno == 1) {
                bt3.setText("X");
                bt3.setBackgroundColor(Color.parseColor("#F44336"));
                turnillo.setText("O");
                casillas1[2] = 1;
                turno=2;
            } else {
                bt3.setText("O");
                bt3.setBackgroundColor(Color.parseColor("#2196f3"));
                turnillo.setText("X");
                casillas2[2] = 1;
                turno=1;
            }
            turnos++;
        }
        if(turnos==9){
            ganador.setText("EMPATE");
            ganador.setTextColor(Color.parseColor("#4CAF50"));
            finjuego=1;
        }
        if(gana1()){
            ganador.setText("X");
            ganador.setTextColor(Color.parseColor("#F44336"));
            finjuego=1;
        }
        if(gana2()){
            ganador.setText("O");
            ganador.setTextColor(Color.parseColor("#2196f3"));
            finjuego=1;
        }
    }
    public void press4(View view){
        if(casillas1[3]!=1&&casillas2[3]!=1&&finjuego!=1) {
            if (turno == 1) {
                bt4.setText("X");
                bt4.setBackgroundColor(Color.parseColor("#F44336"));
                turnillo.setText("O");
                casillas1[3] = 1;
                turno=2;
            } else {
                bt4.setText("O");
                bt4.setBackgroundColor(Color.parseColor("#2196f3"));
                turnillo.setText("X");
                casillas2[3] = 1;
                turno=1;
            }
            turnos++;
        }
        if(turnos==9){
            ganador.setText("EMPATE");
            ganador.setTextColor(Color.parseColor("#4CAF50"));
            finjuego=1;
        }
        if(gana1()){
            ganador.setText("X");
            ganador.setTextColor(Color.parseColor("#F44336"));
            finjuego=1;
        }
        if(gana2()){
            ganador.setText("O");
            ganador.setTextColor(Color.parseColor("#2196f3"));
            finjuego=1;
        }
    }
    public void press5(View view){
        if(casillas1[4]!=1&&casillas2[4]!=1&&finjuego!=1) {
            if (turno == 1) {
                bt5.setText("X");
                bt5.setBackgroundColor(Color.parseColor("#F44336"));
                turnillo.setText("O");
                casillas1[4] = 1;
                turno=2;
            } else {
                bt5.setText("O");
                bt5.setBackgroundColor(Color.parseColor("#2196f3"));
                turnillo.setText("X");
                casillas2[4] = 1;
                turno=1;
            }
            turnos++;
        }
        if(turnos==9){
            ganador.setText("EMPATE");
            ganador.setTextColor(Color.parseColor("#4CAF50"));
            finjuego=1;
        }
        if(gana1()){
            ganador.setText("X");
            ganador.setTextColor(Color.parseColor("#F44336"));
            finjuego=1;
        }
        if(gana2()){
            ganador.setText("O");
            ganador.setTextColor(Color.parseColor("#2196f3"));
            finjuego=1;
        }
    }
    public void press6(View view){
        if(casillas1[5]!=1&&casillas2[5]!=1&&finjuego!=1) {
            if (turno == 1) {
                bt6.setText("X");
                bt6.setBackgroundColor(Color.parseColor("#F44336"));
                turnillo.setText("O");
                casillas1[5] = 1;
                turno=2;
            } else {
                bt6.setText("O");
                bt6.setBackgroundColor(Color.parseColor("#2196f3"));
                turnillo.setText("X");
                casillas2[5] = 1;
                turno=1;
            }
            turnos++;
        }
        if(turnos==9){
            ganador.setText("EMPATE");
            ganador.setTextColor(Color.parseColor("#4CAF50"));
            finjuego=1;
        }
        if(gana1()){
            ganador.setText("X");
            ganador.setTextColor(Color.parseColor("#F44336"));
            finjuego=1;
        }
        if(gana2()){
            ganador.setText("O");
            ganador.setTextColor(Color.parseColor("#2196f3"));
            finjuego=1;
        }
    }
    public void press7(View view){
        if(casillas1[6]!=1&&casillas2[6]!=1&&finjuego!=1) {
            if (turno == 1) {
                bt7.setText("X");
                bt7.setBackgroundColor(Color.parseColor("#F44336"));
                turnillo.setText("O");
                casillas1[6] = 1;
                turno=2;
            } else {
                bt7.setText("O");
                bt7.setBackgroundColor(Color.parseColor("#2196f3"));
                turnillo.setText("X");
                casillas2[6] = 1;
                turno=1;
            }
            turnos++;
        }
        if(turnos==9){
            ganador.setText("EMPATE");
            ganador.setTextColor(Color.parseColor("#4CAF50"));
            finjuego=1;
        }
        if(gana1()){
            ganador.setText("X");
            ganador.setTextColor(Color.parseColor("#F44336"));
            finjuego=1;
        }
        if(gana2()){
            ganador.setText("O");
            ganador.setTextColor(Color.parseColor("#2196f3"));
            finjuego=1;
        }
    }
    public void press8(View view){
        if(casillas1[7]!=1&&casillas2[7]!=1&&finjuego!=1) {
            if (turno == 1) {
                bt8.setText("X");
                bt8.setBackgroundColor(Color.parseColor("#F44336"));
                turnillo.setText("O");
                casillas1[7] = 1;
                turno=2;
            } else {
                bt8.setText("O");
                bt8.setBackgroundColor(Color.parseColor("#2196f3"));
                turnillo.setText("X");
                casillas2[7] = 1;
                turno=1;
            }
            turnos++;
        }
        if(turnos==9){
            ganador.setText("EMPATE");
            ganador.setTextColor(Color.parseColor("#4CAF50"));
            finjuego=1;
        }
        if(gana1()){
            ganador.setText("X");
            ganador.setTextColor(Color.parseColor("#F44336"));
            finjuego=1;
        }
        if(gana2()){
            ganador.setText("O");
            ganador.setTextColor(Color.parseColor("#2196f3"));
            finjuego=1;
        }
    }
    public void press9(View view){
        if(casillas1[8]!=1&&casillas2[8]!=1&&finjuego!=1) {
            if (turno == 1) {
                bt9.setText("X");
                bt9.setBackgroundColor(Color.parseColor("#F44336"));
                turnillo.setText("O");
                casillas1[8] = 1;
                turno=2;
            } else {
                bt9.setText("O");
                bt9.setBackgroundColor(Color.parseColor("#2196f3"));
                turnillo.setText("X");
                casillas2[8] = 1;
                turno=1;
            }
            turnos++;
        }
        if(turnos==9){
            ganador.setText("EMPATE");
            ganador.setTextColor(Color.parseColor("#4CAF50"));
            finjuego=1;
        }
        if(gana1()){
            ganador.setText("X");
            ganador.setTextColor(Color.parseColor("#F44336"));
            finjuego=1;
        }
        if(gana2()){
            ganador.setText("O");
            ganador.setTextColor(Color.parseColor("#2196f3"));
            finjuego=1;
        }
    }

    public boolean gana1(){
        if((casillas1[0]==1&&casillas1[1]==1&&casillas1[2]==1)||(casillas1[3]==1&&casillas1[4]==1&&casillas1[5]==1)||(casillas1[6]==1&&casillas1[7]==1&&casillas1[8]==1)||(casillas1[0]==1&&casillas1[3]==1&&casillas1[6]==1)||(casillas1[1]==1&&casillas1[4]==1&&casillas1[7]==1)||(casillas1[2]==1&&casillas1[5]==1&&casillas1[8]==1)||(casillas1[0]==1&&casillas1[4]==1&&casillas1[8]==1)||(casillas1[2]==1&&casillas1[4]==1&&casillas1[6]==1)){
            return true;
        }else {
            return false;
        }
    }
    public boolean gana2(){
        if((casillas2[0]==1&&casillas2[1]==1&&casillas2[2]==1)||(casillas2[3]==1&&casillas2[4]==1&&casillas2[5]==1)||(casillas2[6]==1&&casillas2[7]==1&&casillas2[8]==1)||(casillas2[0]==1&&casillas2[3]==1&&casillas2[6]==1)||(casillas2[1]==1&&casillas2[4]==1&&casillas2[7]==1)||(casillas2[2]==1&&casillas2[5]==1&&casillas2[8]==1)||(casillas2[0]==1&&casillas2[4]==1&&casillas2[8]==1)||(casillas2[2]==1&&casillas2[4]==1&&casillas2[6]==1)){
            return true;
        }else {
            return false;
        }
    }
}

