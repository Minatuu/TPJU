/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AgileTP;

import java.util.Collection;

/**
 *
 * @author aamina
 */
public interface Stock {
   // public int alimenterStock(int quantite);
    //public String delivreyStock(int quantite);
    //public void setQuantite(int q);
    //public int getQuantite();
    public void add(Stock potion);
    public void remove(Stock potion);
    public Collection getListeStock();
    
    
}
