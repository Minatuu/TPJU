package Stepss;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static org.junit.Assert.assertEquals;
import tpju.Film;
import tpju.Personnage;

public class ConnaitreActeursSteps {

    private Film film1;
    private Personnage personna1;

    @Given("^un téléspectateur$")
    public void un_téléspectateur() throws Throwable {
        //
    }

    @When("^vouloir connaitre l'acteur associé à un personnage de film \"([^\"]*)\"$")
    public void vouloir_connaitre_l_acteur_associé_à_un_personnage_de_film(String arg1) throws Throwable {
        film1 = new Film("Astérix et Obélix", "Alain Chabat");
        personna1 = new Personnage("Astérix", "Christian Clavier");
        film1.addPersonnage(personna1);

        assertEquals("Christian Clavier", film1.getPersonnage(arg1));

    }

    @Then("^afficher le nom de l'acteur$")
    public void afficher_le_nom_de_l_acteur() throws Throwable {

//
    }

}
