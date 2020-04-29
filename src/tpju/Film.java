package tpju;
import java.util.ArrayList;
import java.util.ListIterator;
/**
 * Décrivez votre classe Film ici.
 */
public class Film
{
    // variables d'instance 
    private String titre;
    private String realisateur;
    private ArrayList<Personnage> personnages;
    /**
     * Constructeur d'objets de classe Film
     */
    public Film(String titre,String realisateur)
    {
        // initialisation des variables d'instance
        this.titre = titre;
        this.realisateur = realisateur;
        personnages = new ArrayList<Personnage>();
    }

    
    public void addPersonnage(Personnage personnage)
    {
        personnages.add(personnage);
    }
    
    public String getPersonnage()
    {
        ListIterator<Personnage> it = personnages.listIterator();
        while(it.hasNext()){
         Personnage per = it.next();
         return per.getNom();
        }
        return null;
    }
}
