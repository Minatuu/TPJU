package tpju;
/**
 * Décrivez votre classe Personnage ici.
 */
import AgileTP.*;
public class Personnage implements Observateur
{
    // variables d'instance 
    private String nom;
    private String acteur;
    private Film film ;
    
    //public static int quantity ; // quatité de potion disponible
    
    /**
     * Constructeur d'objets de classe Personnage
     */
    public Personnage(String nom, String acteur )
    {
        // initialisation des variables d'instance
        this.nom = nom;
        this.acteur = acteur;
    }
    
    /*public static int getQuantity() {
        return quantity;
    }*/

   /* public static void setQuantity(int quantity) {
        Personnage.quantity = quantity;
    }*/
     /**
     * Accesseurs
     */
    public String getNom()  { 
        return nom;
    }
    public String getActeur()  { 
        return acteur;
    }
    
     public void setNom(String nom) {
        this.nom = nom;
    }
    
    public int prepare(String name, int qty){ 
        
        Stock potion = new Potion(name, qty);
        potion.add(potion);
        return qty;
    }

   
    public int boire(Stock potion){ 
        
        potion.remove(potion);
        return 1;
    }

    /**
     * La méthode compétence retourne les competences de chaque personnage
     * les personnages sont inspirer du film Astérix Obélix
     */
    public String competences()
    {
        switch (this.nom) {
              case "Panoramix":
                 return(this.nom + " est un magicien, savant et philosophe ");
              case "Astérix":
                 return(this.nom + " est un grand guerrier et il a des compétences de chef ");
              case "Obélix":
                 return(this.nom + " est fort ");
                }
        return null;
    }

    @Override
    public void notifier() {
         System.out.println("la notification est bien reçu");
    }
}
