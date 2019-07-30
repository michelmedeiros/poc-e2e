package com.hotmart.cucumber.poc.e2e;

import com.hotmart.cucumber.poc.e2e.commons.ResultMap;
import lombok.NoArgsConstructor;
import org.junit.AfterClass;
import org.junit.BeforeClass;

@NoArgsConstructor
public class E2ETestIntegration {

  protected static ResultMap resultMap;

  @BeforeClass
  public static void setUp() {
    resultMap = new ResultMap();
  }


  @AfterClass
  public static void setDown() {
    resultMap.cleanResults();
  }

}
