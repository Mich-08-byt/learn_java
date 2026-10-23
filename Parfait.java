import java.util.Scanner;
public class Parfait{
    public static void main(String[] data){
        Scanner sc=new Scanner(System.in); 
        System.out.println("entrez un nombre");
        int a=sc.nextInt();
        int s=0;
        for(int i=1; i<a;i++){
            if(a%i==0){
                s=s+i;
            }
        }
        if(s == a){ 
            System.out.println("le nombre"+a+" est parfait");
        }else{
            System.out.println("le nombre "+a+ " n'est pas parfait");
        }

    }
      
}