package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class ManagerTest {

    @Test
    public void calculsalaire() {

        Manager m=new Manager(0,5);
        assertEquals(2000,m.calculsalaire());
    }
}