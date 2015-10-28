package org.davidrt.springinaction.conditional;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=MagicConfig.class)
public class MagicExistsTest {
	
	@Autowired
	private ApplicationContext context;
	
	/**
	 * Set an environment variable called magic to work with conditional bean declaration.
	 */
	@BeforeClass
    public static void runBefore() {
		 System.setProperty("magic", "magic");
    }
	
	@Test
	public void shouldNotBeNull(){
		assertTrue(context.containsBean("MagicBean"));
	}

}
