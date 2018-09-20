public class NumeroC {

    //afficher le contenu du tableau
    static void afficher(Personne[] tabPers) {
        System.out.println();
        for (int i=0; i<tabPers.length ;i++) {
            System.out.println(tabPers[i].getNaissance() + "    " + tabPers[i].getNbCafe() + " tasse(s)" );
        }
    }

    //Determiner la personne qui consomme le plus de cafe
    static void lePlusDeCafe(Personne[] tabPers) {
        int nbCafe = 0;
        Personne plusGrosConsommateur = new Personne();
        for (int i=0; i<tabPers.length ;i++) {
            if (tabPers[i].getNbCafe() > nbCafe) {
                nbCafe = tabPers[i].getNbCafe();
                plusGrosConsommateur = tabPers[i];
            }
        }

        System.out.println("\nVoici les informations du plus gros consommateur de café : " + plusGrosConsommateur.getNaissance() + " " + nbCafe +" tasse(s)");
    }

    //Deduire un cafe et reafficher le tableau
    static void deductionTasse(Personne[] tabPers) {
        for (int i=0; i<tabPers.length ; i++) {
            if (tabPers[i].getNbCafe() > 0) {
                tabPers[i].setNbCafe(tabPers[i].getNbCafe()-1);
            }
        }
        afficher(tabPers);
    }

    //Trier le tableau selon la date de naissance et le reafficher
    static void triDate(Personne[] tabPers) {
        Personne temp = new Personne();
        for (int i=0 ; i<tabPers.length ; i++) {
            for (int j = i+1 ; j<tabPers.length;j++) {
                if (Integer.parseInt(tabPers[i].getNaissance().substring(6)) > Integer.parseInt(tabPers[j].getNaissance().substring(6))) {
                    temp = tabPers[i];
                    tabPers[i] = tabPers[j];
                    tabPers[j] = temp;
                }
            }
        }
        System.out.println("\nTableau aprés le Tri : ");
        afficher(tabPers);
    }


    //Compter et afficher les personnes nés en un certain mois
    public static void triMois(Personne[] tabPers) {
        int compteur = 0;
        for (int i=0; i<tabPers.length ; i++) {
            if (Integer.parseInt(tabPers[i].getNaissance().substring(3,5)) == 5) {
                compteur++;
            }
        }

        System.out.println("\nLe nombre de personne né au mois de mai est : " + compteur);
    }



    public static void main(String[] args) {

        Personne[] tabPers;
        tabPers = new Personne[5];
        tabPers[0] = new Personne("16/11/1996",2);
        tabPers[1] = new Personne("02/05/1990");
        tabPers[2] = new Personne("23/05/1990",5);
        tabPers[3] = new Personne("19/02/1985",0);
        tabPers[4] = new Personne("30/05/1991",2);

        afficher(tabPers);
        lePlusDeCafe(tabPers);
        deductionTasse(tabPers);
        triDate(tabPers);
        triMois(tabPers);
    }
}
