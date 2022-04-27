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
        if (DLCPage.hasAquaticDlc = true){
            String origins4 = "Here Be Dragons";
            String origins5 = "Ocean Paradise";
            originArray.add(origins4);
            originArray.add(origins5);
        }
        if (DLCPage.hasHumanoidDlc = true){
            String origins6 = "Clone Army";
            originArray.add(origins6);
        }
        if (DLCPage.hasNecroidDlc = true){
            String origins7 = "Necrophage";
            originArray.add(origins7);
        }
        if (DLCPage.hasSyntheticDlc = true){
            String origins18 = "Resource Consolidation";
            originArray.add(origins18);
        }
        if (DLCPage.hasAncientDlc = true){
            String origins19 = "Remnants";
            originArray.add(origins19);
        }
        if (DLCPage.hasApocalypseDlc = true){
            String origins16 = "Life Seeded";
            String origins17 = "Post-Apocalyptic";
            originArray.add(origins16);
            originArray.add(origins17);
        }
        if (DLCPage.hasFederationsDlc = true){
            String origins8 = "Remnants";
            String origins9 = "Shattered Ring";
            String origins10 = "Void Dwellers";
            String origins11 = "Scion";
            String origins12 = "On The Shoulders of Giants";
            String origins13 = "Common Ground";
            String origins14 = "Hegemon";
            String origins15 = "Doomsday";
            originArray.add(origins8);
            originArray.add(origins9);
            originArray.add(origins10);
            originArray.add(origins11);
            originArray.add(origins12);
            originArray.add(origins13);
            originArray.add(origins14);
            originArray.add(origins15);
        }
        if (DLCPage.hasUtopiaDlc = true){
            String origin20 = "Syncretic Evolution";
            String origin21 = "Mechanist";
            String origin22 = "String of Life";
            originArray.add(origin20);
            originArray.add(origin21);
            originArray.add(origin22);
        }
        originArray.add(origins1);
        originArray.add(origins2);
        originArray.add(origins3);
        origin = originArray.get(random.nextInt(originArray.size()));
        return origin;

    }
}
