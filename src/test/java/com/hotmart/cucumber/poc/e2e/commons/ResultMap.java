package com.hotmart.cucumber.poc.e2e.commons;

import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Component;

@Component
public class ResultMap {

  private Map<String, Object> results;

  public ResultMap() {
    this.results = new HashMap<>();
  }

  public void addResult(String key, Object value) {
    this.results.put(key, value);
  }

  public Object getResult(String key) {
    if(this.results.containsKey(key)) {
      return results.get(key);
    }
    return null;
  }

  public void cleanResults() {
    results.clear();
  }


}
