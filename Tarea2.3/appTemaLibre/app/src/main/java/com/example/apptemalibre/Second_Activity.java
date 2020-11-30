package com.example.apptemalibre;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Second_Activity extends AppCompatActivity {

    EditText edTxtNombre, edTxtEdad, edTxtEmail;
    Button btnRegistrar;
    boolean nombre = false, correo = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_);

        btnRegistrar = (Button)findViewById(R.id.buttonRgtro);
        edTxtNombre = (EditText) findViewById(R.id.edTxtNombre);
        edTxtEdad = (EditText) findViewById(R.id.edTxtEdad);
        edTxtEmail = (EditText) findViewById(R.id.edTxtEmail);

        btnRegistrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //extraemos los datos completados por el usuario
                String usuario = edTxtNombre.getText().toString();
                String email = edTxtEmail.getText().toString();

                Pattern pattern = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
                Matcher mather = pattern.matcher(email);

                //comprobamos que los usuarios han completado todos los datos y es mayor de edad
                if(usuario.isEmpty() || usuario.matches("[0-9]*")){
                    Toast.makeText(getApplicationContext(), "Nombre es incorrecto", Toast.LENGTH_LONG).show();
                    nombre = false;
                }else{
                    nombre = true;
                }
                if(email.isEmpty() || (mather.find() == false)){
                    Toast.makeText(getApplicationContext(), "Email es incorrecto", Toast.LENGTH_LONG).show();
                    correo = false;
                }else{
                    correo = true;
                }
                if(edTxtEdad.getText().toString().isEmpty()){
                    Toast.makeText(getApplicationContext(), "Debes completar la edad", Toast.LENGTH_LONG).show();
                }else{
                    int edad = Integer.parseInt(edTxtEdad.getText().toString());
                    if(edad < 18){
                        Toast.makeText(getApplicationContext(), "Menor de 18", Toast.LENGTH_LONG).show();
                    }
                    if((nombre == true) && (correo == true) && (edad > 18)){
                        //volvemos a la página principal al completar el registro correctamente
                        Toast.makeText(getApplicationContext(), "Registrado con exito", Toast.LENGTH_SHORT).show();
                        Intent intent = getIntent();
                        intent.putExtra("Resultado", "SI");
                        setResult(RESULT_OK,intent);
                        finish(); // cerramos la ventana y volvemos a la ventana anterior
                    }else{
                        setResult(RESULT_CANCELED);
                    }
                }
            }
        });

    }
}