////////////////////////////////////////////////////////////////////
// Valeri Mihail Belenkov 2068232
// Matteo Piron 2076044
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class InputTest {
    @Test
    public void BasicTest() {
        assert(1 == 1);
    }
    
    @Test
    public void TestClass() {
        try{
            IntegerToRoman ITR = new IntegerToRoman();
        } catch (Exception e) {
            assert(false);
        }
    }
    
    @Test
    public void TestClassSecond() {
        try{
            RomanPrinter RP = new RomanPrinter();
        } catch (Exception e) {
            assert(false);
        }
    }

    @Test
    public void IntegerToRoman_1_to_I() {
        assertEquals(IntegerToRoman.convert(1),"I");
    }

    @Test
    public void IntegerToRoman_5_to_V() {
        assert(IntegerToRoman.convert(5).equals("V"));
    }

    @Test
    public void RomanPrinter_I() {     
        String IArt = " _____ \n|_   _|\n  | |  \n  | |  \n _| |_ \n|_____|\n";
        assertEquals(RomanPrinter.print(1),(IArt));
    }
    
    @Test
    public void RomanPrinter_V() {
        String VArt = "__      __\n\\ \\    / /\n \\ \\  / / \n  \\ \\/ /  \n   \\  /   \n    \\/    \n";
        assertEquals(RomanPrinter.print(5),(VArt));
    }

    @Test
    public void TestEmptyString() {
        assert(IntegerToRoman.convert(0).equals(""));
    }

    @Test
    public void NumberIsOver10000() {
        assert(IntegerToRoman.convert(10001).equals("Invalid Roman Number Value"));
    }

    @Test
    public void TestNumberNegative() {
        assert(IntegerToRoman.convert(-1234).equals("Invalid Roman Number Value"));
    }

}
