package services;

import com.interfaces.Mentor;

public class PartTimeMentor implements Mentor {
    @Override
    public void createAccount(){
        System.out.println("part time account is created");
    }
}
