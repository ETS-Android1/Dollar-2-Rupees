package com.NDY.dollar2rupees;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    private Button button;                                                                              //
    private TextView textView2;                                                                         //
    private EditText editText;                                                                          //
    private static final DecimalFormat df = new DecimalFormat("0.00");
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);                                                                //
        textView2 = findViewById(R.id.textView2);                                                              //
        editText = findViewById(R.id.editTextTextPersonName);                                               //

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = editText.getText().toString();
                int dollar = Integer.parseInt(s);
                double rupee = 75.65 * dollar;
                textView2.setText("In Rupees: " + df.format(rupee));
            }
        });

    }
}