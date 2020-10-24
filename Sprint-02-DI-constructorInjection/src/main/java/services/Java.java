package services;

import com.interfaces.Course;
import com.interfaces.ExtraSessions;

public class Java implements Course {

    OfficeHours officeHours;
    ExtraSessions extraSessions;

    public Java(OfficeHours officeHours) {
        this.officeHours = officeHours;
    }

    @Override
    public void getTeachingHours() {
        System.out.println("Weekly Teaching Hours : " + (20 + officeHours.getHours()));
    }
}
