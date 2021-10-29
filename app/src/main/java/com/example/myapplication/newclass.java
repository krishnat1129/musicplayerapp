package com.example.myapplication;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.lang.invoke.MutableCallSite;

public class newclass {
    RecyclerView recyclerView;
    musicadapter Musicadapter;
    musicfiles musicfiles;


    public newclass(){

    }
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.main_front,container,false    );
        recyclerView = view.findViewById(R.id.recyclerview1);
        recyclerView.setHasFixedSize(true);
        Musicadapter = new musicadapter(this,musicfiles);
        recyclerView.setAdapter(Musicadapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(inflater.getContext(),RecyclerView.VERTICAL,false));
        return view;
    }
}
