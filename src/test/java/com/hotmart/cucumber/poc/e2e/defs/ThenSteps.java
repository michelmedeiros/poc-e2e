package com.hotmart.cucumber.poc.e2e.defs;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com.hotmart.cucumber.poc.e2e.E2ETestIntegration;
import cucumber.api.java.en.Then;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ThenSteps extends E2ETestIntegration {

  @Then("I should be told {string}")
  public void i_should_be_told(String expectedAnswer) {
    log.info("Then step");
    assertThat(expectedAnswer, equalTo(resultMap.getResult("awser")));
  }

}
