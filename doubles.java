import java.util.Scanner;
public class Doubles{
    float n;
    public Doubles(float n){
        this.n=n;
    }
    public float formule(float n){
        return n*2;
    }
public static void main(String[] args){
    System.out.println("Entrez un nombre:");
    Scanner c=new Scanner(System.in);
    float l=c.nextFloat();
    Doubles s=new Doubles(l);
    //float formule =s.formule(l);
    System.out.println("Le double du nombre est:"+s.formule(l));

}
}