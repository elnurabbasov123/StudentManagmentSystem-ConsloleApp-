package service.menyu.impl;

import bean.Config;
import bean.Student;
import bean.Teacher;
import service.menyu.inter.MenyuAddTeacherServiceInter;

import java.util.Scanner;

public class MenyuAddTeacherService implements MenyuAddTeacherServiceInter {
    @Override
    public void process() {
        System.out.println("Enter name :");
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();

        System.out.println("Enter surname :");
        Scanner sc2=new Scanner(System.in);
        String surname=sc2.nextLine();

        Teacher t=new Teacher();
        t.setName(name);
        t.setSurname(surname);

        Config.instance().appendTeacher(t);
        System.out.println("Teacher added");
    }
}
