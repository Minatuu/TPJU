/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AgileTP;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import tpju.Observateur;

/**
 *
 * @author aamina
 */
class Observable {

    private List<Observateur> m_observateurs;

    public Observable() {
        m_observateurs = new LinkedList<Observateur>();
    }

    public void notifierObservateurs() {
        Iterator<Observateur> it = m_observateurs.iterator();
        // Notifier tous les observers
        while (it.hasNext()) {
            Observateur obs = it.next();
            obs.notifier();
        }
    }

    void ajouterObservateur(Observateur observateur) {
        // On ajoute un personnage à la liste en le plaçant en premier (implémenté en pull).
        // On pourrait placer cet observateur en dernier (implémenté en push, plus commun).
        m_observateurs.add(observateur);
    }

}
