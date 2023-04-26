import java.util.DoubleSummaryStatistics;

public class Autoroutes extends Routes {
    private double tarif;
    private int nbVoies;
    public Autoroutes(String nomRoute, int limiteVitesse, int distance, int nbVoies, Ville destination, double tarif){
        super(nomRoute, limiteVitesse, distance, destination);
        this.tarif=tarif;
        this.nbVoies=nbVoies;
    }
    public String getNomAutoroute(){
        return nomRoute;
    }
    public Ville getDesti(){
        return destination;
    }
}
