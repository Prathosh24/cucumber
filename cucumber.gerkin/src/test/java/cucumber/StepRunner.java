package cucumber;

import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/resources/feature",glue="cucumber")
public class StepRunner {

}
