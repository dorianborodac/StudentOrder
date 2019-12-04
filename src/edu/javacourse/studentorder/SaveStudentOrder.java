package edu.javacourse.studentorder;

import edu.javacourse.studentorder.domain.other.Adult;
import edu.javacourse.studentorder.domain.StudentOrder;

public class SaveStudentOrder {
    public static void main(String[] args) {



       // buildStudentOrder();
//        StudentOrder so=new StudentOrder();
//        long ans = saveStudentOrder(so);
//        System.out.println(ans);
    }

    static long saveStudentOrder(StudentOrder studentOrder){
        long a = 2;
        System.out.println("savestundetorder");
        return a;
    }

   public  static StudentOrder buildStudentOrder(long id){
        StudentOrder so = new StudentOrder();
        so.setStudentOrderId(id);




       return so;
    }

}
