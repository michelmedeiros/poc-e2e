package com.hotmart.cucumber.poc.e2e;

import com.hotmart.cucumber.poc.e2e.commons.ResultMap;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = "pretty", features = "src/test/resources/features")
public class CucumberRunner extends E2ETestIntegration {

  @Autowired
  private ResultMap resultMap;

}
