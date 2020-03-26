package org.example;

public class Manager extends Employe {
    int ordre;
    public Manager(int anciennete, int ordre) {
        super(anciennete);
        this.ordre=ordre;
    }

    @Override
    public int calculsalaire() {
        return super.calculsalaire()+100*ordre;
    }
}
