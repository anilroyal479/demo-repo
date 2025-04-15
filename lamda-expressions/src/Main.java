public class Main{
    public static void main(String [] args){
//        int i=1;
//        while(i<=5){
//            System.out.print(i + " ");
//            i++;
//        }


//        for(int i=0; i<16; i++){
//            if(i%4==0){
//                System.out.println();
//            }
//            System.out.print("*" + " ");
//
//        }


//        for(int i=0; i<4; i++){
//
//            for(int j=0; j<4; j++){
//                System.out.print(i + " ");
//            }
//            System.out.println();
//        }


        for(int i=1; i<=4; i++){

            for(int j=1; j<=4; j++){
                if(i==1 || i==4 || j==1 || j==4) {
                    System.out.print("* ");
                }else
                    System.out.print( "  ");

            }
            System.out.println();    //use short cut sout + Tab key

        }

    }
}