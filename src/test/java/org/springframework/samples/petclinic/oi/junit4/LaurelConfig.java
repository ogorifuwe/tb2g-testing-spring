package org.springframework.samples.petclinic.oi.junit4;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.samples.petclinic.oi.LaurelWordProducer;

@Configuration
public class LaurelConfig {

  @Bean
  LaurelWordProducer laurelWordProducer() {
    return new LaurelWordProducer();
  }
}
