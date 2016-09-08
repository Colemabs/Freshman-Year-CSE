import java.util.ArrayList;


public class Tester {

	public static ArrayList<GameObject> gameObjects = new ArrayList<GameObject>();
	
	
	public static void main(String[] args) {
		primeArray();
		printTest();
	}

	private static void printTest() {
		for(GameObject go : gameObjects){
			if(go instanceof Flyable)
				((Flyable) go).fly();
			if(go instanceof Swimmable)
				((Swimmable) go).swim();
		}
		
	}
	
//	private static void addObject(GameObject go, int count){
//		for(int i = 0; i < count; i++){
//			gameObjects.add(go);
//		}
//	}

	private static void primeArray() {
		gameObjects.add(new Badbird());
		gameObjects.add(new Badbird());
		gameObjects.add(new Badbird());
		gameObjects.add(new Badbird());
		gameObjects.add(new Badbird());
		
		gameObjects.add(new Dragon());
		gameObjects.add(new Dragon());
		
		gameObjects.add(new Troll());
		gameObjects.add(new Troll());
		gameObjects.add(new Troll());
		
		gameObjects.add(new Fighter());
		
		gameObjects.add(new Wizard());
		gameObjects.add(new Wizard());
		
		for(int i = 0; i < 5; i++){
			gameObjects.add(new Rock());
		}
		
		for(int i = 0; i < 20; i++){
			gameObjects.add(new House());
		}
		
		for(int i = 0; i < 40; i++){
			gameObjects.add(new Cave());
		}
		
		gameObjects.add(new Snake());
		}
		
	}


