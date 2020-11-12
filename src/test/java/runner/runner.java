package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "html:target/cucumber-html-report",
                "json:target/cucumber.json", "junit:target/cucumber.xml"},
        features = "src/test/resources/spoton.feature",
        glue = "step_definitions",
        dryRun = true,
        tags = "@SmokeTest"

)

public class runner {
}
