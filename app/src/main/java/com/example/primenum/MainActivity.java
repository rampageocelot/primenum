package com.example.primenum;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText num1;
    private TextView ans1;
    private Button calc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1= (EditText)findViewById(R.id.etnum);
        calc= (Button)findViewById(R.id.btn);
        ans1= (TextView)findViewById(R.id.ans);

        calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int l;
                int inp=0;
                int c=0;
                inp=Integer.parseInt(num1.getText().toString());
                if(inp==0)
                    ans1.setText("you have not entered anything");
                for(l=(inp/2);l<=inp;l++)
                {if(inp%l==0)
                  c++;;

                }
                if(c==1)
                {             ans1.setText("its prime");

                }
                else ans1.setText("its not  prime");




    }
});
    }}