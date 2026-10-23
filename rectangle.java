import java.util.Scanner;
public class Rectangle{
    float L,l;
    public Rectangle(float L, float l){
        this.L=L;
        this.l=l;
    }
    public float perimetre(float L, float l){
        return (L+l)/2;
    }
    public float surface(float L,float l){
        return L*l;
    }
    public static void main(String[] args){
      System.out.println("entrez les valeurs des cotes:");
      Scanner c=new Scanner(System.in);
      float lar=c.nextFloat();
      float Lon=c.nextFloat();
      Rectangle d=new Rectangle(Lon,lar);
      float perimetre= d.perimetre(Lon,lar);
      float surface= d.surface(Lon,lar);
      System.out.println("le perimetre est:"+perimetre);
      System.out.println("la surface est:"+surface);   

    }
}