package has_a_relationship;

public class Engine {
	int hp;
	int strokes;
	String type;
	Engine()
	{
		
	}
	Engine(int hp, int strokes, String type)
	{
		this.hp=hp;
		this.strokes=strokes;
		this.type=type;
	}
	public void start()
	{
		System.out.println("Start the Engine");
	}
	public void displayEngine()
	{
		System.out.println("Engine HP is: "+hp);
		System.out.println("Engine Strokes is: "+strokes);
		System.out.println("Engine Type is: "+type);
	}

}











