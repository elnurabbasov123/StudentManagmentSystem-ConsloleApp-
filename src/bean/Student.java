package bean;

import java.io.Serializable;

public class Student extends Person {
    private String schoolName;
    private double sholarship;


    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public double getSholarship() {
        return sholarship;
    }

    public void setSholarship(double sholarship) {
        this.sholarship = sholarship;
    }


}
