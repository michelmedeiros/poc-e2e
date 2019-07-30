package com.hotmart.cucumber.poc.e2e.defs;

import com.hotmart.cucumber.poc.e2e.E2ETestIntegration;
import cucumber.api.java.en.Given;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class GivenSteps extends E2ETestIntegration {


  @Given("today is {string}")
  public void today_is(String today) {
    log.info("Given step");
    resultMap.addResult("today", today);
  }

}
