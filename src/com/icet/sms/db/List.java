package com.icet.sms.db;

public class List<T>{
    private Node start;
    
    public boolean add(T object){
        Node n1=new Node(object);
        if(start==null){
            start=n1;
        }else{
            Node temp=start;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=n1;
        }
        return true;
    }
    public boolean remove(int index){
        if(index>=0 && index<size()){
            if(index==0){
                start=start.next;
                return true;
            }
            Node temp=start;
            for(int i=1; i<index; i++){
                temp=temp.next;
            }
            temp.next=temp.next.next;
            return true;
        }
        return false;
    }
    public boolean remove(T object){
        return remove(search(object));
    }
    public int search(T object){
        int count=0;
        Node temp=start;
        while(temp!=null){
            if(temp.object.equals(object)){
                return count;
            }
            count++;
            temp=temp.next;
        }
        return -1;
    }
    public boolean contains(T object){
        return search(object)!=-1;
    }
    public boolean set(T object){
         return set(search(object),object);
    }
    public boolean set(int index,T object){
        if(index>=0 && index<size()){
            Node n1=new Node(object);
            if(index==0){
               n1.next=start.next;
               start=n1;
            }else{
                Node temp=start;
                int count=0;
                while(count<index-1){
                    temp=temp.next;
                    count++;
                }
                n1.next=temp.next.next;
                temp.next=n1;
            }
            return true;
        }
        return false;
    }
    public  Object[] toArray(){
        Object[] tempArray=new Object[size()];
        Node temp=start;
        for(int i=0; i<size(); i++){
            tempArray[i]=temp.object;
            temp=temp.next;
        }    
        return tempArray;
    }
    public T get(T object){
        Node temp=start;
        while(temp!=null){
            if(temp.object.equals(object)){
                return temp.object;
            }
            temp=temp.next;
        }
        return null;
    }
    public void printList(){
        System.out.print("[");
        Node temp=start;
        while(temp!=null){
            System.out.print(temp.object+", ");
            temp=temp.next;
        }
        System.out.println(start==null? "empty]":"\b\b]");
    }
    private int size(){
        int count=0;
        Node temp=start;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        return count;
    }
    
    class Node{
        private T object;
        private Node next;
        
        Node(T object){
            this.object=object;
        }
    }
}

