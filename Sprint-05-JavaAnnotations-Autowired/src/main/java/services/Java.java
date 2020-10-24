package services;

import com.interfaces.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Java implements Course {

    @Autowired
    private OfficeHours officeHours;

    //Constructor Injection
 /* @Autowired
    public Java(OfficeHours officeHours) {
        this.officeHours = officeHours;
    }*/
  //setter injection

/*@Autowired
    public void setOfficeHours(OfficeHours officeHours) {
        this.officeHours = officeHours;
    }*/

    @Override
    public void getTeachingHours(){
        System.out.println("Weekly teaching: " + (30 + officeHours.getOfficeHours()));

    }
}
