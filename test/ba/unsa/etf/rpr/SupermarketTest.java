package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SupermarketTest {

@Test
    void dodajArtikl(){
    Supermarket a=new Supermarket();
    boolean vrijednost=a.dodajArtikl(new Artikl("sladoled", 56,"345"));
    assertTrue(vrijednost);
}
@Test
    void izbaciArtiklSaKodom(){
    Supermarket a=new Supermarket();
    a.dodajArtikl(new Artikl("sladoled", 78,"999"));
    Artikl art=a.izbaciArtiklSaKodom("999");
    assertEquals("999",art.getKod());
    }


}