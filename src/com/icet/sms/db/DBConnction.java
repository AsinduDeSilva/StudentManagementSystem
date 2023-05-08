package com.icet.sms.db;

import com.icet.sms.model.Student;

public class DBConnction {
    private List<Student> studentList;
    private static DBConnction dbConnection;
    
    private DBConnction(){
        studentList=new List<Student>();
    }
    public static DBConnction getInstance(){
        if(dbConnection==null){
            dbConnection=new DBConnction();
        }
        return dbConnection;
    }
    public List<Student> getStudentList(){
        return studentList;
    }   
}

