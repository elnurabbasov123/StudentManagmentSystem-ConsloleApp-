package util;

import bean.Config;
import service.impl.*;
import service.inter.Process;

public enum Menyu {
    LOGIN(1,"Login",new MenyuLoginService()),
    REGISTER(2,"Register",new MenyuRegisterService()),
    ADD_TEACHER(3,"Add Teacher",new MenyuAddTeacherService()),
    ADD_STUDENT(4,"Add Student",new MenyuAddStudentService()),
    SHOW_ALL_TEACHER(5,"Show all Teachers",new MenyuShowTeacherService()),
    SHOW_ALL_STUDENT(6,"Show all Students",new MenyuShowStudentService()),
    UNKNOWN;

    private String label;
    private Process service;
    private int number;

    Menyu(){

    }
    Menyu(int number, String label, Process service){
        this.label=label;
        this.service=service;
        this.number=number;
    }

    public String getLabel(){
        return label;
    }

    @Override
    public String toString() {
        return number+"."+label;
    }

    public void process(){
        service.process();
        MenyuUtil.showMenyu();
    }

    public int getNumber(){
        return this.number;
    }

    public static Menyu find(int number){
        Menyu[] menus=Menyu.values();
        for(int i=0;i<menus.length;i++){
            if(menus[i].getNumber()==number){
                return menus[i];
            }
        }
        return Menyu.UNKNOWN;
    }
    public static void showAllMenyu(){
        Menyu[] menus=Menyu.values();
        for(int i=0;i<menus.length;i++){
            if(menus[i]!=UNKNOWN) {
                if (menus[i] == LOGIN || menus[i]==REGISTER){
                        if(!Config.isLoggedIn()){
                    System.out.println(menus[i]);
                        }
                }else if (Config.isLoggedIn()){
                        System.out.println(menus[i]);
                }
            }
        }
    }
}
