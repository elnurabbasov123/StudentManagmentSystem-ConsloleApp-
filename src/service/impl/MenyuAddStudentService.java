package service.impl;

import bean.Config;
import bean.Student;
import service.menyu.inter.MenyuAddStudentServiceInter;

import java.util.Scanner;

public class MenyuAddStudentService  implements MenyuAddStudentServiceInter {
    @Override
    public void processLogic() {
        System.out.println("Enter name :");
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();

        System.out.println("Enter surname:");
        Scanner sc2=new Scanner(System.in);
        String surname=sc2.nextLine();

        Student s=new Student();
        s.setName(name);
        s.setSurname(surname);

        Config.instance().appendStudent(s);
        System.out.println("Student added");
    }
}
