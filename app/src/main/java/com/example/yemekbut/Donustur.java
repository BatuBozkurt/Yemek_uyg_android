package com.example.yemekbut;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public abstract class Donustur extends RecyclerView.Adapter<Donustur.OzelViewHolder> {
    class OzelViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        public OzelViewHolder(@NonNull View itemView) {
            super(itemView);
        }

        @Override
        public void onClick(View view) {

        }
    }
}
