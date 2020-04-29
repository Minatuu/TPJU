/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestRunner_TPJU;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


/**
 *
 * @author aamina
 */

@RunWith(Cucumber.class)
@CucumberOptions(features="features",glue={"StepDefinitions"})
public class TestRunner {
    
}
