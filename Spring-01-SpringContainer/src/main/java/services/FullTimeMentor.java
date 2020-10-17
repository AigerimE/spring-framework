package service;

import interfaces.Mentor;

public class FullTimeMentor implements Mentor {
    @Override
    public void createAccount(){
        System.out.println("part time account is created");
    }
}
