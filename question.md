-Question 1 :

```java 
int i1 =5;
int i2 =2;
int i3 = i1/i2;
```

what is the value i3 ?

-Question 2:
Which method is called when a thread is executed ?

-Question 3:
A.isFoo(String param) should return true if param is equal  to the string  "foo",
false  otherwise.

implement a.isFoo(String param).

-Question 4:
Which option is a valid constant declaration in Java?

-Question 5:
Are private attributes visible from subclasses ?

-Question 6:
Can an abstract class contain a concrete method ?

-Question 7:
Can a java class  have more than one parent class (multiple inheritance)? 


-Question 8:
A method declared as final means ?

-Question 9:
Complete the answer to make the following peace of code  valid:
A a = new A();
A b = new B();

-Question 10:
give examples of unchecked exceptions

-Question 11:
some code :

HashMap m = new HashMap();
Object o1 = new Object();

Object o2 = o1;

m.put(o1, 1);
m.put(o2, 2);
m.get(o1);

what is the value returned by m.get(o1);

-Question 12:
a protected attribute is visible from a class that belongs to the same package?

-Question 13:
try to improve the code displayed in the answer editor
by keeping the current behavior of the program.

```java
abstract class  Animal{}
class Dog extends Animal{
    String name;

    Dog(String name){
        this.name = name;
    }

    String getName(){
        return name;
    }
}
class Cat extends Animal{
    String name;

    Cat (String name){
        this.name = name;
    }

    String getName(){
        return name;
    }
}


```

-Question 14;
Implement the method findLargest (numbers) , so it returns the largest number from the numbers array.

Notes:
numbers always contains at least one element, and never contains more than numberscontains only integers.10 elements.
The integers are ranged from
-2^31 to+2°31 - 1 (they always fit in a 32-bit
signed integer).

-Question 15;

StringUtils. concat (String[] strings) should join character strings end to end
For example, from an array which contains "f", "o","o", "bar" it should result
"foobar"
Input: strings always contains at least one element.
Implement StringUtils. concat (Stringl[] strings).

-Question 16;

public class A {}

who is the parent of class A ?

-question 17;

String s;
what is the value of s ?


-Question 18;
// Java code below
```java
import java util.*;
import java.io.*;
import java.nio.*;
import lava.math.*;

class Solution {
    static int sumRange(int[] ints) {
    int sum = 0;
    for (int i - 1; i < ints.length; i++) {
        int n - ints[i];
        if (n >= 10 || n <= 100) sum += n;
    return sum;
}
}
```
Solution.sumRange should return the sum of the integers having a value between 10 to 100 inclusive and belonging to the array ints
Fix Solution.sumkange:
Note: the ints parameter is never null


-Question 19;
A.a(int i, int j should retur sum is equal to 1.
true if one of the arguments equals 1 or if their sum is equal to 1;



For example:
A.a (1, 5) returns true
A.a(2,
3) retums
false
A.a(-3,
4) returns true

-Question 20:

Make Counter.increment() thread safe :
```java

class Counter {
    private static int count = 0;
    //Increments count in a thread-safe manner.
    public static int increment() {
        count = count + 1;
        return count;
    }
}

```
-Question 21 :

```java
class A {
    /**
	    Executes the service with the given connection.
    */	
    void a(Service s, Connection c) {
        // update this code
        s. setConnection(c) ;
        s.execute():
    }
}

interface Service {
    void execute()throws Exception; void setconnection (connection c);
}

interface Connection {
    void commit () ;
    void rollback();
    void close();
}

```
Update the code by implementing the following rules:
• If an exception is thrown by s. execute()
then call c.rollback() and
propagate the exception, otherwise call c. commit ( )
• In any circumstances, c.close() must be called before leaving the method
a(service S. connection c)


-Question 22;

Console> Java Echo Hello you !
Hello
You
!
Console>

write the Echo program

Answer :

//java code below
class Echo{
}


-Question 23;

Write the body of the calc(array. n1. n2) method.

array is an array of integers.
The n1  and n2 parameters are integers defined by the relation
0<=n1 <= n2 < array. Length.
The calc method should return the sum of the integers of array whose index belongs to the [n1; n2] intervall



class Solution {
    //@return the sum of integers whose index is between nl and n2
    public static int calc(int[] array, int n1, int n2) {
        return 0;
    }
}

-Question 24;


You have to organize a chess tournament in which players will compete head-to-head.
Here is how we proceed to form the duels: select a first player randomly,
then, select his opponent at random among the remaining participants. 
The pair of competitors obtained forms one of the duels of the tournament. 
We proceed in the same manner to form all the other pairs.


In this exercise, we would like to know how many pairs it is possible to form knowing that the order of opponents in a pair does not matter.

For example, with 4 players named A, B, C and D, it is possible to get 6 different pairs : AB, AC, AD, BC, BD, CD.

Implement count to return the number of possible pairs. Parameter n corresponds to the number of players.
Try to optimize your solution so that, ideally, the duration of treatment is the same for any
Input: 2 <= n <= 10000)
formula is n(n-1)/2;

```java

import java.util.*;
import java.io.*;
import java.nio.*;
import java.math.*;

class Solution {
    /** Counts the number of pairs for n players. */
    static int count (int. n) {

    }
}

```

-Question 25;
which are primitive types in java ?

-Question 26;
private static class A {}
In which case is this class correct ?

Choose one or few answers :
1 Never
2 An anonymous class
3 An inner class
4 Always

-Question 27;

