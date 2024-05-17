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
    public void IntegerToRoman_1_to_I() {
        assertEquals(IntegerToRoman.convert(1),"I");
    }
    @Test
    public void RomanPrinter_I() {     
        String IArt = " _____ \n|_   _|\n  | |  \n  | |  \n _| |_ \n|_____|\n";
        assertEquals(RomanPrinter.print(1),(IArt));
    }
}
