package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    float num1,num2,result;
    boolean add=false,multiply=false,sub=false,operation_done_once=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b9 = findViewById(R.id.b9);
        Button b8 = findViewById(R.id.b8);
        Button b7 = findViewById(R.id.b7);
        Button bstar = findViewById(R.id.bstar);
        Button b6 = findViewById(R.id.b6);
        Button b5 = findViewById(R.id.b5);
        Button b4 = findViewById(R.id.b4);
        Button bminus = findViewById(R.id.bminus);
        Button b3 = findViewById(R.id.b3);
        Button b2 = findViewById(R.id.b2);
        Button b1 = findViewById(R.id.b1);
        Button bplus = findViewById(R.id.bplus);
        Button bC = findViewById(R.id.bC);
        Button bdot = findViewById(R.id.bdot);
        Button b0 = findViewById(R.id.b0);
        Button bequal = findViewById(R.id.bequal);
        final TextView tv = findViewById(R.id.tv1);
        final TextView tv2 = findViewById(R.id.tv2);
        tv2.setText(null);
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                   if (!operation_done_once) {
                       tv2.setText(null);
                       operation_done_once = true;
                   }
                tv2.setText(tv2.getText() + "9");
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                if (!operation_done_once) {
                    tv2.setText(null);
                    operation_done_once = true;
                }
                tv2.setText(tv2.getText()+"8");}});
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                if (!operation_done_once) {
                    tv2.setText(null);
                    operation_done_once = true;
                }
                tv2.setText(tv2.getText()+"7");}});
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!operation_done_once) {
                    tv2.setText(null);
                    operation_done_once = true;
                }
                tv2.setText(tv2.getText()+"6");
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!operation_done_once) {
                    tv2.setText(null);
                    operation_done_once = true;
                }
                tv2.setText(tv2.getText()+"5");
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!operation_done_once) {
                    tv2.setText(null);
                    operation_done_once = true;
                }
                tv2.setText(tv2.getText()+"4");
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!operation_done_once) {
                    tv2.setText(null);
                    operation_done_once = true;
                }
                tv2.setText(tv2.getText()+"3");
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!operation_done_once) {
                    tv2.setText(null);
                    operation_done_once = true;
                }
                tv2.setText(tv2.getText()+"2");
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!operation_done_once) {
                    tv2.setText(null);
                    operation_done_once = true;
                }
                tv2.setText(tv2.getText()+"1");
            }
        });
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!operation_done_once) {
                    tv2.setText(null);
                    operation_done_once = true;
                }
                tv2.setText(tv2.getText()+"0");
            }
        });
        bdot.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                String checker = tv2.getText().toString();
                if (checker.contains("."))
                {

                }else {
                    if (tv2.length() > 0) {
                        tv2.setText(tv2.getText() + ".");
                    }else {}
                }
            }
        });
        bplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (tv2.length() > 0) {
                    num1 = Float.parseFloat(tv2.getText() + "");
                    tv2.setText(null);
                    add = true;
                }else{

                }
            }
        }

        );
        bminus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (tv2.length() > 0) {
                    num1 = Float.parseFloat(tv2.getText() + "");
                    tv2.setText("");
                    tv2.setText("");
                    sub=true;

                }else {

                }
            }
        });
        bstar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (tv2.length() > 0) {
                    num1 = Float.parseFloat(tv2.getText() + "");
                    tv2.setText("");
                    multiply =true;
                }
                else {

                }
            }
        });
        bequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (tv2.length()>0) {
                    num2 = Float.parseFloat(tv2.getText() + "");
                    if (add) {
                        result = num1 + num2;
                        tv2.setText(String.valueOf(result));
                        add = false;
                    } else if (multiply) {
                        result = num1 * num2;
                        tv2.setText(String.valueOf(result));
                        multiply=false;
                    } else if (sub) {
                        result = num1 - num2;
                        tv2.setText(String.valueOf(result));
                        sub = false;
                    }
                    operation_done_once=false;
                }else { }
            }
        });
        bC.setOnClickListener(new View.OnClickListener() {
                                     @Override
                                     public void onClick(View view) {
                                         tv2.setText(null);


                                     }
                                 }

        );

    }
}
