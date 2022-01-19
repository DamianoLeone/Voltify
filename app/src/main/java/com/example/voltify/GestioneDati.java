package com.example.voltify;
import java.util.ArrayList;


public class GestioneDati{
    ArrayList<Brano> ListaBrani;

    public GestioneDati(){
        ListaBrani = new ArrayList<Brano>();
    }

    public void addBrani(String titolo, String genere, int durata, String dataCreazione, String regista){
        Brano br = new Brano(titolo,genere,durata,dataCreazione,regista);
        ListaBrani.add(br);
    }

    public void listaBrani(){
        StringBuilder stBui = new StringBuilder();//StringBuilder è una classe che crea una stringa che concatena i dati
        for(Brano brV : ListaBrani){ //equivale a fare i=0;i<ListaBrani.size();i++ quindi serve per scorrere tutti gli oggetti dell'arraylist
            stBui.append(brV.toString());//chiedi al prof domaani ma penso che aggiunga ogni elemento di lista brani all'interno della stringa stbui
            System.out.println(ListaBrani);
        }
    }

    public StringBuilder vediLista(){ //è di tipo StringBuilder perché ritorna un stringbuilder alla fine
        StringBuilder stBui = new StringBuilder();
        for (Brano brV : ListaBrani){
            stBui.append(brV.toString());
        }
        return stBui;
    }

}
