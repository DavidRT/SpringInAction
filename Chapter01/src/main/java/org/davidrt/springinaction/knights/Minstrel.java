package org.davidrt.springinaction.knights;

import java.io.PrintStream;

public class Minstrel {
	
	private PrintStream stream;
	
	public Minstrel(PrintStream stream) {
		this.stream = stream;
	}
	
	// called before quest
	public void singBeforeQuest(){
		stream.println("La la la, the knight is sooo braveee!");
	}
	
	// called after quest
	public void singAfterQuest(){
		stream.println("Teee hee, the brave knight did embark on a quest!!!");
	}

}
