package fi.jamk.rekisteri;

import java.util.ArrayList;

/**
 *
 * @author Mytechnique
 */
public class Rekisteri {
    
    //Salmiakeilla määritetään, että ArrayListiin voi laittaa vain Henkilo tyyppisiä juttuja
    private ArrayList<Henkilo> henkilot;
    
    public Rekisteri() {
        this.henkilot = new ArrayList<>();
    }
    
    //.size:llä saa määrän
    public int getHenkilomaara() {
       return this.henkilot.size();
    }
    
    //palauttaa true tai false jos henkilön lisäys onnistui tai epäonnistui
    public boolean addHenkilo(Henkilo h) {
       return this.henkilot.add(h);
    }
    
    public Henkilo getHenkilo(int index) {
        if (index < getHenkilomaara()){
            return this.henkilot.get(index);
        }else { 
            return null;
        }
    }
    
    public Henkilo findHenkilo(String sotu) {
        for(Henkilo h : this.henkilot) {
            // onko vuorossa olevan henkilon sotu sama kuin etsittava?
            if (sotu.equalsIgnoreCase(h.getSotu())) {
                return h;
            }  
        }
        //sotua vastaavaa henkiloa ei loydy
        return null;
    }
}