enum Planet{
    MERCURY, VENUS, EARTH
}

given this code what is true about it ?

choose :

Planet.MERCURY == Planet.VENUS; //true
Planet.MERCURY == Planet.MERCURY; //true
Planet.MERCURY.equals(Planet.MERCURY);// true

-Question 28;
```java
ArrayList list1 = new ArrayList(2);

list1.add(1);
list1.add(1);
list1.add(1);
```

what is the value returned by list1.size()?

-Question 29;

Among the following options, which class would you use to rewrite UsersService?

```java
class UsersService {
ArrayList<Integer> ids = new ArrayList<Integer›();
ArrayList<String> names = ArrayList<String>();

void add(int identifiant, String nom){
    ids.add(identifiant);
    names.add(nom);

    String findNameById(int id){
        for( int i = ids.size()-1; i>=0;i—){
            if (ids.get(i) ==id){
                return names.get (i);
            }
        }
        return null;
    }
}

```

Answer options to choose from :
1 HashMap
2 Vector 
3 Stack
4 LinkedList
5 ArrayList
6 HashSet


-Question 30;

StreamPrinter.print (Reader reader) is not robust.
Improve StreamPrinter.print (Reader reader)

```java
import java.io. IOException; 
import java. io.Reader;

/* This class defines a stream printer.*/
class StreamPrinter {
/**
Reads from the given reader and print to stdout.*/
    void print (Reader reader) throws IOException {
    int code = reader. read();
    while (code != - 1) {
        System. out.print ((char) code);
        code = reader.read();
    }
    reader. close();
    }
}

```

Question 31;

Modify the body of some methods (this can include the body of the constructor) to protect Person instances against alteration:
Once a Person is created, it should not be possible to modify it.

```java
import java.util.Date;

class Person {
    private String name; 
    private Date birthDate;

    //Creates a Person with the given name and birth date.
    public Person(String name, Date birthDate) {
        this.name =name;
        this.birthDate =birthDate;
    }

    public String getsame (){
        return name;
    }

    public Date getBirthDate() {
        return birthDate;
    }
}
```

question 32;

One of your colleagues developed the program displayed in the answer editor. The Program class is used for obtaining information on a piece of text, such as the number of words it contains.
The current code works correctly but you are asked to improve it so that the program is able to accept new commands.

	Create an abstract class Command, containing an abstract method exec. 
    This method is supposed to return a String, and has one parameter named text of type String:

    Create a class WordCount Command, inherited from Command. Override the method exec. It must do the same actions as what currently does the class Program, when it receives the command "CountWords".

    Add a method registerCommand to the class Program. This method must have two parameters:
        commandName, of type String,
        command, an instance of a class inherited from Command.

    Change the body of the method String exec(String commandName, String text), It must execute the method exec of the corresponding registered Command. The correspondance is based on commandName. If the Program class doesn't have the required command, it must throw an IlLegalArgumentException, as it currently does.
    The Program class must not have any dependency to WordCounter, because this dependancy will be moved to the class WordCount Command|:

Be careful to use the exact specified names for the classes and method to add, otherwise the automatic validation will fail. These names have been put as commentaries in the starter code, so that you can copy-paste them.
Make sure the Program class is able to associate any command to any command name (not just "CountWords"). The automatic validation will check that too.

```java

import java.util.*;

// add a class "Command" and a class "WordCountCommand here

class Program {
    // add a method "registerCommand" here.
    // keep the method "exec*, but change its body.

    String exec(String commandName, String text){
        if (!"CountWords".equals (commandName)) {
            throw new IllegalArgumentException(commandName);
        }
    return WordCounter.count(text);
    }
}

Question 33;
```java

    BigInteger b = new BigInteger(“1”);
    b.add (new BigInteger (“1”));

```

What is the value of b?

Question 34;
***
TreeSet<A> set = new TreeSet<A>();
set.add(new A());


Type the name of the interface that should be implemented by the class A.

Question 35;

Type the name of a class  belonging to the package java.lang which allows
to concatenate efficiently strings of characters.

Question 36;
J2SE API provides a class which helps at transforming a date from a string to an object of type Date. Do you know the name of this class?

Question 37:
The JDBC API provides an interface that should be used to prevent against SQL injection. Type the name of this interface.

Question 38;
```java
File f = new File(“/tmp/myfile”);
FileOutputStream fos = new FileOutputStrean(f);
ObjectOutputStream oos = new ObjectOutputStream(fos);
oos.writeobject (myobject);
```

Type the name of the interface myobject should implement.

Question 39;
J2SE provides a class to access thread-scope variables. If you know it, type its name in the text field.

Question 40;
Type the name of the design pattern illustrated by the code below (1 word only):

```java
interface Window {
    void draw();
}

class SimpleWindow implements Window {
    public void draw() {
        // draw simple window
        System.out.println("Drawing a simple window");
    }
}

abstract class WindowEnhancement implements Window {
    protected Window window;

    public WindowEnhancement(Window window) {
        this.window = window;
    }

    public void draw() {
        window.draw();
    }
}

class ScrollBarEnhancement extends WindowEnhancement {
    public ScrollBarEnhancement(Window window) {
        super(window);
    }

    public void draw() {
        drawScrollBars();
        super.draw();
    }

    private void drawScrollBars() {
        // draw scroll bars
        System.out.println("Drawing scroll bars");
    }
}

class WindowTest {
    public static void main(String[] args) {
        Window w = new ScrollBarEnhancement(new SimpleWindow());
        w.draw();
    }
}

```




