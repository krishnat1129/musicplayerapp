package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class musicadapter extends RecyclerView.Adapter<musicadapter.MyViewHolder> {

    private Context mcontext;
    private ArrayList<musicfiles>mfiles;
    musicadapter(Context mcontext,ArrayList<musicfiles>mfiles){
        this.mfiles = mfiles;
        this.mcontext  = mcontext;
    }

    public musicadapter(newclass newclass, musicfiles musicfiles) {

    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull  ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mcontext).inflate(R.layout.main_front,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull  musicadapter.MyViewHolder holder, int position) {
        holder.filename.setText(mfiles.get(position).getTitle());
        holder.albumname.setText(mfiles.get(position).getAlbum());
        holder.artistname.setText(mfiles.get(position).getArtist());
        //holder.albumart.setImageResource(mfiles.get(position).get);

    }

    @Override
    public int getItemCount() {
        return mfiles.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView filename;
        ImageView albumart;
        TextView artistname;
        TextView albumname;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            filename = itemView.findViewById(R.id.textView);
            albumart = itemView.findViewById(R.id.imageView);
            artistname = itemView.findViewById(R.id.textView2);
            albumname = itemView.findViewById(R.id.textView3);


        }
    }
}
