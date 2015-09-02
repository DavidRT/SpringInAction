package org.davidrt.springinaction.knights.config;

import org.davidrt.springinaction.knights.BraveKnight;
import org.davidrt.springinaction.knights.Knight;
import org.davidrt.springinaction.knights.Minstrel;
import org.davidrt.springinaction.knights.Quest;
import org.davidrt.springinaction.knights.SlayDragonQuest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/** 
 * Configuration wiring java-based.
 */

@Configuration
public class KnightConfig {
	
	@Bean
	public Knight knight(){
		return new BraveKnight(quest());
	}
	
	@Bean
	public Quest quest(){
		return new SlayDragonQuest(System.out);
	}
	

}
