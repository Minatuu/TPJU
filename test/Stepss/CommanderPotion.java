package Stepss;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static org.junit.Assert.assertEquals;
import tpju.Personnage;
import AgileTP.*;

public class CommanderPotion {
    private Personnage guerrier;
    private Stock potion;
    
@Given("^un guerrier qui souhaite commander de la potion$")
public void un_guerrier_qui_souhaite_commander_de_la_potion() throws Throwable {
    guerrier = new Personnage("Asterix", "Christian Clavier");
}

@When("^le guerrier commande une potion en saisissant le nom \"([^\"]*)\" et la quantite (\\d+)$")
public void le_guerrier_commande_une_potion_en_saisissant_le_nom_et_la_quantite(String arg1, int arg2) throws Throwable {
    potion = new Potion(arg1, arg2);
    potion.add(potion);
    assertEquals(true, potion.getListeStock().contains(potion));
    potion.remove(potion);
    
    
}

@Then("^la potion est suprimée du stock de potion disponible$")
public void la_potion_est_suprimée_du_stock_de_potion_disponible() throws Throwable {
      //
}

@When("^le guerrier commande une potion non disponible dans le stock en saisissant le nom \"([^\"]*)\" et la quantite (\\d+)$")
public void le_guerrier_commande_une_potion_non_disponible_dans_le_stock_en_saisissant_le_nom_et_la_quantite(String arg1, int arg2) throws Throwable {
    potion = new Potion(arg1,arg2);
    assertEquals(false, potion.getListeStock().contains(potion));
    
}

@Then("^le systeme lui renvoie un message qui indique la rupture de stock de potion$")
public void le_systeme_lui_renvoie_un_message_qui_indique_la_rupture_de_stock_de_potion() throws Throwable
{
    //
}
}
