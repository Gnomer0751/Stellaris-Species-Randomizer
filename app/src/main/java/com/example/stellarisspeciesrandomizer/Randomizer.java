package com.example.stellarisspeciesrandomizer;

import android.view.View;
import android.widget.ImageView;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Random;
import java.util.Scanner;

public class Randomizer {

    public static boolean isGestalt;
    public static HashMap RandomSpecies(HashMap<Integer, String> randomizedDict) throws FileNotFoundException {
        Random random = new Random();
        HashMap<Integer,String> originDict = new HashMap<Integer,String>();
        HashMap<Integer,String> speciesDict = new HashMap<Integer,String>();


        speciesDict.put(0,"Humanoid");
        speciesDict.put(1,"Mammalian");
        speciesDict.put(2,"Reptilian");
        speciesDict.put(3,"Avian");
        speciesDict.put(4,"Arthropoid");
        speciesDict.put(5,"Molluscoid");
        speciesDict.put(6,"Fungoid");
        speciesDict.put(7,"Plantoid");
        speciesDict.put(8,"Lithoid");
        speciesDict.put(9,"Necroid");
        speciesDict.put(10,"Aquatic");
        speciesDict.put(11,"Toxoid");
        speciesDict.put(12,"Machine");
        String species = speciesDict.get(random.nextInt(speciesDict.size()));
        ArrayList<String[]> gov_ethics = new ArrayList<String[]>();
        ArrayList<String> generated_gov_ethics = new ArrayList<String>();

        // Ethic pairs
        String[] NS = {"Militarist", "Pacifist"};
        String[] NeSw = {"Xenophobe", "Xenophile"};
        String[] EW = {"Egalitarian", "Authoritarian"};
        String[] SeNw = {"Materialist", "Spiritualist"};
        String[] Gestalt = {"Gestalt Consciousness"};

        // Adds ethic pairs to gov_ethics
        String[][] all = {NS, NeSw, EW, SeNw, Gestalt};
        for (int i = 0; i < all.length; i++) {
            gov_ethics.add(all[i]);
        }
        int points_available = 3;
        while (points_available > 0) {
            Random rng = new Random();
            // Picks random pair
            int idx = rng.nextInt(gov_ethics.size());
            String[] rand_pair = gov_ethics.get(idx);
            gov_ethics.remove(idx); // Prevents duplicate pulls
            // Picks from pair
            idx = rng.nextInt(rand_pair.length);
            String ethic = rand_pair[idx];
            // Gestalt exception
            if (points_available == 3) { // Makes sure following check only runs on first run of while loop
                if (ethic.equals("Gestalt Consciousness")) {
                    generated_gov_ethics.add(ethic);
                    break;
                } else {
                    gov_ethics.remove(gov_ethics.size() - 1);
                }
            }
            // Determines if ethic is Fanatic
            int points = rng.nextInt(2) + 1;
            if (points > 1 && points_available > 1) {
                ethic = "Fanatic " + ethic;
            }
            generated_gov_ethics.add(ethic);
            points_available -= points;
        }
        for (String ethic : generated_gov_ethics) {
            System.out.print(ethic + ", ");
        }
        System.out.print("\n");

        String ethics = generated_gov_ethics.toString();

        originDict.put(0,"Prosperous Unification");
        originDict.put(1, "Galactic Doorstep");
        originDict.put(2,"Lost Colony");
        originDict.put(3,"Here Be Dragons");
        originDict.put(4, "Ocean Paradise");
        originDict.put(5, "Clone Army");
        originDict.put(6, "Necrophage");
        originDict.put(7, "Remnants");
        originDict.put(8, "Life Seeded");
        originDict.put(9, "Post-Apocalyptic");
        originDict.put(10, "Remnants");
        originDict.put(11, "Shattered Ring");
        originDict.put(12, "Void Dwellers");
        originDict.put(13, "Scion");
        originDict.put(14, "On The Shoulders of Giants");
        originDict.put(15, "Common Ground");
        originDict.put(16, "Hegemon");
        originDict.put(17, "Doomsday");
        originDict.put(18, "Syncretic Evolution");
        originDict.put(19, "Mechanist");
        originDict.put(20, "String of Life");

        String origin = originDict.get(random.nextInt(originDict.size()));
        randomizedDict = new HashMap<Integer, String>();
        randomizedDict.put(1,species);
        randomizedDict.put(2,origin);
        randomizedDict.put(3,ethics);
        System.out.print(randomizedDict);
        return randomizedDict;

    }
}
