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
    public static ArrayList<String> ethicsDict = new ArrayList();
    public static HashMap<Integer,String> ethicsChoiceDict = new HashMap<Integer,String>();
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

        ethicsDict.add("Gestalt Consciousness");
        ethicsDict.add("Militarist");
        ethicsDict.add("Pacifist");
        ethicsDict.add("Authoritarian");
        ethicsDict.add("Egalitarian");
        ethicsDict.add("Xenophile");
        ethicsDict.add("Xenophobe");
        ethicsDict.add("Spiritualist");
        ethicsDict.add("Materialist");
        chooseEthics();


        String ethics = ethicsChoiceDict.toString();
        if (species.equals("Machine")||isGestalt==true||ethicsChoiceDict.containsValue("Gestalt Consciousness")){
            ethics = "Gestalt Consciousness";
        }




        originDict.put(1,"Prosperous Unification");
        originDict.put(2, "Galactic Doorstep");
        originDict.put(3,"Lost Colony");
        originDict.put(4,"Here Be Dragons");
        originDict.put(5, "Ocean Paradise");
        originDict.put(6, "Clone Army");
        originDict.put(7, "Necrophage");
        originDict.put(8, "Remnants");
        originDict.put(9, "Life Seeded");
        originDict.put(10, "Post-Apocalyptic");
        originDict.put(11, "Remnants");
        originDict.put(12, "Shattered Ring");
        originDict.put(13, "Void Dwellers");
        originDict.put(14, "Scion");
        originDict.put(15, "On The Shoulders of Giants");
        originDict.put(16, "Common Ground");
        originDict.put(17, "Hegemon");
        originDict.put(18, "Doomsday");
        originDict.put(19, "Syncretic Evolution");
        originDict.put(20, "Mechanist");
        originDict.put(21, "String of Life");

        String origin = originDict.get(random.nextInt(originDict.size()));
        randomizedDict = new HashMap<Integer, String>();
        randomizedDict.put(1,species);
        randomizedDict.put(2,origin);
        randomizedDict.put(3,ethics);
        System.out.print(randomizedDict);
        return randomizedDict;

    }
    public static void chooseEthics(){
        Random random = new Random();
        int isGestaltInt = random.nextInt(8);
        if (isGestaltInt == 0){
            isGestalt = true;
        }
        for(int i=1;i<4;i++){
            ethicsChoiceDict.put(i,ethicsDict.get(random.nextInt(ethicsDict.size())));
            String choice = ethicsChoiceDict.get(i);
            if (ethicsChoiceDict.containsValue("Militarist")){
                ethicsDict.remove("Pacifist");
                ethicsDict.remove("Militarist");
            }
            if (ethicsChoiceDict.containsValue("Pacifist")){
                ethicsDict.remove("Militarist");
                ethicsDict.remove("Pacifist");
            }
            if (ethicsChoiceDict.containsValue("Authoritarian")){
                ethicsDict.remove("Egalitarian");
                ethicsDict.remove("Authoritarian");
            }
            if (ethicsChoiceDict.containsValue("Egalitarian")){
                ethicsDict.remove("Authoritarian");
                ethicsDict.remove("Egalitarian");
            }
            if (ethicsChoiceDict.containsValue("Xenophile")){
                ethicsDict.remove("Xenophobe");
                ethicsDict.remove("Xenophile");
            }
            if (ethicsChoiceDict.containsValue("Xenophobe")){
                ethicsDict.remove("Xenophile");
                ethicsDict.remove("Xenophobe");
            }
            if (ethicsChoiceDict.containsValue("Spiritualist")){
                ethicsDict.remove("Materialist");
                ethicsDict.remove("Spiritualist");
            }
            if (ethicsChoiceDict.containsValue("Materialist")){
                ethicsDict.remove("Spiritualist");
                ethicsDict.remove("Materialist");
            }
            int isFanatic = random.nextInt(2);
            if (i!=3) {
                // to make sure there isn't 2 fanatics
                if (isFanatic == 1) {
                    choice = "Fanatic " + choice;
                    ethicsChoiceDict.put(i, choice);
                    i++;
                }
            }
            if (!ethicsChoiceDict.containsValue("Gestalt Consciousness")){
                ethicsDict.remove("Gestalt Consciousness");
            }

        }

    }
}
