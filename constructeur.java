public class Constructeur{ //classe principale
    private int x; 
    private int y;//(la visibilite de x et y sont de type package)
    Constructeur(){ // notre constructeur sans paramettre
        this.x=0;
        this.y=0;
    
    }
    Constructeur(int a){
        x=a;
    }
    Constructeur(int x, int y){//constructeur avec paramettre
        this.x=x;
        this.y=y;
    }
    public int getx(){ // get :c'est pour recupere la valeur
        return x;
    }
    public void setx(int x){ // c'est de type void parce que la fonction ne return rien; set c'est pour attribuer une valeur
        this.x=x;
    }
    public int gety(){ // 
        return y;
    }
    public void sety(int y){
        this.y=y;
    }

    public static void main(String[] args){
        Constructeur p1 =new Constructeur();
        Constructeur p2 =new Constructeur(10);// x=10
        Constructeur p3 =new Constructeur(5, 8);// x=5 et y=8
        System.out.println(" p3 x = " + p3.getx() + " p3 y = " + p3.gety());// 'println' permet daffiche et dalle directement a la ligne pour affiche une autre instruction
        System.out.println(" p1 x = " + p1.getx() + " p1 y = " + p1.gety());
        System.out.println(" p2 x = " + p2.getx() + " p2 y = " + p2.gety());
        if(p3 instanceof Constructeur){// instance c-a-d decoule dune classe "p3 est une instance de la classe Constructeur"
             System.out.println(" p3 est une instance de la classe Constructeur" );
        }
        
    }
}//lors de lexecution quel est le tyoe de fichier qui est produit
// ca va vrnir les diagrammes 
//  une variable static est une variable dont toute les ont acces a un 
