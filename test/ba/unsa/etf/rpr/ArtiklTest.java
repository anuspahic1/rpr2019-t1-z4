package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.*;

class ArtiklTest {

    @Test
    void testKonstruktora(){
        Artikl a=new Artikl ("voda",5,"54");
        assertAll("test",

                () -> assertEquals("voda", a.getNaziv()),
                ()-> assertEquals(5, a.getCijena()),
                () -> assertEquals("54",a.getKod())
        );
    }

}