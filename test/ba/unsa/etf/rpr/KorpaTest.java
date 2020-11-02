package ba.unsa.etf.rpr;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KorpaTest {
    @Test
    void dajUkupnuCijenuArtikla(){
        Supermarket supermarket = new Supermarket();
        supermarket.dodajArtikl(new Artikl("Sladoled", 4, "567"));
        Korpa korpa=new Korpa();
        korpa.dodajArtikl(new Artikl("Sladoled", 4, "567"));
        int cijena=korpa.dajUkupnuCijenuArtikala();
        assertEquals(4,korpa.dajUkupnuCijenuArtikala());
    }

    @Test
   void dodajArtikl(){
Korpa korpa=new Korpa();
boolean a=korpa.dodajArtikl(new Artikl("cokolada",10, "189"));
assertTrue(a);
    }

    @Test
    void izbaciArtiklSKodom(){

    }



}