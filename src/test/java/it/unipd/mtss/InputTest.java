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
    public void IntegerToRoman_10_to_X() {
        assert(IntegerToRoman.convert(10).equals("X"));
    }

    @Test
    public void IntegerToRoman_50_to_L() {
        assert(IntegerToRoman.convert(50).equals("L"));
    }

    @Test
    public void IntegerToRoman_100_to_C() {
        assert(IntegerToRoman.convert(100).equals("C"));
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
    public void RomanPrinter_X() {
        String XArt = "__  __\n\\ \\/ /\n \\  / \n  ><  \n /  \\ \n/_/\\_\\\n";
        assertEquals(RomanPrinter.print(10),(XArt));
    }

    @Test
    public void RomanPrinter_L() {
        String LArt = " _    \n| |   \n| |   \n| |   \n| |__ \n|____|\n";
        assertEquals(RomanPrinter.print(50),(LArt));
    }

    @Test
    public void RomanPrinter_C() {
        String CArt = "  ____  \n / ___| \n| |     \n| |     \n| |___  \n \\____| \n";
        assertEquals(RomanPrinter.print(100),(CArt));
    }

    @Test
    public void TestZero() {
        assert(IntegerToRoman.convert(0).equals("0"));
    }

    @Test
    public void NumberIsOver10000() {
        assert(IntegerToRoman.convert(10001).equals("Invalid Roman Number Value"));
    }

    @Test
    public void TestNumberNegative() {
        assert(IntegerToRoman.convert(-1234).equals("Invalid Roman Number Value"));
    }

    @Test
    public void TestSwitchCase() {
        assert(RomanPrinter.print(-1234).equals("Invalid Roman Number Value"));
    }

}
