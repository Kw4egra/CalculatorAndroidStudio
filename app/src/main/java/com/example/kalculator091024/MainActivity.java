package com.example.kalculator091024;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    char sign;
    double firstNumber;
    double secondNuber = 0.0;
    double answer;
    public void onBtnClearClick(View view) {
        nado.setText("0");
    }

    public void onBtnZeroClick(View view) {
        if (!nado.getText().toString().equals("0")) {
            nado.append("0");
        }
    }

    public void onBtnNumClick(View view) {
        Button button = (Button) view;
        String buttonText = button.getText().toString();

        if (nado.getText().toString().equals("0")) {
            nado.setText(buttonText);
        }
        else {
            nado.append(buttonText);
        }
    }

    public void onBtnUndoClick(View view) {
        if (!nado.getText().toString().equals("0") && nado.getText().toString().length() > 1)
        {
            StringBuilder sb = new StringBuilder(nado.getText().toString());
            sb.deleteCharAt(nado.getText().toString().length() - 1);
            nado.setText(sb.toString());
        }
        else {
            nado.setText("0");
        }
    }

    public void onBtnSwipeClick(View view) {
            switch (nado.getText().toString().charAt(0)) {
                case '-':
                    StringBuilder sb = new StringBuilder(nado.getText().toString());
                    sb.deleteCharAt(0);
                    nado.setText(sb.toString());
                    break;
                case '0':
                    break;
                default:
                    nado.setText("-"+nado.getText());
                    break;

        }
    }
    public void onBtnDotClick(View view) {
        for (char i:nado.getText().toString().toCharArray()) {
            switch (i) {
                case '.':
                    return;
            }
        }
        nado.append(".");
    }

    public void onBtnPercentClick(View view) {
        firstNumber = Double.parseDouble(nado.getText().toString());
        answer = firstNumber/100;
        nado.setText(String.valueOf(answer));
    }

    public void onBtnSqrtClick(View view) {
        switch (nado.getText().toString().charAt(0)) {
            case '-':
                nado.setText("0");
                break;
            default:
                firstNumber = Double.parseDouble(nado.getText().toString());
                answer = Math.sqrt(firstNumber);
                nado.setText(String.valueOf(answer));
        }
    }

    public void onBtnDivideClick(View view) {
        firstNumber = Double.parseDouble(nado.getText().toString());
        nado.setText("0");
        sign = '/';
    }

    public void onBtnMultipleClick(View view) {
        firstNumber = Double.parseDouble(nado.getText().toString());
        nado.setText("0");
        sign = '*';
    }

    public void onBtnMinusClick(View view) {
        firstNumber = Double.parseDouble(nado.getText().toString());
        nado.setText("0");
        sign = '-';
    }

    public void onBtnPlusClick(View view) {
        firstNumber = Double.parseDouble(nado.getText().toString());
        nado.setText("0");
        sign = '+';
    }

    public void onBtnSumClick(View view) {
        if (answer != Double.parseDouble(nado.getText().toString()))
        {
            secondNuber = Double.parseDouble(nado.getText().toString());
        }
        switch (sign) {
            case '+':
                answer = firstNumber + secondNuber;
                nado.setText(String.valueOf(answer));
                break;
            case '-':
                answer = firstNumber - secondNuber;
                nado.setText(String.valueOf(answer));
                break;
            case '/':
                if (secondNuber == 0) {
                    nado.setText("0");
                    break;
                }
                answer = firstNumber / secondNuber;
                nado.setText(String.valueOf(answer));
                break;
            case '*':
                answer = firstNumber * secondNuber;
                nado.setText(String.valueOf(answer));
                break;
        }
        firstNumber = answer;
    }



    private TextView nado;

    private Button btnSum;
    private Button btnMinus;
    private Button btnPlus;
    private Button btnMultiple;
    private Button btnDivide;
    private Button btnSqrt;
    private Button btnPercent;
    private Button btnDot;
    private Button btnSwipe;
    private Button btnOne;

    private Button btnTwo;

    private Button btnThree;

    private Button btnFour;

    private Button btnFive;

    private Button btnSix;

    private Button btnSeven;

    private Button btnEight;

    private Button btnNine;
    private Button btnUndo;
    private Button btnClear;
    private Button btnZero;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnOne = findViewById(R.id.btnOne);
        btnTwo = findViewById(R.id.btnTwo);
        btnThree = findViewById(R.id.btnThree);
        btnFour = findViewById(R.id.btnFour);
        btnFive = findViewById(R.id.btnFive);
        btnSix = findViewById(R.id.btnSix);
        btnSeven = findViewById(R.id.btnSeven);
        btnEight = findViewById(R.id.btnEight);
        btnNine = findViewById(R.id.btnNine);

        btnSum = findViewById(R.id.btnSum);
        btnMinus = findViewById(R.id.btnMinus);
        btnPlus = findViewById(R.id.btnPlus);
        btnMultiple = findViewById(R.id.btnMultiple);
        btnDivide = findViewById(R.id.btnDivide);
        btnSqrt = findViewById(R.id.btnSqrt);
        btnPercent = findViewById(R.id.btnPercent);
        btnDot = findViewById(R.id.btnDot);
        btnSwipe = findViewById(R.id.btnSwipe);
        btnUndo = findViewById(R.id.btnUndo);
        btnZero = findViewById(R.id.btnSero);
        btnClear = findViewById(R.id.btnClear);
        nado = findViewById(R.id.nado);
    }


}
