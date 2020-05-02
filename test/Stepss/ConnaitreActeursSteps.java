package Stepss;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static org.junit.Assert.assertEquals;
import tpju.Personnage;

public class ConnaitreActeursSteps {
    private Personnage personna1;
    
@Given("^un téléspectateur$")
public void un_téléspectateur() throws Throwable {
 //
}

@When("^vouloir connaitre l'acteur associé à un personnage de film \"([^\"]*)\"$")
public void vouloir_connaitre_l_acteur_associé_à_un_personnage_de_film(String arg1) throws Throwable 
{
    personna1 = new Personnage(arg1, "Christian Clavier");
    assertEquals("Christian Clavier", personna1.getActeur());
   
}

@Then("^afficher le nom de l'acteur$")
public void afficher_le_nom_de_l_acteur() throws Throwable {
    
//
}

}
