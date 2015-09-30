package org.davidrt.springinaction.mixedconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CDPlayerConfig {
	
	@Bean
	public CDPlayer cdPlayer(CompactDisc compactDisc){
		return new CDPlayer(compactDisc);
	}
}
