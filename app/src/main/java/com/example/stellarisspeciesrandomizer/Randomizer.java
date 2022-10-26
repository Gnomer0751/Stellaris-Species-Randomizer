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
    //private static int[] tall= new int[3] ;
    public static HashMap<Integer,String> ethicsDict = new HashMap<Integer,String>();
    public static HashMap<Integer,String> ethicsChoiceDict = new HashMap<Integer,String>();
    public static HashMap RandomSpecies(HashMap<Integer, String> randomizedDict) throws FileNotFoundException {
        //readFile();
        Random random = new Random();
        HashMap<Integer,String> originDict = new HashMap<Integer,String>();
        HashMap<Integer,String> speciesDict = new HashMap<Integer,String>();


        speciesDict.put(1,"Humanoid");
        speciesDict.put(2,"Mammalian");
        speciesDict.put(3,"Reptilian");
        speciesDict.put(4,"Avian");
        speciesDict.put(5,"Arthropoid");
        speciesDict.put(6,"Molluscoid");
        speciesDict.put(7,"Fungoid");
        speciesDict.put(8,"Plantoid");
        speciesDict.put(9,"Lithoid");
        speciesDict.put(10,"Necroid");
        speciesDict.put(11,"Aquatic");
        speciesDict.put(12,"Toxoid");
        speciesDict.put(13,"Machine");
        String species = speciesDict.get(random.nextInt(speciesDict.size()));

        ethicsDict.put(1,"Gestalt Consciousness");
        ethicsDict.put(2,"Militarist");
        ethicsDict.put(3,"Fanatic Militarist");
        ethicsDict.put(4,"Pacifist");
        ethicsDict.put(5,"Fanatic Pacifist");
        ethicsDict.put(6,"Authoritarian");
        ethicsDict.put(7,"Fanatic Authoritarian");
        ethicsDict.put(8,"Egalitarian");
        ethicsDict.put(9,"Fanatic Egalitarian");
        ethicsDict.put(10,"Xenophile");
        ethicsDict.put(11,"Fanatic Xenophile");
        ethicsDict.put(12,"Xenophobe");
        ethicsDict.put(13,"Fanatic Xenophobe");
        ethicsDict.put(14,"Spiritualist");
        ethicsDict.put(15,"Fanatic Spiritualist");
        ethicsDict.put(16,"Materialist");
        ethicsDict.put(17,"Fanatic Materialist");
        chooseEthics();


        String ethics = ethicsDict.get(random.nextInt(ethicsDict.size()));
        if (species.equals("Machine")){
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
        return randomizedDict;
    }
    public static void chooseEthics(){
        for(int i=1;i<4;i++){
            Random random = new Random();
            ethicsChoiceDict.put(i,ethicsDict.get(random.nextInt(ethicsDict.size())));
            String Choice = ethicsChoiceDict.get(i);


        }
        if ((ethicsChoiceDict.containsValue("Militarist")&&ethicsChoiceDict.containsValue("Pacifist"))||(ethicsChoiceDict.containsValue("Fanatic Militarist")&&ethicsChoiceDict.containsValue("Fanatic Pacifist"))||(ethicsChoiceDict.containsValue("Fanatic Pacifist")&&ethicsChoiceDict.containsValue("Militarist"))||(ethicsChoiceDict.containsValue("Fanatic Militarist")&&ethicsChoiceDict.containsValue("Pacifist"))){
            chooseEthics();

        }
    }
    /*public static void readFile() throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("hasDLC.txt"));
        tall = new int [100];
        int i = 0;
        while(scanner.hasNextInt()){
            tall[i++] = scanner.nextInt();
        }
        System.out.println(tall);

    }*/
}
