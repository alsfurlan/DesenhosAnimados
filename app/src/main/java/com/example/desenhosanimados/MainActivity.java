package com.example.desenhosanimados;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView desenhosListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Desenho dragonBallZ = new Desenho("Dragon Ball Z", R.drawable.dragon_ball_z);
        Desenho pokemon = new Desenho("Pokemon", R.drawable.pokemon);
        Desenho digimon = new Desenho("Digimon", R.drawable.digimon);

        List<Desenho> desenhos = Arrays.asList(dragonBallZ, pokemon, digimon);

        final ListAdapter arrayAdapter = new DesenhoAdapter(this, desenhos);

        desenhosListView = findViewById(R.id.desenhosListView);

        desenhosListView.setAdapter(arrayAdapter);

    }
}
