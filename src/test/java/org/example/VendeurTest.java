package org.example;

import static org.junit.Assert.*;
import org.junit.Test;

public class VendeurTest {

    @Test
    public void calculsalaire() {
        Vendeur v =new Vendeur(0,0);
        assertEquals(1500,v.calculsalaire());

    }
}