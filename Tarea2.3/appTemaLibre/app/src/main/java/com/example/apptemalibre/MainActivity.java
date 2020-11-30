package com.example.apptemalibre;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnRegistro, btnLista;
    int request_code = 1;
    boolean registro;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnRegistro = (Button)findViewById(R.id.buttonRegistro);
        btnLista = (Button)findViewById(R.id.buttonLista);

        //Abrimos segunda actividad al pulsar el boton registro
        btnRegistro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            Intent i = new Intent(getApplicationContext(), Second_Activity.class);
            startActivityForResult(i, request_code);

            }
        });

        //Abrimos tercera actividad al pulsar el boton lista
        btnLista.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //comprobamos que se ha registrado para poder abrir la lista
                if(registro) {
                    Intent i = new Intent(getApplicationContext(), Third_Activity.class);
                    startActivity(i);
                }else {
                //mostramos mensaje de advertencia de no registrado
                Toast.makeText(getApplicationContext(), "Debes registrarte", Toast.LENGTH_LONG).show();
                }
            }
        });
    }

    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data){
        super.onActivityResult(requestCode, resultCode, data);

        if(resultCode == RESULT_OK){
            String registrar = data.getStringExtra("Resultado");
            if(registrar.compareTo("SI")==0){
                registro = true;
            }
        }
    }
}