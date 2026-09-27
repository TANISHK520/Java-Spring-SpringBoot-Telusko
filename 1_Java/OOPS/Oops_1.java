class Calculator{
    int a;

    public int add(int num1,int num2){
        int r=num1+num2;
        return r;
    }
}

class Computer{
    public void playMusic(){
        System.out.println("music playing");
    }

    public String getMepen(int cost){
        if(cost>10){
            return "Pen";
        }
        else{
            return "nothing";
        }
    }
}

class Oops_1{
    public static void main(String a[]){

        Calculator calc=new Calculator();

        int result=calc.add(2,3);
        System.out.println(result);

        Computer comp=new Computer();
        comp.playMusic();
        String res=comp.getMepen(2);
        System.out.println(res);
    }
}