package com.example.calculator5;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import org.mariuszgromada.math.mxparser.*;

public class Advanced extends AppCompatActivity {
    Button btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btnBck,btnBackspaceAll,btnDot,
            btnDivision,btnMinus,btnEquals,btnPlus,btnMult,btnResign,btnCos,btnSin,btnTg,
            btnLn,btnCtg,btnPowX2,btnPowXY,btnSqrt;
    TextView tvInput, tvOutput;
    String process, newInput, finalResult, output;
    Boolean wcisnietooperator=true;
    Boolean wcisnietominus=false;

   public void closeBracketAfterTrig(char s){
        process=tvInput.getText().toString();
        process=process.replace("(-","(m");
        System.out.println("Process"+process);
        if (process.length()>0) {
            String parts[] = process.split("[-+*/]");
            String check_for_trig = parts[parts.length - 1];
            char pierwszy = check_for_trig.charAt(0);
            if ((pierwszy == '√' || pierwszy == 'c' || pierwszy == 's' || pierwszy == 't' || pierwszy == 'l')&&process.charAt(process.length()-1)!=')'){
                newInput = process + ")" + s;
            } else {
                newInput = process + s;
            }
        } else {
            newInput = process + s;
        }

       newInput=newInput.replace("m","-");
       tvInput.setText(newInput);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advanced_main);
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
        btnCos=findViewById(R.id.btnCos);
        btnSin=findViewById(R.id.btnSin);
        btnTg=findViewById(R.id.btnTg);
        btnLn=findViewById(R.id.btnLn);
        btnCtg=findViewById(R.id.btnCtg);
        btnPowX2=findViewById(R.id.btnPowX2);
        btnPowXY=findViewById(R.id.btnPowXY);

        btnMult=findViewById(R.id.btnMult);
        btnDot=findViewById(R.id.btnDot);
        btnBackspaceAll=findViewById(R.id.btnBackspaceAll);
        btnBck=findViewById(R.id.btnBck);
        btnDivision=findViewById(R.id.btnDivision);
        btnMinus=findViewById(R.id.btnMinus);
        btnEquals=findViewById(R.id.btnEquals);
        btnPlus=findViewById(R.id.btnPlus);
        btnResign=findViewById(R.id.btnResign);
        btnSqrt=findViewById(R.id.btnSqrt);

