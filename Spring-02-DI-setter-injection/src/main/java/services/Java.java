package services;

import com.interfaces.Course;
import lombok.Data;

@Data
public class Java implements Course {

  private OfficeHours extraSessions;

   /* public void setOfficeHours(OfficeHours officeHours) { //set + officeHours
        this.officeHours = officeHours;
    }

    public OfficeHours getOfficeHours() {
        return officeHours;
    }

    */

    @Override
    public void getTeachingHours() {
        System.out.println("Weekly Teaching Hours : " + (20 + extraSessions.getHours()));
    }
}
