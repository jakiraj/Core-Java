package collection_framework;

import java.util.LinkedList;

public class StudentLinkedList {

    public static void main(String[] args) {
        //student linkedlist
        LinkedList<Student> list = new LinkedList<Student>();
        
        //student create
        Student s1 = new Student("Jakir", "X", 101);
        Student s2 = new Student("Raj", "X", 101);
        Student s3 = new Student("Hossain", "X", 101);
        
        //adding student to the studentList
        list.add(s1);
        list.add(s2);
        list.add(s3);
        
        //information display
        for(Student s : list){
            System.out.println(s.id + " " + s.name + " " + s.className);
        }
    }
    
}
