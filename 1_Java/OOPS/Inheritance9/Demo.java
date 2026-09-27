public class Demo{

    public static void main(String args[]){

        // Calc obj=new Calc();

        // int r1=obj.add(2,3);

        // int r2=obj.sub(5,2);

        // System.out.println(r1+" "+r2);

        // AdvCalc obj=new AdvCalc();

        VeryAdvCalc obj=new VeryAdvCalc();
        int r1=obj.add(2,3);
        System.out.println(r1);

        int r2=obj.sub(3,2);
        System.out.println(r2);

        int r3=obj.mul(2,3);
        System.out.println(r3);

        int r4=obj.div(6,2);
        System.out.println(r4);

        double r5=obj.power(4);
        System.out.println(r5);
        
    }

}