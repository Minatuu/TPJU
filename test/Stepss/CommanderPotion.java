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
    
@Given("^un guerrier qui souhaite commander une quantite du potion$")
public void un_guerrier_qui_souhaite_commander_une_quantite_du_potion()  throws Throwable
{
    guerrier = new Personnage("Asterix", "Christian Clavier");
    potion = new Potion();
}

@When("^le guerrier commande une quantite de potion (\\d+)$")
public void le_guerrier_commande_une_quantite_de_potion(int arg1)  throws Throwable
{
    potion.setQuantite(10);
    potion.delivreyStock(arg1);
    assertEquals(10-arg1,potion.getQuantite());
}

@Then("^la quantite disponible du potion devient la difference entre la quantite initiale et la quantite commandee\\.$")
public void la_quantite_disponible_du_potion_devient_la_difference_entre_la_quantite_initiale_et_la_quantite_commandee()  throws Throwable
{
   //
}

@When("^le guerrier commande une quantite du potion (\\d+) superieure à la quantite disponible dans le stock$")
public void le_guerrier_commande_une_quantite_du_potion_superieure_à_la_quantite_disponible_dans_le_stock(int arg1) throws Throwable
{
    assertEquals("OK", potion.delivreyStock(arg1));
}

@Then("^le systeme lui renvoie un message qui indique la rupture de stock de potion$")
public void le_systeme_lui_renvoie_un_message_qui_indique_la_rupture_de_stock_de_potion() throws Throwable
{
    //
}
}
