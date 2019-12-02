package com.example.tablerecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

//belajar dari AzharRivaldi

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerViewDeliveryProductList);

        TableViewAdapter adapter = new TableViewAdapter(getMovieList());

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);

        recyclerView.setAdapter(adapter);

    }

    private List<MovieModel> getMovieList() {
        List<MovieModel> movieList = new ArrayList<>();

        movieList.add(new MovieModel(1, "Pocong Takut Kuntilanak", 2019, 45000));
        movieList.add(new MovieModel(2, "Ibuku Ternyata Mamak ku", 2015, 36500));
        movieList.add(new MovieModel(3, "Tukang Kibul Kena Kibul", 2018, 31600));
        movieList.add(new MovieModel(4, "Dunia Fantaasi Yang Baru", 2020, 30000));
        movieList.add(new MovieModel(5, "Huatan Tiga Dimensi", 2017, 36000));
        movieList.add(new MovieModel(6, "Perang Solo Player", 2018, 27500));
        movieList.add(new MovieModel(7, "Joko Sang Pahlawan", 2017, 26400));
        movieList.add(new MovieModel(8, "Batam dan Bandung Pereman", 2016, 263000));
        movieList.add(new MovieModel(9, "Bintang Planet Tersesat", 2017, 263000));
        movieList.add(new MovieModel(10, "Trigadi Sadis", 2010, 260000));
        movieList.add(new MovieModel( 11, "Jomblo dan Janda", 2016,40000));
        movieList.add(new MovieModel(12, "Pelakor Kena Bully",2019,50000));
        movieList.add(new MovieModel(13, "Pencuri Keselek Bakso", 2019,30000));
        movieList.add(new MovieModel(14, "Bakso Terbang Peneror", 2010, 40000));
        movieList.add(new MovieModel(15,"Aku Dia dan Istri Baru", 2019,335600));
        movieList.add(new MovieModel(16, "Cinta Suci Yang Tak TerBalas",2019,90000));
        movieList.add(new MovieModel(17,"Tragedi Cinta Indah",2019,98000));


        return movieList;


    }
}
