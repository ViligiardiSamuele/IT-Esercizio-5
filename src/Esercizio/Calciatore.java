package Esercizio;

import java.lang.reflect.Array;

public class Calciatore {
    private String nome, cognome, squadra;
    private int totaleGol = 0, partiteDisputate = 0;
    private float valoreMercato;

    public Calciatore(){
        nome = " ";
        cognome = " ";
        squadra = " ";
        totaleGol = 0;
        partiteDisputate = 0;
        valoreMercato = 0;
    }
    public Calciatore(String nome, String cognome, String squadra, int totaleGol, int partiteDisputate, float valoreMercato) {
        this.nome = nome;
        this.cognome = cognome;
        this.squadra = squadra;
        this.totaleGol = totaleGol;
        this.partiteDisputate = partiteDisputate;
        this.valoreMercato = valoreMercato;
    }
    public Calciatore(Calciatore calciatore) {
        this.nome = calciatore.getNome();
        this.cognome = calciatore.getCognome();
        this.squadra = calciatore.getSquadra();
        this.totaleGol = calciatore.getTotaleGol();
        this.partiteDisputate = calciatore.getPartiteDisputate();
        this.valoreMercato = calciatore.getValoreMercato();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getSquadra() {
        return squadra;
    }

    public void setSquadra(String squadra) {
        this.squadra = squadra;
    }

    public int getTotaleGol() {
        return totaleGol;
    }

    public void setTotaleGol(int totaleGol) {
        this.totaleGol = totaleGol;
    }

    public int getPartiteDisputate() {
        return partiteDisputate;
    }

    public void setPartiteDisputate(int partiteDisputate) {
        this.partiteDisputate = partiteDisputate;
    }

    public float getValoreMercato() {
        return valoreMercato;
    }

    public void setValoreMercato(float valoreMercato) {
        this.valoreMercato = valoreMercato;
    }

    public void partitaDisputata(int golFatti){
        this.setTotaleGol(this.getTotaleGol() + golFatti);
        this.setPartiteDisputate(this.getPartiteDisputate() + 1);
        this.setValoreMercato(this.getValoreMercato() + this.getValoreMercato()/100);
    }

    public float mediaGolPartita(){
        return (float)(this.getTotaleGol()/this.getPartiteDisputate());
    }

    public void stampaInformazioni(){
        System.out.println(
                "Nome: " + this.getNome()
                + "Cognome: " + this.getCognome()
                + "Squadra: " + this.getSquadra()
                + "Totale gol: " + this.getTotaleGol()
                + "Partite disputate: " + this.getPartiteDisputate()
                + "Valore mercato: " + this.getValoreMercato()
        );
    }

}
