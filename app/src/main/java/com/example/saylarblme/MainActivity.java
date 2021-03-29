package com.example.saylarblme;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private LinearLayout lnr1,lnr2,lnr3,lnr4;
    Context context=null;
    Class<?> cls=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findView();
        setTheme(R.style.Theme);
        context=getApplicationContext();
        lnr1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            Utility.setNextActivity(context,activity_tables.class);
            }
        });
        lnr2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Utility.setNextActivity(context,activity_ogrenme.class);
            }
        });
        lnr3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Utility.setNextActivity(context,activity_test.class);
            }
        });

        lnr4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://play.google.com/store/apps/details?id=com.setsoft.semihtr13.englishforkids"));
                startActivity(intent);
            }
        });

    }


    @Override
    public void onBackPressed() {
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        builder.setIcon(R.drawable.info);
        builder.setTitle("Çıkış");
        builder.setMessage("Çıkış yapmak istiyor musunuz ?");
        builder.setPositiveButton("Evet", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                finish();
            }
        });
        builder.setNegativeButton("Hayır", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        });
        builder.show();


    }


    private void findView() {
        lnr1 = findViewById(R.id.lnr1);
        lnr2 = findViewById(R.id.lnr2);
        lnr3 = findViewById(R.id.lnr3);
        lnr4 = findViewById(R.id.lnr4);

    }
}