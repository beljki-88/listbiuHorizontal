package com.example.listbiuhorizontal;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    String ComentaD [] = {"uno","dos","tres","cuatro","cinco",
            "seis","siete","ocho","nueve","diez"};
    String ListaD [] = {"Duno","Ddos","Dtres","Dcuatro","Dcinco",
            "Dseis","Dsiete","Docho","Dnueve","Ddiez"};

    int imagenesD[] = {R.drawable.furro,R.drawable.gacha,R.drawable.gatito,
            R.drawable.miku,R.drawable.jesus,
            R.drawable.minovio,R.drawable.mothermother,R.drawable.pastel,
            R.drawable.perropelon,R.drawable.sackboy2};

    LinearLayout contenedorsote;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

       contenedorsote = findViewById(R.id.contenedorsote);

        Adaptador adaptadorsote = new Adaptador(getApplicationContext(),
                ComentaD,
                ListaD,
                imagenesD, getLayoutInflater());

       for (int i=0;i<adaptadorsote.getCount();i++)
        {
            View vista = adaptadorsote.getView(i,null,contenedorsote);

            final int posicion = i;
            vista.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(MainActivity.this, String.valueOf(posicion), Toast.LENGTH_SHORT).show();
                }
            });
            contenedorsote.addView(vista);
        }
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id)
    {

    }
}