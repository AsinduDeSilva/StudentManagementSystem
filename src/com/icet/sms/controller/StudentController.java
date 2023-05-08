package com.icet.sms.controller;

import com.icet.sms.db.DBConnction;
import com.icet.sms.db.List;
import com.icet.sms.model.Student;


public class StudentController {
    public static boolean addStudent(Student student){
        return DBConnction.getInstance().getStudentList().add(student);
    } 
    public static boolean contains(String id){
        return DBConnction.getInstance().getStudentList().contains(new Student(id,"",0,0));
    }   
    public static Student[] getAllStudents(){
        Object[] objectArray=DBConnction.getInstance().getStudentList().toArray();
        Student[] studentArray=new Student[objectArray.length];
        for(int i=0; i<objectArray.length; i++){
            studentArray[i]=(Student)objectArray[i];       
        }
        return studentArray;
    }
    public static Student getStudent(String id){
        return DBConnction.getInstance().getStudentList().get(new Student(id,"",0,0));
    }
    public static boolean deleteStudent(Student student){
        return DBConnction.getInstance().getStudentList().remove(student);
    }
    public static boolean updateStudent(Student student){
        return DBConnction.getInstance().getStudentList().set(student);
    } 
}


