
public abstract class GameCharacter extends GameObject {

	
		
		public abstract GameCharacter fight(GameCharacter opp);
		public abstract void moveCharacter();
		public abstract void speak(GameCharacter character, String text);
		

}
