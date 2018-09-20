//Ahmed Ben Daya
//p1161664

public class NumeroA {

    //Afficher les tableaux
    static void afficher(char[] poste, int[] nbCafe, int nbEmp) {

        System.out.println("Contenu des deux tableaux :\n");
        for (int i=0; i <nbEmp ; i++ ) {
            System.out.println(poste[i] + " " + nbCafe[i]);
        }
    }

    //Compter le nombre de personnes du meme poste
    static int compter(char type , char[] poste) {
        int compteur =0;
        for (int i=0; i < poste.length ; i++) {
            if (type==poste[i]) {
                compteur++;
            }
        }
        return compteur;
    }

    //Calculer le nombre de personne d'un tel poste consommant un tel ou superieur nombre de cafe
    static int nbCafe(int nCafe, int nbEmp, char[] poste, int []  nbCafe, char type) {
        int compteur = 0;
        for (int i=0 ; i<nbEmp ; i++ ) {
            if (poste[i] == type && nbCafe[i] >= nCafe ) {
                compteur++;
            }
        }
        return compteur;
    }

    //Calculer la consommation moyenne de cafe par des personnes d'un tel poste
    static double consommationMoyenne(int nbEmp,char[] poste, int[] nbCafe, char type) {
        int nCafe =0;
        int nbPersonne =0;
        for (int i=0; i<nbEmp; i++) {
            if (poste[i] == type) {
                nCafe += nbCafe[i];
                nbPersonne++;
            }
        }
        return (double) nCafe/nbPersonne;
    }

    //Calculer la consommation minimale de cafe par des personnes d'un tel poste
    static int consommationMinimale(int nbEmp,char[] poste, int[] nbCafe, char type) {
        int min =100;
        for (int i=0; i<nbEmp ; i++) {
            if (poste[i] == type && nbCafe[i] < min) {
                min = nbCafe[i];
            }
        }
        return min;
    }

    //Calculer la consommation maximale de cafe par des personnes d'un tel poste
    static int consommationMaximale(int nbEmp,char[] poste, int[] nbCafe, char type) {
        int max=0;
        for (int i=0; i<nbEmp; i++) {
            if (poste[i] == type && nbCafe[i] > max) {
                max = nbCafe[i];
            }
        }
        return max;
    }


    public static void main(String[] args) {

        char[]  poste = { 'P', 'P', 'O', 'A', 'P', 'A', 'O', 'A', 'P' };
        int[]  nbCafe = {   3,  1, 4, 0, 4, 2, 2, 5, 1 };
        int nbEmp = poste.length ;

        afficher(poste,nbCafe,nbEmp);
        System.out.println("\nLe nombre de programmeurs est : "+ compter('P',poste));
        System.out.println("\nLe nombre d'analystes est : " + compter('A',poste));
        System.out.println("\nLe nombre de secretaires est : " + compter('S',poste));
        System.out.println("\nLe nombre de programmeurs consommant 3 tasses ou plus est: " + nbCafe(3,nbEmp,poste,nbCafe,'P'));
        System.out.println("\nLa consommation moyenne des cafés des analystes est : " + consommationMoyenne(nbEmp,poste,nbCafe,'A'));
        System.out.println("\nLa consommation minimale de café des programmeurs est : " + consommationMinimale(nbEmp,poste,nbCafe,'P'));
        System.out.println("\nLa consommation maximale de café des operateurs est : " + consommationMaximale(nbEmp,poste,nbCafe,'O'));




    }
}
