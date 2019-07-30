package com.hotmart.cucumber.poc.e2e.defs;

import com.hotmart.cucumber.poc.e2e.E2ETestIntegration;
import com.hotmart.cucumber.poc.e2e.commons.Hooks;
import com.hotmart.cucumber.poc.e2e.commons.ResultMap;
import cucumber.api.java.en.When;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

@Slf4j
public class WhenSteps extends E2ETestIntegration {

  @When("I ask whether it's {string} yet")
  public void i_ask_whether_it_s_yet(String ask) {
    log.info("When step");
    String  today = (String) resultMap.getResult("today");
    String response = ask.equalsIgnoreCase(today) ? "Ok" : "Nope";
    resultMap.addResult("awser", response);
  }
}
