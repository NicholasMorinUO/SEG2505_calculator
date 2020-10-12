package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button button0, button1, button2, button3, button4, button5, button6, button7, button8, button9;
    Button buttonAdd, buttonMinus, buttonMult, buttonDiv, buttonEqual, buttonClear;
    TextView screen;

    float val1, val2;
    boolean add, equal, minus, mult, div, clear;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button0 = (Button) findViewById(R.id.btn0);
        button1 = (Button) findViewById(R.id.btn1);
        button2 = (Button) findViewById(R.id.btn2);
        button3 = (Button) findViewById(R.id.btn3);
        button4 = (Button) findViewById(R.id.btn4);
        button5 = (Button) findViewById(R.id.btn5);
        button6 = (Button) findViewById(R.id.btn6);
        button7 = (Button) findViewById(R.id.btn7);
        button8 = (Button) findViewById(R.id.btn8);
        button9 = (Button) findViewById(R.id.btn9);
        buttonAdd = (Button) findViewById(R.id.btnPlus);
        buttonMinus = (Button) findViewById(R.id.btnMinus);
        buttonMult = (Button) findViewById(R.id.btnMult);
        buttonDiv = (Button) findViewById(R.id.btnDiv);
        buttonEqual = (Button) findViewById(R.id.btnEq);
        buttonClear = (Button) findViewById(R.id.btnClear);

        screen = (TextView) findViewById(R.id.result);

        button0.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View V){
                screen.setText(screen.getText()+"0");
            }
        });
        button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View V){
                screen.setText(screen.getText()+"1");
            }
        });
        button2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View V){
                screen.setText(screen.getText()+"2");
            }
        });
        button3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View V){
                screen.setText(screen.getText()+"3");
            }
        });
        button4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View V){
                screen.setText(screen.getText()+"4");
            }
        });
        button5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View V){
                screen.setText(screen.getText()+"5");
            }
        });
        button6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View V){
                screen.setText(screen.getText()+"6");
            }
        });
        button7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View V){
                screen.setText(screen.getText()+"7");
            }
        });
        button8.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View V){
                screen.setText(screen.getText()+"8");
            }
        });
        button9.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View V){
                screen.setText(screen.getText()+"9");
            }
        });
        buttonAdd.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View V){
                if (screen==null){
                    screen.setText(null);
                }

                val1 = Float.parseFloat(screen.getText().toString());

                add = true;
                screen.setText(null);
            }
        });

        buttonEqual.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View V){
                equal=true;
                val2=Float.parseFloat(screen.getText().toString());

                if(add){
                    screen.setText((val1+val2)+" ");
                    add=false;
                }
                if(minus){
                    screen.setText((val1-val2)+" ");
                    minus=false;
                }
                if(mult){
                    screen.setText((val1*val2)+" ");
                    mult=false;
                }
                if(div){
                    screen.setText((val1/val2)+" ");
                    div=false;
                }
            }
        });
        buttonMinus.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View V){
                if (screen==null){
                    screen.setText(null);
                }

                val1 = Float.parseFloat(screen.getText().toString());

                minus = true;
                screen.setText(null);
            }
        });

        buttonMult.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View V){
                if (screen==null){
                    screen.setText(null);
                }

                val1 = Float.parseFloat(screen.getText().toString());

                mult = true;
                screen.setText(null);
            }
        });

        buttonDiv.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View V){
                if (screen==null){
                    screen.setText(null);
                }
                val1 = Float.parseFloat(screen.getText().toString());

                div = true;
                screen.setText(null);
            }
        });

        buttonClear.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View V){
                clear = true;
                screen.setText("Clear");
                screen.setText("");
            }
        });
    }

}
