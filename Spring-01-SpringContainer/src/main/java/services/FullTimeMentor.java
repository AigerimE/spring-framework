package services;

import com.interfaces.Mentor;

public class FullTimeMentor implements Mentor {
    @Override
    public void createAccount(){
        System.out.println("full time account is created");
    }
}
