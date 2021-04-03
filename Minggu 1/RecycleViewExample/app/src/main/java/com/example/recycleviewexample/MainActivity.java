package com.example.recycleviewexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.ArrayList;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private RecyclerView viewRec;
    private MahasiswaAdapter adapter;
    private ArrayList<Mahasiswa> mahasiswaArrayList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addData();
        viewRec = (RecyclerView) findViewById(R.id.recycle_view);
        adapter = new MahasiswaAdapter(mahasiswaArrayList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
        viewRec.setLayoutManager(layoutManager);
        viewRec.setAdapter(adapter);
    }

    void addData() {
        mahasiswaArrayList = new ArrayList<>();
        mahasiswaArrayList.add(new Mahasiswa("Firman Wahyudi","E41190305","085231481241"));
        mahasiswaArrayList.add(new Mahasiswa("Iqbal Ikhlasul Amal","E41190528","08289745121"));
        mahasiswaArrayList.add(new Mahasiswa("Sara Laiqa","11908111","08123457121"));
        mahasiswaArrayList.add(new Mahasiswa("Dicky Kurnia Ramadhan","E41191553","085232281241"));
        mahasiswaArrayList.add(new Mahasiswa("Kana Farira","E41190322","085331484241"));
        mahasiswaArrayList.add(new Mahasiswa("Priska Arlinda","E41190668","085331001241"));
        mahasiswaArrayList.add(new Mahasiswa("Satsa Ratri Hastutik","E41191795","082911984811"));
    }
}