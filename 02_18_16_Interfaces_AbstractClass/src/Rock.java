
public class Rock extends GameObject implements Flyable{
	
	public Rock(){
		
	}

	@Override
	public boolean fly() {
		System.out.println("Rock: fly()");
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
