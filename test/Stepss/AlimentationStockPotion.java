package Stepss;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static org.junit.Assert.assertEquals;
import tpju.Personnage;
import AgileTP.*;

public class AlimentationStockPotion {
    private Personnage magicien;
    private Stock potion; 
    
@Given("^un magicien qui souhaite stocker une quantite preparee de potion$")
public void un_magicien_qui_souhaite_stocker_une_quantite_preparee_de_potion()
{
    magicien = new Personnage("Panoramix", "Claude Rich");
    potion = new Potion();
}

@When("^le magicien saisie la quantite du potion preparee (\\d+)$")
public void le_magicien_saisie_la_quantite_du_potion_preparee(int arg1)
{
    potion.setQuantite(10);
    potion.alimenterStock(arg1);
    assertEquals(10+arg1,potion.getQuantite());
}

@Then("^la quantite actuelle du stock devient la somme de la quantite existante plus la quantitee ajoute$")
public void la_quantite_actuelle_du_stock_devient_la_somme_de_la_quantite_existante_plus_la_quantitee_ajoute() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    
}
}
