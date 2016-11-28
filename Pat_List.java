/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database_demo;

/**
 *
 * @author mackansari
 */
public class Pat_List {
    
    
    private int Patient_ID;
    private String Pat_FName;
    private String Pat_MName;
    private String Pat_LName;
    private  String Pat_StreetAddrs;
    private String Pat_City;
    private String Pat_State; 
    private String Pat_Height; 
    private  String Pat_Weight;
    private  String Pat_DOB;
          
    public Pat_List(int Patient_ID,String Pat_FName,String Pat_MName,String Pat_LName,String Pat_StreetAddrs,String Pat_City,String Pat_State,String Pat_Height, String Pat_Weight, String Pat_DOB)
    {
            this.Patient_ID = Patient_ID;
            this.Pat_FName = Pat_FName;
            this.Pat_MName = Pat_MName;
            this.Pat_LName = Pat_LName;
            this.Pat_StreetAddrs = Pat_StreetAddrs;
            this.Pat_City = Pat_City;
            this.Pat_State = Pat_State;
            this.Pat_Weight = Pat_Weight;
            this.Pat_Height = Pat_Height;
            this.Pat_DOB = Pat_DOB;
           
                   
    }

    Pat_List(int aInt, String string, String string0, String string1, String string2, String string3, String string4, String string5, String string6, String string7, boolean add) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public int getPatient_ID()
    {
        return Patient_ID;
    }
    
    public String getPat_FName()
            
    {       
        return Pat_FName;
    }
    
    public String getPat_MName()
    {
        return Pat_MName;
       
    }
    
    public String getPat_LName()
    {
        return Pat_LName;
        
    }  
    
    public String getPat_StreetAddrs()
    {
        return Pat_StreetAddrs;
    }
            
    public String getPat_City()
    {
        return Pat_City;
    }
    
    public String getPat_State()
    {
        return Pat_State;
        
    }
    
    public String getPat_Weight()
    {
        return Pat_Weight;
    }
    
    public String getPat_Height()
    {
        return Pat_Height;
    }
       }
