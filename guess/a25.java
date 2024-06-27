package guess;
class CodeA
{
    public String type = "A ";
    public CodeA() {  
        System.out.print("CodeA ");//called first 
    }
}

class CodeB extends CodeA
{
    public CodeB() {
        System.out.print("CodeB "); //called second
    }
  
    void go()
    {
        type = "B ";
        System.out.print(this.type + super.type); // B B
    }
  
    public static void main(String[] args)
    {
        new CodeB().go();
    }
}

public class a25 {

    public static void main(String[] args)
    {
        new CodeB().go();
   
    }
}
