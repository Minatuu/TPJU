package Stepss;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import tpju.Personnage;


public class FabricationPotionSteps {
    private Personnage personna3;
    
@Given("^un personnage qui souhaite préparer de la potion$")
public void un_personnage_qui_souhaite_préparer_de_la_potion() throws Throwable 
{   
    personna3 = new Personnage("Panoramix", "Claude Rich");
}

@When("^le personnage saisit la quantité de potion (\\d+)$")
public void le_personnage_saisit_la_quantité_de_potion(int arg1) throws Throwable 
{
    assertEquals(10, personna3.prepare(arg1));
}

@Then("^la quantité totale devient la somme de quantité et de la quantitité préparé$")
public void la_quantité_totale_devient_la_somme_de_quantité_et_de_la_quantitité_préparé() throws Throwable 
{
    //
}

@Then("^le systéme lui renvoie la quantité initiale de potion$")
public void le_systéme_lui_renvoie_la_quantité_initiale_de_potion() throws Throwable 
{
    //
}  
}
