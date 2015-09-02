package org.davidrt.springinaction.knights;

public class BraveKnight implements Knight{
	
	private Quest quest; 
	// private Minstrel minstrel;
	
	
	/* This knight doesnt create his own quest. This type of DI
	 * is called as "constructor injection".
	 * */
	public BraveKnight(Quest quest // injecting quest (dependendcy)
		//	, Minstrel minstrel --> injecting the minstreal would work, but it is doenst job for a knight.
			) { 
		
		
		/* Quest its an interface that all types of quest implements.
		 * So, this knight is not couple to any implementation
		 */
		this.quest = quest;
	}
	
	public void embarkOnQuest(){
//		minstrel.singBeforeQuest(); --> minstrel should do their job, not the knight
		quest.embark();
//		minstrel.singAfterQuest();
	}
	
	

}
