import Univ.*;
import java.util.*;

public class Student {

    private String first;
    private String last;
    private int studentNum;
    private ArrayList<Attempt> taken;
    private ArrayList<Course> havetotake;

    public Student() {
        this.first = null;
        this.last = null;
        this.studentNum = 0;
        taken = new ArrayList<Attempt>();
        havetotake = new ArrayList<Course>();
    }


    public Student(String f, String l, String id) {
        this.first = f;
        this.last = l;
        int i = Integer.parseInt(id);
        this.studentNum = i;
    }

    public void setFirstName(String first) {
        if (first != null && !first.isEmpty())
            this.first = first;
    }

    public void setLastName(String last) {
        if (last != null && !last.isEmpty())
            this.last = last;
    }

    public void setStudentNumber(int studentNum) {

            this.studentNum = studentNum;
            
    }

    public String getFullName() {
        String fullName;
        if (this.first == null && this.last == null) {
            return null;
        } else if (this.first == null) {
            fullName = this.last;
        } else if (this.last == null) {
            fullName = this.first;
        } else {
            fullName = this.first + " " + this.last;
        }
        return fullName;
    }

    public String getFirstName() { return this.first; }

    public String getLastName() { return this.last; }

    public Integer getStudentNumber() { return this.studentNum; }

    @Override
    public String toString() {
        String toString = "";
        if (this.first != null) {
            toString = ("First name: " + this.first + System.getProperty( "line.separator" ));
        }
        if (this.last != null) {
            toString += ("Last name: " + this.last + System.getProperty( "line.separator" ));
        }
        toString += ("Student number: " + this.studentNum + System.getProperty( "line.separator" ));

        return toString;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }

        if (!(o instanceof Student)) {
            return false;
        }

        Student student = (Student) o;
        if (!(this.first.equals(student.first))){
            return false;
        }
        if (!(this.last.equals(student.last))){
            return false;
        }
        return this.studentNum == student.studentNum;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + Objects.hashCode(this.first);
        hash = 37 * hash + Objects.hashCode(this.last);
        hash = 37 * hash + Objects.hashCode(this.studentNum);
        return hash;
    }


   public void setCourses(ArrayList<Course> havetotake) { this.havetotake = havetotake; }

    public Course getCourse(String courseCode, String semester) {
        for (Course c : this.havetotake) {
            if (c.getCourseCode() != null && c.getSemesterTaken() != null && c.getCourseCode().equals(courseCode) && c.getSemesterTaken().equals(semester)) {
                return c;
            }
        }
        return null;
    }

   public void setAttempt(ArrayList<Attempt> taken) { this.taken = taken; }


    public Attempt getAttempt(String courseCode, String semester) {
        for (Attempt c : this.taken) {
            if (c.getAttemptGrade() != null && c.getSemesterTaken() != null && c.getCourseAttempted().equals(courseCode) && c.getSemesterTaken().equals(semester)) {
                return c;
            }
        }
        return null;
    }
}
