import java.util.Scanner;
public class Ppcm{ 
     int a, b;
    public Ppcm(int a, int b){
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
    public int div(int a, int b){
           return (a * b)/multi(a, b);
    } 
    public static void main(String[] data){
        System.out.println("Entrez deux nombres");
        Scanner sc=new Scanner(System.in);
        int l=sc.nextInt();
        int L=sc.nextInt();
        Pgcd p=new Pgcd(l, L);
        Ppcm n=new Ppcm(l, L);
        int multi = p.multi(l, L);
        int div = n.div(l, L);
        System.out.println("le ppcm est :"+div);
    }
    
}