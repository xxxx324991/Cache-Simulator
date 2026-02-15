
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cachesimulator;

import java.io.File;
import java.io.FileNotFoundException;
import static java.lang.Integer.parseInt;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class CacheSimulator {
    
    public static ArrayList<String> openFile(File file) throws FileNotFoundException {
        ArrayList<String> result = new ArrayList<>();
        Scanner scanner;
        scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            result.add(line);
        }
        scanner.close();
        return result;
    }

    public static boolean validData(String str){
        return (str.length() == 2)&&
               ((str.charAt(0) >= 48 && str.charAt(0) <= 57)||(str.charAt(0) >= 65 && str.charAt(0) <= 70))&&
               ((str.charAt(1) >= 48 && str.charAt(1) <= 57)||(str.charAt(1) >= 65 && str.charAt(1) <= 70));
    }
    
    public static boolean validAddr(String string){
        try{
            int addr = parseInt(string);
            return addr >= 0 && addr <= 63;
        }catch(NumberFormatException e){
            return false;
        }
    }
    
    public static void main(String[] args) {
        CacheGUI frame = new CacheGUI();
        frame.setVisible(true);
    }
}
