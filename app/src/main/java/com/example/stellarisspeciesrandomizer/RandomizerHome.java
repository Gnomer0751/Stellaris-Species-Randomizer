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

import java.io.FileNotFoundException;

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
                String originTrue = "hi";
                originTrue = RandomSpecies(hi);

                switch(originTrue){
                    case ("Prosperous Unification"): originImageView.setImageResource(R.drawable.prosperousunification);break;
                    case ("Galactic Doorstep"): originImageView.setImageResource(R.drawable.galacticdoorstep);break;
                    case ("Lost Colony"): originImageView.setImageResource(R.drawable.lostcolony);break;
                    case ("Here Be Dragons"): originImageView.setImageResource(R.drawable.here_be_dragons);break;
                    case ("Ocean Paradise"): originImageView.setImageResource(R.drawable.ocean_paradise);break;
                    case ("Clone Army"): originImageView.setImageResource(R.drawable.clones);break;
                    case ("Necrophage"): originImageView.setImageResource(R.drawable.necrophage);break;
                    case ("Resource Consolidation"): originImageView.setImageResource(R.drawable.resource_consolidation);break;
                    case ("Remnants"): originImageView.setImageResource(R.drawable.remnant);break;
                    case ("Life Seeded"): originImageView.setImageResource(R.drawable.life_seeded);break;
                    case ("Post-Apocalyptic"): originImageView.setImageResource(R.drawable.post_apocalyptic);break;
                    case ("Shattered Ring"): originImageView.setImageResource(R.drawable.shattered_ring);break;
                    case ("Void Dwellers"): originImageView.setImageResource(R.drawable.void_dwellers);break;
                    case ("Scion"): originImageView.setImageResource(R.drawable.scion);break;
                    case ("On The Shoulders of Giants"): originImageView.setImageResource(R.drawable.on_the_shoulders_of_giant);break;
                    case ("Common Ground"): originImageView.setImageResource(R.drawable.common_ground);break;
                    case ("Hegemon"): originImageView.setImageResource(R.drawable.hegemon);break;
                    case ("Doomsday"): originImageView.setImageResource(R.drawable.doomsday);break;
                    case ("Syncretic Evolution"): originImageView.setImageResource(R.drawable.syncretic_evolution);break;
                    case ("Mechanist"): originImageView.setImageResource(R.drawable.mechanist);break;
                    case ("Tree of Life"): originImageView.setImageResource(R.drawable.tree_of_life);break;
                }
                System.out.println(originTrue);
            }
        });

    }

}
