package org.davidrt.springinaction.knights;

import java.io.PrintStream;

import org.springframework.context.annotation.Bean;

public class KnightConfig {
	

	  @Bean
	  public Knight knight() {
	    return new BraveKnight(quest());
	  }

	  @Bean
	  public Quest quest() {
	    return new SlayDragonQuest(stream());
	  }

	  @Bean
	  public PrintStream stream() {
	    return new FakePrintStream();
	  }

}
