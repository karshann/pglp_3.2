package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class EmployeTest {

    @Test
    public void calculsalaire() {
        Employe E =new Employe(5);
        assertEquals(1600, E.calculsalaire());

    }
}