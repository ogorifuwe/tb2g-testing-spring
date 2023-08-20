package org.springframework.samples.petclinic.oi.junit5;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.samples.petclinic.oi.HearingInterpreter;
import org.springframework.samples.petclinic.oi.junit4.BaseConfig;
import org.springframework.samples.petclinic.oi.junit4.YannyConfig;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import static org.junit.jupiter.api.Assertions.*;

@SpringJUnitConfig(classes = {BaseConfig.class, YannyConfig.class})
class HearingInterpreterYannyTest {

  @Autowired
  private HearingInterpreter hearingInterpreter;

  @Test
  void whatIHeard() {
    String word = hearingInterpreter.whatIHeard();

    assertEquals("Yanny", word);
  }

}