package com.example.ismailov_3_3_2;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MangaViewAdapter extends RecyclerView.Adapter<MangaViewHolder> {




    private List<String> MangaNarutoList;
    public void setMangaNarutoList(List<String> mangaNarutoList){
        this.MangaNarutoList =mangaNarutoList;
        notifyDataSetChanged();
    }



    @NonNull
    @Override
    public MangaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MangaViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_manga,parent,false));

    }

    @Override
    public void onBindViewHolder(@NonNull MangaViewHolder holder, int position) {
        holder.onBind(MangaNarutoList.get(position));
    }

    @Override
    public int getItemCount() {
       return MangaNarutoList.size();
    }
}
