package fi.jamk;
import java.util.Iterator;
import java.util.TreeSet;
/**
 *
 * @author Mytechnique
 */
public class Main {
    public static void main(String args[]){
    
    Henkilo h1 = new Henkilo("Aku","Ankka","A1");
    Henkilo h2 = new Henkilo("Pasi","Mankka","B5");
    Henkilo h3 = new Henkilo("Manu","Vankka","C7");
    Henkilo h4 = new Henkilo("Panu","Rankka","D8");
    Henkilo h5 = new Henkilo("Yusuf","Lankka","E9");
    Henkilo h6 = new Henkilo("Yusuf","Lankka","E9");
    
    TreeSet t1 = new TreeSet();
    t1.add(h1);
    t1.add(h2);
    t1.add(h3);
    t1.add(h4);
    t1.add(h5);
    // d) Kun lisään samoilla tiedoilla olevan olion, tulostus tapahtuu vain yhdelle
    t1.add(h6);
    
    System.out.println("TreeSetin sisältö\n");
        
    // Olioiden siirtäminen taulukkoon läpikäyntiä varten    
    Object lista[] = t1.toArray();
    
    
    // Olioiden tulostus
    for(int i = 0; i < lista.length; i++) {
        System.out.println(((Henkilo)lista[i]).getAll());
            
        }
    }
   
}