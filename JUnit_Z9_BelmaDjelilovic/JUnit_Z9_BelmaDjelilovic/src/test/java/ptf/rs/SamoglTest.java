package ptf.rs;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.Test;

public class SamoglTest {

    @Test
    public void testBrojSamoglasnikaPrazanString() {
        Exception ex = assertThrows(Exception.class, () -> {
            Main.brojSamoglasnika("");
        });
        assertEquals("String ne smije biti prazan", ex.getMessage());
    }

    @Test
    public void testBrojSamoglasnikaSarajevo() throws Exception {
        int broj = Main.brojSamoglasnika("Sarajevo");
        assertEquals(4, broj);
    }

    @Test
    public void testBrojSamoglasnikaTrn() {
        Exception ex = assertThrows(Exception.class, () -> {
            Main.brojSamoglasnika("Trn");
        });
        assertEquals("String ne sadrži samoglasnike", ex.getMessage());
    }

    @Test
    public void testBrojSamoglasnikaDrzava() throws Exception {
        int broj = Main.brojSamoglasnika("drzava Bosna i Hercegovina");
        assertEquals(11, broj);
    }

}
