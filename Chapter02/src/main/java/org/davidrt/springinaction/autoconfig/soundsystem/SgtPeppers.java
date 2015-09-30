package org.davidrt.springinaction.autoconfig.soundsystem;

import org.springframework.stereotype.Component;

/**
 * Implementation of CompacDisc
 */

@Component // can be @Named (java specification)
public class SgtPeppers implements CompactDisc{
	
	private String title = "Sgt. Pepper's Lonely Hearts Club Band";
	private String artist = "The Beatles";
	
	@Override
	public void play() {
		System.out.println("Playing "+title+" by "+artist);
	}
	
	

	
}
