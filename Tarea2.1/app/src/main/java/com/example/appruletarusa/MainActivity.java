package com.example.appruletarusa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btn1, btn2, btn3, btn4, btn5, btn6, btnInicio;
    int numero; //guardaremos el numero aleatorio en cada momento
    boolean jugador = false; //para saber el turno del jugador
    boolean jugar = false; //para controlar que se pulsa el boton inicio para comenzar el juego
    TextView texto;
    Menu menu;
    MenuItem item;
    ImageView imgView;

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_1, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        switch (item.getItemId())
        {
            case R.id.id_item1:
                Intent i = new Intent(getApplicationContext(), SecondActivity.class);
                startActivity(i);   //iniciamos second activity
            default:
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = (Button)findViewById(R.id.btn1);
        btn2 = (Button)findViewById(R.id.btn2);
        btn3 = (Button)findViewById(R.id.btn3);
        btn4 = (Button)findViewById(R.id.btn5);
        btn5 = (Button)findViewById(R.id.btn4);
        btn6 = (Button)findViewById(R.id.btn6);
        btnInicio = (Button)findViewById(R.id.btnInicio);
        imgView = (ImageView) findViewById(R.id.imageView);
        texto = (TextView)findViewById(R.id.textView3);



        btnInicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numero = generaNumeroAleatorio(1,6);
                btnInicio.setText("REINICIAR");
                texto.setText("Comienza el juego");
                imgView.setImageResource(R.drawable.play);
                jugador = true;
                jugar = true; //podemos comenzar a jugar
                //volvemos a establecer el color blanco a cada botón
                btn1.setTextColor(Color.WHITE);
                btn2.setTextColor(Color.WHITE);
                btn3.setTextColor(Color.WHITE);
                btn4.setTextColor(Color.WHITE);
                btn5.setTextColor(Color.WHITE);
                btn6.setTextColor(Color.WHITE);

            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(jugar) {
                    if(jugador){
                        if(numero == 1){
                            imgView.setImageResource(R.drawable.over);
                            btnInicio.setText("INICIO");
                            texto.setText("Ohh!!Has perdido jugador 1 :(");
                            jugar = false;  //hasta que no pulse el boton inicio no se puede jugar
                            btn1.setTextColor(Color.RED);
                        }
                        else{
                            imgView.setImageResource(R.drawable.seguir);
                            texto.setText("Te has salvado jugador 1 :)");
                            btn1.setTextColor(Color.GREEN);
                        }
                        jugador = false; //le toca al jugador 2
                    }else{
                        if(numero == 1){
                            imgView.setImageResource(R.drawable.over);
                            btnInicio.setText("INICIO");
                            texto.setText("Ohh!!Has perdido jugador 2 :(");
                            jugar = false; //hasta que no pulse el boton inicio no se puede jugar
                            btn1.setTextColor(Color.RED);
                        }
                        else{
                            imgView.setImageResource(R.drawable.seguir);
                            texto.setText("Te has salvado jugador 2 :)");
                            btn1.setTextColor(Color.GREEN);
                        }
                        jugador = true;  //le toca al jugador 1
                    }
                }
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(jugar){
                    if(jugador){
                        if(numero == 2){
                            imgView.setImageResource(R.drawable.over);
                            btnInicio.setText("INICIO");
                            texto.setText("Ohh!!Has perdido jugador 1 :(");
                            jugar = false; //hasta que no pulse el boton inicio no se puede jugar
                            btn2.setTextColor(Color.RED);
                        }
                        else{
                            imgView.setImageResource(R.drawable.seguir);
                            texto.setText("Te has salvado jugador 1 :)");
                            btn2.setTextColor(Color.GREEN);
                        }
                        jugador = false; //le toca al jugador 2
                    }else{
                        if(numero == 2){
                            imgView.setImageResource(R.drawable.over);
                            btnInicio.setText("INICIO");
                            texto.setText("Ohh!!Has perdido jugador 2 :(");
                            jugar = false; //hasta que no pulse el boton inicio no se puede jugar
                            btn2.setTextColor(Color.RED);
                        }
                        else{
                            imgView.setImageResource(R.drawable.seguir);
                            texto.setText("Te has salvado jugador 2 :)");
                            btn2.setTextColor(Color.GREEN);
                        }
                        jugador = true;  //le toca al jugador 1
                    }
                }
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (jugar) {
                    if (jugador) {
                        if (numero == 3) {
                            imgView.setImageResource(R.drawable.over);
                            btnInicio.setText("INICIO");
                            texto.setText("Ohh!!Has perdido jugador 1 :(");
                            jugar = false; //hasta que no pulse el boton inicio no se puede jugar
                            btn3.setTextColor(Color.RED);
                        } else {
                            imgView.setImageResource(R.drawable.seguir);
                            texto.setText("Te has salvado jugador 1 :)");
                            btn3.setTextColor(Color.GREEN);
                        }
                        jugador = false; //le toca al jugador 2
                    } else {
                        if (numero == 3) {
                            imgView.setImageResource(R.drawable.over);
                            btnInicio.setText("INICIO");
                            texto.setText("Ohh!!Has perdido jugador 2 :(");
                            jugar = false; //hasta que no pulse el boton inicio no se puede jugar
                            btn3.setTextColor(Color.RED);
                        } else {
                            imgView.setImageResource(R.drawable.seguir);
                            texto.setText("Te has salvado jugador 2 :)");
                            btn3.setTextColor(Color.GREEN);
                        }
                        jugador = true;  //le toca al jugador 1
                    }
                }
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (jugar) {
                    if (jugador) {
                        if (numero == 4) {
                            imgView.setImageResource(R.drawable.over);
                            btnInicio.setText("INICIO");
                            texto.setText("Ohh!!Has perdido jugador 1 :(");
                            jugar = false; //hasta que no pulse el boton inicio no se puede jugar
                            btn4.setTextColor(Color.RED);
                        } else {
                            imgView.setImageResource(R.drawable.seguir);
                            texto.setText("Te has salvado jugador 1 :)");
                            btn4.setTextColor(Color.GREEN);
                        }
                        jugador = false; //le toca al jugador 2
                    } else {
                        if (numero == 4) {
                            imgView.setImageResource(R.drawable.over);
                            btnInicio.setText("INICIO");
                            texto.setText("Ohh!!Has perdido jugador 2 :(");
                            jugar = false; //hasta que no pulse el boton inicio no se puede jugar
                            btn4.setTextColor(Color.RED);
                        } else {
                            imgView.setImageResource(R.drawable.seguir);
                            texto.setText("Te has salvado jugador 2 :)");
                            btn4.setTextColor(Color.GREEN);
                        }
                        jugador = true;  //le toca al jugador 1
                    }
                }
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (jugar) {
                    if (jugador) {
                        if (numero == 5) {
                            imgView.setImageResource(R.drawable.over);
                            btnInicio.setText("INICIO");
                            texto.setText("Ohh!!Has perdido jugador 1 :(");
                            jugar = false; //hasta que no pulse el boton inicio no se puede jugar
                            btn5.setTextColor(Color.RED);
                        } else {
                            imgView.setImageResource(R.drawable.seguir);
                            texto.setText("Te has salvado jugador 1 :)");
                            btn5.setTextColor(Color.GREEN);
                        }
                        jugador = false; //le toca al jugador 2
                    } else {
                        if (numero == 5) {
                            imgView.setImageResource(R.drawable.over);
                            btnInicio.setText("INICIO");
                            texto.setText("Ohh!!Has perdido jugador 2 :(");
                            jugar = false; //hasta que no pulse el boton inicio no se puede jugar
                            btn5.setTextColor(Color.RED);
                        } else {
                            imgView.setImageResource(R.drawable.seguir);
                            texto.setText("Te has salvado jugador 2 :)");
                            btn5.setTextColor(Color.GREEN);
                        }
                        jugador = true;  //le toca al jugador 1
                    }
                }
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (jugar) {
                    if (jugador) {
                        if (numero == 6) {
                            imgView.setImageResource(R.drawable.over);
                            btnInicio.setText("INICIO");
                            texto.setText("Ohh!!Has perdido jugador 1 :(");
                            jugar = false; //hasta que no pulse el boton inicio no se puede jugar
                            btn6.setTextColor(Color.RED);
                        } else {
                            imgView.setImageResource(R.drawable.seguir);
                            texto.setText("Te has salvado jugador 1 :)");
                            btn6.setTextColor(Color.GREEN);
                        }
                        jugador = false; //le toca al jugador 2
                    } else {
                        if (numero == 6) {
                            imgView.setImageResource(R.drawable.over);
                            btnInicio.setText("INICIO");
                            texto.setText("Ohh!!Has perdido jugador 2 :(");
                            jugar = false; //hasta que no pulse el boton inicio no se puede jugar
                            btn6.setTextColor(Color.RED);
                        } else {
                            imgView.setImageResource(R.drawable.seguir);
                            texto.setText("Te has salvado jugador 2 :)");
                            btn6.setTextColor(Color.GREEN);
                        }
                        jugador = true;  //le toca al jugador 1
                    }
                }
            }
        });

    }

    public static int generaNumeroAleatorio(int minimo, int maximo) {
        int num = (int) Math.floor(Math.random() * (maximo - minimo + 1) + (minimo));
        return num;
    }
}