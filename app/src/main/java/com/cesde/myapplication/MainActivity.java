package com.cesde.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

        TextView resultado;
        Button uno,dos,tres,cuatro,cinco,seis,siete,ocho,nueve,cero;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        resultado = findViewById(R.idresultado);
        uno = findViewById(R.id.uno);
        dos = findViewById(R.id.dos);
        tres = findViewById(R.id.tres);
        cuatro= findViewById(R.id.cuatro);
        cinco = findViewById(R.id.cinco);
        seis= findViewById(R.id.seis);

        setContentView(R.layout.activity_main);

        dos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (resultado.getText().toString().equals("0")){
                    resultado.setText("2");
                }else{
                    resultado.setText(resultado.getText()+"2");


                }

            }
        }




        );
        tres.setOnClickListener(View ->{
            if (resultado.getText().toString().equals("0")){
                resultado.setText("3");
            }else{
                resultado.setText(resultado.getText()+"3");


            }

        });
    }
    public void uno (View view){
        if (resultado.getText().toString().equals("0")){
            resultado.setText("1");
        }else{
            resultado.setText(resultado.getText()+"1");


        }




    }
}