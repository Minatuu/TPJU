package AgileTP;

import java.util.ArrayList;
import java.util.Collection;

    public class Potion extends Observable implements Stock  {
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    public int quantite;
    public String potion;
    public Collection listePotion = new ArrayList();

    /**
     * Constructeur d'objets de classe Stock
     */
    public Potion(String potion, int q)
    {
        this.potion = potion;
        quantite = q;
    }
    
   /** Ajoute une potion à la liste des composants
     * @param potion la potion que l'on veux ajouter au composite
     * @throws PotionException Si elle est null.
     */
    @Override
    public void add(Stock potion) throws PotionException {
        assert null != listePotion;
        if (null == potion) {
            throw new PotionException("Impossible d'ajouter une potion nulle");
        }
       listePotion.add(potion);
       notifierObservateurs();
       
    }

    /** Enlève un produit de la composition.
     * @param potion la potion à retirer de la composition.
     * @throws ProduitException Si elle est null ou n'est pas dans la liste.
     */
    @Override
    public void remove(Stock potion) throws PotionException {
        assert null != listePotion;
        if (null == potion) {
            throw new PotionException("Impossible d'enlever une potion nulle");
        }

        if ( ! listePotion.contains(potion)) {
            throw new PotionException("Impossible d'enlever cette potion, elle n'est pas dans la liste");
        }

        listePotion.remove(potion);
        notifierObservateurs();
    }
    public int getQuantite() {
        return quantite ;
    }

    public void setQuantite(int q) {
         quantite = q;
    }    

    @Override
    public Collection getListeStock() {
        return listePotion;
    }
         
    /**
     * un exemple methode alimentation de Stock
     *
     * @param  quantite dup Stock   le paramètre de la méthode
     * @return     quantite disponible dans le Stock
     */
       
    /*  @Override
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
    */
    }

