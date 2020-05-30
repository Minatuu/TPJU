/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AgileTP;

/**
 *
 * @author aamina
 */
import java.lang.RuntimeException;

public class PotionException extends RuntimeException {
    public PotionException() {
        super();
    }
    public PotionException(String msg) {
        super(msg);
    }
    public PotionException(Exception e) {
        super(e);
    }
}
