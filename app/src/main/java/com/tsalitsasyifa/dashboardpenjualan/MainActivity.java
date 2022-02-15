package com.tsalitsasyifa.dashboardpenjualan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void AksiMakanan(View view) {
        Intent intent = new Intent(MainActivity.this,AksiMakanan.class);
        startActivity(intent);
    }

    public void AksRumah(View view) {
        Intent intent = new Intent(MainActivity.this,AksiRumah.class);
        startActivity(intent);
    }

    public void AksiIbu(View view) {
        Intent intent = new Intent(MainActivity.this,AksiIbu.class);
        startActivity(intent);
    }

    public void AksiKesehatan(View view) {
        Intent intent = new Intent(MainActivity.this,AksiKesehatan.class);
        startActivity(intent);
    }

    public void AksiBaju(View view) {
        Intent intent = new Intent(MainActivity.this,AksiBaju.class);
        startActivity(intent);
    }

    public void AksiSkincare(View view) {
        Intent intent = new Intent(MainActivity.this,AksiSkincare.class);
        startActivity(intent);
    }
}