package bdd.cucumber.java;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        format = {"pretty","html:target/reports"},
        features = "classpath:features",
        glue = "bdd.cucumber.java"
        //,tags = {""}
)

public class TestRunner {
}
