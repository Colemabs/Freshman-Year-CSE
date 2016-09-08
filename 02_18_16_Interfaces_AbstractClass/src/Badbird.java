
public class Badbird extends Monster implements Flyable {

	@Override
	public GameCharacter fight(GameCharacter opp) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void moveCharacter() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void speak(GameCharacter character, String text) {
		// TODO Auto-generated method stub
		
	}

	
	@Override
	public boolean fly() {
		System.out.println("Badbird: fly()");
		return false;
	}

	@Override
	public boolean land() {
		
		return false;
	}

	@Override
	public void crash() {
		
		
	}

	

}
