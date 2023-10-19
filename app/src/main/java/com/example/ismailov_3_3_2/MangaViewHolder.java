package com.example.ismailov_3_3_2;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


public class MangaViewHolder extends RecyclerView.ViewHolder {
    private TextView Naruto;
    public MangaViewHolder(@NonNull View itemView) {
        super(itemView);
        Naruto = itemView.findViewById(R.id.Nuruto);
    }
    public void onBind(String MangaNaruto){
        Naruto.setText(MangaNaruto);
    }
}
