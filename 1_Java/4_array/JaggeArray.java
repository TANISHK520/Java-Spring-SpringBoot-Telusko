class JaggeArray{
    public static void main(String a[]){

        int num[][]=new int[3][];
        num[0]=new int[3];
        num[1]=new int[4];
        num[2]=new int[5];

        for(int i=0;i<num.length;i++){
            for(int j=0;j<num[i].length;j++){
                num[i][j]=(int)(Math.random()*100);
            }
        }

        
        for(int i=0;i<num.length;i++){
            for(int j=0;j<num[i].length;j++){
                System.out.print(num[i][j]+" ");
            }
            System.out.println();
        }
    }

}