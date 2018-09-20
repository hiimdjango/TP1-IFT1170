//Ahmed Ben Daya
//p1161664
public class NumeroB {

    //Formater les chaines de caracteres en nouveau format
    static String formaterNumero(String tel, String enTete) {
        String regionalCode ="" , firstThreeDigits="", lastDigits="";
        regionalCode = "(" + tel.substring(0,3) + ")";
        firstThreeDigits = tel.substring(3,6);
        lastDigits = tel.substring(6,10);

        return "\n" + enTete + regionalCode + firstThreeDigits + "-" + lastDigits;
    }

    //Trouver les repetitions d'un chiffre

    static void nbRepetition(String tel, char number, String enTete) {
        int compteur =0;
        for (int i=0 ; i<tel.length() ; i++) {
            if (tel.charAt(i) == number) {
                compteur++;
            }
        }
        System.out.println("\nIl y'a " + compteur + " fois le chiffre " + number + " dans le numero de " + enTete);
    }

    //Calculer et afficher le nombre de chiffre impairs

    static void chiffreImpairs(String tel, String enTete) {
        int compteur =0;
        for (int i=0; i<tel.length() ;i++) {
            if (Character.getNumericValue(tel.charAt(i)) % 2 != 0) {
                compteur++;
            }
        }
        System.out.println("\nIl y a " + compteur + " fois les chiffres impairs dans le numero de " + enTete);
    }

    //Calculer et afficher le nombre de chiffre pairs

    static void chiffrePairs(String tel, String enTete) {
        int compteur=0;
        for (int i=0; i<tel.length(); i++) {
            if (Character.getNumericValue(tel.charAt(i)) % 2 == 0) {
                compteur++;
            }
        }
        System.out.println("\nIl y a " + compteur + " fois les chiffres pairs dans le numero de " + enTete);
    }

    //Calculer et determiner les chiffres en commun

    static void chiffresCommun(String premierTel, String deuxiemeTel) {
        String chiffreEnCommun =" ";
        for (int i=0 ; i<premierTel.length() ; i++) {
            for (int j = 0; j < deuxiemeTel.length(); j++) {
                if (premierTel.charAt(i) == deuxiemeTel.charAt(j)) {
                            chiffreEnCommun = chiffreEnCommun + " " +premierTel.charAt(i);
                }
            }
        }

        //Enlever les duplications

        String chiffreEnCommunFinal = new String();
        for (int i=0; i<chiffreEnCommun.length(); i++) {
            if (!chiffreEnCommunFinal.contains(String.valueOf(chiffreEnCommun.charAt(i)))) {
                chiffreEnCommunFinal += " " + String.valueOf(chiffreEnCommun.charAt(i));
            }
        }


        System.out.println("\nLes chiffres en communs sont :" + chiffreEnCommunFinal);
    }

    //Determiner et afficher le plus petit chiffre

    static void plusPetitChiffre(String tel, String enTete) {

        int lowestNumber =9;
        for (int i=0;i<tel.length();i++) {
            if (Character.getNumericValue(tel.charAt(i)) < lowestNumber) {
                lowestNumber = Character.getNumericValue(tel.charAt(i));
            }
        }

        System.out.println("\nLe chiffre " + lowestNumber + " est le plus petit chiffre dans le numéro de  " + enTete);
    }




    public static void main(String[] args) {

        String  telUdm  =  "5143436111",  telJean = "4501897654" ;

        System.out.println(formaterNumero(telUdm, "Téléphone d'UdM : "));
        System.out.println(formaterNumero(telJean,"Téléphone de Jean : "));
        nbRepetition(telUdm,'3',"téléphone d'Udm.");
        nbRepetition(telUdm,'1',"téléphone d'Udm.");
        nbRepetition(telJean,'2',"téléphone de Jean.");
        chiffreImpairs(telUdm,"téléphone d'UdM.");
        chiffrePairs(telJean,"téléphone de Jean.");
        chiffresCommun(telJean,telUdm);
        plusPetitChiffre(telUdm,"téléphone de l'UdM");
        plusPetitChiffre(telJean,"téléphone de Jean");




    }
}
