package org.springframework.samples.petclinic.oi.junit5;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.samples.petclinic.oi.HearingInterpreter;
import org.springframework.samples.petclinic.oi.LaurelWordProducer;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import static org.junit.jupiter.api.Assertions.*;

@SpringJUnitConfig(classes = {HearingInterpreterInnerClassTest.TestConfig.class})
class HearingInterpreterInnerClassTest {

  @Autowired
  private HearingInterpreter hearingInterpreter;

  @Test
  void whatIHeard() {
    String word = hearingInterpreter.whatIHeard();

    assertEquals("Laurel", word);
  }

  @Configuration
  static class TestConfig {

    @Bean
    HearingInterpreter hearingInterpreter() {
      return new HearingInterpreter(new LaurelWordProducer());
    }
  }

}