package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\Tarak\\eclipse-workspace\\CucumberPractice\\src\\test\\java\\Features\\loginfreecrm.feature"
                 , glue = {"stepdefinition" }
				 , monochrome = true
                 , plugin = {"pretty" , "html:index.html"} 
                 , stepNotifications = true
                	


)

public class TestRunner {

}
