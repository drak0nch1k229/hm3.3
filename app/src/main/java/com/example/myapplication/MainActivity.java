package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<String> countryNameList = new ArrayList<>();
    private RecyclerView rvCountry;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        loadData();
    }

    private void loadData(){
        countryNameList.add("Россия");
        countryNameList.add("Канада");
        countryNameList.add("США");
        countryNameList.add("Китай");
        countryNameList.add("Бразилия");
        countryNameList.add("Австралия");
        countryNameList.add("Индия");
        countryNameList.add("Аргентина");
        countryNameList.add("Казахстан");
        countryNameList.add("Алжир");
        countryNameList.add("Конго");
        countryNameList.add("Гренландия");
        countryNameList.add("Саудовская Аравия");
        countryNameList.add("Мексика");
        countryNameList.add("Индонезия");
        initAdapter();
    }

    private void initAdapter(){
        CountryAdapter adapter = new CountryAdapter(countryNameList);
        rvCountry.setAdapter(adapter);
    }

    private void initView(){
        rvCountry = findViewById(R.id.rw_country);
    }
}