package org.davidrt.springinaction.autoconfig.soundsystem;
import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.contrib.java.lang.system.StandardOutputStreamLog;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

//Create spring app context before test.
@RunWith(SpringJUnit4ClassRunner.class) 
@ContextConfiguration(classes=CDPlayerConfig.class)
public class CdPlayerTest {

	// Rule that permit assertions whatever is written to console.
	@Rule
	public final StandardOutputStreamLog log = new StandardOutputStreamLog();
	
	@Autowired
	private MediaPlayer player;
	
	@Autowired
	private CompactDisc cd;
	
	@Test
	public void cdShouldNotBeNull() {
	assertNotNull(cd);
	}
	
	@Test
	public void play(){
		player.play();
		assertEquals("Playing Sgt. Pepper's Lonely Hearts Club Band by The Beatles\n", log.getLog());
	}

}
