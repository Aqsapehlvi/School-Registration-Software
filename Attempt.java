import Univ.*;

public class Attempt{

  private String AttemptGrade;
  private String SemesterTaken;
  private Course CourseAttempted;

    public Attempt(Attempt Attempt){

     this.AttemptGrade = null;
     this.SemesterTaken = null;
     this.CourseAttempted = null;

    }


    public void setAttemptGrade(String grade){
          this.AttemptGrade = grade;

    } // a number, P, F, INC or MNR

    String getAttemptGrade(){ return AttemptGrade; }

    public void setSemesterTaken(String semester){
          this.SemesterTaken = semester;
    }

    String getSemesterTaken(){ return SemesterTaken; }

    public void setCourseAttempted(Course theCourse) {
          this.CourseAttempted = theCourse;
    }

    Course getCourseAttempted(){ return CourseAttempted; }
}
