////////////////////////////////////////////////////////////////////
// Valeri Mihail Belenkov 2068232
// Matteo Piron 2076044
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

public class RomanPrinter {
    public static String print(int num){
        return printAsciiArt(IntegerToRoman.convert(num));
    }
    private static String printAsciiArt(String romanNumber){
        String[] I = {" _____ ",
                      "|_   _|",
                      "  | |  ",
                      "  | |  ",
                      " _| |_ ",
                      "|_____|"};
        

        String[] tmp_result = {"","","","","","",""};

        for(int i=0;i<romanNumber.length();i++){
            switch(romanNumber.substring(i,i+1)){
                case "I":
                    tmp_result[0] += I[0];
                    tmp_result[1] += I[1];
                    tmp_result[2] += I[2];
                    tmp_result[3] += I[3];
                    tmp_result[4] += I[4];
                    tmp_result[5] += I[5];
                    break;
                default:
                    break;
            }
        }
    
        String result = "";
        result = String.join("\n", tmp_result);
        return result;
    }
}
