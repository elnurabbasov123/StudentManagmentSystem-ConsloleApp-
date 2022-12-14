package service.inter;

import bean.Config;
import service.inter.Process;

public interface SaveableProcess extends Process {
    public default void process(){
        processLogic();
        Config.save();
    }
}
