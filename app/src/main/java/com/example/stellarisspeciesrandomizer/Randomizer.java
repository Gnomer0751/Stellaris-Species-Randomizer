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
        String origins18 = "Resource Consolidation";
        String origins19 = "Remnants";
        String origins16 = "Life Seeded";
        String origins17 = "Post-Apocalyptic";
        String origins8 = "Remnants";
        String origins9 = "Shattered Ring";
        String origins10 = "Void Dwellers";
        String origins11 = "Scion";
        String origins12 = "On The Shoulders of Giants";
        String origins13 = "Common Ground";
        String origins14 = "Hegemon";
        String origins15 = "Doomsday";
        String origin20 = "Syncretic Evolution";
        String origin21 = "Mechanist";
        String origin22 = "String of Life";
        if (DLCPage.hasAquaticDlc = true){
            originArray.add(origins4);
            originArray.add(origins5);
        } else if (DLCPage.hasAquaticDlc = false) {
            originArray.remove(origins4);
            originArray.remove(origins5);
        }
        if (DLCPage.hasHumanoidDlc = true){
            originArray.add(origins6);
        } else if (DLCPage.hasHumanoidDlc = false) {
            originArray.remove(origins6);
        }
        if (DLCPage.hasNecroidDlc = true){
            originArray.add(origins7);
        }else if (DLCPage.hasNecroidDlc = false) {
            originArray.remove(origins7);
        }
        if (DLCPage.hasSyntheticDlc = true){
            originArray.add(origins18);
        }else if (DLCPage.hasSyntheticDlc = false) {
            originArray.remove(origins18);
        }
        if (DLCPage.hasAncientDlc = true){
            originArray.add(origins19);
        }else if (DLCPage.hasAncientDlc = false) {
            originArray.remove(origins19);
        }
        if (DLCPage.hasApocalypseDlc = true){

            originArray.add(origins16);
            originArray.add(origins17);
        } else if (DLCPage.hasApocalypseDlc = false) {
            originArray.remove(origins17);
            originArray.remove(origins16);
        }
        if (DLCPage.hasFederationsDlc = true){
            originArray.add(origins8);
            originArray.add(origins9);
            originArray.add(origins10);
            originArray.add(origins11);
            originArray.add(origins12);
            originArray.add(origins13);
            originArray.add(origins14);
            originArray.add(origins15);
        } else if (DLCPage.hasFederationsDlc = true) {
            originArray.remove(origins8);
            originArray.remove(origins9);
            originArray.remove(origins10);
            originArray.remove(origins11);
            originArray.remove(origins12);
            originArray.remove(origins13);
            originArray.remove(origins14);
            originArray.remove(origins15);
        }
        if (DLCPage.hasUtopiaDlc = true){

            originArray.add(origin20);
            originArray.add(origin21);
            originArray.add(origin22);
        }else if (DLCPage.hasUtopiaDlc = false) {
            originArray.remove(origin20);
            originArray.remove(origin21);
            originArray.remove(origin22);
        }
        originArray.add(origins1);
        originArray.add(origins2);
        originArray.add(origins3);
        origin = originArray.get(random.nextInt(originArray.size()));
        return origin;

    }
}
