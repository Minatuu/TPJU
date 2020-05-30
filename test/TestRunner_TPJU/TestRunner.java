package TestRunner_TPJU;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(monochrome = true,
        strict = true,
        features = "test/features",
        glue = "Stepss")
public class TestRunner {

}
