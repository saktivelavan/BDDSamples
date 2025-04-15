package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "@target/failedScenarios.txt",
		glue = {"stepDefs"},
		monochrome = true,
		dryRun= true,
		plugin = {"pretty",
				"html:targe/Reports/HtmlReport.html"
		}
		)
public class RerunRunner extends AbstractTestNGCucumberTests {

}
