package com.faat.drtechno;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;

public class PreviousAppointment extends AppCompatActivity {
RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_previous_appointment);
        PreviousAppoint();


    }

    public void PreviousAppoint(){
        ArrayList<String> mNames = new ArrayList<>();
        ArrayList<String> mImageUrls = new ArrayList<>();
        //Log.d(TAG, "initImageBitmaps: preparing bitmaps.");

        mImageUrls.add("https://c1.staticflickr.com/5/4636/25316407448_de5fbf183d_o.jpg");
        mNames.add("Patient Name");

        mImageUrls.add("https://i.redd.it/tpsnoz5bzo501.jpg");
        mNames.add("Patient Name");

        mImageUrls.add("https://i.redd.it/qn7f9oqu7o501.jpg");
        mNames.add("Patient Name");

        mImageUrls.add("https://i.redd.it/j6myfqglup501.jpg");
        mNames.add("Patient Name");


        mImageUrls.add("https://i.redd.it/0h2gm1ix6p501.jpg");
        mNames.add("Patient Name");

        mImageUrls.add("https://i.redd.it/k98uzl68eh501.jpg");
        mNames.add("Patient Name");

        mImageUrls.add("https://i.redd.it/glin0nwndo501.jpg");
        mNames.add("Patient Name ");

        mImageUrls.add("https://i.redd.it/obx4zydshg601.jpg");
        mNames.add("Patient Name");

        mImageUrls.add("https://i.imgur.com/ZcLLrkY.jpg");
        mNames.add("Patient Name");
        AppointmentRecyclerView(mImageUrls,mNames);
    }
    private void AppointmentRecyclerView(ArrayList mImageUrls,ArrayList mNames){
        Log.d("Startting", "initRecyclerView: init recyclerview");

        LinearLayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        recyclerView = findViewById(R.id.previousAppoint);
        recyclerView.setLayoutManager(layoutManager);
        PreviousAppointmentAdapter adapter = new PreviousAppointmentAdapter(this, mNames, mImageUrls);
        recyclerView.setAdapter(adapter);
    }
}
