package com.example.ejercicio2tema5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {
private Button botonDivision;
private EditText num1;
private EditText num2;
private Button botonSumar;

private TextView textoResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Asociar el objeto al elemento correspondiente XML


            num1=findViewById(R.id.numero1);
            num2=findViewById(R.id.numero2);
            textoResultado=findViewById(R.id.Resultado);
            botonDivision=findViewById(R.id.division);
            botonSumar=findViewById(R.id.button2);

           botonDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              int n1=Integer.parseInt(num1.getText());
              int n2=Integer.parseInt(num2.getText());
             int  resultado=n1/n2;
              textoResultado.setText(""+resultado);
            }
        });
            }

    }
