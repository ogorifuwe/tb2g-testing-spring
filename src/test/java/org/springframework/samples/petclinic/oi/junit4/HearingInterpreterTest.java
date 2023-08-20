package org.springframework.samples.petclinic.oi.junit4;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.samples.petclinic.oi.HearingInterpreter;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = {BaseConfig.class, LaurelConfig.class})
public class HearingInterpreterTest {

  @Autowired
  private HearingInterpreter hearingInterpreter;

  @Test
  public void whatIHeard() {
    String word = hearingInterpreter.whatIHeard();

    assertEquals("Laurel", word);
  }
}