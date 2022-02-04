package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/java/testFeatures",
		glue="assignment4",
		tags="@TC02_Negative2"
		
		)

public class TC02_Negative2 {

}
