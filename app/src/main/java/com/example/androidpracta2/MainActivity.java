package com.example.androidpracta2;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements RecyclerViewAdapter.OnItemClickListener {

    RecyclerView recyclerView;
    ArrayList<Kittens> listCats;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerViewEl);


        listCats = new ArrayList<>();
        listCats.add(new Kittens("Alien Cat", "Alien cat from another world", R.drawable.aliencat));
        listCats.add(new Kittens("Angry Cat", "Angry cat, bc he must go to school", R.drawable.angrycat));
        listCats.add(new Kittens("Funny Cat", "A funny cat, he just waked up ", R.drawable.funnycat));
        listCats.add(new Kittens("Lovely Cat", "A lovely cat, he loves you", R.drawable.lovelycat));
        listCats.add(new Kittens("Proud Cat", "A proud cat, he blew out his problems", R.drawable.proudcat));
        listCats.add(new Kittens("Mysterious Cat", "A mysterious cat, he's from Hogwarts and playing chess", R.drawable.mysteriouscat));
        listCats.add(new Kittens("Suspicious Cat", "A suspicious cat, he's watching you", R.drawable.suspiciouscat));
        listCats.add(new Kittens("Alien Cat", "Alien cat from another world", R.drawable.aliencat));
        listCats.add(new Kittens("Angry Cat", "Angry cat, bc he must go to school", R.drawable.angrycat));
        listCats.add(new Kittens("Funny Cat", "A funny cat, he just waked up ", R.drawable.funnycat));
        listCats.add(new Kittens("Lovely Cat", "A lovely cat, he loves you", R.drawable.lovelycat));
        listCats.add(new Kittens("Proud Cat", "A proud cat, he blew out his problems", R.drawable.proudcat));
        listCats.add(new Kittens("Mysterious Cat", "A mysterious cat, he's from Hogwarts and playing chess", R.drawable.mysteriouscat));
        listCats.add(new Kittens("Suspicious Cat", "A suspicious cat, he's watching you", R.drawable.suspiciouscat));

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(this, listCats);
        recyclerView.setAdapter(adapter);
        adapter.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(int position) {
        Kittens kitten = listCats.get(position);
        Toast.makeText(this, "Kitty's name: " + kitten.getName(), Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(MainActivity.this, Info2Activity.class);
        intent.putExtra("imageResourceId", kitten.getImageResourceId());
        intent.putExtra("name", kitten.getName());
        intent.putExtra("description", kitten.getDescription());
        startActivity(intent);
    }
}