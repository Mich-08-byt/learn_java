import java.util.Scanner;
public class Rectangle {
    private float l;
    private float L;
    
     public Rectangle(){ //constructeur sans parametre
        this.l=0;
        this.L=0;
    }
    public Rectangle(float l, float L){ //constructeur avec parametre 
        this.l=l;
        this.L=L;
    }
    public void setl(float l){//modificateur pour attribuer une valeur a l
        if(l>=0){// pour verifier si la valeur de l est negative
            this.l=l;
        }
        else{
            System.out.println("la longueur doit etre un nombre positif");
        }
    }
    public void setL(float L){//modificateur pour attribuer une valeur a L
        if(L>=0){// pour verifier si la valeur de L est negative
            this.L=L;
        }
        else{
            System.out.println("la largeur doit etre un nombre positif");
        }
    }

    public float getl(){// accesseur pour recuperer la valeur de l
        return l;
    }
    public float getL(){// accesseur pour recuperer la valeur de L
        return L;
    }

    public float surface(float l, float L){// methode pour calculer la surface
        return l*L;
    }
    public float perimetre(float l, float L){// methode pour calculer le perimetre
        return (l+L)*2;
    }

    public static void main(String[] args){
        
        System.out.println("enter two numbers:");// pour demander a lutilisateur de saisir deux nombres
        Scanner sc=new Scanner(System.in);// pour lire les deux nombres saisis par lutilisateur
        float b=sc.nextFloat();// pour lire le premier nombre saisi par lutilisateur
        float g=sc.nextFloat();
        Rectangle d=new Rectangle(b,g);// pour creer un objet de la classe rectangle et pour initialiser les valeurs de l et L avec les valeurs saisies par lutilisateur
        float surface=d.surface(b,g);
        float perimetre=d.perimetre(b,g);
        System.out.println("largeur: "+b);
        System.out.println("longueur: "+g);
        d.setl(-4);
        d.setL(-5);
        if(b<0 || g<0){
            System.out.println("la longueur et la largeur doivent toujours etre positif");

        }
        else{
            System.out.println("le perimetre est : "+perimetre + " cm "+" et la surface est: "+surface+" cm2");   
        }
    }
}