package com.example.stellarisspeciesrandomizer;

import static com.example.stellarisspeciesrandomizer.Randomizer.RandomSpecies;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class RandomizerHome extends AppCompatActivity {
    String hi = "hi";
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.randomizer_layout);
        ImageView originImageView =(ImageView) findViewById(R.id.originImageView);
        Intent dlcIntent = new Intent(this, DLCPage.class);
        Button dlcButton = (Button) findViewById(R.id.dlc_button);
        dlcButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(dlcIntent);
            }
        });
        Button randomizeButton = (Button) findViewById(R.id.randomize_button);
        randomizeButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String originTrue = RandomSpecies(hi);
                if (originTrue.equals("Prosperous Unification")){
                    originImageView.setImageResource(R.drawable.prosperousunification);
                    System.out.println(originTrue);
                } else if (originTrue.equals("Galactic Doorstep")){
                    originImageView.setImageResource(R.drawable.galacticdoorstep);
                    System.out.println(originTrue);
                } else if (originTrue.equals("Lost Colony")){
                    originImageView.setImageResource(R.drawable.lostcolony);
                    System.out.println(originTrue);
                } else if (originTrue.equals("hi")){
                    System.out.println(originTrue);
                }
            }
        });

    }

}
