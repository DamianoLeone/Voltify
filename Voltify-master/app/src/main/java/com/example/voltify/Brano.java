package com.example.voltify;

public class Brano {
    private String titolo;
    private String genere;
    private int durata;
    private String regista;
    private String dataCreazione;

    public Brano(String titolo, String genere, int durata, String dataCreazione, String regista){
        this.titolo=titolo;
        this.genere=genere;
        this.durata=durata;
        this.dataCreazione=dataCreazione;
        this.regista=regista;
    }

    public String getTitolo(){
        return titolo;
    }
    public void setTitolo(String titolo){
        this.titolo=titolo;
    }

    public String getGenere(){
        return genere;
    }
    public void setGenere(String genere){
        this.genere=genere;
    }

    public int getDurata(){
        return durata;
    }
    public void setDurata(int durata){
        this.durata=durata;
    }

    public String getRegista(){
        return regista;
    }
    public void setRegista(String autore){
        this.regista=regista;
    }

    public String getDataCreazione(){
        return dataCreazione;
    }
    public void setDataCreazione(String dataCreazione) {
        this.dataCreazione = dataCreazione;
    }

    public String toString(){
        return  "Titolo: "+ titolo +
                "\n" +
                "Genere: " + genere +
                "\n" +
                "Durata: " + durata + " minuti" +
                "\n" +
                "Data uscita: " + dataCreazione +
                "\n" +
                "Regista: " + regista +
                "\n\n";

    }
}
