
public class Hello {
	public static void main(String[] args) throws InterruptedException  {
		
		int i=0;
		
		while (true){
			System.out.println("Hello world "+i);		
			Thread.sleep(5000);
			i=i+1;
		}
		
		
	}
}
