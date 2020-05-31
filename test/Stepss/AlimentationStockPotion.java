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
}

@When("^le magicien saisie le nom \"([^\"]*)\" et la quantite de potion (\\d+)$")
public void le_magicien_saisie_le_nom_et_la_quantite_de_potion(String arg1, int arg2) throws Throwable {
    potion = new Potion(arg1, arg2);
}


@Then("^la potion est ajoutée au stock de potions$")
public void la_potion_est_ajoutée_au_stock_de_potions() throws Throwable {
    potion.add(potion);
    assertEquals(true,potion.getListeStock().contains(potion));
}
}
