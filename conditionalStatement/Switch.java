package conditionalStatement;

public class Switch {

	public static void main(String[] args) {

		int dayofweek=4;
		
		switch(dayofweek)
		{
		case 1:
		case 2:
			System.out.println("Bad");
			break;
		case 3:
			System.out.println("Average");
			break;
		case 4:
		case 5:
			System.out.println("Good");
			break;
		default:
			System.out.println("bitch");
			break;
		}
		
	}

}
