package services;

import interfaces.Course;
import interfaces.ExtraSessions;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

public class Java implements Course {
@Data

  private OfficeHours officeHours;

   /* public void setOfficeHours(OfficeHours officeHours) { //set + officeHours
        this.officeHours = officeHours;
    }

    public OfficeHours getOfficeHours() {
        return officeHours;
    }

    */

    @Override
    public void getTeachingHours() {
        System.out.println("Weekly Teaching Hours : " + (20 + officeHours.getHours()));
    }
}
