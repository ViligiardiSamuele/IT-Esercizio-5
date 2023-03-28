package Esercizio;

public class SquadraDiCalcio {
    private String nome, presidente, allenatore, citta;
    private float capitaleIniziale, puntiCampionato;
    private Calciatore[] squadra;

    public SquadraDiCalcio(){}

    public SquadraDiCalcio(String nome, String presidente, String allenatore, String citta, float capitaleIniziale, float puntiCampionato) {
        this.nome = nome;
        this.presidente = presidente;
        this.allenatore = allenatore;
        this.citta = citta;
        this.capitaleIniziale = capitaleIniziale;
        this.puntiCampionato = puntiCampionato;
    }
    public SquadraDiCalcio(SquadraDiCalcio squadraDiCalcio) {
        this.nome = squadraDiCalcio.getNome();
        this.presidente = squadraDiCalcio.getPresidente();
        this.allenatore = squadraDiCalcio.getAllenatore();
        this.citta = squadraDiCalcio.getCitta();
        this.capitaleIniziale = squadraDiCalcio.getCapitaleIniziale();
        this.puntiCampionato = squadraDiCalcio.getPuntiCampionato();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPresidente() {
        return presidente;
    }

    public void setPresidente(String presidente) {
        this.presidente = presidente;
    }

    public String getAllenatore() {
        return allenatore;
    }

    public void setAllenatore(String allenatore) {
        this.allenatore = allenatore;
    }

    public String getCitta() {
        return citta;
    }

    public void setCittà(String citta) {
        this.citta = citta;
    }

    public float getCapitaleIniziale() {
        return capitaleIniziale;
    }

    public void setCapitaleIniziale(float capitaleIniziale) {
        this.capitaleIniziale = capitaleIniziale;
    }

    public float getPuntiCampionato() {
        return puntiCampionato;
    }

    public void setPuntiCampionato(float puntiCampionato) {
        this.puntiCampionato = puntiCampionato;
    }

    public Calciatore[] getSquadra() {
        return squadra;
    }

    public void setSquadra(Calciatore[] squadra) {
        this.squadra = squadra;
    }

}
