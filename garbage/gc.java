package garbage;

public class gc{

    public static void main(String[] args)throws InterruptedException {
        // Creating objects in a loop to generate garbage
        for (int i = 0; i < 10; i++) {
            MyObject obj = new MyObject(i);
        }

       // calling garbage collector 
       System.gc();  
              
       // waiting for gc to complete 
       Thread.sleep(1000); 

        // The JVM may or may not perform garbage collection at this point
        System.out.println(" New Garbage collection requested.");
    }
}

class MyObject {
    private int id;

    public MyObject(int id) {
        this.id = id;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("New Override Garbage collecting object with id: " + id);
        //super.finalize();
    }
}
