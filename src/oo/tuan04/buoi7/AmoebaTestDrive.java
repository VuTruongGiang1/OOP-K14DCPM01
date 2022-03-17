package oo.tuan04.buoi7;

public class AmoebaTestDrive {
    public static void main(String[] args) {
        Amoeba amoeba = new Amoeba("Amoeba.hif", 5.5, 5.5);
        amoeba.rorate();
        amoeba.playSound();
    }
}
