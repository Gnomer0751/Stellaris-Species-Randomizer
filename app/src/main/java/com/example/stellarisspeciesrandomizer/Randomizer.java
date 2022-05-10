package com.example.stellarisspeciesrandomizer;

import android.view.View;
import android.widget.ImageView;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Randomizer {
    private static int[] tall= new int[3] ;
    public static String RandomSpecies(String origin) throws FileNotFoundException {
        readFile();
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

            originArray.add(origins4);
            originArray.add(origins5);

            originArray.add(origins6);

            originArray.add(origins7);

            originArray.add(origins18);


            originArray.add(origins19);


            originArray.remove(origins17);
            originArray.remove(origins16);

            originArray.add(origins8);
            originArray.add(origins9);
            originArray.add(origins10);
            originArray.add(origins11);
            originArray.add(origins12);
            originArray.add(origins13);
            originArray.add(origins14);
            originArray.add(origins15);

            originArray.add(origin20);
            originArray.add(origin21);
            originArray.add(origin22);


        originArray.add(origins1);
        originArray.add(origins2);
        originArray.add(origins3);
        origin = originArray.get(random.nextInt(originArray.size()));

        return origin;

    }
    public static void readFile() throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("hasDLC.txt"));
        tall = new int [100];
        int i = 0;
        while(scanner.hasNextInt()){
            tall[i++] = scanner.nextInt();
        }
        System.out.println(tall);

    }
}
