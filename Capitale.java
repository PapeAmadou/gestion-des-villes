public class Capitale extends   Ville {
    //Attributs
    private String nomPays;
    //Constructeurs
    public Capitale(String nom, String nomPays, int nbHabitants){
        super(nom,nbHabitants);
        this.nomPays=nomPays.toUpperCase();
    }
    public Capitale(String nom, String nomPays){
        super(nom);
        this.nomPays=nomPays;
    }
    public String categorie(){
        return "C";
    }
    public String toString(){
        return "Ville de"+" "+ nom.toUpperCase()+";"+" "+nbHabitants+"habitants."+" "+"Capitale de"+" "+nomPays.toUpperCase();
    }
    
}
