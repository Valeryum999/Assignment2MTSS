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
        if(number == 0){
            return "0";
        }
        int[] values = {1000,900,500,400,100,90,50,40,10,9,5,4,1};  
        String[] romanLetters = {"M","CM","D","CD","C",
                                "XC","L","XL","X","IX",
                                "V","IV","I"};  
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
