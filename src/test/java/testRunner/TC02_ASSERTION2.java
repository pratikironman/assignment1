package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/java/featureFiles",
		glue="assignment3",
		tags="@TC02_ASSERTION2"
		
		)

public class TC02_ASSERTION2  {

}
