import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        // exercice 1 
//        System.out.println("Hello World");
//        //exercice 2
//        int a = 1;
//        int b = 2;
//        int c = a;
//        a = b;
//        b = c;
//        String A = Integer.toString(a);
//        String B = Integer.toString(b);
//        System.out.println(A + B);
//        //exercice 1 (Partie 1 et 2)
//        if (a < b) {
//            System.out.println(a);
//        } else if (b < a) {
//            System.out.println(b);
//        } else {
//            System.out.println("Les deux variables sont égales");
//        }
//        //exercice du diapo
//        int age = 70;
//        if (age >= 18 && age < 60) {
//            System.out.println("La personne est majeure");
//        } else if (age < 18) {
//            System.out.println("La personne est mineure");
//        } else {
//            System.out.println("La personne est séniore");
//        }
//        //exercice anti-pédophile
//        int ageZizi = 30;
//        if (age < 18) {
//            System.out.println("!!! NE PAS TOUCHER !!!");
//        } else if (age > 18 && (ageZizi -= age) <= 3) {
//            System.out.println("c'est ok");
//        }
//        if (age > 60) {
//            System.out.println("OMG C MAMIE !!!");
//        }
//        //exercice diapo, fizz-buzz
//        for (int i = 1; i <= 100; i++) {
//            if (i % 3 == 0 && i % 5 == 0) {
//                System.out.println("FizzBuzz");
//            } else if (i % 3 == 0) {
//                System.out.println("Fizz");
//            } else if (i % 5 == 0) {
//                System.out.println("Buzz");
//            } else {
//                System.out.println(i);
//            }
//        }
        //exercice diapo scanner
//        Scanner entree = new Scanner(System.in);
//        System.out.print("Saisir un entier : ");
//        int monInt = entree.nextInt();
//        System.out.println("L'entier saisi est " + monInt);
//        Random r = new Random();
//        int nombreAleatoire = r.nextInt(5);
//        System.out.println(nombreAleatoire);
        //exercice diapo scanner 2
//        Scanner entree = new Scanner(System.in);
//        System.out.println("Saisir une chaîne de caractères : ");
//        String monString = entree.nextLine();
//        System.out.println("La chaîne de caractères saisie est " + monString);
        // exercice aire rectangle
//        Scanner entree = new Scanner(System.in);
//        System.out.println("Longueur du rectangle :");
//        int longueur = entree.nextInt();
//        System.out.println("Largeur du rectangle :");
//        int largeur = entree.nextInt();
//        System.out.println("L'aire du rectangle est " + longueur * largeur);
//        System.out.println("Voici une image du rectangle :");
//        for (int j = 0; j < largeur; j++) {
//            for (int i = 0; i < longueur; i++) {
//                System.out.print("*");
//            }
//            System.out.print("\n");
//        }
//        System.out.println("Boujour \nhihi");
        //exercice diapo sapin 
//        Scanner entree = new Scanner(System.in);
//        System.out.println("hauteur de la pyramide:");
//        int h = entree.nextInt();
//        for (int j = 0; j < h; j++) {
//            for (int i = 0; i < (h - j - 1); i++) {
//                System.out.print(" ");
//            }
//            for (int i = 0; i < (2 * j + 1); i++) {
//                System.out.print("*");
//            }
//            for (int i = 0; i < (h - j - 1); i++) {
//                System.out.print(" ");
//            }
//            System.out.print("\n");


        //exercice Vincent la Gaffe diapo 
        Random r = new Random();
        int n = r.nextInt(1000);
        Scanner devinette = new Scanner(System.in);
        System.out.println("Quel est le prix du Lot ?");
        int propal = -1;
        int essai =0;
        while(propal != n){
            essai++;
            propal = devinette.nextInt();
            if (propal > n){
                System.out.println("Moins");
            } else if (propal < n) {
                System.out.println("Plus");
            } else {
                System.out.println("Bravo !!! Vous avez gagné un lot de " + n + "€");
            }
        }
        System.out.println("Vous avez trouvé en " + essai + " essai(s)");

    }
    //Ma première procedure
//    public static void maProcedure(String str, int n){
//        System.out.println("Voilà. " + str);
//    }
//    //Ma première fonction
//    public static String profiterole(){
//        return "J'aime les profiteroles";
//    }
}