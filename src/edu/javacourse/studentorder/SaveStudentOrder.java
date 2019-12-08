package edu.javacourse.studentorder;

import edu.javacourse.studentorder.domain.Address;
import edu.javacourse.studentorder.domain.Child;
import edu.javacourse.studentorder.domain.Adult;
import edu.javacourse.studentorder.domain.StudentOrder;

import java.time.LocalDate;

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
        so.setMarriageCertificateId("" + (1234560000 + id));
        so.setMarriageDate(LocalDate.of(2016, 7 ,4));
        so.setMarriageOffice("Departamentul ZACS");

       Address address = new Address("190000", "Cladirea 10", "12","1","123");

       Adult husband = new Adult("Patric","Vicotr", "Vladi",LocalDate.of(1997,8,24));
       husband.setPassportSeria(""+(1000 +id));
       husband.setPassportNumber(""+(100000 + id));
       husband.setIssueDate(LocalDate.of(2017,9,15));
       husband.setStudentId(""+(100000 + id));
       husband.setAddress(address);

       Adult wife = new Adult("Patric","Verona","Arca",LocalDate.of(1998,3,12));
       wife.setPassportSeria("" + (2000 + id));
       wife.setPassportNumber("" + (200000 + id));
       wife.setIssueDate(LocalDate.of(2018, 4, 5));
       wife.setIssueDepartment("Отдел милиции №" + id);
       wife.setStudentId("" + (200000 + id));
       wife.setAddress(address);
       // Ребенок
       Child child = new Child("Петрова", "Ирина", "Викторовна", LocalDate.of(2018, 6, 29));
       child.setCertificationNumber("" + (300000 + id));
       child.setIssueDate(LocalDate.of(2018, 7, 19));
       child.setIssueDepartment("ОТдел ЗАГС №" + id);
       child.setAddress(address);

       so.setHusband(husband);
       so.setWife(wife);
       so.setChild(child);




       return so;
    }

}
