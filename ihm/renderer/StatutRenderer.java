package jeuxDeVoitureAuto.ihm.renderer;

import java.awt.Color;
import java.awt.Component;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.List;

import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;

import jeuxDeVoitureAuto.RootGson;
import jeuxDeVoitureAuto.pojo.Statut;

public class StatutRenderer extends DefaultTableCellRenderer {


	public StatutRenderer() throws FileNotFoundException, UnsupportedEncodingException{}
	@Override
	public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
		super.getTableCellRendererComponent(table, value, isSelected, hasFocus,	row, column);

			Statut statut = (Statut) value;

		setText(value.toString());

		if (statut == Statut.PILOTE) {
			setForeground(Color.PINK);
		} else {
			setForeground(Color.BLUE);
		}

		return this;
	}

}