package edu.javacourse.studentorder.validator;

import edu.javacourse.studentorder.domain.children.AnswerChildren;
import edu.javacourse.studentorder.domain.StudentOrder;

public class ChildValidator {
   public AnswerChildren checkChildren(StudentOrder so){
        System.out.println("child");
        AnswerChildren ans = new AnswerChildren();
        return ans;
    }
}
