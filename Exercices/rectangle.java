import java.util.Scanner;
public class Rectangle {
    private float l;
    private float L;
    
    Rectangle(){ //constructeur sans parametre
        this.l=0;
        this.L=0;
    }
    Rectangle(float l, float L){ //constructeur avec parametre 
        this.l=l;
        this.L=L;
    }
    public void setl(float l){
        this.l=l;

    }
    public void setL(float L){
        this.L=L;
    }

    public float getl(){
        return l;
    }
    public float getL(){
        return L;
    }

    public float surface(float l, float L){// methode pour calculer la surface
        return l*L;
    }
    public float perimetre(float l, float L){// methode pour calculer le perimetre
        return (l+L)/2;
    }

    public static void main(String[] data){
        
        System.out.println("enter two number:");
        Scanner sc=new Scanner(System.in);
        float b=sc.nextFloat();
        float g=sc.nextFloat();
        Rectangle d=new Rectangle(b,g);
        float perimetre=d.perimetre(b,g);
        float surface=d.surface(b,g);
        
        System.out.println("le perimetre est : "+perimetre + " cm "+" et la surface est: "+surface+" cm^2");
        
    }
}