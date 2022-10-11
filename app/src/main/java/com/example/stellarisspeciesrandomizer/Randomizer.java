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
    public static HashMap RandomSpecies(HashMap<Integer, String> randomizedDict) throws FileNotFoundException {
        //readFile();
        Random random = new Random();
        HashMap<Integer,String> originDict = new HashMap<Integer,String>();

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
        randomizedDict.put(1,origin);
        return randomizedDict;
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
