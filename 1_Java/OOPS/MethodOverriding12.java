/*Method overriding is a fundamental concept in Object-Oriented Programming (OOP) that enables 
a subclass to provide a specific implementation of a method that is already defined in its superclass. 
It plays a crucial role in achieving runtime polymorphism in Java.*/

/*
Key Concepts
Inheritance: Method overriding occurs only when there is inheritance, meaning a subclass inherits 
             the methods and properties from a superclass.

Same Method Signature: For method overriding to occur, the method in the subclass must have the same name, 
                       return type, and parameters as the method in the superclass.

Overriding vs Overloading: Method overriding should not be confused with method overloading. Overloading is 
                          when multiple methods have the same name but differ in parameters, while overriding 
                          is about redefining the method in the subclass with the same signature.
 */

/*
Syntax of Method Overriding
To override a method in Java, we simply declare the method in the subclass with the same signature as in the superclass. 
We can use the @Override annotation to inform the compiler that you intend to override the method, which provides 
error checking to ensure the method matches the superclass’s method signature.
 */


/*class Animal{
    public void Sound(){
        System.out.println("Animal make sound");
    }
}

class Dog extends Animal{
    public void Sound(){
        System.out.println("Dog barks");
    }
}

public class MethodOverriding12{
    public static void main(String args[]){
        Dog objDog=new Dog();
        objDog.Sound();
    }
} */

/*In this example, the sound() method is defined in both the Animal superclass and the Dog subclass.
 The Dog class provides its specific implementation of the sound() method. */

 /*
 Why Use Method Overriding?
Polymorphism: Method overriding allows a subclass to provide a specific implementation for a method, 
            enabling polymorphism. This means that the same method call can behave differently depending 
            on the object that calls it. For instance, both Animal and Dog objects can call the sound() method, 
            but the result will depend on the type of object.

Dynamic Method Dispatch: At runtime, the method to be executed is determined by the type of the object, 
                        not the type of reference. This process is known as dynamic method dispatch or runtime polymorphism.

Reusability and Extensibility: Overriding allows extending or modifying the behavior of inherited methods. 
                                This promotes code reuse, as the subclass can inherit common behavior while 
                                providing additional functionality or overriding behavior as needed.
  */

/*Example with super Keyword
The super keyword is often used in method overriding to call the superclass’s version of a method. 
This is useful when you want to retain the behavior of the parent class’s method while adding additional functionality 
in the subclass.*/



class Animal{
    public void Sound(){
        System.out.println("Animal make sound");
    }
}

class Dog extends Animal{
    public void Sound(){
        super.Sound();
        System.out.println("Dog barks");
    }
}

public class MethodOverriding12{
    public static void main(String args[]){
        Dog objDog=new Dog();
        objDog.Sound();
    }
}

/*
    Here, the Dog class overrides the sound() method but uses the super.sound() call to invoke 
    the original behavior from the Animal class before adding its own behavior.
*/

/*
Rules for Method Overriding
The method must have the same signature as in the superclass.
The method must be in a subclass of the class that contains the original method.
The method in the subclass should have the same or more accessible access modifier. For example, if a method is protected in the superclass, it cannot be private in the subclass.
We cannot override final, static, or private methods.
 */

