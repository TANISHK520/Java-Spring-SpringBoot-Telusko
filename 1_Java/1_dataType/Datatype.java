class Datatype{
    public static void main(String a[]){

        //primitive datatypes
        int num=10;
        double fla=10.48;
        float f=5;
        float ff=(float) 10.48;
        float fl=5.6f;
        char c='a'; //only single quotes no double quotes
        boolean ans=true;
        boolean notans=false;

        byte by=127;
        short sh=558;
        long l=5679l;

        System.out.println(num);
        System.out.println(fla);
        System.out.println(f);
        System.out.println(ff);
        System.out.println(fl);
        System.out.println(c);
        System.out.println(ans);
        System.out.println(notans);
        System.out.println(by);
        System.out.println(sh);
        System.out.println(l);

        System.out.println("Tanishkapoor:"+sh+",Kapoor");

        int num_dec=0b1011;
        System.out.println(num_dec);

        int num_hex=0x7E;
        System.out.println(num_hex);

        int num_wayofwriting_toCountZeroes=10_00_00_000;
        System.out.println(num_wayofwriting_toCountZeroes);

        double num_l=12e10;
        System.out.println(num_l);

        System.out.println(c);
        c++;
        System.out.println(c);

    }
}