package com.mycompany.wsclient_flight.models;

import java.util.ArrayList;
import javax.swing.AbstractListModel;
import javax.swing.ComboBoxModel;

public class BoxModel<T> extends AbstractListModel<T> implements ComboBoxModel<T> {
	private ArrayList<T> list;	
    private T selectedItem;
	
    public BoxModel(ArrayList<T> list) {
        this.list = list;
    }
    
	@Override
	public int getSize() {
		return list.size();
	}

	@Override
	public T getElementAt(int index) {
		return list.get(index);
	}

	@Override
	public void setSelectedItem(Object anItem) {
		selectedItem = (T)anItem;
	}

	@Override
	public Object getSelectedItem() {
		return selectedItem;
	}
    	
}
