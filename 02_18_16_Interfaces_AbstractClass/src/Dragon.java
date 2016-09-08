
public class Dragon extends Monster implements Flyable {

	public Dragon() {
		// TODO Auto-generated constructor stub
	}

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
		System.out.println("Dragon: fly()");
		return false;
	}

	@Override
	public boolean land() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void crash() {
		// TODO Auto-generated method stub
		
	}

}
