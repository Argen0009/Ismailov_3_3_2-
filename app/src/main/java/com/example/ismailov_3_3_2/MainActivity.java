    package com.example.ismailov_3_3_2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;

import java.util.ArrayList;

    public class MainActivity extends AppCompatActivity {

    MangaViewAdapter mangaViewAdapter;
    private RecyclerView Manga;



    private ArrayList<String> MangaList = new ArrayList<>();
    int spanCout = 2;
    int orientation = StaggeredGridLayoutManager.VERTICAL;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        InitView();
        loadData();
    }
        private void InitView() {

            MangaViewAdapter adapter = new MangaViewAdapter();
            Manga = findViewById(R.id.Manga);


        }

        private void loadData() {
            MangaList.add("1");
            MangaList.add("2");
            MangaList.add("3");
            MangaList.add("4");
            MangaList.add("5");
           MangaList .add("6");
            MangaList.add("7");
            MangaList.add("8");
            MangaList.add("9");
            MangaList.add("10");
            MangaList.add("11");
            MangaList.add("12");
            initAdapter();
        }

        private void initAdapter() {
            StaggeredGridLayoutManager layoutManager = new StaggeredGridLayoutManager(spanCout,orientation);
            Manga.setLayoutManager(layoutManager);

            MangaViewAdapter adapter = new MangaViewAdapter();
            Manga.setAdapter(adapter);

        }




    }