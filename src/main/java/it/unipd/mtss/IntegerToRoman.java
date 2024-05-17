////////////////////////////////////////////////////////////////////
// Valeri Mihail Belenkov 2068232
// Matteo Piron 2076044
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

public class IntegerToRoman {
    public static String convert(int number){
        if(number < 0 || number > 10000){
            return "Invalid Roman Number Value";
        }
        int[] values = {1};  
        String[] romanLetters = {"I"};  
        String result = "";
        for(int i=0;i<values.length;i++){  
            while(number >= values[i]){  
                number = number - values[i];  
                result += romanLetters[i];
            }  
        }  
        return result;
    }
}
