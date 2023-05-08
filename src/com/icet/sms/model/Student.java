package com.icet.sms.model;

public class Student {
    private String id;
    private String name;
    private int prf;
    private int dbms;

    
    public Student(String id, String name, int prf, int dbms) {
        this.id = id;
        this.name = name;
        this.prf = prf;
        this.dbms = dbms;
    }
    public boolean equals(Object obj){
        return obj instanceof Student ? ((Student)obj).id.equals(this.id):false;
    }
    public String getId() {
        return id;
    } 
    public String getName() {
        return name;
    }   
    public int getPrf() {
        return prf;
    }   
    public int getDbms() {
        return dbms;
    }       
    public String toString(){
        return id;
    }
}
