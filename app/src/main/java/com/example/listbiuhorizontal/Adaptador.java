package com.example.listbiuhorizontal;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class Adaptador extends BaseAdapter{

    private Context contexto;
    private String[] Dcomenta;
    private String[] Dlista;
    private int[] Dimagenes;
    LayoutInflater inflater;


    public Adaptador(Context contexto, String[] dcomenta,
                     String[] dlista, int[] dimagenes, LayoutInflater inflater) {
        this.contexto = contexto;
        this.Dcomenta = dcomenta;
        this.Dlista = dlista;
        this.Dimagenes = dimagenes;
        this.inflater = inflater;
    }


    @Override
    public int getCount() {
        return Dcomenta.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = inflater.inflate(R.layout.basurota,null);

        TextView text = convertView.findViewById(R.id.text);
        TextView text2 = convertView.findViewById(R.id.text2);
        ImageView imagensota = convertView.findViewById(R.id.imagensota);
        text.setText(Dlista[position]);
        text2.setText(Dcomenta[position]);
        imagensota.setImageResource((Dimagenes[position]));

        return convertView;
    }
}