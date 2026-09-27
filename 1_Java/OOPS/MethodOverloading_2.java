// Method overloading means having multiple methods with the same name 
// in the same class, but with different parameters.

// Parameters can differ by:

// Number of parameters
// Type of parameters
// Order of parameter types

// Changing only the return type does not create method overloading.



class Calculator{

    public int add(int a,int b){
        return a+b;
    }

    public int add(int a,int b,int c){
        return a+b+c;
    }

    public double add(double a,int b){
        return a+b;
    }


}


class MethodOverloading_2{
    public static void main(String a[]){

        Calculator calc=new Calculator();
        int r2=calc.add(1,2);
        int r3=calc.add(1,2,3);
        double r4=calc.add(34.4,4);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r4);
    }
}