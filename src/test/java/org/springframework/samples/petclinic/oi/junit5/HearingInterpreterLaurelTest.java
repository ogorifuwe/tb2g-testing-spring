package org.springframework.samples.petclinic.oi.junit5;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.samples.petclinic.oi.HearingInterpreter;
import org.springframework.samples.petclinic.oi.junit4.BaseConfig;
import org.springframework.samples.petclinic.oi.junit4.LaurelConfig;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import static org.junit.jupiter.api.Assertions.*;

@ActiveProfiles("base-test")
@SpringJUnitConfig(classes = {BaseConfig.class, LaurelConfig.class})
class HearingInterpreterLaurelTest {

  @Autowired
  private HearingInterpreter hearingInterpreter;

  @Test
  void whatIHeard() {
    String word = hearingInterpreter.whatIHeard();

    assertEquals("Laurel", word);
  }
}