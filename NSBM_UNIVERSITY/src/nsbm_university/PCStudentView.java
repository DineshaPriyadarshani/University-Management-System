/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nsbm_university;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author USER
 */
public class PCStudentView extends AbstractTableModel{
    private static final String [] COLUMN_NAMES = {"Std_Id","Full_Name","DOB","Gender","Address","Email","Contact_No"};
    private static ArrayList<PostgraduateDetails> list;
    
    PCStudentView(ArrayList<PostgraduateDetails>pdList){
            list=pdList;
    }

    @Override
    public int getRowCount() {
         return list.size();
         
    }
    
    @Override
    public String getColumnName(int columnIndex){
        return COLUMN_NAMES[columnIndex];
    }

    @Override
    public int getColumnCount() {
        return COLUMN_NAMES.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0:return list.get(rowIndex).getStd_Id();
            case 1:return list.get(rowIndex).getFull_Name();
            case 2:return list.get(rowIndex).getDOB();
            case 3:return list.get(rowIndex).getGender();
            case 4:return list.get(rowIndex).getAddress();
            case 5:return list.get(rowIndex).getEmail();
            case 6:return list.get(rowIndex).getContact_No();
                default:return "Error";
        }
    }

    
    
}
