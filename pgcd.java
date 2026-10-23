import java.util.Scanner;
public class Pgcd {
    int a, b;
    public Pgcd(int a, int b){
        this.a = a;
        this.b = b;
    }
    public int multi(int a, int b){
        if (a == b){
            return a;    
        }
        else if (a < b){ 
            return multi(a, b - a);
        }
        else {
            return multi(a - b, b);
        }
        
    } 
    public static void main(String[] data){
        System.out.println("Entrez un nombre");
        System.out.println("Entrez un second nombre");
        Scanner sc=new Scanner(System.in);
        int l=sc.nextInt();
        int L=sc.nextInt();
        Pgcd p=new Pgcd(l, L);
        int multi = p.multi(l, L);
        System.out.println("le pgcd est :"+multi);
    }
}