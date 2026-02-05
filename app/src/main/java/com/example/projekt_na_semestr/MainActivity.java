package com.example.projekt_na_semestr;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;
import java.util.SortedMap;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.buttonSTART);
        textView = findViewById(R.id.textView1);
        //textView.setText(""+sekwencja());

        button.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        textView.setText(""+sekwencja());
                    }
                }
        );


    }

    public int sekwencja(){
        Random random = new Random();
        int liczba = random.nextInt(1,5 );
        return  liczba;
        //dodawać to do arraylisty, przechodzić przez listę i podświetlać konkretne buttony
    }
}