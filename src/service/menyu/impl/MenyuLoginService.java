package service.menyu.impl;

import bean.Config;
import service.menyu.inter.MenyuLoginServiceInter;
import service.menyu.inter.MenyuService;

import java.util.Scanner;

public class MenyuLoginService implements MenyuLoginServiceInter {
    @Override
    public void process() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Username: ");
        String userName=sc.nextLine();

        Scanner sc2=new Scanner(System.in);
        System.out.println("Password: ");
        String password=sc2.nextLine();

        if(!(userName.equals("user")&&password.equals("11111"))){
            throw  new IllegalArgumentException("user or password is invalid");
        }
        Config.setLoggedIn(true);
    }
}
