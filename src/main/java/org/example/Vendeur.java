package org.example;

public class Vendeur extends Employe {
    private int commission;

    public Vendeur(int commission,int anciennete) {
        super(anciennete);
        this.commission = commission;
    }

    @Override
    public int calculsalaire() {
        return super.calculsalaire()+commission;
    }
}
