import java.util.Random;

public class RandomNumbers {
public static void main(String[] args) {
	Random lly= new Random();
	int r= lly.nextInt(100)+100;
	System.out.println(r);
}
}