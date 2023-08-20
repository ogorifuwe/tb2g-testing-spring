package org.springframework.samples.petclinic.oi.junit4;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.samples.petclinic.oi.YannyWordProducer;

@Configuration
public class YannyConfig {

  @Bean
  YannyWordProducer yannyWordProducer() {
    return new YannyWordProducer();
  }
}
