 import java.util.Scanner;
 public class Pascal{
      
     public static void main(String[] data){
         System.out.println("Entrez un nombre");
            Scanner sc=new Scanner(System.in);
            int d=sc.nextInt();
            for(int i=0; i<=d; i++){
                int f=1;
                System.out.print(f+" ");
                for(int j=0; j<=i; j++){
                    if(j<i){
                        System.out.print((f = f*(i-j)/(j+1))+" " );
                    }                    
                }
                System.out.println( );
            }
    }
}
