package com.example.chani.logini;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class LecturaHolder extends RecyclerView.ViewHolder {

    TextView lblLectura, lblGrupo, lblActividad;

    public LecturaHolder(@NonNull View itemView) {
        super(itemView);
        lblActividad = itemView.findViewById(R.id.lblActividad);
        lblGrupo = itemView.findViewById(R.id.lblGrupo);
        lblLectura = itemView.findViewById(R.id.lblLectura);

    }


}
