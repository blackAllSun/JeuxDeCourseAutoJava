package vue.ihm.renderer.list;

import java.awt.Component;

import javax.swing.DefaultListCellRenderer;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

public class ListRendererSponsor implements ListCellRenderer {
	protected static Border noFocusBorder = new EmptyBorder(15, 1, 1, 1);

	  protected static TitledBorder focusBorder = new TitledBorder(LineBorder.createGrayLineBorder(),"title");
	  DefaultListCellRenderer defaultRenderer = new DefaultListCellRenderer();
	@Override
	public Component getListCellRendererComponent(JList list, Object value, int index,
		      boolean isSelected, boolean cellHasFocus) {
	    JLabel renderer = (JLabel) defaultRenderer.getListCellRendererComponent(list, value, index,
	        isSelected, cellHasFocus);
	    renderer.setBorder(cellHasFocus ? focusBorder : noFocusBorder);
	    return renderer;}
}