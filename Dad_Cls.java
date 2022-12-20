package Details;

public class Dad_Cls {

	public static void main(String[] args) {
		
		Dad_Cls things = new Dad_Cls();
		
		things.pen();
		things.pencil();
		things.scale();
		things.eraser();
	}
	public void pen() {
     System.out.println("the pen");
	}
	private void pencil() {
     System.out.println("the pencil");
	}
	protected void eraser() {
     System.out.println("the eraser");
	}
    void scale() {
     System.out.println("the scale");
	}
	
}
