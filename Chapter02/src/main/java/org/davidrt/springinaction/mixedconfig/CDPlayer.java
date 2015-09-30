package org.davidrt.springinaction.mixedconfig;

import org.springframework.beans.factory.annotation.Autowired;

public class CDPlayer implements MediaPlayer{
	
	private CompactDisc compactDisc;

	@Autowired
	public CDPlayer(CompactDisc cd){
		this.compactDisc = cd;
	}
	
	@Override
	public void play() {
		compactDisc.play();
	}
	
	

}
