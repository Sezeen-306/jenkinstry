package runtest;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "src/test/resources" }, 
				 glue={"runbrowserstepsdefinition"},
				 plugin = { "pretty", "json:target/cucumber-reports/cucumber.json\\\", \\\"html:target/cucumber-reports" },
		 	   // tags = {"@WIP "},
				 snippets = SnippetType.CAMELCASE
				 )
public class RunCuckTest {

}
