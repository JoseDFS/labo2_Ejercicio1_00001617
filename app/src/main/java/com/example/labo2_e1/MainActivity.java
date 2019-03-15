package com.example.labo2_e1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button Boton_action;

    private TextView info;

    private TextView Texto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Boton_action = findViewById(R.id.btn_id);
        info= findViewById(R.id.text_info);

        Boton_action.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Texto = findViewById(R.id.username_id);
                info.setText(Texto.getText());

            }


        });

        Boton_action.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Texto = findViewById(R.id.password_id);
                info.setText(Texto.getText());

                return false;
            }
        });
    }
}
