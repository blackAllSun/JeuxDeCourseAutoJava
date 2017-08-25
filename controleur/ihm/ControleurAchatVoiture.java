package controleur.ihm;

import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class ControleurAchatVoiture implements ListSelectionListener {

	@Override
	public void valueChanged(ListSelectionEvent listSelectionEvent){
        if (listSelectionEvent.getValueIsAdjusting())
            return;
        ListSelectionModel lsm = (ListSelectionModel)listSelectionEvent.getSource();
        if (lsm.isSelectionEmpty()) {
            System.out.println("No rows selected");
        }
        else{
            int selectedRow = lsm.getMinSelectionIndex();
            System.out.println("The row "+selectedRow+" is now selected");
 
        }
        System.out.println("source : "+lsm);

    }

}
