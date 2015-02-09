package fi.jamk;

/**
 *
 * @author Mytechnique
 */
public class Henkilo implements Comparable {
    
    private String etunimi;
    private String sukunimi;
    private String sotu;

    public Henkilo(String etunimi, String sukunimi, String sotu) {
        this.etunimi = etunimi;
        this.sukunimi = sukunimi;
        this.sotu = sotu;
    }

    public String getEtunimi() {
        return etunimi;
    }

    public void setEtunimi(String etunimi) {
        this.etunimi = etunimi;
    }

    public String getSukunimi() {
        return sukunimi;
    }

    public void setSukunimi(String sukunimi) {
        this.sukunimi = sukunimi;
    }

    public String getSotu() {
        return sotu;
    }

    public void setSotu(String sotu) {
        this.sotu = sotu;
    }
    
    public String getAll() {
        return this.etunimi + " " + this.sukunimi + " " + this.sotu;
    }

    @Override
    public int compareTo(Object seuraava) {
        String bSukunimi = ((Henkilo)seuraava).getSukunimi();
        String bEtunimi = ((Henkilo)seuraava).getEtunimi();
        int sukuVert = sukunimi.compareTo(bSukunimi);
        if (sukuVert == 0) return etunimi.compareTo(bEtunimi);
        else return sukuVert;
        
    }
    
    
}
