public class TestVille {
    public static void main(String[] args) {
        Ville v1, v2, v3;
        v1= new Ville ("Valenciennes");
        v2 = new Ville ("Lille", 232741);
        v3 = new Ville("Orchies");
        System.out.println(v1);
        System.out.println(v2);
        System.out.println();
        Capitale paris, rome;
        paris = new Capitale("Paris", "France");
        rome = new Capitale("Rome", "Italie", 2700000);
        paris.setNbHabitants(2181000);
        System.out.println(paris);
        System.out.println(rome);
        System.out.println();
        System.out.println("catégorie de la ville de " +
        v1.getNom() + " : " + v1.categorie());
        System.out.println("catégorie de la ville de " +
        v2.getNom() + " : " + v2.categorie());
        System.out.println("catégorie de la ville de " +
        paris.getNom() + " : " + paris.categorie());
        System.out.println();
        Autoroutes a1 = new Autoroutes("A1", 130, 2, 225, paris,12.5);
        Autoroutes a23 = new Autoroutes("A23", 130, 2, 50, v2, 0.0);
        Routes r1 = new Routes("D549", 90, 29, v3);
        v2.addRoute(a1, false);
        v2.addRoute(r1, true);
        v1.addRoute(a23, true);
        a23 = new Autoroutes("A23", 130, 2, 28, v1, 0.0);
        v3.addRoute(a23, true);
        System.out.println("Liste des routes au départ de Lille etValenciennes :");
        v2.listerRoutes();
        v1.listerRoutes();
        System.out.println();
        System.out.println("Itinéraires (avec au plus une villeétape) entre Lille et Valenciennes :");
        v2.listerItineraires(v1);

    }
}
