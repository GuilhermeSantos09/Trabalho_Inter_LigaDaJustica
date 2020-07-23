package com.example.liga_herois;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import static android.content.Intent.ACTION_VIEW;


public class MainActivity extends AppCompatActivity {

    private Object Intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void bt_batman(View view){
        Intent intent = new Intent(this, Activity_Batman.class);
        startActivity(intent);
    }
    public void bt_superman(View view){
        Intent intent = new Intent(this, Activity_Superman.class);
        startActivity(intent);
    }
    public void bt_mulher_maravilha(View view){
        Intent intent = new Intent(this, Activity_MulherMara.class);
        startActivity(intent);
    }
    public void bt_aquaman(View view) {
        Intent intent = new Intent(this, Activity_Aquaman.class);
        startActivity(intent);
    }
        public void bt_intent(View view) {
            String url = "https://pt.wikipedia.org/wiki/Categoria:Her%C3%B3is_da_DC_Comics/";
            Intent intent = new Intent(ACTION_VIEW);
            intent.setData(Uri.parse(url));
            startActivity(intent);
    }

}