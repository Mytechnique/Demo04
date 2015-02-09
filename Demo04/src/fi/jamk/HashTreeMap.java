
package fi.jamk;

import java.util.HashMap;
import java.util.TreeMap;

/**
 *
 * @author h8599
 */
public class HashTreeMap {
    public static void main(String args[]) {
        
    Henkilo h1 = new Henkilo("Aku","Ankka","A1");
    Henkilo h2 = new Henkilo("Pasi","Mankka","B5");
    Henkilo h3 = new Henkilo("Manu","Vankka","C7");
    Henkilo h4 = new Henkilo("Panu","Rankka","D8");
    Henkilo h5 = new Henkilo("Yusuf","Lankka","E9");
    Henkilo h6 = new Henkilo("Yusuf","Lankka","E9");
    
    HashMap henkilot = new HashMap();
    henkilot.put(h1.getSotu(), h1);
    henkilot.put(h2.getSotu(), h2);
    henkilot.put(h3.getSotu(), h3);
    henkilot.put(h4.getSotu(), h4);
    henkilot.put(h5.getSotu(), h5);
    henkilot.put(h6.getSotu(), h6);
   
    Henkilo henkilo = (Henkilo) henkilot.get("C7");
    
    if(henkilo != null) {
        System.out.println(henkilo.getAll());
    }
    
    TreeMap henkilot2 = new TreeMap();
    henkilot2.put(h1.getSotu(), h1);
    henkilot2.put(h2.getSotu(), h2);
    henkilot2.put(h3.getSotu(), h3);
    henkilot2.put(h4.getSotu(), h4);
    henkilot2.put(h5.getSotu(), h5);
    henkilot2.put(h6.getSotu(), h6);
    
    Henkilo henkilo2 = (Henkilo) henkilot2.get("D8");
   
    if(henkilo2 != null) {
        System.out.println(henkilo2.getAll());
    }
    }
}
