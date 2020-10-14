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
    TextView lastOperation;

    float val1, val2;
    boolean add, equal, minus, mult, div;
    boolean cleared = true;

    private void clear() {
        val1 = Float.NaN;
        val2 = Float.NaN;
        add = equal = minus = mult = div = false;
        screen.setText(null);
        lastOperation.setText(null);
    }

    private void checkCleared() {
        if (!cleared) {
            clear();
            cleared = true;
        }
    }

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
        lastOperation = (TextView) findViewById(R.id.lastOperation);

        button0.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View V){
                checkCleared();
                screen.setText(screen.getText()+"0");
            }
        });
        button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View V){
                checkCleared();
                screen.setText(screen.getText()+"1");
            }
        });
        button2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View V){
                checkCleared();
                screen.setText(screen.getText()+"2");
            }
        });
        button3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View V){
                checkCleared();
                screen.setText(screen.getText()+"3");
            }
        });
        button4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View V){
                checkCleared();
                screen.setText(screen.getText()+"4");
            }
        });
        button5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View V){
                checkCleared();
                screen.setText(screen.getText()+"5");
            }
        });
        button6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View V){
                checkCleared();
                screen.setText(screen.getText()+"6");
            }
        });
        button7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View V){
                checkCleared();
                screen.setText(screen.getText()+"7");
            }
        });
        button8.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View V){
                checkCleared();
                screen.setText(screen.getText()+"8");
            }
        });
        button9.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View V){
                checkCleared();
                screen.setText(screen.getText()+"9");
            }
        });
        buttonAdd.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View V){
                //System.out.println(val1 + "is val1");
                //System.out.println(val1 + "is val1");
                cleared = true;

                try {
                    //System.out.println("hey");
                    val1 = Float.parseFloat(screen.getText() + "");
                } catch (Exception e) {
                    //System.out.println(e);
                    return;
                }
                add = true;
                screen.setText(null);
                //System.out.println(val1 + "is val1");

            }
        });

        buttonEqual.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View V){
                equal=true;

                try {
                    val2=Float.parseFloat(screen.getText().toString());
                    //System.out.println(val2 + "is val2");

                } catch (Exception e) {

                    return;
                }
                //System.out.println(val1 + "is val1");
                //System.out.println(val2 + "is val2");

                if (!Float.isNaN(val1) && !Float.isNaN(val2)) {
//                    System.out.println("inside first if");
                    cleared = false;
                  
                    if(add){
                        lastOperation.setText(val1 + " + " + val2);
                        screen.setText(Float.toString(val1 + val2));

                        add=false;
                    }
                    if(minus){
                        lastOperation.setText(val1 + " - " + val2);
                        screen.setText(Float.toString(val1 - val2));

                        minus=false;
                    }
                    if(mult){
                        lastOperation.setText(val1 + " × " + val2);
                        screen.setText(Float.toString(val1 * val2));

                        mult=false;
                    }
                    if(div){
                        lastOperation.setText(val1 + " ÷ " + val2);
                        screen.setText(Float.toString(val1 / val2));

                        div=false;
                    }
                }
                //System.out.println("send an equal");
            }
        });
        buttonMinus.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View V){
                cleared = true;

                try {
                    val1 = Float.parseFloat(screen.getText().toString());
                } catch (Exception e) {
                    return;
                }
                minus = true;
                screen.setText(null);
            }
        });

        buttonMult.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View V){

                cleared = true;

                try {
                    val1 = Float.parseFloat(screen.getText().toString());
                } catch (Exception e) {
                    return;
                }
                mult = true;
                screen.setText(null);
            }
        });

        buttonDiv.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View V){
                cleared = true;

                try {
                    val1 = Float.parseFloat(screen.getText().toString());
                } catch (Exception e) {
                    return;
                }

                div = true;
                screen.setText(null);
            }
        });

        buttonClear.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View V){
                cleared = true;
                clear();
            }
        });
    }

}
