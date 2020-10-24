package services;

import org.springframework.stereotype.Component;

@Component
public class MockInterviewHours implements ExtraSessions{
    @Override
    public int getOfficeHours();
    return 9;
}
