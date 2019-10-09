package testDriver;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="Features"
		,glue="stepDefinitions"
		//,plugin={"prety","html:target/Cucumber"}
		//,tags="@web"
		
		)

public class Runner {

}
