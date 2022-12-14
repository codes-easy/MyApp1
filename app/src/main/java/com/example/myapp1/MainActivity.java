package com.example.myapp1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;



public class MainActivity extends AppCompatActivity
    implements View.OnClickListener {


    EditText firstnumberText;
    EditText secondnumberText;
    Button add_button;
    Button sub_button;
    Button multi_button;
    Button div_button;
    Button Hisotry;
    TextView result_text;
    Button clear_button;
//    private void  calculate (String opr)
//    {
//        //if (!firstnumberText.getText().toString().isEmpty() &&
//               // !secondnumberText.getText().toString().isEmpty()) {
//
//            double fn = Double.parseDouble(firstnumberText.getText().toString().isEmpty()? "0":(firstnumberText.getText().toString()));
//            double sn = Double.parseDouble(secondnumberText.getText().toString().isEmpty()? "0":(secondnumberText.getText().toString()));
//            double result = 0;
//
//            if (opr.equals("+")) {
//                result = fn + sn;
//            } else if (opr.equals("-")) {
//                result = fn - sn;
//
//            } else if (opr.equals("*")) {
//                result = fn * sn;
//            } else if (opr.equals("/")) {
//                result = fn / sn;
//            }
//            result_text.setText(fn + " " + opr + " " + sn + " = " + result);
//        //}
//        //else {
//           // Toast.makeText(MainActivity.this, "Please enter both numbers, if none fill number with 1",
//                    //Toast.LENGTH_LONG).show();
//       // }
// }
    @SuppressLint("MissingInflatedId")

    CalculatorClass calculatorClass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_constraint);
        Log.d("Calculator App", "Add created");
        calculatorClass = new CalculatorClass();
        //  EditText firstnumberText = (EditText) findViewById(R.id.FirstNumber);

        //TextView title1Text = (TextView) findViewById(R.id.Title1);
        // title1Text.setText("This is a new text changed in Java File");

        //TextView title2Text = (TextView) findViewById(R.id.Title2);

        firstnumberText =  findViewById(R.id.FirstNumber);
        secondnumberText =  findViewById(R.id.SecondNumber);
        add_button = findViewById(R.id.AddButton);
        sub_button = findViewById(R.id.SubButton);
        multi_button = findViewById(R.id.MultiButton);
        div_button = findViewById(R.id.DivButton);
        Hisotry = findViewById(R.id.showpreviouscontent);
        clear_button = findViewById(R.id.clearButton);


        add_button.setOnClickListener(this);
        sub_button.setOnClickListener(this);
        multi_button.setOnClickListener(this);
        div_button.setOnClickListener(this);
        result_text = findViewById(R.id.resultText);
        Hisotry.setOnClickListener(this);
        clear_button.setOnClickListener(this);


    }

        @SuppressLint("NonConstantResourceId")
        @Override
        public void onClick(View view) {


        switch (view.getId()){
            case R.id.clearButton:
                firstnumberText.setText("");
                secondnumberText.setText("");
                result_text.setText("");
            break;


            case R.id.showpreviouscontent:
                if (!calculatorClass.History.isEmpty())
                    result_text.setText(calculatorClass.History);

                else
                    result_text.setText("No previous History");
                break;

            default:
                String op = ((Button)view).getText().toString();
                validate(op);

        }


        }




//        add_button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//               String op = ((Button)view).getText().toString();
//               validate(op);
//
//              //  Log.d("Calculator App", "Add Button clicked");
//
//                /*if (!firstnumberText.getText().toString().isEmpty() &&
//                        !secondnumberText.getText().toString().isEmpty()) {
//
//                    double fn = Double.parseDouble((firstnumberText.getText().toString()));
//                    double sn = Double.parseDouble(secondnumberText.getText().toString());
//                    double result = fn + sn;
//                    result_text.setText(result + " ");
//
//
//                } else {
//                    Toast.makeText(MainActivity.this, "Please enter both numbers, if none fill number with 1",
//                            Toast.LENGTH_LONG).show();
//                }*/
//                //calculate("+");
//            }
//        });
//
//        sub_button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//             //   Log.d("Calculator App", "Sub Button clicked");
//                String op = ((Button)view).getText().toString();
//                validate(op);
//               // calculate("-");
//               // Log.d("Calculator App", "negative error" );
//            }
//        });
//        multi_button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                String op = ((Button)view).getText().toString();
//                validate(op);
//               // Log.d("Calculator App", "Mutliply Button clicked");
//                //calculate("*");
//            }
//        });
//
//        div_button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                String op = ((Button)view).getText().toString();
//                validate(op);
//               // Log.d("Calculator App", "Division Button clicked");
//               // calculate("/");
//            }
//        });




    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Calculator App", "App Started");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Calculator App", "App Resumed");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Calculator App", "App Paused");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

private void validate(String op){


    if (!firstnumberText.getText().toString().isEmpty() &&
            !secondnumberText.getText().toString().isEmpty()) {

        double fn = Double.parseDouble((firstnumberText.getText().toString()));
        double sn = Double.parseDouble(secondnumberText.getText().toString());
        double result = calculatorClass.calculate(fn, sn, op);
        result_text.setText(fn + " " + op + " " + sn + " = " + result);



    } else {
        Toast.makeText(MainActivity.this, "Please enter both numbers, if none fill number with 1",
                Toast.LENGTH_LONG).show();
    }


}


}