package tpju;



import static org.junit.Assert.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Classe-test PersonnageTest.
 *
 * @author  (votre nom)
 * @version (un numéro de version ou une date)
 *
 * Les classes-test sont documentées ici :
 * http://junit.sourceforge.net/javadoc/junit/framework/TestCase.html
 * et sont basées sur le document Š 2002 Robert A. Ballance intitulé
 * "JUnit: Unit Testing Framework".
 *
 * Les objets Test (et TestSuite) sont associés aux classes à tester
 * par la simple relation yyyTest (e.g. qu'un Test de la classe Name.java
 * se nommera NameTest.java); les deux se retrouvent dans le męme paquetage.
 * Les "engagements" (anglais : "fixture") forment un ensemble de conditions
 * qui sont vraies pour chaque méthode Test à exécuter.  Il peut y avoir
 * plus d'une méthode Test dans une classe Test; leur ensemble forme un
 * objet TestSuite.
 * BlueJ découvrira automatiquement (par introspection) les méthodes
 * Test de votre classe Test et générera la TestSuite conséquente.
 * Chaque appel d'une méthode Test sera précédé d'un appel de setUp(),
 * qui réalise les engagements, et suivi d'un appel à tearDown(), qui les
 * détruit.
 */
public class PersonnageTest
{
    private Personnage personna1;
    private Personnage personna2;
    private Personnage personna3;
    private Film film1;

    // Définissez ici les variables d'instance nécessaires à vos engagements;
    // Vous pouvez également les saisir automatiquement du présentoir
    // à l'aide du menu contextuel "Présentoir --> Engagements".
    // Notez cependant que ce dernier ne peut saisir les objets primitifs
    // du présentoir (les objets sans constructeur, comme int, float, etc.).
    
    

    /**
     * Constructeur de la classe-test PersonnageTest
     */
    public PersonnageTest()
    {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    /**
     * Met en place les engagements.
     *
     * Méthode appelée avant chaque appel de méthode de test.
     */
    @Before
    public void setUp() // throws java.lang.Exception
     {
        personna1 = new Personnage("Astérix", "Christian Clavier");
        personna2 = new Personnage("Obélix", "Gérard Depardieu");
        personna3 = new Personnage("Panoramix", "Claude Rich");
        film1 = new Film("Astérix et Obélix", "Alain Chabat");
        film1.addPersonnage(personna1);
        film1.addPersonnage(personna2);
        
    }

    /**
     * Supprime les engagements
     *
     * Méthode appelée après chaque appel de méthode de test.
     */
    @After
    public void tearDown() // throws java.lang.Exception
    {
        personna1 = null;
        personna2 = null;
        film1 = null;
    }
    @Test
    public void testcompetences_personnages()
    {
        personna1 = new Personnage("Astérix", "Christian Clavier");
        assertEquals("Christian Clavier", personna1.getActeur());
        assertEquals("Astérix", personna1.getNom());
        assertEquals("Astérix est un grand guerrier et il a des compétences de chef ",personna1.competences());
    }
    @Test
    public void testboire()
    {
        assertNull(Personnage.quantity);
        assertEquals(10, personna3.prepare(10));
        assertEquals(5, personna3.boire(5));
        assertEquals(-1, personna3.boire(10));
             
    }
    @Test
    public void testfilm_acteur()
    {
        assertEquals("Gérard Depardieu", personna2.getActeur());
        assertEquals("Obélix", personna2.getNom());
        assertEquals("Christian Clavier", personna1.getActeur());
        assertEquals("Astérix", personna1.getNom());
        film1.getPersonnage();
        assertNotNull(film1);
        
    }
}

 




