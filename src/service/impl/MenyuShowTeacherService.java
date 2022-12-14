package service.impl;

import bean.Config;
import bean.Teacher;
import service.menyu.inter.MenyuShowTeachersInter;

public class MenyuShowTeacherService implements MenyuShowTeachersInter {
    @Override
    public void processLogic() {
        Teacher[] allTeachers= Config.instance().getTeachers();
        for(int i=0;i<allTeachers.length;i++){
            System.out.println(allTeachers[i]);
        }
    }
}
