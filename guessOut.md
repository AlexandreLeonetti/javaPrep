1 : What is the output of the following code snippet?



```java

String og = "opengenus";
String og2 = new String(og);

System.out.println((og==og2) + " "+ (og.equals(og2)));

```
choices :

true true
true false
false true
false false
Answer: false true

The operator == compare the address of the two variables while equals method compare the content of the two variables.




2 What is the output of the following code snippet?
```java
int five = 5;
int two = 2;
int total = five + (five > 6 ? ++two : --two);
```
1
2
4
6
Answer: 6

In ternary expressions, only one of the two right-most expressions are evaluated. Since "five" > 6 is false, ––"two" is evaluated and ++"two" is skipped. 
"two" is changed from 2 to 1 and total becomes "five" + (1) which means 5 + 1 = 6.

3 Which one is not a valid statement in Java?
```java
double num = 2.718;
double num = 2._718;
double num = 2.7_1_8;
```

Answer: double num = 2._718;

Underscore (_) is valid between two numbers but in this code statement, underscore is between a number and dot (.). Hence, it is the only code statement that is not valid and will not compile.

4 How many strings can be collected by Garbage Collector in the following code snippet?
```java
public static void main(String[] fruits) {
  String str1 = new String("open");
  String str2 = new String("source");
  String str3 = new String("opengenus");
  str3 = str1;
  str2 = str3;
  str1 = str2;
}
```
0
1
2
3
Answer: 2

All three strings (str1, str2, str3) point to the same string that is "open". 
Hence, the two strings str2 and str3 can be collected by Garbage Collector before the end of main() function.

5 What is the output of the following code snippet?
```java
Integer int_data = new Integer(10);
System.out.print(int_data.byteValue());
System.out.print("-");
int int_data_2 = new Integer(10);
System.out.print(int_data_2.byteValue());
```
10-10
1010-1010
Does not compile
Run-time error
Answer: Compilation error

If you compile the above code snippet, you will get the following compilation error:

opengenus.java:11: error: int cannot be dereferenced
System.out.print(int_data_2.byteValue());
                           ^
Note: opengenus.java uses or overrides a deprecated API.
Note: Recompile with -Xlint:deprecation for details.
1 error
byteValue() is for Integer wrapper dataype and not for the int primitive datatype.

6 What line in this code snippet will give compilation error?
```java
double d1 = 5f; // c1
double d2 = 5.0; // c2
float f1 = 5f; // c3
float f2 = 5.0; // c4
```
JavaCopy
c1
c2
c3
c4
Answer: c4

The problem with the last code statement is that it attempts to convert a double (5.0) to a float which will result in accuracy loss. Hence, this will result in compilation error.

7 What is the output of the following code snippet?
```java
public static void main(String... args) {
   String car, bus = "petrol";
   car = car + bus;
   System.out.println(car);
}
```
JavaCopy
petrol
petrolpetrol
Compilation error
Runtime error
Answer: Compilation error

If you compile the above code snippet, you will get the following compilation error:

opengenus.java:4: error: variable car might not have been initialized
   car = car + bus;
         ^
1 error
In the code snippet, the car variable remains unintialized while "petrol" is assigned to bus variable only.

8 Which code statement give compilation error?
```java
double num1, int num2 = 1; // C1
int num1, num2; // C2
int num1, num2 = 1; // C3
int num1 = 2, num2 = 1; // C4
```
C1
C2
C3
C4
Answer: C1

Java does not permit programmers to declare different data types in the same declaration. Hence, the first code statement C1 does not compile correctly.

9 What is the output of the following code snippet?
```java
public class Test {
	public static void main(String[] args) {
		for(int i=0; 0; i++) {
			System.out.println("Hello World!");
		}
	}
}
```
Hello World!
no output
Compilation error
Runtime error
Answer: Compilation error

