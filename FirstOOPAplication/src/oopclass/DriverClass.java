package oopclass;

import java.util.*;

class LMS{
    String StudentId,StudentPassword,course,AdminId,AdminPassword;
    int Payment;
    
    void studentaccount(){
       
    }
    void adminaccount(){
        
    }
    void payment(){
        
    }
}



public class DriverClass {
    public static void main(String[] args) {
     LMS student01 = new LMS();
     LMS admin01 = new LMS();
     LMS student02 = new LMS();
     
     student01.StudentId = "STD001";
     student02.StudentId = "STD002";
     admin01.AdminId = "ADM001";
    }
}
