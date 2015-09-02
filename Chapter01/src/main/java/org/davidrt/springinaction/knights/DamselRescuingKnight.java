package org.davidrt.springinaction.knights;

public class DamselRescuingKnight implements Knight{
	
	private RescueDamselQuest quest;
	
	public DamselRescuingKnight(){
		// Tightly coupled to RescueDamselQuest, difficult to test, reuse and understand
		this.quest = new RescueDamselQuest();  
	}
	
	public void embarkOnQuest(){
		quest.embark();
	}

}
