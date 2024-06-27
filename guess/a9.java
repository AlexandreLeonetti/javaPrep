package guess;

public class a9 {
    public static void main(String[] args){
        for(int i=0; ((i%2 == 0) && i<100); i++)        {// loop stops at first false condition ie i==1
            System.out.println(i);
        }
        for(int i=0; 0; i++) {// can't be cast into boolean compilation error
			System.out.println("Hello World!");
		}
    }
    
}
