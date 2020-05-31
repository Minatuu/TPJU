package Stepss;

import AgileTP.*;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.*;
import static org.junit.Assert.assertEquals;
import tpju.Personnage;

public class BoirePotionSteps {
    private Personnage personna2, personna1;
    Stock potion;
    
@Given("^un personnage qui souhaite boire de la potion$")
public void un_personnage_qui_souhaite_boire_de_la_potion()  throws Throwable
{
    personna1 = new Personnage("Astérix", "Christian Clavier");
    personna2 = new Personnage("Obélix", "Gérard Depardieu");
}
@When("^le personnage commande une potion en saisissant le nom \"([^\"]*)\" et la quantite (\\d+)$")
public void le_personnage_commande_une_potion_en_saisissant_le_nom_et_la_quantite(String arg1, int arg2) throws Throwable {
    
    potion = new Potion(arg1,arg2);
    potion.add(potion);
    assertEquals(true, potion.getListeStock().contains(potion));
}

@When("^le personnage commande une potion non disponible dans le stock en saisissant le nom \"([^\"]*)\" et la quantite (\\d+)$")
public void le_personnage_commande_une_potion_non_disponible_dans_le_stock_en_saisissant_le_nom_et_la_quantite(String arg1, int arg2) throws Throwable {
    potion = new Potion(arg1,arg2);
    assertEquals(false, potion.getListeStock().contains(potion));
}

@Then("le systéme refuse avec le messageErreur")
public void le_systéme_refuse_avec_le_messageErreur()  throws Throwable
{
    //
}

@Then("^le systéme lui renvoie la quantité de potion initiale$")
public void le_systéme_lui_renvoie_la_quantité_de_potion_initiale()  throws Throwable
{
    //
}
}
