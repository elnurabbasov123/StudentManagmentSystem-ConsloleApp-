package service.menyu.impl;

import service.menyu.inter.MenyuRegisterServiceInter;
import service.menyu.inter.MenyuService;

public class MenyuRegisterService implements MenyuRegisterServiceInter {
    @Override
    public void process() {
        System.out.println("Register");
    }
}
