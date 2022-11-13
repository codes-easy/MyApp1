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

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {


    EditText firstnumberText;

    EditText secondnumberText;
    TextView result_text;
    private void  calculate (String opr)
    {
        //if (!firstnumberText.getText().toString().isEmpty() &&
               // !secondnumberText.getText().toString().isEmpty()) {

            double fn = Double.parseDouble(firstnumberText.getText().toString().isEmpty()? "0":(firstnumberText.getText().toString()));
            double sn = Double.parseDouble(secondnumberText.getText().toString().isEmpty()? "0":(secondnumberText.getText().toString()));
            double result = 0;

            if (opr.equals("+")) {
                result = fn + sn;
            } else if (opr.equals("-")) {
                result = fn - sn;

            } else if (opr.equals("*")) {
                result = fn * sn;
            } else if (opr.equals("/")) {
                result = fn / sn;
            }
            result_text.setText(fn + " " + opr + " " + sn + " = " + result);
        //}
        //else {
           // Toast.makeText(MainActivity.this, "Please enter both numbers, if none fill number with 1",
                    //Toast.LENGTH_LONG).show();
       // }
    }
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("Calculator App", "Add created");
      //  EditText firstnumberText = (EditText) findViewById(R.id.FirstNumber);
       firstnumberText = (EditText) findViewById(R.id.FirstNumber);
        TextView title1Text = (TextView) findViewById(R.id.Title1);
        // title1Text.setText("This is a new text changed in Java File");
         secondnumberText = (EditText) findViewById(R.id.SecondNumber);
        TextView title2Text = (TextView) findViewById(R.id.Title2);

        Button add_button = findViewById(R.id.AddButton);
        Button sub_button = findViewById(R.id.SubButton);
        Button multi_button = findViewById(R.id.MultiButton);
        Button div_button = findViewById(R.id.DivButton);


        result_text = findViewById(R.id.resultText);








        add_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("Calculator App", "Add Button clicked");

                /*if (!firstnumberText.getText().toString().isEmpty() &&
                        !secondnumberText.getText().toString().isEmpty()) {

                    double fn = Double.parseDouble((firstnumberText.getText().toString()));
                    double sn = Double.parseDouble(secondnumberText.getText().toString());
                    double result = fn + sn;
                    result_text.setText(result + " ");


                } else {
                    Toast.makeText(MainActivity.this, "Please enter both numbers, if none fill number with 1",
                            Toast.LENGTH_LONG).show();
                }*/
                calculate("+");
            }
        });

        sub_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("Calculator App", "Sub Button clicked");

                calculate("-");
                Log.d("Calculator App", "negative error" );
            }
        });
        multi_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("Calculator App", "Mutliply Button clicked");
                calculate("*");
            }
        });

        div_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("Calculator App", "Division Button clicked");
                calculate("/");
            }
        });


    }

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


}