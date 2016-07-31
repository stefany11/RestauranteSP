package com.facci.restaurantsp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivitySP extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity_sp);
    }
    public void click1(View v){
        Toast.makeText(MainActivitySP.this,"TONGA",Toast.LENGTH_SHORT).show();
    }

    public void click12(View v){
        Toast.makeText(MainActivitySP.this,"ARROZ CON CAMARON",Toast.LENGTH_SHORT).show();
    }

    public void click3(View v){
        Toast.makeText(MainActivitySP.this,"CEVICHE DE PESCADO",Toast.LENGTH_SHORT).show();
    }

    public void click4(View v){
        Toast.makeText(MainActivitySP.this,"BANDEJA DE MARISCO",Toast.LENGTH_SHORT).show();
    }

    public void click5(View v){
        Toast.makeText(MainActivitySP.this,"DESAYUNO",Toast.LENGTH_SHORT).show();
    }
    public void click6(View v){
        Toast.makeText(MainActivitySP.this,"CEVICHE MARINERO",Toast.LENGTH_SHORT).show();
    }

    public void click7(View v){
        Toast.makeText(MainActivitySP.this,"DESAYUNO2",Toast.LENGTH_SHORT).show();
    }
}
