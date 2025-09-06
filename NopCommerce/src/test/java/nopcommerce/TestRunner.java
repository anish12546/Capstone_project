package nopcommerce;


import org.junit.runner.RunWith;
 
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
 
 
@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/features",
                 glue={"nopcommerce"},
                 plugin= {"pretty","html:target/htmlreport3.html",
		                           "json:target/jsonreport3",
		                           "junit:target/junitreport3"})
public class TestRunner {
 
}
 