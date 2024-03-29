package com.example.stellarisspeciesrandomizer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);
        Intent randomizerIntent = new Intent(this, RandomizerHome.class);
        Button intentButton = (Button) findViewById(R.id.button_start);
        intentButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(randomizerIntent);
            }
        });

    }
}