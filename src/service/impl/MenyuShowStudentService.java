package service.impl;

import bean.Config;
import bean.Student;
import service.menyu.inter.MenyuShowStudentsInter;

public class MenyuShowStudentService implements MenyuShowStudentsInter {
    @Override
    public void processLogic() {
        Student[] allStudents= Config.instance().getStudents();
        for(int i=0;i<allStudents.length;i++){
            System.out.println(allStudents[i]);
        }
    }
}
