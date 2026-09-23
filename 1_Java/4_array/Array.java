// int num[]={1,2,3};
// int num1[]=new int[4]; -- default value is 0

class Array{
    public static void main(String a[]){
        int num[]={1,2,3};
        System.out.println(num);
        System.out.println(num[1]);

        for(int i=0;i<num.length;i++){
            System.out.println(num[i]);
        }

        int num_mul[][]=new int[3][4];
        
        for(int i=0;i<num_mul.length;i++){
            for(int j=0;j<num_mul[i].length;j++){
                num_mul[i][j]=(int)(Math.random()*100);
                System.out.print(num_mul[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();

        for(int n[]:num_mul){
            for(int m:n){
                System.out.print(m+" ");
            }
            System.out.println();
        }
    }
}