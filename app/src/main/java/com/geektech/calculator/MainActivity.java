package com.geektech.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tvResult;
    private Boolean isOperationClick;
    private Integer firstVar;
    private Integer secondVar;
    private String operation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvResult = findViewById(R.id.tv_result);
    }

    public void onNumberClick(View view) {
        switch (view.getId()){
            case R.id.btn_one:
                //клик на единицу
                if (tvResult.getText().toString().equals("0")){
                    tvResult.setText("1");
                }else if (isOperationClick){
                    tvResult.setText("1");
                }else {
                    tvResult.append("1");
                }
                isOperationClick = false;
                break;
            case R.id.btn_two:
                //клик на двойку
                if (tvResult.getText().toString().equals("0")){
                    tvResult.setText("2");
                }else if (isOperationClick){
                    tvResult.setText("2");
                }else {
                    tvResult.append("2");
                }
                isOperationClick = false;
                break;
            case R.id.btn_three:
                //клик на единицу
                if (tvResult.getText().toString().equals("0")){
                    tvResult.setText("3");
                }else if (isOperationClick){
                    tvResult.setText("3");
                }else {
                    tvResult.append("3");
                }
                isOperationClick = false;
                break;
            case R.id.btn_four:
                //клик на единицу
                if (tvResult.getText().toString().equals("0")){
                    tvResult.setText("4");
                }else if (isOperationClick){
                    tvResult.setText("4");
                }else {
                    tvResult.append("4");
                }
                isOperationClick = false;
                break;
            case R.id.btn_five:
                //клик на единицу
                if (tvResult.getText().toString().equals("0")){
                    tvResult.setText("5");
                }else if (isOperationClick){
                    tvResult.setText("5");
                }else {
                    tvResult.append("5");
                }
                isOperationClick = false;
                break;
            case R.id.btn_six:
                //клик на единицу
                if (tvResult.getText().toString().equals("0")){
                    tvResult.setText("6");
                }else if (isOperationClick){
                    tvResult.setText("6");
                }else {
                    tvResult.append("6");
                }
                isOperationClick = false;
                break;
            case R.id.btn_seven:
                //клик на единицу
                if (tvResult.getText().toString().equals("0")){
                    tvResult.setText("7");
                }else if (isOperationClick){
                    tvResult.setText("7");
                }else {
                    tvResult.append("7");
                }
                isOperationClick = false;
                break;
            case R.id.btn_eight:
                //клик на единицу
                if (tvResult.getText().toString().equals("0")){
                    tvResult.setText("8");
                }else if (isOperationClick){
                    tvResult.setText("8");
                }else {
                    tvResult.append("8");
                }
                isOperationClick = false;
                break;
            case R.id.btn_nine:
                //клик на единицу
                if (tvResult.getText().toString().equals("0")){
                    tvResult.setText("9");
                }else if (isOperationClick){
                    tvResult.setText("9");
                }else {
                    tvResult.append("9");
                }
                isOperationClick = false;
                break;
            case R.id.btn_zero:
                if (tvResult.getText().toString().equals("0")){
                    tvResult.setText("0");
                }else if (isOperationClick){
                    tvResult.setText("0");
                }else {
                    tvResult.append("0");
                }
                isOperationClick = false;
                break;
            case R.id.btn_clear:
                //клик на очистку
                tvResult.setText("0");
                firstVar = 0;
                secondVar = 0;
                break;
        }
    }

    public void onOperationClick(View view) {
        switch (view.getId()){
            case R.id.btn_plus:
                //клик на плюс
                operation = "+";
                isOperationClick = true;
                //12
                firstVar = Integer.parseInt(tvResult.getText().toString());
                break;
            case R.id.btn_multiplication:
                operation = "X";
                isOperationClick = true;
                firstVar = Integer.parseInt(tvResult.getText().toString());
                break;
            case R.id.btn_divide:
                operation = "-";
                isOperationClick = true;
                firstVar = Integer.parseInt(tvResult.getText().toString());
                break;
            case R.id.btn_division:
                operation = "/";
                isOperationClick = true;
                firstVar = Integer.parseInt(tvResult.getText().toString());
                break;
            case R.id.btn_equal:
                //клик на равно
                isOperationClick = true;
                //21
                secondVar = Integer.parseInt(tvResult.getText().toString());
                Integer result = 0;
                switch (operation){
                    case "+":
                        result = firstVar + secondVar;
                        break;
                    case "-":
                        result = firstVar - secondVar;
                        break;
                    case "X":
                        result = firstVar * secondVar;
                        break;
                    case "/":
                        result = firstVar / secondVar;
                        break;
                }
                tvResult.setText(result.toString());
                break;
        }
    }
}