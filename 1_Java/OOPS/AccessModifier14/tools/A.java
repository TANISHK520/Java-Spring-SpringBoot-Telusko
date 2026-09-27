package AccessModifier14.tools;

public class A {
    public int marks=6;
    int goal=10;

    public void hello(){
        System.out.println("Hello");
    }


}


//within same package no need to import.
//outside same package , import and public is accessed everywhere
//private is only accessable inside own class
//if not public and private , its default by default. --> accessed with in same package
//protected cant use outside the package , you can but it should be a subclass.
//protected can access within package 
