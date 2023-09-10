package presentation;

import metier.MetierProduitImpl;
import metier.Produit;

import java.util.List;

public class Application2 {
    public static void main(String[] args) throws Exception {
        MetierProduitImpl metierProduit=new MetierProduitImpl();
        metierProduit.add(new Produit(1,"pc","HP",5000,"ugigigig"));
        metierProduit.add(new Produit(2,"souris","HP",50,"ugigigig") );
        metierProduit.add(new Produit(3,"casque","HP",300,"ugigigig") );

        metierProduit.saveAll();
        List<Produit> produits=metierProduit.getAll();
        for (Produit p: produits){
            System.out.println(p.getId()+" "+p.getNom()+" "+p.getMarque()+" "+p.getPrix()+" "+p.getDescription());
        }
    }
}
