package edu.javacourse.studentorder;

import edu.javacourse.studentorder.domain.*;
import edu.javacourse.studentorder.domain.children.AnswerChildren;
import edu.javacourse.studentorder.domain.register.AnswerCityRegister;
import edu.javacourse.studentorder.domain.student.AnswerStudent;
import edu.javacourse.studentorder.domain.wedding.AnswerWedding;
import edu.javacourse.studentorder.mail.MailSender;
import edu.javacourse.studentorder.validator.ChildValidator;
import edu.javacourse.studentorder.validator.CityRegisterValidator;
import edu.javacourse.studentorder.validator.StudentValidator;
import edu.javacourse.studentorder.validator.WeddingValidator;

public class StudentOrderValidator {

    private CityRegisterValidator cityRegisterVal;
    private WeddingValidator weddingVal;
    private ChildValidator childVal;
    private StudentValidator studentVal;
    private MailSender mailSender;

    public StudentOrderValidator(){
        cityRegisterVal = new CityRegisterValidator();
        weddingVal = new WeddingValidator();
        childVal = new ChildValidator();
        studentVal = new StudentValidator();
        mailSender = new MailSender();
    }

    public static void main(String[] args){
       StudentOrderValidator sov = new StudentOrderValidator();
       sov.checkAll();
    }
    public void checkAll(){

            StudentOrder[] soArray = readStudentOrders();

        for (int i = 0; i < soArray.length; i++) {
            checkOneOrder(soArray[i]);
        }

    }

    public StudentOrder[] readStudentOrders(){
        StudentOrder[] soArray = new StudentOrder[3];
        for(int i = 0;i<soArray.length;i++){
            soArray[i] =  SaveStudentOrder.buildStudentOrder(i);
        }
        return soArray;
    }

    public void checkOneOrder(StudentOrder so){
        AnswerCityRegister cityAnswer = checkCityRegister(so);
//        AnswerWedding wedAnswer = checkWedding(so);
//        AnswerStudent studAnswer = checkStudent(so);
//        AnswerChildren childAnswer = checkChildren(so);
//        sendMail(so);
    }



    public AnswerCityRegister checkCityRegister(StudentOrder so){
        return cityRegisterVal.checkCityRegister(so);
    }

    public AnswerWedding checkWedding(StudentOrder so){
       return weddingVal.checkWedding(so);
    }
    public AnswerChildren checkChildren(StudentOrder so){
        return childVal.checkChildren(so);
    }
    public AnswerStudent checkStudent(StudentOrder so){
       return studentVal.checkStudent(so);
    }
    public void sendMail(StudentOrder so){
        mailSender.sendMail(so);
    }

}
