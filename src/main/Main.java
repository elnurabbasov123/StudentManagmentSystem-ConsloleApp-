package main;

import bean.Config;
import util.Menyu;
import util.MenyuUtil;

public class Main {
    public static void main(String[] args) {
        Config.initialize();
        MenyuUtil.showMenyu();
    }
}
