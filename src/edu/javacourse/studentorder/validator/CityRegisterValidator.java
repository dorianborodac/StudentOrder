package edu.javacourse.studentorder.validator;

import edu.javacourse.studentorder.domain.AnswerCityRegister;
import edu.javacourse.studentorder.domain.StudentOrder;

public class CityRegisterValidator {

   public String hostName;
    String login;
    String pass;

    private CityRegisterChecker personChecker;

    public CityRegisterValidator() {
        personChecker = new RealCityRegisterChecker();
    }

    //transmite ca argument tipul edu.javacourse.studentorder.domain.StudentOrder penutr a verifica Numele Prenumele penutr verificare
    //metoda de tip AnsewerCityRegister care returneaza ceea ce verificam
      public  AnswerCityRegister checkCityRegister(StudentOrder so){

        personChecker.checkPerson(so.getHusband());
        personChecker.checkPerson(so.getWife());
        personChecker.checkPerson(so.getChild());

        AnswerCityRegister ans =  new AnswerCityRegister();
        return ans;
    }
}
