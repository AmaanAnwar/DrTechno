package com.faat.drtechno;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
//import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class opdHomePage extends AppCompatActivity {
    String str= "Select Location";
    TextView selectlocation;
    Dialog MyDialog;
   public void homenav()
    {
        Intent intent=new Intent(getApplicationContext(),opdHomePage.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }
    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(MenuItem item) {
            switch (item.getItemId()) {
                case R.id.appointment:
//                    mTextMessage.setText(R.string.title_home);
                    appointmentdialog();
                    return false;
                case R.id.emergency:
//                    mTextMessage.setText(R.string.title_dashboard);
                    return false;
                case R.id.moreservices:
//                    mTextMessage.setText(R.string.title_notifications);
                        Intent intent =new Intent(getApplicationContext(),moreServices.class);
                    intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        startActivity(intent);
                    return false;
                case R.id.message:
                    Intent intentpro =new Intent(getApplicationContext(),profile.class);
                    intentpro.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    intentpro.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    //startActivity(intentpro);
                return false;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opd_homepage);
        BottomNavigationView navView = findViewById(R.id.nav_view);
        navView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        navView.setItemIconTintList(null);
        selectlocation=findViewById(R.id.selec);
        eventdisplay();
        hospitaldisplay();
        selectlocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(getApplicationContext(),"Please Wait",Toast.LENGTH_SHORT).show();
                MyCustomAlertDialog();

            }
        });

        ImageView imageView=findViewById(R.id.actionhome);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                homenav();
            }
        });
        ImageButton appointment=findViewById(R.id.img1);
        appointment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                appointmentdialog();
            }
        });

         ImageButton prescription=findViewById(R.id.img3);
        prescription.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                prescriptiondialog();
            }
        });
         ImageButton medicinestats=findViewById(R.id.img6);
        medicinestats.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                medicinestatsdialog();
            }
        });

        ImageButton pro=findViewById(R.id.img2);
        pro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(getApplicationContext(),profile.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
            }
        });
        ImageView reports=findViewById(R.id.img4);
        reports.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),ReportsActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
            }
        });
        ImageView invoice=findViewById(R.id.img5);
        invoice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),invoic.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
            }
        });
        ImageButton casehistory =findViewById(R.id.img7);
        casehistory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nousealert();
            }
        });
        ImageButton documents=findViewById(R.id.img8);
        documents.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nousealert();
            }
        });
        ImageButton history=findViewById(R.id.img9);
        history.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nousealert();
            }
        });

        TextView viewmore=findViewById(R.id.viewmore);
        viewmore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(getApplicationContext(),profile.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
            }
        });


    }
    public  void nousealert()
    {
        MyDialog = new Dialog(opdHomePage.this);
        MyDialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        MyDialog.setContentView(R.layout.nousedialog);
        Button clos ;
        clos=MyDialog.findViewById(R.id.clos);
        clos.setEnabled(true);
        clos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MyDialog.cancel();
            }
        });
        MyDialog.show();
    }
    public void appointmentdialog()
    {
        Button book,prev;
        MyDialog = new Dialog(opdHomePage.this);
        MyDialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        MyDialog.setContentView(R.layout.appointmentdialog);
         book= MyDialog.findViewById(R.id.book);
        prev = MyDialog.findViewById(R.id.prev);

        book.setEnabled(true);
        prev.setEnabled(true);

        book.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),bookAppointment.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
                MyDialog.cancel();

            }
        });
        prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),PreviousAppointment.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);

                startActivity(intent);
                MyDialog.cancel();
            }
        });

        MyDialog.show();
    }
    public void prescriptiondialog()
    {
        MyDialog = new Dialog(opdHomePage.this);
        MyDialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        MyDialog.setContentView(R.layout.prescriptiondialog);
       Button current  = MyDialog.findViewById(R.id.current);
      Button prevp   = MyDialog.findViewById(R.id.prevp);
      Button visiys   = MyDialog.findViewById(R.id.visits);
        current.setEnabled(true);
        prevp.setEnabled(true);
        visiys.setEnabled(true);

        current.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),currentPrescription.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
            MyDialog.cancel();

        }
    });
        prevp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent=new Intent(getApplicationContext(),opdHomePage.class);
//                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
//                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
//                startActivity(intent);
                MyDialog.cancel();

            }
        });
        visiys.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),VisistHistory.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);

                startActivity(intent);
                MyDialog.cancel();
            }
        });

        MyDialog.show();
    }
    public void medicinestatsdialog()
    {
        Button medistat,consumstate;
        MyDialog = new Dialog(opdHomePage.this);
        MyDialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        MyDialog.setContentView(R.layout.medicinedialog);
       medistat = MyDialog.findViewById(R.id.medistat);
        consumstate = MyDialog.findViewById(R.id.consustate);

        medistat.setEnabled(true);
        consumstate.setEnabled(true);

        medistat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent=new Intent(getApplicationContext(),opdHomePage.class);
//                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
//                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
//                startActivity(intent);
                MyDialog.cancel();

            }
        });
        consumstate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent=new Intent(getApplicationContext(),opdHomePage.class);
