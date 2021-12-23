package runnerFiles;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		features="src/test/java/runnerFiles",
		glue="runnerFiles"
				
		)
public class TestRunner extends AbstractTestNGCucumberTests{

}
