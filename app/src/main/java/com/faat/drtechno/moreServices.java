package com.faat.drtechno;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class moreServices extends AppCompatActivity {
Dialog MyDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_more_services);
        BottomNavigationView navView = findViewById(R.id.nav_view);
        navView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        navView.setItemIconTintList(null);
        ImageView btn=findViewById(R.id.backbutn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                finish();
            }
        });
        final TextView appointment,prescription,medicindestats,profile;
        appointment=findViewById(R.id.appointment);
        prescription=findViewById(R.id.prescription);
        medicindestats=findViewById(R.id.medicinestats);
        profile=findViewById(R.id.profile);
        appointment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                appointmentdialog();
            }
        });
        prescription.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                prescriptiondialog();
            }
        });
        medicindestats.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                medicinestatsdialog();
            }
        });
        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),profile.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
            }
        });
         TextView casehistry,documents,history;
        casehistry=findViewById(R.id.casehistory);
        documents=findViewById(R.id.documents);
        history=findViewById(R.id.history);
        casehistry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nousealert();
            }
        });
        documents.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nousealert();
            }
        });
        history.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nousealert();
            }
        });
    }

    public  void nousealert()
    {
        MyDialog = new Dialog(moreServices.this);
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

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.moreservices:
//                    mTextMessage.setText(R.string.title_home);
                    return false;
                case R.id.appointment:
//                    mTextMessage.setText(R.string.title_dashboard);
                    appointmentdialog();
                    return false;
                case R.id.emergency:
//                    mTextMessage.setText(R.string.title_notifications);
//                    Intent intent =new Intent(getApplicationContext(),moreServices.class);
//                    intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
//                    intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
//                    startActivity(intent);
                    return false;
                case R.id.message:
                    Intent intent =new Intent(getApplicationContext(),profile.class);
                    intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                   // startActivity(intent);
                    return false;
            }
            return false;
        }
    };
    public void appointmentdialog()
    {
        Button book,prev;
        MyDialog = new Dialog(moreServices.this);
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
        MyDialog = new Dialog(moreServices.this);
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
//                Intent intent=new Intent(getApplicationContext(),opdHomePage.class);
//                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
//                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
//                startActivity(intent);
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
    public void medicinestatsdialog()
    {
        Button medistat,consumstate;
        MyDialog = new Dialog(moreServices.this);
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
}
