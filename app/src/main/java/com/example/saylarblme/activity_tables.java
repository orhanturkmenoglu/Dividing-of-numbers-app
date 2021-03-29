package com.example.saylarblme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class activity_tables extends AppCompatActivity {

    private ImageView imgBack;
    private TextView tvText, tv1, tv2, tv3, tv4, tv5, tv6, tv7, tv8, tv9, tv10;
    private Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn10;
    private List<TextView> textViews = new ArrayList<>();
    int tablo =1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Intent intent=getIntent();
        tablo=intent.getIntExtra("tablo",1);
        setTheme(R.style.Theme);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tables);
        findView();

        textViews.add(tv1);
        textViews.add(tv2);
        textViews.add(tv3);
        textViews.add(tv4);
        textViews.add(tv5);
        textViews.add(tv6);
        textViews.add(tv7);
        textViews.add(tv8);
        textViews.add(tv9);
        textViews.add(tv10);
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn1:
                setTablo1();
                break;
            case R.id.btn2:
                setTablo2();
                break;
            case R.id.btn3:
                setTablo3();
                break;
            case R.id.btn4:
                setTablo4();
                break;
            case R.id.btn5:
                setTablo5();
                break;
            case R.id.btn6:
                setTablo6();
                break;
            case R.id.btn7:
                setTablo7();
                break;
            case R.id.btn8:
                setTablo8();
                break;
            case R.id.btn9:
                setTablo9();
                break;
            case R.id.btn10:
                setTablo10();
                break;
        }

    }

    private void setTablo1() {
        tv1.setText("1 / 1 = 1");
        tv2.setText("2 / 1 = 2");
        tv3.setText("3 / 1 = 3");
        tv4.setText("4 / 1 = 4");
        tv5.setText("5 / 1 = 5");
        tv6.setText("6 / 1 = 6");
        tv7.setText("7 / 1 = 7");
        tv8.setText("8 / 1 = 8");
        tv9.setText("9 / 1 = 9");
        tv10.setText("10 / 1 = 10");
    }
    private void setTablo2() {
        tv1.setText("2 / 2 = 1");
        tv2.setText("4 / 2 = 2");
        tv3.setText("6 / 2 = 3");
        tv4.setText("8 / 2 = 4");
        tv5.setText("10 / 2 = 5");
        tv6.setText("12 / 2 = 6");
        tv7.setText("14 / 2 = 7");
        tv8.setText("16 / 2 = 8");
        tv9.setText("18 / 2 = 9");
        tv10.setText("20 / 2 = 10");
    }
    private void setTablo3() {
        tv1.setText("3 / 3 = 1");
        tv2.setText("6 / 2 = 3");
        tv3.setText("9 / 3 = 3");
        tv4.setText("12 / 3 = 4");
        tv5.setText("15 / 3 = 5");
        tv6.setText("18 / 3 = 6");
        tv7.setText("21 / 3 = 7");
        tv8.setText("24 / 3 = 8");
        tv9.setText("27 / 3 = 9");
        tv10.setText("30 / 3 = 10");
    }
    private void setTablo4() {
        tv1.setText("4 / 4 = 1");
        tv2.setText("8 / 4 = 2");
        tv3.setText("12 / 4 = 3");
        tv4.setText("16 / 4 = 4");
        tv5.setText("20 / 4 = 5");
        tv6.setText("24 / 4 = 6");
        tv7.setText("28 / 4 = 7");
        tv8.setText("32 / 4 = 8");
        tv9.setText("36 / 4 = 9");
        tv10.setText("40 / 4 = 10");
    }
    private void setTablo5() {
        tv1.setText("5 / 5 = 1");
        tv2.setText("10 / 5 = 2");
        tv3.setText("15 / 5 = 3");
        tv4.setText("20 / 5 = 4");
        tv5.setText("25 / 5 = 5");
        tv6.setText("30 / 5 = 6");
        tv7.setText("35 / 5 = 7");
        tv8.setText("40 / 5 = 8");
        tv9.setText("45 / 5 = 9");
        tv10.setText("50 / 5 = 10");
    }
    private void setTablo6() {
        tv1.setText("6 / 6 = 1");
        tv2.setText("12 / 6 = 2");
        tv3.setText("18 / 6 = 3");
        tv4.setText("24 / 6 = 4");
        tv5.setText("30 / 6 = 5");
        tv6.setText("36 / 6 = 6");
        tv7.setText("42 / 6 = 7");
        tv8.setText("48 / 6 = 8");
        tv9.setText("54 / 6 = 9");
        tv10.setText("60 / 6 = 10");
    }
    private void setTablo7() {
        tv1.setText("7 / 7 = 1");
        tv2.setText("14 / 7 = 2");
        tv3.setText("21 / 7 = 3");
        tv4.setText("28 / 7 = 4");
        tv5.setText("35 / 7 = 5");
        tv6.setText("42 / 7 = 6");
        tv7.setText("49 / 7 = 7");
        tv8.setText("56 / 7 = 8");
        tv9.setText("63 / 7 = 9");
        tv10.setText("70 / 7 = 10");
    }
    private void setTablo8() {
        tv1.setText("8 / 8 = 1");
        tv2.setText("16 / 8 = 2");
        tv3.setText("24 / 8 = 3");
        tv4.setText("32 / 8 = 4");
        tv5.setText("40 / 8 = 5");
        tv6.setText("48 / 8 = 6");
        tv7.setText("56 / 8 = 7");
        tv8.setText("64 / 8 = 8");
        tv9.setText("72 / 8 = 9");
        tv10.setText("80 / 8 = 10");
    }
    private void setTablo9() {
        tv1.setText("9 / 9 = 1");
        tv2.setText("18 / 9 = 2");
        tv3.setText("27 / 9 = 3");
        tv4.setText("36 / 9 = 4");
        tv5.setText("45 / 9 = 5");
        tv6.setText("54 / 9 = 6");
        tv7.setText("63 / 9 = 7");
        tv8.setText("72 / 9 = 8");
        tv9.setText("81 / 9 = 9");
        tv10.setText("90 / 9 = 10");
    }
    private void setTablo10() {
        tv1.setText("10 / 10 = 1");
        tv2.setText("20 / 10 = 2");
        tv3.setText("30 / 10= 3");
        tv4.setText("40 / 10 = 4");
        tv5.setText("50 / 10 = 5");
        tv6.setText("60 / 10 = 6");
        tv7.setText("70 / 10 = 7");
        tv8.setText("80 / 10 = 8");
        tv9.setText("90 / 10 = 9");
        tv10.setText("100 / 10 = 10");
    }

    public void onLeftClick(View view) {
        onBackPressed();
    }



    private void findView() {
        imgBack = findViewById(R.id.imgBack);
        tvText = findViewById(R.id.tvText);
        tv1 = findViewById(R.id.tv1);
        tv2 = findViewById(R.id.tv2);
        tv3 = findViewById(R.id.tv3);
        tv4 = findViewById(R.id.tv4);
        tv5 = findViewById(R.id.tv5);
        tv6 = findViewById(R.id.tv6);
        tv7 = findViewById(R.id.tv7);
        tv8 = findViewById(R.id.tv8);
        tv9 = findViewById(R.id.tv9);
        tv10 = findViewById(R.id.tv10);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btn10 = findViewById(R.id.btn10);

    }
}