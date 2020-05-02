package Stepss;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static org.junit.Assert.assertEquals;
import tpju.Personnage;

public class BoirePotionSteps {
    private Personnage personna2, personna1;
    
@Given("^un personnage qui souhaite boire de la potion$")
public void un_personnage_qui_souhaite_boire_de_la_potion()  throws Throwable
{
    personna1 = new Personnage("Astérix", "Christian Clavier");
    personna2 = new Personnage("Obélix", "Gérard Depardieu");
}

@When("^le personnage entre la quantité de potion (\\d+)$")
public void le_personnage_entre_la_quantité_de_potion(int arg1)  throws Throwable
{
    Personnage.setQuantity(10);
    assertEquals(10-arg1, personna1.boire(arg1));
}

@Then("^la quantité restance devient la différence entre la valeur initiale de quantité et de la valeur bue\\.$")
public void la_quantité_restance_devient_la_différence_entre_la_valeur_initiale_de_quantité_et_de_la_valeur_bue()  throws Throwable
{
   //
}

@When("^le personnage entre une quantité de potion (\\d+) supérieure à la quantité de potion disponible$")
public void le_personnage_entre_une_quantité_de_potion_supérieure_à_la_quantité_de_potion_disponible(int arg1) throws Throwable
{
    assertEquals(-1, personna1.boire(arg1));
}

@Then("^le systéme lui renvoie la quantité de potion initiale$")
public void le_systéme_lui_renvoie_la_quantité_de_potion_initiale()  throws Throwable
{
    //
}
}
