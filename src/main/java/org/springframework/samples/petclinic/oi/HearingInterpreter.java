package org.springframework.samples.petclinic.oi;

import org.springframework.stereotype.Service;

@Service
public class HearingInterpreter {

  private final WordProducer wordProducer;

  public HearingInterpreter(WordProducer wordProducer) {
    this.wordProducer = wordProducer;
  }

  public String whatIHeard() {
    String word = wordProducer.getWord();
    System.out.println(word);
    return word;
  }
}
