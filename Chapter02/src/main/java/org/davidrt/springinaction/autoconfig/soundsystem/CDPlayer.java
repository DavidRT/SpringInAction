package org.davidrt.springinaction.autoconfig.soundsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CDPlayer implements MediaPlayer{

	private CompactDisc cd;
	
	@Autowired // or @Inject java specification.
	public CDPlayer(CompactDisc cd) {
		this.cd = cd;
	}
	
	/* Also apply in setters or any method.

	@Autowired
	public void setCompactDisc(CompactDisc cd){
		this.cd = cd;
	}
	
	 */
	
	
	@Override
	public void play() {
		cd.play();
	}
	
	
}
