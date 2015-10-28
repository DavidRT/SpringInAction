package org.davidrt.springinaction.conditional;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MagicConfig {
	
	/*
	 * Conditional declaration; this bean will be wired only if the condition its true.
	 * */
	@Bean
	@Conditional(MagicExistsCondition.class)
	public MagicBean MagicBean(){
		return new MagicBean();
	}

}
