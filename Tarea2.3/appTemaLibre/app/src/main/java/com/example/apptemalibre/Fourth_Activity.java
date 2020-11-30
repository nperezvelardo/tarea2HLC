package com.example.apptemalibre;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;


public class Fourth_Activity extends AppCompatActivity {

    TextView nombre, descripcion;
    ImageView foto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth_);

        nombre = (TextView)findViewById(R.id.textViewTitulo);
        descripcion = (TextView)findViewById(R.id.textViewDesc);
        foto = (ImageView) findViewById(R.id.imageViewJuego);

        Intent intent = getIntent();
        if(intent != null){
            //pasamos desde la tercera actividad  el juego que queremos mostrar
            String nombreJuego = intent.getStringExtra("Nombre");
            String descripci = intent.getStringExtra("Descripcion");
            int imagen = intent.getIntExtra("Imagen", 0);

            nombre.setText(nombreJuego);
            descripcion.setText(descripci);
            foto.setImageResource(imagen);

        }

    }
}