opengenus.java:3: error: incompatible types: int cannot be converted to boolean
		for(int i=0; 0; i++) {
		             ^
1 error
0 does not convert to boolean value.

 10 What is the output of the following code snippet?
```java
public class Code {
	public static void main(String[] args) {
		for(int i = 0; i < 1; i++) {
			System.out.println(i+' ');
		}
	}
}
```
JavaCopy
1
0
32
50
Answer: 32

The answer is a character code as 0 is appended with a character ' ' and the result should be a character so, the character ' ' is converted the numeric character code that is 32.

11 What is the output of the following code snippet?
```java
public class Code {
    public static void main(String[] args)
    {
        if (true)
            break;
    }
}
```

No output
0
Compilation error
Runtime error
Answer: Compilation error

On compiling the code, you will get the following error:

opengenus.java:5: error: break outside switch or loop
            break;
            ^
1 error
In Java, break statement can be used within loop like for, while or do while loop or within switch statement. Hence, the code snippet produce compilation error.

12 What is the output of the following code snippet?
```java
public class Code {
    public static void main(String[] args)
    {
        int $_ = 5;
    }
}
```

No output
0
Compilation error
Runtime error
Answer: No output

In Java, an identifier can start with an alphabet, underscore (_) or dollar sign ($). Hence, $_ is a valid identifier/ variable in this case.

13 What is the output of the following code snippet?
```java
public class Code{
    public static void main(String[] arr){
          
    }
    public static void main(String arr){
          
    }
}
```
JavaCopy
No output
0
Compilation error
Runtime error
Answer: No output

main() function can be overloaded in Java. The main() function that has String[] will be the entry point and will be called by Java.

14 What is the output of the following code snippet?
```java
public class Code {
    public static void main(String[] args)
    {
        System.out.println('j' + 'a' + 'v' + 'a');
    }
}
```
JavaCopy
java
32
418
Compilation error
Answer: 418

As each character is enclosed in single quotes, it is considered as a character and not a string by Java. Hence, the concatenation will result in a character. As the string "java" cannot fit in a character, the characters are converted to ASCII value before concatenation that is addition.

106 + 97 + 118 + 97 = 418

15 What is the output of the following code snippet?
```java
public class Code{
    public static void main(String[] arr){
        Integer num1 = 400;
        Integer num2 = 400;

        if(num1 == num2){
            System.out.println(0);
        }
        else{
            System.out.println(1);
        }
    }
}
```
JavaCopy
0
1
Compilation error
Runtime error
Answer: 1

Integer class support the range of -128 to 127. If the number is within the range, autoboxing is applied. This means the same reference is assigned for the same number as they are from the same pool. As 400 is outside the range, different references are assigned.

16 What is the output of the following code snippet?
```java
public class Code {
    public static void main(String[] args) {
        method(null);
    }
    public static void method(Object o) {
        System.out.println("Object method");
    }
    public static void method(String s) {
        System.out.println("String method");
    }
}
```
JavaCopy
Object method
String method
Compilation error
Runtime error
Answer: String method

Null is not an object in Java.

Java compiler prefer the method which has more specific parameters.
String is object of the class java.lang.String. Hence, String is more specific than Object class. Therefore, null is matched as a string object.

17 What is the output of the following code snippet?

```java
class Code {
    String args[] = { "1", "2" };
    public static void main(String args[]) {
        System.out.println(args.length);
    }
}
```

0
1
2
3
Answer: 0

args is the command line arguments and is not related to the global variable args. So, if you run the above code without passing any command line argument, you will get the output as 0.

18 What is the output of the following code snippet?
```java
class Code {
    public static void main(String args[]) {   
        System.out.println(value());
    } 
    int value() {
        return 1;
    } 
}
```
JavaCopy
0
1
Compilation error
Runtime error
Answer: Compilaton error

Following is the compilation error on compiling the above code:

opegenus.java:3: error: non-static method value() cannot be referenced from a static context
        System.out.println(value());
                           ^
1 error
The problem is that in Java, we cannot call a non-static function from a static function. Therefore, the fix is to make the function value() static.

The correct Java code is:
```java
class Code {
    public static void main(String args[]) {   
        System.out.println(value());
    } 
    static int value() {
        return 1;
    } 
}
```




19 What is the output of the following code snippet?
```java
class Code {
   public static void main(String args[]) {
       System.out.println(value());
   }
   static int value() {
       static int data = 0;
       return data;
   }
}
```
JavaCopy
0
1
Compilation error
Runtime error
Answer: Compilaton error

Following is the compilation error on compiling the above code:

opengenus.java:6: error: illegal start of expression
       static int data = 0;
       ^
opengenus.java:7: error: illegal start of type
       return data;
       ^
opengenus.java:7: error: <identifier> expected
       return data;
                  ^
opengenus.java:9: error: class, interface, or enum expected
}
^
4 errors
The problem is that in Java, we cannot have static local variables. The alternative is to use static class members.

The fix will be to change "data" variable to be non-static or make "data" variable a static class member.

20 What is the output of the following code snippet?
```java
class Parent {
    public void Print()
    {
        System.out.println("Parent");
    }
}
 
class Child extends Parent {
    public void Print()
    {
        System.out.println("Child");
    }
}
 
class Main {
    public static void PrintMain(Parent o)
    {
        o.Print();
    }
    public static void main(String[] args)
    {
        Parent x = new Parent();
        Parent y = new Child();
        Child z = new Child();
        PrintMain(x);
        PrintMain(y);
        PrintMain(z);
    }
}
```
Child, Child, Child
Parent, Child, Child
Parent, Child, Parent
Parent, Parent, Child
Answer: Parent, Child, Child

