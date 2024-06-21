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

StringUtils. concat (String[l strings) should join character strings end to end
For example, from an array which contains "f*, "o"To". "bar" it should result
"foobar"
Input: strings always contains at least one element.
Implement StringUtils. concat (Stringll strings).

