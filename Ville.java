import java.util.ArrayList;

public class Ville{
    //Attributs
    ArrayList<Routes>routes=new ArrayList<Routes>();
    protected String nom ;
    protected int nbHabitants;
    //Constructeurs
    public Ville(String nom){
        this.nom=nom.toUpperCase();
        nbHabitants=0;
    }
    public Ville(String nom, int nbHabitants){
        this.nom=nom.toUpperCase();
        this.nbHabitants=nbHabitants;
    }
    //Methodes
    public String getNom(){
        return (this.nom).toUpperCase();
    }
    public int getNbHabitants(){
        if(nbHabitants<0){
            return 0;
        }
        else{
        return this.nbHabitants;
        }
    }
    public void setNbHabitants(int n){
        if(n<0){
            nbHabitants=0;
        }
        else{
            nbHabitants=n;
        }
    }
    public boolean nbHabitantsConnu(){
            if(nbHabitants !=0){
                return true;
            }
            else{
                return false;
            }
    } 
    public String toString(){
            return "Ville de : "+nom.toUpperCase()+";"+" "+nbHabitants +"habitants";
    } 
    // 3)
    /*C'est dans la classe Ville qu'on doit définir la méthode catégorie et dans la classse capitale aussi où elle retourne directement "C"  */
    public String categorie(){
        if(nbHabitants<500000){
            return "A";
        }
        if(nbHabitants>5000000){
            return "B";
        }
        if(nbHabitants==0){
            return "?";
        }
        return nom;
    }
    public boolean addRoute(Routes route, boolean autoroute){
            routes.add(route);
            return autoroute;
    }   
    public void listerRoutes(){
        for(int i=0;i<routes.size();i++){
            Routes r=routes.get(i);
            if(r.limiteVitesse>90){
                System.out.println( r.getNomRoute()+"-->"+r.getDestination()+  "(Autoroute)");
            }
            else{
                System.out.println(r.getNomRoute()+"-->"+r.getDestination()+  "(Route)");
            }
            
        }
    }
    public void listerItineraires(Ville v){
        for(int i=0; i<routes.size(); i++){
            Routes R=routes.get(i);
            if(this.nom!=R.destination.nom && this.nom!=v.nom){
                System.out.println(R.getNomRoute()+"-->" +v.nom);


            }

        }

        
    }

    }
