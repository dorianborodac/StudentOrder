package edu.javacourse.studentorder.validator;

import edu.javacourse.studentorder.domain.Child;
import edu.javacourse.studentorder.domain.register.CityRegisterCheckerResponse;
import edu.javacourse.studentorder.domain.Person;
import edu.javacourse.studentorder.domain.Adult;
import edu.javacourse.studentorder.exception.CityRegisterException;

public class FakeCityRegisterChecker implements CityRegisterChecker
{
    private static final String GOOD_1 = "1000";
    private static final String GOOD_2 = "2000";
    private static final String BAD_1 = "1001";
    private static final String BAD_2 = "2001";
    private static final String ERROR_1 = "1002";
    private static final String ERROR_2 = "2002";
    public CityRegisterCheckerResponse checkPerson(Person person)
    throws CityRegisterException
    {
        CityRegisterCheckerResponse res = new CityRegisterCheckerResponse();
        //answer if transfer object is ADULT or CHILD
        //instanceof - apartine obiectul dat clasei ADULT
        if (person instanceof Adult){
            //want to see Person Object like a - Adult
            Adult t = (Adult) person;
            //comparam 2 obiecte equals()
            String ps = t.getPassportSeria();

            if(ps.equals(GOOD_1) || ps.equals(GOOD_2)){

                res.setExisting(true);
                res.setTemporal(false);
            }
            if(ps.equals(BAD_1) || ps.equals(BAD_2)){
                res.setExisting(false);
            }
            if(ps.equals(ERROR_1) || ps.equals(ERROR_2)){
                CityRegisterException ex = new CityRegisterException("FAKE EROR" + ps);
                throw ex;
            }
        }
        if(person instanceof Child){
            res.setExisting(true);
            res.setTemporal(true);
        }
        System.out.println(res);
        return res;
    }
}
