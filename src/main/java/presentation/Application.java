package presentation;

import metier.MetierProduitImpl;
import metier.Produit;

import java.io.FileNotFoundException;
import java.util.Scanner;

import static java.lang.System.exit;

public class Application {
    public static void main(String[] args) throws Exception {
        MetierProduitImpl m=new MetierProduitImpl();
       /* m.add(new Produit(1,"pc","hp",16988,"bjffifjik"));
        System.out.println("List of elements");
        System.out.println(m.getAll());
        System.out.println("Find element");
        m.finfById(1);
        System.out.println("delete element");
        m.delete(1);*/


        int c=0;
            do{
                System.out.println("1.Afficher la liste des produits");
                System.out.println("2.Rechercher un produit par son id");
                System.out.println("3.Ajouter un nouveau produit dans la liste");
                System.out.println("4.Supprimer un produit par son id");
                System.out.println("5.Quitter le programme");
                System.out.print("Entrer un choix : ");
                Scanner s=new Scanner(System.in);
                c= s.nextInt();
                switch (c){
                    case 1:
                        System.out.println(m.getAll());

                        break;
                    case 2:
                        System.out.println(m.finfById(1));
                        break;
                    case 3:
                        m.add(new Produit(1,"PC","HP",5000,"blablab"));
                        break;
                    case 4:
                        m.delete(1);
                        break;
                    case 5:
                        exit(0);
                        break;
                }
            }while(c >= 1 && c <5);



    }
}
