package com.example.apptemalibre;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

import Utilidades.Juego;
import Utilidades.RecyclerViewAdapter;

public class Third_Activity extends AppCompatActivity {

    ArrayList<Juego> listaJuegos = new ArrayList<>();
    private RecyclerView rv;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager manager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third_);

        rv = (RecyclerView)findViewById(R.id.recyclerView);
        manager = new LinearLayoutManager(this);
        rv.setLayoutManager(manager);

        adapter = new RecyclerViewAdapter(this, getListJuegos());

        ((RecyclerViewAdapter) adapter).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //cuando pulsamos sobre un elemento abrimos la cuarta actividad pasando los datos del elemento pulsado
                Intent i = new Intent(getApplicationContext(), Fourth_Activity.class);
                i.putExtra("Nombre", listaJuegos.get(rv.getChildAdapterPosition(v)).getNombre());
                i.putExtra("Imagen", listaJuegos.get(rv.getChildAdapterPosition(v)).getImgId());
                i.putExtra("Descripcion", listaJuegos.get(rv.getChildAdapterPosition(v)).getDescripcion());
                startActivity(i);
            }
        });

        rv.setAdapter(adapter);

    }

    //metodo que devuelve la lista de los juegos disponibles
    public ArrayList<Juego> getListJuegos(){
        listaJuegos.add(new Juego("Fortnite es un videojuego del año 2017 desarrollado por la empresa Epic Games, lanzado como diferentes paquetes de software que presentan diferentes modos de juego, pero que comparten el mismo motor de juego y mecánicas. Se trata de un juego de zombis en el que supervivientes controlados por humanos cooperaran online para mantener sus fortalezas a salvo", R.drawable.fornite, "Fornite"));
        listaJuegos.add(new Juego("Animal Crossing: New Horizons es un videojuego de simulación social desarrollado y publicado por Nintendo para Nintendo Switch, cuya fecha de lanzamiento mundial fue el 20 de marzo de 2020. Es la novena entrega de la saga Animal Crossing.",R.drawable.animal,"Animal Crossing"));
        listaJuegos.add(new Juego("Sonic the Hedgehog (en español Sonic el Erizo) es una serie de videojuegos publicados por Sega y por Sonic Team. Es uno de los personajes de videojuegos más reconocidos del mundo. En Japón, Sonic no consiguió la misma popularidad que la de Super Mario Bros. en su momento. Pero en Estados Unidos, Sonic consiguió lograr tanta popularidad en el público, que hasta en una encuesta era más famoso que Mickey Mouse.Y en 1993 participó en el Desfile de Acción de Gracias, siendo el primer personaje de videojuegos en participar.", R.drawable.sonic, "Sonic"));
        listaJuegos.add(new Juego("Bomberman es una franquicia de videojuegos estratégico-laberínticos originalmente desarrollada por Hudson Soft y actualmente por Konami. El juego original fue desarrollado por Shinichi Nakamoto y fue lanzado en 1983 para PC y posteriormente para Famicom. Bomberman es un robot que se especializa en la producción de bombas. Él ha sido puesto a trabajar en un recinto subterráneo por fuerzas malignas y eso hace su existencia pesada e insoportable.", R.drawable.bomber, "Bomberman"));
        listaJuegos.add(new Juego("Donkey Kong es un videojuego arcade creado por Nintendo en el año 1981. Es un primitivo juego del género plataformas que se centra en controlar al personaje sobre una serie de plataformas mientras evita obstáculos. La historia no es muy compleja, pero funcionó en aquella época.", R.drawable.donkey, "Donkey Kong"));
        listaJuegos.add(new Juego("Super Mario es una serie de videojuegos de plataformas creados por la empresa desarrolladora Nintendo y protagonizados por su mascota, Mario. También conocida como la serie Super Mario Bros. o simplemente la serie Mario, es la serie principal de la franquicia de Mario. El juego describe las aventuras de los hermanos Mario y Luigi, deben rescatar a la princesa Peach", R.drawable.mario, "Super Mario"));
        listaJuegos.add(new Juego("Crash Bandicoot es el nombre de una serie de videojuegos protagonizado por el personaje del mismo nombre. Fue creada en 1996 por Naughty Dog, quien desarrolló los primeros cuatro títulos, bajo la distribución de Universal Interactive Studios. Un marsupial evolucionado por el científico loco Neo Cortex, quien tenía intenciones viles de controlarlo mentalmente para dirigir su ejército de animales mutantes", R.drawable.crash, "Crash Bandicoot"));
        listaJuegos.add(new Juego("Kirby es una serie de videojuegos desarrollada por HAL Laboratory y Nintendo, empresa que también la distribuye. Kirby es descrito como una criatura esférica de color rosa que vive en el planeta Pop Star. Su principal habilidad es absorber objetos y enemigos para lanzarlos en forma de estrella, o bien tragárselos y copiar sus habilidades", R.drawable.kirby, "Kirby"));
        listaJuegos.add(new Juego("Call of Duty es una serie de videojuegos de disparos en primera persona, de estilo bélico, creada por Ben Chichoski, desarrollada principal e inicialmente por Infinity Ward, Treyarch, Sledgehammer Games y en menor proporción Raven Software y distribuida por Activision. Es un juego Multijugador masivo en línea de Disparos en primera persona desarrollado por Tencent y Activision Shangai para ser jugador exclusivamente en la región de China.", R.drawable.call, "Call of Duty"));
        listaJuegos.add(new Juego("Bob, una esponja cuadrada y amarilla que junto a su mejor amigo Patricio tienen muchas aventuras en el Fondo de Bikini, la ciudad en la que viven, en el fondo del mar. El jugador trata de defender a Fondo de Bikini de una invasión de Robots creados por Plancton que utiliza una máquina llamada el Duplicatotron 3000.", R.drawable.bob, "Bob Esponja"));

        return listaJuegos;
    }


}