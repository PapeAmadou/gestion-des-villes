public class Routes {
    protected String nomRoute;
    protected int limiteVitesse;
    protected int distance;
    protected Ville destination;
    public Routes(String nomRoute, int limiteVitesse, int distance, Ville destination){
        this.nomRoute=nomRoute;
        this.limiteVitesse=limiteVitesse;
        this.distance=distance;
        this.destination=destination;
    }
    public String getNomRoute(){
        return nomRoute;
    }
    public Ville getDestination(){
        return destination;
    }
    /*public String toString(){
        return "nom de la route: "+nomRoute+","+"la limite vitesse autorisee:"+limiteVitesse+","+"distance: "+distance + ","+"destination: "+destination;
    }*/
}
