package org.academiadecodigo.codepoetry.two;

/**
 * Created by <Boolegans_Code Cadet> Ana Lourenço on 10/12/16.
 */


public class CodePoetryTwo {

    /**
     * Sings the chorus for the song Amor D'Água Fresca, sung by the portuguese artist Dina.
     * She was the portuguese participant in the 1992's Eurovision Contest.
     * <p>
     * The first chorus starts at the 0:41s mark in the following link:
     * https://youtu.be/I4d1kj095FU?t=41s
     */
    public static void main(String[] args) {

        singChorus();

    }


    private static void singChorus() {

        Pessoa eu = new Pessoa();
        Pessoa tu = new Pessoa();
        Cesta cesta = new Cesta();

        eu.pegar(tu);
        eu.trincar(tu);
        eu.meter(tu, cesta);
        tu.rir();
        tu.darAVolta(eu.getCabeça());
        tu.andar(eu.getPosição());
        eu.setTerSede(true);
        tu.setAmorType("D'Água Fresca");
        eu.querer(tu.getAmorType());
    }
}


