import java.util.Random;


public class RandomNumber {
	
	StringBuilder sb = new StringBuilder();
	
	public String randomNum(String name){
		
		Random ran = new Random();
		int x = ran.nextInt(11) + 5;
	
		sb.append(x);
		sb.append(" ");
		sb.append(name);
	}
      return sb.toString();
}