//                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
//                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
//
//                startActivity(intent);
                MyDialog.cancel();
            }
        });

        MyDialog.show();
    }


    public void MyCustomAlertDialog(){
        AlertDialog.Builder b = new AlertDialog.Builder(this);
        b.setTitle("Select Location");
        final String[] types = getResources().getStringArray(R.array.india_top_places);
        b.setItems(types, new DialogInterface.OnClickListener() {

            @Override
            public void onClick(DialogInterface dialog, int which) {
                str = types[which];
                setlocation();
                dialog.dismiss();
            }
        });
        b.show();

    }
    public void setlocation()
    {
        selectlocation.setText(str);

    }
    private void eventdisplay()
    {
        // final String TAG = "ipdHomePage";
        ArrayList<String> mNames = new ArrayList<>();
        ArrayList<String> mImageUrls = new ArrayList<>();
        //Log.d(TAG, "initImageBitmaps: preparing bitmaps.");

        mImageUrls.add("https://c1.staticflickr.com/5/4636/25316407448_de5fbf183d_o.jpg");
        mNames.add("Havasu Falls");

        mImageUrls.add("https://i.redd.it/tpsnoz5bzo501.jpg");
        mNames.add("Trondheim");

        mImageUrls.add("https://i.redd.it/qn7f9oqu7o501.jpg");
        mNames.add("Portugal");

        mImageUrls.add("https://i.redd.it/j6myfqglup501.jpg");
        mNames.add("Rocky Mountain");


        mImageUrls.add("https://i.redd.it/0h2gm1ix6p501.jpg");
        mNames.add("Mahahual");

        mImageUrls.add("https://i.redd.it/k98uzl68eh501.jpg");
        mNames.add("Frozen Lake");


        mImageUrls.add("https://i.redd.it/glin0nwndo501.jpg");
        mNames.add("White Sands Desert");

        mImageUrls.add("https://i.redd.it/obx4zydshg601.jpg");
        mNames.add("Austrailia");

        mImageUrls.add("https://i.imgur.com/ZcLLrkY.jpg");
        mNames.add("Washington");

        initRecyclerView(mImageUrls,mNames);

    }

    private void hospitaldisplay()
    {
        // final String TAG = "ipdHomePage";
        ArrayList<String> mNames = new ArrayList<>();
        ArrayList<String> mImageUrls = new ArrayList<>();
        //Log.d(TAG, "initImageBitmaps: preparing bitmaps.");

        mImageUrls.add("https://c1.staticflickr.com/5/4636/25316407448_de5fbf183d_o.jpg");
        mNames.add("Havasu Falls");

        mImageUrls.add("https://i.redd.it/tpsnoz5bzo501.jpg");
        mNames.add("Trondheim");

        mImageUrls.add("https://i.redd.it/qn7f9oqu7o501.jpg");
        mNames.add("Portugal");

        mImageUrls.add("https://i.redd.it/j6myfqglup501.jpg");
        mNames.add("Rocky Mountain National Park");


        mImageUrls.add("https://i.redd.it/0h2gm1ix6p501.jpg");
        mNames.add("Mahahual");

        mImageUrls.add("https://i.redd.it/k98uzl68eh501.jpg");
        mNames.add("Frozen Lake");


        mImageUrls.add("https://i.redd.it/glin0nwndo501.jpg");
        mNames.add("White Sands ");

        mImageUrls.add("https://i.redd.it/obx4zydshg601.jpg");
        mNames.add("Austrailia");

        mImageUrls.add("https://i.imgur.com/ZcLLrkY.jpg");
        mNames.add("Washington");

        hospitalinitRecyclerView(mImageUrls,mNames);

    }
    private void initRecyclerView(ArrayList mImageUrls,ArrayList mNames){
        //Log.d(TAG, "initRecyclerView: init recyclerview");
        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        RecyclerView recyclerView = findViewById(R.id.recv);
        recyclerView.setLayoutManager(layoutManager);
        EventsViewAdapter adapter = new EventsViewAdapter(this, mNames, mImageUrls);
        recyclerView.setAdapter(adapter);
    }

    private void hospitalinitRecyclerView(ArrayList mImageUrls,ArrayList mNames){
        //Log.d(TAG, "initRecyclerView: init recyclerview");
        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        RecyclerView recyclerView = findViewById(R.id.recv2);
        recyclerView.setLayoutManager(layoutManager);
        HospitalViewAdapter adapter = new HospitalViewAdapter(this, mNames, mImageUrls);
        recyclerView.setAdapter(adapter);
    }


}
