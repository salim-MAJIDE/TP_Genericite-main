package metier;

import metier.Produit;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class MetierProduitImpl implements IMetier<Produit>  {

    List<Produit> listProduit=new ArrayList<>();
    @Override
    public void add(Produit o) {
        listProduit.add(o);
    }

    @Override
    public List<Produit> getAll() throws Exception {
        File file=new File("produits.txt");
        FileInputStream fis=new  FileInputStream(file);
        ObjectInputStream ois=new ObjectInputStream(fis);
        Produit p;
        while(fis.available() > 0){

            listProduit= (List<Produit>) ois.readObject();
        }
        ois.close();
        return listProduit;
    }

    @Override
    public Produit finfById(long id) {
        Produit result=null;
        for (Produit p : listProduit) {
            if (p.getId() == id) result = p;}

            return result;

    }

    @Override
    public void delete(long id) {
        Produit result=null;
        for (Produit p: listProduit){
            if(p.getId()==id) result=p;
        }
        listProduit.remove(result);
    }

    @Override
    public void saveAll() throws Exception {
    File file=new File("produits.txt");
    FileOutputStream fos=new FileOutputStream(file);
    ObjectOutputStream oos=new ObjectOutputStream(fos);
    oos.writeObject(listProduit);
    oos.close();
    }

}
