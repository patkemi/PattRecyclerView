package com.example.patrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    private ArrayList<String> mNames = new ArrayList<>();
    private ArrayList<String> mImageUri = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG, "onCreate: started.");

        initImageBitmap();

    }

    private void initImageBitmap(){

        Log.d(TAG, "initImageBitmap: preparing bitmap");

        mImageUri.add("https://c1.staticflickr.com/5/4636/25316407448_de5fbf183d_o.jpg");
        mNames.add("Havasu Falls");

        mImageUri.add("https://images.pexels.com/photos/33109/fall-autumn-red-season.jpg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940.jpg");
        mNames.add("Nature Red Forest Leaves");

        mImageUri.add("https://images.pexels.com/photos/460775/pexels-photo-460775.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940.jpg");
        mNames.add("Animal Photography");

        mImageUri.add("https://images.pexels.com/photos/462118/pexels-photo-462118.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500.jpg");
        mNames.add("Bloom Blooming");

        mImageUri.add("https://images.pexels.com/photos/414612/pexels-photo-414612.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940.jpg");
        mNames.add("Beautiful Blue Bright");

        mImageUri.add("https://images.pexels.com/photos/68147/waterfall-thac-dray-nur-buon-me-thuot-daklak-68147.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500.jpg");
        mNames.add("Wilderness View");

        mImageUri.add("https://images.pexels.com/photos/36762/scarlet-honeyeater-bird-red-feathers.jpg?auto=compress&cs=tinysrgb&dpr=1&w=500.jpg");
        mNames.add("Red Wildlife");

        mImageUri.add("https://images.pexels.com/photos/132472/pexels-photo-132472.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500.jpg");
        mNames.add("Pink Tiger Lilly");

        mImageUri.add("https://images.pexels.com/photos/145939/pexels-photo-145939.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500.jpg");
        mNames.add("Bengal Tiger");

        mImageUri.add("https://images.pexels.com/photos/234510/pexels-photo-234510.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500.jpg");
        mNames.add("Bridge Daylight");

        initRecyclerView();

    }

    private void initRecyclerView(){

        Log.d(TAG, "initRecyclerView: init recyclerview");
        RecyclerView recyclerView = findViewById(R.id.myContainer);
        PatRecyclerViewAdapter recyclerViewAdapter = new PatRecyclerViewAdapter(this, mNames, mImageUri);
        recyclerView.setAdapter(recyclerViewAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
