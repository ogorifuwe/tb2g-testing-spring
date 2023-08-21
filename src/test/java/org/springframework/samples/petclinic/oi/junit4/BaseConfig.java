package org.springframework.samples.petclinic.oi.junit4;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.samples.petclinic.oi.HearingInterpreter;
import org.springframework.samples.petclinic.oi.WordProducer;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles("base-test")
@Configuration
public class BaseConfig {

  @Bean
  HearingInterpreter hearingInterpreter(WordProducer wordProducer) {
    return new HearingInterpreter(wordProducer);
  }
}