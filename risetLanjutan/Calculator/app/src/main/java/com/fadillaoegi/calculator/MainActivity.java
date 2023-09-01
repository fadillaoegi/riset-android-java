package com.fadillaoegi.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView tvResult;
    private Button btnPlus, btnMin, btnMultiple, btnDistribution;
    private EditText etFirst;
    private EditText etSecond;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Init();
        Button();
    }

    public void Init(){
        btnPlus         = findViewById(R.id.btn_plus);
        btnMin          = findViewById(R.id.btn_minus);
        btnMultiple     = findViewById(R.id.btn_multiple);
        btnDistribution = findViewById(R.id.btn_distribution);
        tvResult        = findViewById(R.id.tv_result);
        etFirst         = findViewById(R.id.et_first);
        etSecond        = findViewById(R.id.et_second);

    }

    public void Button(){
        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String valueFirst = etFirst.getText().toString();
                String valueSecond = etSecond.getText().toString();

                double valueResult = Double.parseDouble(valueFirst) + Double.parseDouble(valueSecond);
                tvResult.setText(String.valueOf(valueResult));
            }
        });

        btnMultiple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String valueFirst = etFirst.getText().toString();
                String valueSecond = etSecond.getText().toString();

                double valueResult = Double.parseDouble(valueFirst) * Double.parseDouble(valueSecond);
                tvResult.setText(String.valueOf(valueResult));
            }
        });

    }
    public void ClickMin(View view){

        String valueFirst = etFirst.getText().toString();
        String valueSecond = etSecond.getText().toString();

        double valueResult = Double.parseDouble(valueFirst) - Double.parseDouble(valueSecond);
        tvResult.setText(String.valueOf(valueResult));

    }

    public void ClickDistribution(View view){

        String valueFirst = etFirst.getText().toString();
        String valueSecond = etSecond.getText().toString();

        double valueResult = Double.parseDouble(valueFirst) / Double.parseDouble(valueSecond);
        tvResult.setText(String.valueOf(valueResult));

    }

//    public void plus(View view) {
//        String valueFirst = et_first.getText().toString();
//        String valueSecond = et_second.getText().toString();
//        double valueResult = Double.parseDouble(valueFirst) + Double.parseDouble(valueSecond);
//        txResult.setText(String.valueOf(valueResult));
//    }
}