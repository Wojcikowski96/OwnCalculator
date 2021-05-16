package com.example.calculator5;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import org.mariuszgromada.math.mxparser.Expression;

public class Basic extends AppCompatActivity {
    Button btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btnBck,btnBackspaceAll,btnDot,
            btnDivision,btnMinus,btnEquals,btnPlus,btnMult,btnResign;
    TextView tvInput, tvOutput;
    String process;
    String newInput, finalResult, output;
    Boolean wcisnietooperator=true;
    Boolean divbyzero=false;
    Boolean wcisnietominus=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic_main);
        btn0=findViewById(R.id.btn0);
        btn1=findViewById(R.id.btn1);
        btn2=findViewById(R.id.btn2);
        btn3=findViewById(R.id.btn3);
        btn4=findViewById(R.id.btn4);
        btn5=findViewById(R.id.btn5);
        btn6=findViewById(R.id.btn6);
        btn7=findViewById(R.id.btn7);
        btn8=findViewById(R.id.btn8);
        btn9=findViewById(R.id.btn9);

        btnMult=findViewById(R.id.btnMult);
        btnDot=findViewById(R.id.btnDot);
        btnBackspaceAll=findViewById(R.id.btnBackspaceAll);
        btnBck=findViewById(R.id.btnBck);
        btnDivision=findViewById(R.id.btnDivision);
        btnMinus=findViewById(R.id.btnMinus);
        btnEquals=findViewById(R.id.btnEquals);
        btnPlus=findViewById(R.id.btnPlus);
        btnResign=findViewById(R.id.btnResign);
        btnResign=findViewById(R.id.btnResign);

        tvInput=findViewById(R.id.tvInput);
        btnBck=findViewById(R.id.btnBck);
        tvOutput=findViewById(R.id.tvOutput);

        btnBackspaceAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                wcisnietooperator=true;
                wcisnietominus=false;
                newInput = "";
                tvInput.setText(newInput);
                tvOutput.setText("");
            }
        });

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                wcisnietooperator=false;
                wcisnietominus=false;
                process=tvInput.getText().toString();
                if (process.length()>0) {
                    if (process.charAt(process.length()-1)=='/') {
                        divbyzero=true;
                    }
                }
                newInput = process + "0";
                tvInput.setText(newInput);
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                wcisnietooperator=false;
                wcisnietominus=false;
                process=tvInput.getText().toString();
                newInput = process + "1";
                tvInput.setText(newInput);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                wcisnietooperator=false;
                wcisnietominus=false;
                process=tvInput.getText().toString();
                newInput = process + "2";
                tvInput.setText(newInput);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                wcisnietooperator=false;
                wcisnietominus=false;
                process=tvInput.getText().toString();
                newInput = process + "3";
                tvInput.setText(newInput);
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                wcisnietooperator=false;
                wcisnietominus=false;
                process=tvInput.getText().toString();
                newInput = process + "4";
                tvInput.setText(newInput);
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                wcisnietooperator=false;
                wcisnietominus=false;
                process=tvInput.getText().toString();
                newInput = process + "5";
                tvInput.setText(newInput);
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                wcisnietooperator=false;
                wcisnietominus=false;
                process=tvInput.getText().toString();
                newInput = process + "6";
                tvInput.setText(newInput);
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                wcisnietooperator=false;
                wcisnietominus=false;
                process=tvInput.getText().toString();
                newInput = process + "7";
                tvInput.setText(newInput);
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                wcisnietooperator=false;
                wcisnietominus=false;
                process=tvInput.getText().toString();
                newInput = process + "8";
                tvInput.setText(newInput);
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                wcisnietooperator=false;
                wcisnietominus=false;
                process=tvInput.getText().toString();
                newInput = process + "9";
                tvInput.setText(newInput);
            }
        });


        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!wcisnietooperator) {
                    wcisnietooperator=true;
                    wcisnietominus=false;
                    process = tvInput.getText().toString();
                    newInput = process + "+";
                    tvInput.setText(newInput);
                }
            }
        });


        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!wcisnietominus) {
                    process=tvInput.getText().toString();
                    if (process.length()>0) {
                        newInput = process + '-';
                    } else {
                        newInput = process + '-';
                    }
                    wcisnietooperator=true;
                    wcisnietominus=true;
                    tvInput.setText(newInput);
                }
            }
        });

        btnMult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!wcisnietooperator) {
                    wcisnietooperator=true;
                    wcisnietominus=false;
                    process = tvInput.getText().toString();
                    newInput = process + "*";
                    tvInput.setText(newInput);
                }
            }
        });

        btnDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!wcisnietooperator) {
                    wcisnietooperator=true;
                    wcisnietominus=false;
                    process = tvInput.getText().toString();
                    newInput = process + "/";
                    tvInput.setText(newInput);
                }
            }
        });

        btnResign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process=tvInput.getText().toString();
                if(!(process.isEmpty())){

                    newInput="-("+process+")";

                    tvInput.setText(newInput);
                }
            }
        });

        btnDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (!wcisnietooperator) {

                    int licznikkropek = 0;
                    int licznikoperatorow = 0;

                    process = tvInput.getText().toString();

                    for(int i = 0; i < process.length(); i++){
                        if(process.charAt(i) == '.'){
                            licznikkropek++;
                        }
                        if(process.charAt(i) == '+'||process.charAt(i) == '-'||process.charAt(i) == '*'||process.charAt(i) == '/'){
                            licznikoperatorow++;
                        }
                    }

                    if (licznikkropek<=licznikoperatorow) {
                        wcisnietooperator = true;
                        wcisnietominus=true;
                        newInput = process + ".";
                    }

                    tvInput.setText(newInput);
                }
            }
        });

        btnBck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process=tvInput.getText().toString();
                if(process.length() > 0){
                    process = process.substring(0, process.length() - 1);
                }

                tvInput.setText(process);

                if (process.length()==0) {
                    wcisnietooperator = true;
                    newInput="0";
                } else if (process.length() > 1 && (process.charAt(process.length()-1) == '+'
                        ||process.charAt(process.length()-1) == '-'
                        ||process.charAt(process.length()-1) == '*'
                        ||process.charAt(process.length()-1) == '/'
                        ||process.charAt(process.length()-1) == '.')) {
                    wcisnietooperator = true;
                } else wcisnietooperator = false;
            }
        });

        btnEquals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process=tvInput.getText().toString();
                if(process.equals("")){
                    process="0";
                }
                mParser(process);
            }
        });

        if(savedInstanceState != null){
            newInput=savedInstanceState.getString("process");
            output=savedInstanceState.getString("result");
            wcisnietooperator = savedInstanceState.getBoolean("wcisnietooperator");
            System.out.println("Process" + newInput);
            tvInput.setText(newInput);
            tvOutput.setText(output);
            //mParser(newInput);
        }
    }

    private void mParser(String arg) {

        arg=checkForOrphans(arg);

        //Zamiana "+-" na symbol rozpoznawalny dla parsera, tzn. "-"
        arg=arg.replace("+-","-");
        newInput = arg;
        tvInput.setText(newInput);

        //Dzielenie przez zero
        boolean divByZero=false;
        outerLoop:
        for (int i =0; i< arg.length(); i++){

            if (arg.charAt(i) == '/' && arg.charAt(i+1)=='0') {
                divByZero=true;
                for (int j =i+2; j< arg.length(); j++){
                    if (arg.charAt(j)=='+'|| arg.charAt(j)=='*'|| arg.charAt(j)=='/'|| arg.charAt(j)=='-') {
                        divByZero=true;
                        break outerLoop;
                    }
                    if (arg.charAt(j)!='0') {
                        divByZero=false;
                        break outerLoop;
                    }
                }
            }
        }

        if (divByZero) {
            tvOutput.setText("divByZeroErr");
        } else {

            //A tutaj pałeczkę przejmuje Mariusz Gromada
            finalResult = "";
            try {
                Expression e = new Expression(arg);
                finalResult = Double.toString(e.calculate());
            } catch (Exception e) {
                finalResult = "0";
            }
            tvOutput.setText(finalResult);
        }
    }

    private String checkForOrphans(String arg) {
        wcisnietooperator= false;
        wcisnietominus = false;
        char last=arg.charAt(arg.length()-1);
        if (last == '+' || last=='-'|| last=='/' || last=='*'|| last=='.') {
            arg=arg.substring(0, arg.length()-1);
            tvInput.setText(arg);
        }
        last = arg.charAt(arg.length() - 1);
        if(last == '+' || last=='-'|| last=='/' || last=='*'|| last=='.'){
            arg=arg.substring(0, arg.length()-1);
            tvInput.setText(arg);
        }
        return arg;
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        output = tvOutput.getText().toString();
        outState.putString("process",newInput);
        outState.putString("result",output);
        outState.putBoolean("wcisnietooperator", wcisnietooperator);
    }

}
