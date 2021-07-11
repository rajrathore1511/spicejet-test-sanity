package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)	

@CucumberOptions(features="features",glue= {"step_definition"},plugin= {"html:target/cucumber-html-report"})


public class runnerclass {
 
}
