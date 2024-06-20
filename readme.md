-Question 1 :

```java 
int i1 =5;
int i2 =2;
int i3 = i1/i2;
```

what is the value i3 ?
answer : 2;

-Question 2:
Which method is called when a thread is executed ?
answer : the run() method;

-Question 3:
A.isFoo(String param) should return true if param is equal  to the string  "foo",
false  otherwise.

implement a.isFoo(String param).
answer :
public class A {
   static boolean  isFoo(String  param){
    return param == "foo";
   } 
}

-Question 4:
Which option is a valid constant declaration in Java?
answer :

    // Constant declaration using 'final' keyword
    public static final int MAX_VALUE = 100;

-Question 5:
In Java, private variables can only be accessed within the same class in which they are declared. 
This means that subclasses cannot directly access private variables of their superclass.

-Question 6:
Can an abstract class contain a concrete method ?
yes , Abstract classes are similar to interfaces. You cannot instantiate them, 
and they may contain a mix of methods declared with or without an implementation. 
However, with abstract classes, you can declare fields that are not static and final, 
and define public, protected, and private concrete methods.

-Question 7:
a java class can have more than one parent class (multiple inheritance)? 
NO
Java allows a class to implement multiple interfaces but limits inheritance to a single parent class,
effectively avoiding the diamond problem and the associated complexities in method resolution.

-Question 8:
A method declared as final means ?
You can declare some or all of a class's methods final.
You use the final keyword in a method declaration to indicate that the method cannot be overridden by subclasses.
The Object class does this—a number of its methods are final .

-Question 9:
Complete the answer to make the following peace of code  valid:
A a = new A();
A b = new B();

answer :
```java
class A {}

class B extends A {}

public class Main {
    public static void main(String[] args) {
        A a = new A();
        A b = new B();
        
        System.out.println("Instance of A: " + a.getClass().getName());
        System.out.println("Instance of B: " + b.getClass().getName());
    }
}
```
In this code:

class A is a simple class.
class B extends class A, making B a subclass of A.
In the main method, A a = new A(); creates an instance of A, and A b = new B(); 
creates an instance of B but assigns it to a variable of type A. 
This is possible because B is a subclass of A.

-Question 10:
Which exceptions belongs to the J2SE API?
The Java 2 Platform, Standard Edition (J2SE) API includes a variety of exceptions that are part of the Java programming language. These exceptions are categorized into two main types: checked exceptions and unchecked exceptions (runtime exceptions).

Checked Exceptions
Checked exceptions are exceptions that must be either caught or declared in the method signature using the throws keyword. Some common checked exceptions in the J2SE API are:

IOException

FileNotFoundException
EOFException
SQLException

ClassNotFoundException

CloneNotSupportedException

InterruptedException

InstantiationException

IllegalAccessException

NoSuchMethodException

NoSuchFieldException

Unchecked Exceptions (Runtime Exceptions)
Unchecked exceptions do not need to be declared in a method's throws clause. These are subclasses of RuntimeException. Some common runtime exceptions in the J2SE API are:

NullPointerException

ArrayIndexOutOfBoundsException

ArithmeticException

ClassCastException

IllegalArgumentException

NumberFormatException
IllegalStateException

IndexOutOfBoundsException

StringIndexOutOfBoundsException
UnsupportedOperationException

Error Classes
Additionally, the J2SE API defines several Error classes, which are used to indicate serious problems that a reasonable application should not try to catch. Some common error classes include:

OutOfMemoryError

StackOverflowError

VirtualMachineError

InternalError
UnknownError


-Question 11:
some code :
HashMap m = new HashMap();
Object o1 = new Object();
Object o2 = o1;
m.put(o1, 1);
m.put(o2, 2);
m.get(o1);

answer :
In this piece of Java code, the behavior of the HashMap is being demonstrated with respect to object references. 
Here is a detailed explanation of what is happening:

Creating the HashMap:

java
Copy code
HashMap m = new HashMap();
A new HashMap object is created.
This HashMap will store key-value pairs where the keys and values can be objects.

Creating Objects:

java
Copy code
Object o1 = new Object();
Object o2 = o1;
o1 is assigned a new Object instance.
o2 is assigned the same reference as o1. 
Thus, o2 is not a new object but rather a reference to the same object as o1.
Putting Key-Value Pairs into the HashMap:

java
Copy code
m.put(o1, 1);
m.put(o2, 2);
m.put(o1, 1); inserts a key-value pair where the key is o1 and the value is 1.
m.put(o2, 2); inserts a key-value pair where the key is o2 and the value is 2.
Since o1 and o2 refer to the same object, the second put operation will replace the value associated with the key o1 in the HashMap.

Retrieving the Value:

java
Copy code
System.out.println(m.get(o1));
m.get(o1) retrieves the value associated with the key o1 from the HashMap.
Since the second put operation replaced the value associated with o1 (which is the same object as o2) to 2, the retrieved value will be 2.


-Question 12:
a protected attribute is visible from a class that belongs to the same package.
true
Yes, it is true that a protected attribute is visible from a class that belongs to the same package. In Java, the protected access modifier has package-level visibility in addition to subclass visibility. This means that:

Within the same package: Any class in the same package as the class containing the protected member can access the protected member.
In subclasses: Any subclass, even if it is in a different package, can access the protected member.

-Question 13:












