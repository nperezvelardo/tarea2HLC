package com.example.appselector;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    TextView rojo, azul, verde, color;
    SeekBar seekbarRojo, seekBarVerde, seekBarAzul;
    View view;
    int r, g, b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rojo = (TextView)findViewById(R.id.textView);
        verde = (TextView)findViewById(R.id.textView2);
        azul = (TextView)findViewById(R.id.textView3);
        color = (TextView)findViewById(R.id.textView4);

        seekbarRojo = (SeekBar)findViewById(R.id.seekBar);
        seekBarVerde = (SeekBar)findViewById(R.id.seekBar2);
        seekBarAzul = (SeekBar)findViewById(R.id.seekBar3);

        view = (View)findViewById(R.id.view);

        rojo.setText("Rojo : 255");
        verde.setText("Verde : 255");
        azul.setText("Azul : 255");
        view.setBackgroundColor(Color.WHITE); //comenzamos con el color blanco
        color.setText("COLOR : #ffffff");

        // Valor Inicial
        seekbarRojo.setProgress(0);
        // Valor Final
        seekbarRojo.setMax(255);

        seekbarRojo.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            //hace la llamada cuando arrastramos
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                rojo.setText("Rojo : "+String.valueOf(progress));
                r = progress;
                view.setBackgroundColor(Color.rgb((int)r,(int)g,(int)b));
                color.setText("COLOR : #"+Integer.toHexString((int)r)+Integer.toHexString((int)g)+Integer.toHexString((int)b));
            }
            //hace la llamada  cuando tocamos
            public void onStartTrackingTouch(SeekBar seekBar) {
            }
            //hace la llamada  cuando se detiene
            public void onStopTrackingTouch(SeekBar seekBar) {
            }
        });

        // Valor Inicial
        seekBarVerde.setProgress(0);
        // Valot Final
        seekBarVerde.setMax(255);

        seekBarVerde.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            //hace la llamada cuando arrastramos
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                verde.setText("Verde: "+String.valueOf(progress));
                g = progress;
                view.setBackgroundColor(Color.rgb((int)r,(int)g,(int)b));
                color.setText("COLOR : #"+Integer.toHexString((int)r)+Integer.toHexString((int)g)+Integer.toHexString((int)b));
            }
            //hace la llamada  cuando tocamos
            public void onStartTrackingTouch(SeekBar seekBar) {
            }
            //hace la llamada  cuando se detiene
            public void onStopTrackingTouch(SeekBar seekBar) {
            }
        });

        // Valor Inicial
        seekBarAzul.setProgress(0);
        // Valot Final
        seekBarAzul.setMax(255);

        seekBarAzul.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            //hace la llamada cuando arrastramos
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                azul.setText("Azul: "+String.valueOf(progress));
                b = progress;
                view.setBackgroundColor(Color.rgb((int)r,(int)g,(int)b));
                color.setText("COLOR : #"+Integer.toHexString((int)r)+Integer.toHexString((int)g)+Integer.toHexString((int)b));
            }
            //hace la llamada  cuando tocamos
            public void onStartTrackingTouch(SeekBar seekBar) {
            }
            //hace la llamada  cuando se detiene
            public void onStopTrackingTouch(SeekBar seekBar) {
            }
        });
    }
}