        tvInput=findViewById(R.id.tvInput);
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
                addnumber("0");
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addnumber("1");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addnumber("2");
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addnumber("3");
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addnumber("4");
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addnumber("5");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addnumber("6");
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addnumber("7");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addnumber("8");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addnumber("9");
            }
        });

        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!wcisnietooperator) {
                    closeBracketAfterTrig('+');
                    wcisnietooperator=true;
                    wcisnietominus=false;
                }
            }
        });

        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!wcisnietominus) {
                    process=tvInput.getText().toString();
                    if (process.length()>0) {
                        if (process.charAt(process.length() - 1) != '(') {
                            closeBracketAfterTrig('-');
                        } else {
                            newInput = process + '-';
                        }
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
                    closeBracketAfterTrig('*');
                    wcisnietooperator=true;
                    wcisnietominus=false;
                }
            }
        });

        btnDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!wcisnietooperator) {
                    closeBracketAfterTrig('/');
                    wcisnietooperator=true;
                    wcisnietominus=false;
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

        btnCos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                wcisnietooperator=true;
                wcisnietominus=false;
                process=tvInput.getText().toString();
                if (process.length()>0) {
                    if (process.charAt(process.length() - 1) == '+' ||
                            process.charAt(process.length() - 1) == '*' ||
                            process.charAt(process.length() - 1) == '-' ||
                            process.charAt(process.length() - 1) == '/'||
                            process.charAt(process.length() - 1) == '(') {
                        newInput = process + "cos(";
                    } else newInput = process + "*cos(";

                } else newInput = process + "cos(";
                tvInput.setText(newInput);
            }
        });

        btnSin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                wcisnietooperator=true;
                wcisnietominus=false;
                process=tvInput.getText().toString();
                if (process.length()>0) {
                    if (process.charAt(process.length() - 1) == '+' ||
                            process.charAt(process.length() - 1) == '*' ||
                            process.charAt(process.length() - 1) == '-' ||
                            process.charAt(process.length() - 1) == '/'||
                            process.charAt(process.length() - 1) == '(') {
                        newInput = process + "sin(";
                    } else newInput = process + "*sin(";

                } else newInput = process + "sin(";
                tvInput.setText(newInput);
            }
        });

        btnTg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                wcisnietooperator=true;
                wcisnietominus=false;
                process=tvInput.getText().toString();
                if (process.length()>0) {
                    if (process.charAt(process.length() - 1) == '+' ||
                            process.charAt(process.length() - 1) == '*' ||
                            process.charAt(process.length() - 1) == '-' ||
                            process.charAt(process.length() - 1) == '/'||
                            process.charAt(process.length() - 1) == '(') {
                        newInput = process + "tg(";
                    } else newInput = process + "*tg(";

                } else newInput = process + "tg(";
                tvInput.setText(newInput);
            }
        });

        btnLn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                wcisnietooperator=true;
                wcisnietominus=false;
                process=tvInput.getText().toString();
                if (process.length()>0) {
                    if (process.charAt(process.length() - 1) == '+' ||
                            process.charAt(process.length() - 1) == '*' ||
                            process.charAt(process.length() - 1) == '-' ||
                            process.charAt(process.length() - 1) == '/'||
                            process.charAt(process.length() - 1) == '(') {
                        newInput = process + "ln(";
                    } else newInput = process + "*ln(";

                } else newInput = process + "ln(";
                tvInput.setText(newInput);
            }
        });

        btnCtg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                wcisnietooperator=true;
                wcisnietominus=false;
                process=tvInput.getText().toString();
                if (process.length()>0) {
                    if (process.charAt(process.length() - 1) == '+' ||
                            process.charAt(process.length() - 1) == '*' ||
                            process.charAt(process.length() - 1) == '-' ||
                            process.charAt(process.length() - 1) == '/'||
                            process.charAt(process.length() - 1) == '(') {
                        newInput = process + "ctg(";
                    } else newInput = process + "*ctg(";

                } else newInput = process + "ctg(";
                tvInput.setText(newInput);
            }
        });

        btnPowX2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!wcisnietooperator) {
                    wcisnietooperator = false;
                    wcisnietominus=false;
                    process = tvInput.getText().toString();
                    newInput = process + "^2";
                    tvInput.setText(newInput);
                }
            }
        });

        btnPowXY.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!wcisnietooperator) {
                    wcisnietooperator = true;
                    wcisnietominus=false;
                    process = tvInput.getText().toString();
                    newInput = process + "^";
                    tvInput.setText(newInput);
                }
            }
        });

        btnSqrt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                wcisnietooperator=true;
                wcisnietominus=false;
                process=tvInput.getText().toString();
                if (process.length()>0) {
                    if (process.charAt(process.length() - 1) == '+' ||
                            process.charAt(process.length() - 1) == '*' ||
                            process.charAt(process.length() - 1) == '-' ||
                            process.charAt(process.length() - 1) == '/'||
                            process.charAt(process.length() - 1) == '(') {
                        newInput = process + "√(";
                    } else newInput = process + "*√(";

                } else newInput = process + "√(";
                tvInput.setText(newInput);
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
                //Ten if jest tylko po to aby uniemożliwić wpisanie operatora po wyzerowaniu inputu
                if (process.length()==0) {
                    wcisnietooperator = true;
                    newInput="0";
                    //... a ten jest po to aby uniemożliwić wpisanie operatora gdy
                    // w wyniku kasowania zostanie nam z prawej goły operator
                } else if (process.length() > 1 && (process.charAt(process.length()-1) == '+'
                        ||process.charAt(process.length()-1) == '-'
                        ||process.charAt(process.length()-1) == '*'
                        ||process.charAt(process.length()-1) == '/'
                        ||process.charAt(process.length()-1) == '.'
                        ||process.charAt(process.length()-1) == '(')) {
                    wcisnietooperator = true;
                    wcisnietominus=false;
                } else {
                    wcisnietooperator = false;
                    wcisnietominus = true;
                }
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

    private void addnumber(String s) {
        wcisnietooperator=false;
        wcisnietominus=false;
        process=tvInput.getText().toString();
        if (process.length()>0) {
            if (process.charAt(process.length() - 1) == ')') {
                newInput = process + "*" + s;
            } else newInput = process + s;
            tvInput.setText(newInput);
        } else newInput = process + s;
        tvInput.setText(newInput);
    }

    private void mParser(String arg) {

       arg=checkForOrphans(arg);

        //Domykanie ewentualnych niedomkniętych nawiasów
        for (int i = arg.length()-1; i >=0 ; i--){
            char c = arg.charAt(i);

            if (c == ')' ) {
                break;
            }
            if (c == '(' ) {
                arg=arg+")";
                newInput=arg;
                tvInput.setText(newInput);
                //break;
            }
        }

        //Zamiana "+-" na symbol rozpoznawalny dla parsera, tzn. "-"
        arg=arg.replace("+-","-");
        newInput = arg;
        tvInput.setText(newInput);

        //Zamiana "√" na symbol rozpoznawalny dla parsera, tzn. sqrt
        arg=arg.replace("√","sqrt");
        newInput = arg;
        tvInput.setText(newInput);

        //Kiedy zostawiamy gołą potęgę to domyślnie wykładnik = 0
        if (arg.charAt(arg.length()-1)=='^') {
            arg=arg+'0';
            newInput=arg;
            tvInput.setText(newInput);
        }

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

        //Pierwiastek liczby ujemnej
        boolean rootFromNegative=false;
        for (int i =0; i< arg.length(); i++){

            if (arg.charAt(i) == 't' && arg.charAt(i+1)=='('&& arg.charAt(i+2)=='-') {
                rootFromNegative=true;
                break;
            }
        }

        //Ln liczby ujemnej
        boolean lnFromNegative=false;
        for (int i =0; i< arg.length(); i++){

            if (arg.charAt(i) == 'l' && arg.charAt(i+1)=='n'&& arg.charAt(i+2)=='('&& arg.charAt(i+3)=='-') {
                lnFromNegative=true;
                break;
            }
        }


        if (divByZero) {
            tvOutput.setText("divByZeroErr");
        } else if (rootFromNegative){
            tvOutput.setText("rootOfNegErr");
        } else if (lnFromNegative) {
            tvOutput.setText("lnOfNegErr");
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
