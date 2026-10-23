import java.util.Scanner;
public class triqngle{
    public static int  factoriel(int n){
        int f =1;
        for(int c=1; c<=n; c++){
            f=f*c;
        }
        return f;
    }
    public static void main(String[] data){
        System.out.println("Entrez un nombre:");
        Scanner n=new Scanner(System.in);
        int a=n.nextInt();
        for(int i=0; i<=a; i++){
            for(int j=0; j<=i; j++){
                System.out.print(factoriel(i)/(factoriel(j)*factoriel(i-j))+" ");
            }
             System.out.println("  ");
        }
    }
}