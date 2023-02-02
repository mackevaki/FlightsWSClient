package com.mycompany.wsclient_flight.models;


import com.mycompany.wsclient_flight.Flight;
import com.mycompany.wsclient_flight.Place;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class FlightModel extends AbstractTableModel {
    public static final int COLUMN_COUNT = 6;
    private ArrayList<Flight> list;
    private SimpleDateFormat formatDate = new SimpleDateFormat("yyyy-MM-dd");

    public FlightModel(ArrayList<Flight> list) {
        this.list = list;
    }

    @Override
    public int getRowCount() {
        return list.size();
    }

    @Override
    public int getColumnCount() {
        return COLUMN_COUNT;
    }

    private int getFreeCount(Flight flight) {
        int count = 0;
        for (Place place : flight.getAircraft().getPlaceList()) {
            if (!place.isBusy()) {
                count++;
            }
        }
        return  count;
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        final Flight flight = list.get(rowIndex);
        
        switch (columnIndex) {
            case 0:
                return flight.getCode();
            case 1: 
                return flight.getDateDepart().toGregorianCalendar().getTime();
            case 2: 
                return flight.getDateCome().toGregorianCalendar().getTime();
            case 3: 
                return flight.getAircraft().getName();
            case 4: 
                return flight.getDuration();
            case 5: 
                return getFreeCount(flight);
        }
        return "";
    }
    
    @Override
    public String getColumnName(int i) {
        switch (i) {
            case 0:
                return "Код";
            case 1:
                return "Дата вылета";
            case 2:
                return "Дата прилета";
            case 3:
                return "Самолет";
            case 4:
                return "Длительность";
            case 5:
                return "Количество мест";
        }

        return "";
    }
}
