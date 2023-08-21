package org.springframework.samples.petclinic.oi.junit5;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.samples.petclinic.oi.HearingInterpreter;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import static org.junit.jupiter.api.Assertions.*;

@ActiveProfiles("component-scan")
@SpringJUnitConfig(classes = HearingInterpreterComponentScanTest.TestConfig.class)
class HearingInterpreterComponentScanTest {

  @Autowired
  private HearingInterpreter hearingInterpreter;

  @Test
  void whatIHeard() {
    String word = hearingInterpreter.whatIHeard();

    assertEquals("Laurel", word);
  }

  @Profile("component-scan")
  @Configuration
  @ComponentScan("org.springframework.samples.petclinic.oi")
  static class TestConfig {
  }
}