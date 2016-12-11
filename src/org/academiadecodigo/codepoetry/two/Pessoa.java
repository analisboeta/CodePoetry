package org.academiadecodigo.codepoetry.two;

/**
 * Created by codecadet on 11/12/16.
 */
public class Pessoa {

    private Cabeça cabeça;
    private String posição;
    private String amorType;
    private boolean terSede;


    public Cabeça getCabeça() {
        return cabeça;
    }

    public void setCabeça(Cabeça cabeça) {
        this.cabeça = cabeça;
    }


    public String getAmorType() {
        return amorType;
    }

    public void setAmorType(String amorType) {
        this.amorType = amorType;
    }

    public String getPosição() {
        return posição;
    }

    public void setPosição(String posição) {
        this.posição = posição;
    }

    public boolean isTerSede() {
        return terSede;
    }

    public void setTerSede(boolean terSede) {
        this.terSede = terSede;
        System.out.println("tenho sede, ");
    }

    public void pegar(Pessoa pessoa) {
        System.out.println("Peguei, ");
    }

    public void trincar(Pessoa pessoa) {
        System.out.println("trinquei, ");
    }

    public void meter(Pessoa pessoa, Local cesta) {
        System.out.println("e meti-te na cesta");
    }

    public void rir() {
        System.out.print("ris ");
    }

    public void darAVolta(Cabeça cabeça) {
        System.out.println("e dás-me a volta à cabeça,");
    }

    public void andar(String posição){
        this.posição=posição;
        System.out.print("vem cá, ");
    }

    public void querer (String amorType)
    {
        System.out.println("quero o teu amor " + amorType + "!!!!!");
    }





}
