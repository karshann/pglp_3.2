package org.example;

public class Employe {
    protected int salaire=1500;
    protected int anciennete;
    public Employe(int anciennete){
        this.anciennete=anciennete;
    }
    public int calculsalaire(){

        return salaire+20*anciennete;
    }
}