The first print statement prints "Parent" as the parent reference is passed to it.

The second print statement prints "Child" because of run time polymorphism which is enabled in Java by default.

The third print statement is passed the reference of Child and hence, the print statement of Child is called. Note that the concept of object slicing which is present in C++ is not valid in Java.

21 What is the output of the following code snippet?
```java
public class Code {
    public static void main(String[] args) {
        method(null);
    }
    public static void method(Object o) {
        System.out.println("Object method");
    }
    public static void method(Integer i) {
        System.out.println("Integer method");
    }
    public static void method(String s) {
        System.out.println("String method");
    }
}
```
JavaCopy
Object method
String method
Integer method
Compilation error
Answer: Compilation error

The code gives the following compilation error:

opengenus.java:3: error: reference to method is ambiguous
        method(null);
        ^
  both method method(Integer) in Code and method method(String) in Code match
1 error
Null is not an object in Java.

Java compiler prefer the method which has more specific parameters.
String is object of the class java.lang.String. Hence, String is more specific than Object class but it is equally specific to Integer class. Therefore, null is unable to match to any function as it is unable to choose between String and Integer.

22 What is the output of the following code snippet?
```java
public class Code
{
    public static void main(String args[])
    {
        StringBuffer str1 = new StringBuffer("open");
        StringBuffer str2 = str1;
        str1.append("genus");
        System.out.println(str1 + " " + str2 + " " + (str1 == str2));
    }
}
```
opengenus open false
opengenus opengenus false
opengenus open true
opengenus opengenus true
Output: opengenus opengenus true

This is because StringBuffer objects are mutable. str2 is pointing to str1 object and not a copy of str1. So, when str1 is modified, str2 points to it so its value is also modified.

If we replace StringBuffer with String, output will be "opengenus open false" as String objects are not mutable and new objects are created when we modified them.

23 What is the output of the following code snippet?
```java
public class Code
{
    public static void main(String args[])
    {
        int y = 08;
        y = y + 2;
        System.out.println(y);
    }
}
```
8
9
Compilation error
Runtime error
Answer: Compilaton error

The code will give the following compilation error:

opengenus.java:5: error: integer number too large
        int y = 08;
                ^
1 error
Any number starting with 0 is considered an octal number which has digits from 0 to 7. So, 08 is invalid and hence, the code will fail to compile.

24 What is the output of the following code snippet?
```java
class Code extends Thread
{
    public void run()
    {
        System.out.print("thread 1");
    }
    public static void main(String args[])
    {
        Code thread1 = new Code();
        thread1.start();
        thread1.stop();
        thread1.start();
    }
}
```
JavaCopy
8
9
Compilation error
Runtime error
Answer: Runtime error

The code will give the following runtime error:

Exception in thread "main" java.lang.IllegalThreadStateException at java.lang.Thread.start
The issue is that a thread cannot be started twice.

25 What is the output of the following code snippet?
```java
class CodeA
{
    public String type = "A ";
    public CodeA() {  
        System.out.print("CodeA "); 
    }
}
  
public class CodeB extends CodeA
{
    public CodeB() {
        System.out.print("CodeB ");
    }
  
    void go()
    {
        type = "B ";
        System.out.print(this.type + super.type);
    }
  
    public static void main(String[] args)
    {
        new CodeB().go();
    }
}
```
JavaCopy
CodeA CodeB A B
CodeA CodeA B B
CodeA CodeB B B
CodeB CodeB B B
Answer: CodeA CodeB B B

CodeB().go() executes in two phases:

CodeB class constructor is called followed by CodeA class constructor as CodeB extends CodeA.
go() function is called on CodeB object which overrides the variable "type" to B and hence, the same value "B" is printed twice. In this code snippet, super keyword is not playing any role.

26 What is the output of the following code snippet?
```java
public class Code
{
    public static void main(String[] args)
    {
        Integer a = 128, b = 128;
        System.out.println(a == b);
  
        Integer c = 100, d = 100;
        System.out.println(c == d);
    }
}
```
JavaCopy
true true
false false
false true
true false
Answer: false true

In the function valueOf() in Integer, the range is -128 (IntegerCache.low) to 127 (IntegerCache.high) so numbers outside this range will not give expected result. Therefore, the objects will value 100 equates to be equal.

With this article at OpenGenus, you must have a strong preparation by practicing Java Interview Questions.