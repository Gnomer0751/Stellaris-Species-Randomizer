package com.example.stellarisspeciesrandomizer;

import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.Random;

public class Randomizer {
    public static String RandomSpecies(String origin){
        Random random = new Random();


        ArrayList<String> originArray = new ArrayList<String>();
        String origins1 = "Prosperous Unification";
        String origins2 = "Galactic Doorstep";
        String origins3 = "Lost Colony";
        String origins4 = "Here Be Dragons";
        String origins5 = "Ocean Paradise";
        String origins6 = "Clone Army";
        String origins7 = "Necrophage";
        if (DLCPage.hasAquaticDlc = true){
            originArray.add(origins4);
            originArray.add(origins5);
        }
        if (DLCPage.hasHumanoidDlc = true){
            originArray.add(origins6);
        }
        if (DLCPage.hasNecroidDlc = true){
            originArray.add(origins7);
        }
        if(DLCPage.hasPlantoidDlc = true){

        }
        if (DLCPage.hasSyntheticDlc = true){

        }
        originArray.add(origins1);
        originArray.add(origins2);
        originArray.add(origins3);
        origin = originArray.get(random.nextInt(originArray.size()));
        return origin;

    }
}
