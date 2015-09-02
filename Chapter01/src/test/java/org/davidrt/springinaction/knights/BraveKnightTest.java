package org.davidrt.springinaction.knights;
import static org.mockito.Mockito.*;
import org.junit.Test;

public class BraveKnightTest {
	
	@Test
	public void knightShouldEmbarkOnQuest(){
		// Create a mock quest
		Quest mockQuest = mock(Quest.class); 
		// Inject mock
		BraveKnight knight = new BraveKnight(mockQuest); 
		knight.embarkOnQuest();
		verify(mockQuest, times(1)).embark();
	}

}
