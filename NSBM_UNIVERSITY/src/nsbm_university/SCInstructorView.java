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
public class SCInstructorView extends AbstractTableModel{
    private static final String [] COLUMN_NAMES = {"LecId","Name","Sub_Code","Email","Tel_No"};
    private static ArrayList<SCInstructorDetails> list;
    
    SCInstructorView(ArrayList<SCInstructorDetails>udList){
            list=udList;
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
            case 0:return list.get(rowIndex).getInstructer_Id();
            case 1:return list.get(rowIndex).getName();
            case 2:return list.get(rowIndex).getSub_Code();
            case 3:return list.get(rowIndex).getEmail();
            case 4:return list.get(rowIndex).getTel_No();
           
            

            default:return "Error";
            
            
    }
    }
}
