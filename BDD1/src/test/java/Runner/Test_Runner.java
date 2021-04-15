package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class) // To identify and execute the cucumber class
@CucumberOptions(features={"src/test/resources/Login/Login.feature"},
glue = {"StepDefinitions"}, dryRun=false,tags="@InvalidLogin", // this basically to check did i implement all the methods//in case if i missed
//any method ot will help me to identify
//Glue means my providing my entire stpe package to this method
monochrome=true,//basically get the right format in console
strict=true, // this is going to chech very strictlly any steps are missing in the step definition
plugin = {"html:testoutput/sunil.html","junit:testoutput/sunil.xml","json:testoutput/sunil.json"})
public class Test_Runner {

}
