package com.example.tam.a5layouttablelayout;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn_color1 = (Button)findViewById(R.id.btn_color1);
        Button btn_color2 = (Button)findViewById(R.id.btn_color2);
        Button btn_color3 = (Button)findViewById(R.id.btn_color3);
        Button btn_clear = (Button)findViewById(R.id.btn_clear);
        txt = (TextView)findViewById(R.id.txt);
        btn_color1.setOnClickListener(new SetColor(Color.YELLOW));
        btn_color2.setOnClickListener(new SetColor(Color.RED));
        btn_color3.setOnClickListener(new SetColor(Color.BLUE));
        btn_clear.setOnClickListener(new SetColor(Color.BLACK));

    }

    private class SetColor implements View.OnClickListener{
        int color;

        public SetColor(int color) {
            this.color = color;
        }

        @Override
        public void onClick(View v) {
            txt.setBackgroundColor(color);
        }
    }
}
