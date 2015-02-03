package fi.jamk.rekisteri;

/**
 *
 * @author Mytechnique
 */
public class RekisteriTesti {
  public static void main(String args[]) {
      Rekisteri kaverit = new Rekisteri();
      
      Henkilo h = new Henkilo("Aku","Ankka","A1");
      
      //Lisätään henkilö rekisteriin
      if (kaverit.addHenkilo(h))
          System.out.println("Lisätty");
      else
          System.out.println("Lisäys epäonnistui");
      
      h = new Henkilo("Kirsi","Kernel","K1");
      
         //Lisätään henkilö rekisteriin
      if (kaverit.addHenkilo(h)){
          System.out.println("Lisätty");
    }else{
          System.out.println("Lisäys epäonnistui");
  }
      System.out.println("Rekisterin sisältö");
      for(int i = 0; i < kaverit.getHenkilomaara();i++){
      h = kaverit.getHenkilo(i);
      System.out.println(h.getAll());
  }
      
     String sotu = "A1";
      System.out.println("Etsitään henkilöä sodulla: " + sotu);
      h = kaverit.findHenkilo(sotu);
      
      if(h!=null) {
          System.out.println(h.getAll());
      }
      else {
          System.out.println("Sotua vastaavaa henkilä ei löydy");
      }
      
  }  
}
