/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nsbm_university;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class DBConection {

    String url = "jdbc:mysql://localhost:3306/nsbmdb";
    String username = "root";
    String password = "";
    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    boolean addPostgraduates(PostgraduateDetails pd) {
        try {

            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/nsbmdb", "root", "");
            String query = "INSERT INTO postgratz_details(Std_Id,Full_Name,DOB,Gender,Address,Email,Contact_No,Qualifications,Reg_Month)  values (?,?,?,?,?,?,?,?,?)";
            pst = con.prepareStatement(query);

            pst.setString(1, pd.getStd_Id());
            pst.setString(2, pd.getFull_Name());
            pst.setString(3, pd.getDOB());
            pst.setString(4, pd.getGender());
            pst.setString(5, pd.getAddress());
            pst.setString(6, pd.getEmail());
            pst.setString(7, pd.getContact_No());
            
            pst.setString(8, pd.getQualifications());
            pst.setString(9, pd.getReg_Month());

            pst.executeUpdate();
            return true;

        } catch (Exception e) {
            System.out.println(e);
            return false;
        } finally {
            try {
                if (con != null) {
                    con.close();
                }

                if (pst != null) {
                    pst.close();
                }
            } catch (Exception e) {

            }
        }
    }

    boolean addUndergraduates(UndergraduateDetails ud) {
        try {

            con = DriverManager.getConnection(url, username, password);
            String query = "INSERT INTO undergratz_details(Std_Id,Full_Name,DOB,Gender,Address,Email,Contact_No,Subject1,Subject2,Subject3,Result1,Result2,Result3,Island_Rank,ZScore,Index_No,Reg_Month)  values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            pst = con.prepareStatement(query);

            pst.setString(1, ud.getStd_Id());
            pst.setString(2, ud.getFull_Name());
            pst.setString(3, ud.getDOB());
            pst.setString(4, ud.getGender());
            pst.setString(5, ud.getAddress());
            pst.setString(6, ud.getEmail());
            pst.setString(7, ud.getContact_No());
            //pst.setString(8, ud.getFaculty());
            pst.setString(8, ud.getSubject1());
            pst.setString(9, ud.getSubject2());
            pst.setString(10, ud.getSubject3());
            pst.setString(11, ud.getResult1());
            pst.setString(12, ud.getResult2());
            pst.setString(13, ud.getResult3());
            pst.setString(14, ud.getIsland_Rank());
            pst.setString(15, ud.getZScore());
            pst.setString(16, ud.getIndex_No());
            pst.setString(17, ud.getReg_Month());

            pst.executeUpdate();
            return true;
        } catch (Exception e) {
            System.out.println(e);
            return false;
        } finally {
            try {
                if (con != null) {
                    con.close();
                }

                if (pst != null) {
                    pst.close();
                }
            } catch (Exception e) {
   
            }
        }
    }

    ArrayList<UndergraduateDetails> getStudent() {
        try {
            ArrayList<UndergraduateDetails> list = new ArrayList<UndergraduateDetails>();
            con = (Connection) DriverManager.getConnection(url, username, password);
            String query = "SELECT * FROM undergratz_details";
            pst = (PreparedStatement) con.prepareStatement(query);

            rs = pst.executeQuery();
            
            while (rs.next()) {
                UndergraduateDetails ud = new UndergraduateDetails();
                ud.setStd_Id(rs.getString(1));
                ud.setFull_Name(rs.getString(2));
                ud.setDOB(rs.getString(3));
                ud.setGender(rs.getString(4));
                ud.setAddress(rs.getString(5));
                ud.setEmail(rs.getString(6));
                ud.setContact_No(rs.getString(7));
                ud.setSubject1(rs.getString(8));
                ud.setResult1(rs.getString(9));
                ud.setSubject2(rs.getString(10)); 
                ud.setResult2(rs.getString(11));
                ud.setSubject3(rs.getString(12));
                ud.setResult3(rs.getString(13));
                ud.setIsland_Rank(rs.getString(14));
                ud.setZScore(rs.getString(15));
                ud.setIndex_No(rs.getString(16));
                
                ud.setReg_Month(rs.getString(17));
                list.add(ud);
                
            }
            return list;

        } catch (Exception e) {
            System.out.println(e);
            return null;
        } finally {
            try {
                if (con != null) {
                    con.close();
                }

                if (pst != null) {
                    pst.close();
                }
            } catch (Exception e) {

            }
        }
    }
ArrayList<PostgraduateDetails> getPStudent() {
        try {
            ArrayList<PostgraduateDetails> list = new ArrayList<PostgraduateDetails>();
            con = (Connection) DriverManager.getConnection(url, username, password);
            String query = "SELECT * FROM postgratz_details";
            pst = (com.mysql.jdbc.PreparedStatement) con.prepareStatement(query);

            rs = pst.executeQuery();
            
            while (rs.next()) {
                PostgraduateDetails ud = new PostgraduateDetails();
                ud.setStd_Id(rs.getString(1));
                ud.setFull_Name(rs.getString(2));
                ud.setDOB(rs.getString(3));
                ud.setGender(rs.getString(4));
                ud.setAddress(rs.getString(5));
                ud.setEmail(rs.getString(6));
                ud.setContact_No(rs.getString(7));
                ud.setQualifications(rs.getString(8));
                
                ud.setReg_Month(rs.getString(9));
                list.add(ud);
                
                   
            }
            return list;

        } catch (Exception e) {
            System.out.println(e);
            return null;
        } finally {
            try {
                if (con != null) {
                    con.close();
                }

                if (pst != null) {
                    pst.close();
                }
            } catch (Exception e) {

            }
        }
    }


    public boolean updateStudent(UndergraduateDetails u){
        try{
            con = (Connection) DriverManager.getConnection(url, username, password);
            String query = "UPDATE undergratz_details SET Std_Id='"+u.getStd_Id()+"',Full_Name='"+u.getFull_Name()+"',DOB='"+u.getDOB()+"',Gender='"+u.getGender()+"',Address='"+u.getAddress()+"',Email='"+u.getEmail()+"',Contact_No='"+u.getContact_No()+"',Subject1='"+u.getSubject1()+"',Result1='"+u.getResult1()+"',Subject2='"+u.getSubject2()+"',Result2='"+u.getResult2()+"',Subject3='"+u.getSubject3()+"',Result3='"+u.getResult3()+"',Island_Rank='"+u.getIsland_Rank()+"',ZScore='"+u.getZScore()+"',Index_No='"+u.getIndex_No()+"',Reg_Month='"+u.getReg_Month()+"' WHERE Std_Id="+u.getStd_Id();
            pst = (com.mysql.jdbc.PreparedStatement) con.prepareStatement(query);

            pst.executeUpdate();
            return true;
            
        } catch (Exception e) {
            System.out.println(e); 
            return false;
        } finally {
            try {
                if (con != null) {
                    con.close();
                }

                if (pst != null) {
                    pst.close();
                }
            } catch (Exception e) {

            }
        }
        
        
        
    }
    
    public boolean deleteStudent(UndergraduateDetails u){
        try{
            con = (Connection) DriverManager.getConnection(url, username, password);
            String query = "DELETE FROM undergratz_details WHERE  Std_Id="+u.getStd_Id();
            pst = (com.mysql.jdbc.PreparedStatement) con.prepareStatement(query);

            pst.executeUpdate();
            return true;
            
        } catch (Exception e) {
            System.out.println(e); 
            return false;
        } finally {
            try {
                if (con != null) {
                    con.close();
                }

                if (pst != null) {
                    pst.close();
                }
            } catch (Exception e) {

            }
        }
        
        
        
    }

    
    public boolean updatePStudent(PostgraduateDetails p){
        try{
            con = (Connection) DriverManager.getConnection(url, username, password);
            String query = "UPDATE postgratz_details SET Std_Id='"+p.getStd_Id()+"',Full_Name='"+p.getFull_Name()+"',DOB='"+p.getDOB()+"',Gender='"+p.getGender()+"',Address='"+p.getAddress()+"',Email='"+p.getEmail()+"',Contact_No='"+p.getContact_No()+"',Qualifications='"+p.getQualifications()+"',Reg_Month='"+p.getReg_Month()+"' WHERE Std_Id="+p.getStd_Id();
            pst = (com.mysql.jdbc.PreparedStatement) con.prepareStatement(query);

            pst.executeUpdate();
            return true;
            
        } catch (Exception e) {
            System.out.println(e); 
            return false;
        } finally {
            try {
                if (con != null) {
                    con.close();
                }

                if (pst != null) {
                    pst.close();
                }
            } catch (Exception e) {

            }
        }
        
        
        
    }
    
    public boolean deletePStudent(PostgraduateDetails p){
        try{
            con = (Connection) DriverManager.getConnection(url, username, password);
            String query = "DELETE FROM postgratz_details WHERE  Std_Id="+p.getStd_Id();
            pst = (com.mysql.jdbc.PreparedStatement) con.prepareStatement(query);

            pst.executeUpdate();
            return true;
            
        } catch (Exception e) {
            System.out.println(e); 
            return false;
        } finally {
            try {
                if (con != null) {
                    con.close();
                }

                if (pst != null) {
                    pst.close();
                }
            } catch (Exception e) {

            }
        }
        
        
        
    }
    
    boolean addLectures(SCLecDetails ud) {
        try {

            con = DriverManager.getConnection(url, username, password);
            String query = "INSERT INTO sclectures(Lec_Id,Name,Sub_Code,Email,Tel_No)  values (?,?,?,?,?)";
            pst = con.prepareStatement(query);

            pst.setInt(1, ud.getLec_Id());
            pst.setString(2, ud.getName());
            pst.setString(3, ud.getSub_Code());
            pst.setString(4, ud.getEmail());
            pst.setString(5, ud.getTel_No());
            
            
            
            
            pst.executeUpdate();
            return true;
        } catch (Exception e) {
            System.out.println(e);
            return false;
        } finally {
            try {
                if (con != null) {
                    con.close();
                }

                if (pst != null) {
                    pst.close();
                }
            } catch (Exception e) {
   
            }
        }
    }
    
    ArrayList<SCLecDetails> getLecture() {
        try {
            ArrayList<SCLecDetails> list = new ArrayList<SCLecDetails>();
            con = (Connection) DriverManager.getConnection(url, username, password);
            String query = "SELECT * FROM sclectures";
            pst = (PreparedStatement) con.prepareStatement(query);

            rs = pst.executeQuery();
            
            while (rs.next()) {
                SCLecDetails ud = new SCLecDetails();
                ud.setLec_Id(rs.getInt(1));
                ud.setName(rs.getString(2));
                ud.setSub_Code(rs.getString(3));
                ud.setEmail(rs.getString(4));
                ud.setTel_No(rs.getString(5));
               
                
                list.add(ud);
                
            }
            return list;

        } catch (Exception e) {
            System.out.println(e);
            return null;
        } finally {
            try {
                if (con != null) {
                    con.close();
                }

                if (pst != null) {
                    pst.close();
                }
            } catch (Exception e) {

            }
        }
    }
    
     boolean addscssecondsemsub(SCSSecondSubDetails pd) {
        try {

            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/nsbmdb", "root", "");
            String query = "INSERT INTO scusecond_sem(Std_Id,Subject1,Subject2,Subject3,Subject4)  values (?,?,?,?,?)";
            pst = con.prepareStatement(query);
            pst.setString(1, pd.getStd_Id());
            pst.setString(2, pd.getSubject1());
            pst.setString(3, pd.getSubject2());
            pst.setString(4, pd.getSubject3());
            pst.setString(5, pd.getSubject4());
            

            pst.executeUpdate();
            return true;

        } catch (Exception e) {
            System.out.println(e);
            return false;
        } finally {
            try {
                if (con != null) {
                    con.close();
                }

                if (pst != null) {
                    pst.close();
                }
            } catch (Exception e) {

            }
        }
     }
     
     boolean addscsfirstsemsub(SCSfirstSubDetails pd) {
        try {

            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/nsbmdb", "root", "");
            String query = "INSERT INTO scufirst_sem(Std_Id,fSubject1,fSubject2,fSubject3,fSubject4,sSubject1,sSubject2,sSubject3,sSubject4)  values (?,?,?,?,?,?,?,?,?)";
            pst = con.prepareStatement(query);
            pst.setString(1, pd.getStd_Id());
            pst.setString(2, pd.getfSubject1());
            pst.setString(3, pd.getfSubject2());
            pst.setString(4, pd.getfSubject3());
            pst.setString(5, pd.getfSubject4());
            pst.setString(6, pd.getsSubject1());
            pst.setString(7, pd.getsSubject2());
            pst.setString(8, pd.getsSubject3());
            pst.setString(9, pd.getsSubject4());
            

            pst.executeUpdate();
            return true;

        } catch (Exception e) {
            System.out.println(e);
            return false;
        } finally {
            try {
                if (con != null) {
                    con.close();
                }

                if (pst != null) {
                    pst.close();
                }
            } catch (Exception e) {

            }
        }
     }
     
     
     
     public boolean updatesclectures(SCLecDetails p){
        try{
            con = (Connection) DriverManager.getConnection(url, username, password);
            String query = "UPDATE sclectures SET Lec_Id="+p.getLec_Id()+",Name='"+p.getName()+"',Sub_Code='"+p.getSub_Code()+"',Email='"+p.getEmail()+"',Tel_No='"+p.getTel_No()+"' WHERE Lec_Id="+p.getLec_Id();
            pst = (com.mysql.jdbc.PreparedStatement) con.prepareStatement(query);

            pst.executeUpdate();
            return true;
            
        } catch (Exception e) {
            System.out.println(e); 
            return false;
        } finally {
            try {
                if (con != null) {
                    con.close();
                }

                if (pst != null) {
                    pst.close();
                }
            } catch (Exception e) {

            }
        }
     }
     
     public boolean deletesclectures(SCLecDetails p){
        try{
            con = (Connection) DriverManager.getConnection(url, username, password);
            String query = "DELETE FROM sclectures WHERE  Lec_Id="+p.getLec_Id();
            pst = (com.mysql.jdbc.PreparedStatement) con.prepareStatement(query);

            pst.executeUpdate();
            return true;
            
        } catch (Exception e) {
            System.out.println(e); 
            return false;
        } finally {
            try {
                if (con != null) {
                    con.close();
                }

                if (pst != null) {
                    pst.close();
                }
            } catch (Exception e) {

            }
        }
        
        
        
    }
     
     boolean addInstructors(SCInstructorDetails ud) {
        try {

            con = DriverManager.getConnection(url, username, password);
            String query = "INSERT INTO scinstructers(Instructer_Id,Name,Sub_Code,Email,Tel_No)  values (?,?,?,?,?)";
            pst = con.prepareStatement(query);

            pst.setInt(1, ud.getInstructer_Id());
            pst.setString(2, ud.getName());
            pst.setString(3, ud.getSub_Code());
            pst.setString(4, ud.getEmail());
            pst.setString(5, ud.getTel_No());
            
            
            
            
            pst.executeUpdate();
            return true;
        } catch (Exception e) {
            System.out.println(e);
            return false;
        } finally {
            try {
                if (con != null) {
                    con.close();
                }

                if (pst != null) {
                    pst.close();
                }
            } catch (Exception e) {
   
            }
        }
    }
    
    ArrayList<SCInstructorDetails> getInstructor() {
        try {
            ArrayList<SCInstructorDetails> list = new ArrayList<SCInstructorDetails>();
            con = (Connection) DriverManager.getConnection(url, username, password);
            String query = "SELECT * FROM scinstructers";
            pst = (PreparedStatement) con.prepareStatement(query);

            rs = pst.executeQuery();
            
            while (rs.next()) {
                SCInstructorDetails ud = new SCInstructorDetails();
                ud.setInstructer_Id(rs.getInt(1));
                ud.setName(rs.getString(2));
                ud.setSub_Code(rs.getString(3));
                ud.setEmail(rs.getString(4));
                ud.setTel_No(rs.getString(5));
               
                
                list.add(ud);
                
            }
            return list;

        } catch (Exception e) {
            System.out.println(e);
            return null;
        } finally {
            try {
                if (con != null) {
                    con.close();
                }

                if (pst != null) {
                    pst.close();
                }
            } catch (Exception e) {

            }
        }
    }
     
      public boolean updatescinstructors(SCInstructorDetails p){
        try{
            con = (Connection) DriverManager.getConnection(url, username, password);
            String query = "UPDATE scinstructers SET Instructer_Id="+p.getInstructer_Id()+",Name='"+p.getName()+"',Sub_Code='"+p.getSub_Code()+"',Email='"+p.getEmail()+"',Tel_No='"+p.getTel_No()+"' WHERE Instructer_Id="+p.getInstructer_Id();
            pst = (com.mysql.jdbc.PreparedStatement) con.prepareStatement(query);

            pst.executeUpdate();
            return true;
            
        } catch (Exception e) {
            System.out.println(e); 
            return false;
        } finally {
            try {
                if (con != null) {
                    con.close();
                }

                if (pst != null) {
                    pst.close();
                }
            } catch (Exception e) {

            }
        }
     }
     
     public boolean deletescinstructors(SCInstructorDetails p){
        try{
            con = (Connection) DriverManager.getConnection(url, username, password);
            String query = "DELETE FROM scinstructers WHERE  Instructer_Id="+p.getInstructer_Id();
            pst = (com.mysql.jdbc.PreparedStatement) con.prepareStatement(query);

            pst.executeUpdate();
            return true;
            
        } catch (Exception e) {
            System.out.println(e); 
            return false;
        } finally {
            try {
                if (con != null) {
                    con.close();
                }

                if (pst != null) {
                    pst.close();
                }
            } catch (Exception e) {

            }
        }
        
        
        
    }
     
     boolean addSCSecondSemResults(SecondSemResultDetails pd) {
        try {

            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/nsbmdb", "root", "");
            String query = "INSERT INTO scsecond_semresults(Std_Id,CSubject1,CResult1,CSubject2,CResult2,CSubject3,CResult3,OSubject1,OResult1,OSubject2,OResult2,OSubject3,OResult3,OSubject4,OResult4)  values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            pst = con.prepareStatement(query);

            pst.setString(1, pd.getStd_Id());
            pst.setString(2, pd.getCSubject1());
            pst.setString(3, pd.getCResult1());
            pst.setString(4, pd.getCSubject2());
            pst.setString(5, pd.getCResult2());
            pst.setString(6, pd.getCSubject3());
            pst.setString(7, pd.getCResult3());
            pst.setString(8, pd.getOSubject1());
            pst.setString(9, pd.getOResult1());
            pst.setString(10, pd.getOSubject2());
            pst.setString(11, pd.getOResult2());
            pst.setString(12, pd.getOSubject3());
            pst.setString(13, pd.getOResult3());
            pst.setString(14, pd.getOSubject4());
            pst.setString(15, pd.getOResult4());
            
           

            pst.executeUpdate();
            return true;

        } catch (Exception e) {
            System.out.println(e);
            return false;
        } finally {
            try {
                if (con != null) {
                    con.close();
                }

                if (pst != null) {
                    pst.close();
                }
            } catch (Exception e) {

            }
        }
    }
     
     boolean addSCFirstSemResults(FirstSemResultDetails pd) {
        try {

            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/nsbmdb", "root", "");
            String query = "INSERT INTO scfirst_semresults(Std_Id,FCSubject1,FCResult1,FCSubject2,FCResult2,FCSubject3,FCResult3,FOSubject1,FOResult1,FOSubject2,FOResult2,FOSubject3,FOResult3,FOSubject4,FOResult4,CSubject1,CResult1,CSubject2,CResult2,CSubject3,CResult3,OSubject1,OResult1,OSubject2,OResult2,OSubject3,OResult3,OSubject4,OResult4)  values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            pst = con.prepareStatement(query);

            pst.setString(1, pd.getStd_Id());
            pst.setString(2, pd.getFCSubject1());
            pst.setString(3, pd.getFCResult1());
            pst.setString(4, pd.getFCSubject2());
            pst.setString(5, pd.getFCResult2());
            pst.setString(6, pd.getFCSubject3());
            pst.setString(7, pd.getFCResult3());
            pst.setString(8, pd.getFOSubject1());
            pst.setString(9, pd.getFOResult1());
            pst.setString(10, pd.getFOSubject2());
            pst.setString(11, pd.getFOResult2());
            pst.setString(12, pd.getFOSubject3());
            pst.setString(13, pd.getFOResult3());
            pst.setString(14, pd.getFOSubject4());
            pst.setString(15, pd.getFOResult4());
             pst.setString(16, pd.getCSubject1());
            pst.setString(17, pd.getCResult1());
            pst.setString(18, pd.getCSubject2());
            pst.setString(19, pd.getCResult2());
            pst.setString(20, pd.getCSubject3());
            pst.setString(21, pd.getCResult3());
            pst.setString(22, pd.getOSubject1());
            pst.setString(23, pd.getOResult1());
            pst.setString(24, pd.getOSubject2());
            pst.setString(25, pd.getOResult2());
            pst.setString(26, pd.getOSubject3());
            pst.setString(27, pd.getOResult3());
            pst.setString(28, pd.getOSubject4());
            pst.setString(29, pd.getOResult4());
            
           

            pst.executeUpdate();
            return true;

        } catch (Exception e) {
            System.out.println(e);
            return false;
        } finally {
            try {
                if (con != null) {
                    con.close();
                }

                if (pst != null) {
                    pst.close();
                }
            } catch (Exception e) {

            }
        }
    }
    
}
