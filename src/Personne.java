public class Personne {

    private String naissance ; // format "jj/mm/aaaa", ex : "25/12/1990"
    private int nbCafe ; // nb de tasses de café consommé par jour

    public Personne(String naissance, int nbCafe) {
        this.naissance = naissance;
        this.nbCafe = nbCafe;
    }

    public Personne(String naissance) {
        this.naissance = naissance;
        this.nbCafe = 1;
    }

    public Personne() {
    }

    public String getNaissance() {
        return naissance;
    }

    public int getNbCafe() {
        return nbCafe;
    }

    public void setNaissance(String naissance) {
        this.naissance = naissance;
    }

    public void setNbCafe(int nbCafe) {
        this.nbCafe = nbCafe;
    }
}
