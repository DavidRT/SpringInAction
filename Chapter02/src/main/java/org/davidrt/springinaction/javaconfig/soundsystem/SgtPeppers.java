package org.davidrt.springinaction.javaconfig.soundsystem;

import org.davidrt.springinaction.javaconfig.soundsystem.CompactDisc;

public class SgtPeppers implements CompactDisc{
	
	private String title = "Sgt. Pepper's Lonely Hearts Club Band"; 
	private String artist = "The Beatles";
	  
	  public void play() {
	    System.out.println("Playing " + title + " by " + artist);
	  }

}
