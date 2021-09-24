package com.example.thieuquangnghia_18041651_baitaptuan3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class danhsachnhac extends AppCompatActivity {
    RecyclerView recyclerView;
    private ArrayList<Music> musicArrayList;
    MusicAdapter musicAdapter ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_danhsachnhac);

        recyclerView=findViewById(R.id.rcvname);
        musicArrayList=new ArrayList<>();
        musicArrayList.add(new Music(R.drawable.eclipse,"Sobin Hoang Son","tro choi"));
        musicArrayList.add(new Music(R.drawable.eclipse,"Song tung","noi nay co anh"));
        musicArrayList.add(new Music(R.drawable.eclipse,"Binz","big cityboy"));
        musicArrayList.add(new Music(R.drawable.eclipse,"sobin hoang son","thangnam"));


        musicAdapter= new MusicAdapter( this,musicArrayList );
        recyclerView.setAdapter(musicAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}