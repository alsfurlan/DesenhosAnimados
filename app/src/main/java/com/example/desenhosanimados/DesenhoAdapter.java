package com.example.desenhosanimados;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class DesenhoAdapter extends ArrayAdapter<Desenho> {

    public DesenhoAdapter(Context context, List<Desenho> objects) {
        super(context, R.layout.row_layout, objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater layoutInflater = LayoutInflater.from(getContext());

        View view = layoutInflater.inflate(R.layout.row_layout, parent, false);

        Desenho desenho = getItem(position);

        TextView desenhoTextView = view.findViewById(R.id.desenhoTextView);
        desenhoTextView.setText(desenho.getNome());

        ImageView logoImageView = view.findViewById(R.id.logoImageView);
        logoImageView.setImageResource(desenho.getLogo());

        return view;
    }
}
