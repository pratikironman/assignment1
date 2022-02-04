package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/java/featureFiles",
		glue="assignment4",
		tags="@TC01_Negative1"
		
		)

public class TC01_Negative1 {

}
