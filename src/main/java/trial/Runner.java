package trial;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "/Users/SU20463960/eclipse-workspace/IRCTC/src/main/java/trial/loginTest.feature"
		,glue={"trial"}
		)

public class Runner {

}
