package org.davidrt.springinaction.xmlconfig.soundsystem.propertyInjection;

import org.davidrt.springinaction.xmlconfig.soundsystem.CompactDisc;
import org.davidrt.springinaction.xmlconfig.soundsystem.MediaPlayer;
import org.springframework.beans.factory.annotation.Autowired;

public class CDPlayer implements MediaPlayer {
	
	
	private CompactDisc compactDisc;
	
	public void setCompactDisc(CompactDisc compactDisc){
		this.compactDisc = compactDisc;
	}
	
	public void play(){
		compactDisc.play();
	}
	

}
