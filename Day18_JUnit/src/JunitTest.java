import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class JunitTest {
	@Test
   void display() {
	   System.out.println("Welcome to JUnit");
	   System.out.println("Hello World!");
	   System.out.println("*******************************");  
   }
	@Test
	@Disabled
	void display1() {
		   System.out.println("Welcome to JUnit Program");
		   System.out.println("Welcome to India! "); 
		   System.out.println("*******************************");
	   }
	@Test
	void display2() {
		   System.out.println("Match between India vs Pakistan");
		   System.out.println("India win by 7 wickets ");   
		   System.out.println("*******************************");
	   }
}
