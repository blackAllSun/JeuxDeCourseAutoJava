package vue.ihm.renderer.table;

import java.awt.Color;
import java.awt.Component;

import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class ColorRenderer extends DefaultTableCellRenderer{
	@Override
	  public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int col) {
		Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, col);
	    String s = table.getModel().getValueAt(row, col).toString();
	    System.out.println(s);
	    if (s.equalsIgnoreCase("java.awt.yellow")) {c.setForeground(Color.YELLOW);c.setBackground(Color.WHITE);}
	    else if(s.equalsIgnoreCase("java.awt.red")) {c.setForeground(Color.RED);c.setBackground(Color.RED);}
	    else if(s.equalsIgnoreCase("java.awt.blue")) {c.setForeground(Color.BLUE);c.setBackground(Color.BLUE);}
	    else if(s.equalsIgnoreCase("java.awt.green")) {c.setForeground(Color.GREEN);c.setBackground(Color.GREEN);}
	    else {
	        c.setForeground(Color.WHITE);
	    }

	    return c;
	}
}
