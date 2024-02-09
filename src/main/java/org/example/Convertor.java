package org.example;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Convertor {
    private static Map<Integer,String> romanMap = new HashMap<>();

    static {
        romanMap.put(1,"I"); romanMap.put(4,"IV"); romanMap.put(5,"V"); romanMap.put(9,"IX");
        romanMap.put(10,"X"); romanMap.put(40,"XL"); romanMap.put(50,"L"); romanMap.put(90,"XC");
        romanMap.put(100,"C"); romanMap.put(400,"CD"); romanMap.put(500,"D"); romanMap.put(900,"CM");
        romanMap.put(1000,"M"); romanMap.put(4000,"_IV"); romanMap.put(5000,"_V"); romanMap.put(9000,"_IX");
        romanMap.put(10000,"_X"); romanMap.put(40000,"_XL"); romanMap.put(50000,"_L"); romanMap.put(90000,"_XC");
        romanMap.put(100000,"_C"); romanMap.put(400000,"_C_D"); romanMap.put(500000,"_D"); romanMap.put(900000,"_C_M");
        romanMap.put(1000000,"_M");
    }


    public static String convertArabicToRoman(int numArabic) {
        if (numArabic <= 0 || numArabic > 4000000) {
            throw new IllegalArgumentException("Input out of range (1-4,000,000)");
        }

        StringBuilder romanNum = new StringBuilder();

        for (int value : discharges()) {
            while (numArabic >= value) {
                romanNum.append(romanMap.get(value));
                numArabic -= value;
            }
        }

        return romanNum.toString();
    }


    public static List<Integer> discharges(){
        return romanMap.keySet().stream().sorted(Comparator.reverseOrder()).toList();
    }

}
