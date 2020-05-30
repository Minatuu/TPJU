package AgileTP;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Décrivez votre classe Stock ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
    public class Potion extends Observable implements Stock  {
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    public boolean disponible;
    public boolean Substituable;
    public static int quantite;
    public Product product1;
    public Product product2;
    Collection listePotion;

    /**
     * Constructeur d'objets de classe Stock
     */
    public Potion()
    {
        listePotion = new ArrayList();
    }
    
   /** Ajoute un produit à la liste des composants
     * @param potion le potion que l'on veux ajouter au composite
     * @throws PotionException Si le produit est null.
     */
    public void add(Potion potion) throws PotionException {
        assert null != listePotion;
        if (null == potion) {
            throw new PotionException("Impossible d'ajouter une potion nulle");
        }
       listePotion.add(potion);
    }

    /** Enlève un produit de la composition.
     * @param produit le produit à retirer de la composition.
     * @throws ProduitException Si le produit est null ou n'est pas dans la liste.
     */
    public void remove(Potion potion) throws PotionException {
        assert null != listePotion;
        if (null == potion) {
            throw new PotionException("Impossible d'enlever une potion nulle");
        }

        if ( ! listePotion.contains(potion)) {
            throw new PotionException("Impossible d'enlever cette potion, elle n'est pas dans la liste");
        }

        listePotion.remove(potion);
    }


    @Override
    public int getQuantite() {
        return quantite ;
    }

    @Override
    public void setQuantite(int q) {
         quantite = q;
    }
    
         
    /**
     * un exemple methode alimentation de Stock
     *
     * @param  quantite dup Stock   le paramètre de la méthode
     * @return     quantite disponible dans le Stock
     */
       
    @Override
    public int alimenterStock(int q)
    {
        // Insérez votre code ici
        quantite += q;
        if (quantite>0){ 
            this.disponible = true;
        }
        
        return quantite;
    }
    
    @Override
    public String delivreyStock(int q)
    {
        // Insérez votre code ici
       if( quantite >= q){ 
           quantite -= q;
         return "OK";
        
    }
        return "KO";
    }
    
    }

