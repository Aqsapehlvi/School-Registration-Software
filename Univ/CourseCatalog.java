package Univ;



import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;

public class CourseCatalog {

    private ArrayList<Course> courseCatalog;
    private ArrayList<String> Databsecopy;
    MyConnection c ;
    private String pwd;
    private String user;

    public CourseCatalog() {
        this.courseCatalog = new ArrayList<>();
        pwd = DBDetails.password;
        user = DBDetails.username;
        c = new MyConnection(user, pwd);

        initializeCatalog();

    }

    protected void setCourseCatalog(ArrayList<Course> courseCatalog) {
        this.courseCatalog = courseCatalog;
    }

    public ArrayList<Course> getCourseCatalog() { return this.courseCatalog; }

    public ArrayList<String> gettingdatabaasecopy(){
      return Databsecopy;

    }

    public void addCourse(String code, String credit, String name, String semester, String prereq) {

        c.addCourse(code,credit,name,semester,prereq);
        Course catalogCourse = new Course();
        catalogCourse.setCourseCode(code);
        catalogCourse.setCourseTitle(name);
        catalogCourse.setCourseCredit(Double.parseDouble(credit));
        catalogCourse.setsemesterOffered(semester);
        ArrayList<Course> preReqList = new ArrayList<>();

        if(prereq.contains(":")){
        String[] splitC;
        splitC = prereq.split(":");
        for (String s : splitC) {

              Course preReq = new Course();
              preReq.setCourseCode(s);
              preReqList.add(preReq);
            }
      }
      if(!prereq.contains(":")){
        Course pre = new Course();
        pre.setCourseCode(prereq);
        preReqList.add(pre);

        }


      catalogCourse.setPrerequisites(preReqList);

        if (!catalogCourse.getPrerequisites().isEmpty()) {
                ArrayList<Course> cat = catalogCourse.getPrerequisites();
                ListIterator<Course> iterPre = cat.listIterator();
                while (iterPre.hasNext()) {
                    Course preReq = iterPre.next();
                    for (Course containsCode : this.courseCatalog) {
                        if (containsCode.getCourseCode().equals(preReq.getCourseCode())) {
                            Course newC = new Course(containsCode);
                            iterPre.remove();
                            iterPre.add(newC);
                            break;
                        }
                    }
                }
                catalogCourse.setPrerequisites(cat);
            }
        }



    public void removeCourse(Course toRemove) {
        for (Course c : this.courseCatalog) {
            if (c.equals(toRemove)) {
                this.courseCatalog.remove(c);
                return;
            }
        }
        c.deleteCourse(toRemove.getCourseCode());
    }

    public Course findCourse(String courseCode) {
      System.out.println(courseCode);
      for (Course c : this.courseCatalog) {
        if (c.getCourseCode().equals(courseCode)) {

            return c;
        }


}
  return null;
    }

    public Boolean isEmpty() { return courseCatalog.isEmpty(); }





    public void initializeCatalog() {
            boolean fullyResetTables = true; //Set this to true if you wish to rebuild/reset your tables!
            PrepStudentScript initTables = new PrepStudentScript(fullyResetTables); //called to initialize our tables
          	c.repopulateCourses();
            ArrayList<String> fileContents = c.getAllCourses();
            this.Databsecopy = fileContents;
            int index = 0;
            while(index<=fileContents.size()-1){
                    System.out.println("index is "+ index);
                    Course fileCourse = new Course();
                    String[] n;
                    n = fileContents.get(index).split(",");

                    fileCourse.setCourseCode(n[0]);
                    fileCourse.setCourseTitle(n[2]);
                    fileCourse.setCourseCredit(Double.parseDouble(n[1]));
                    fileCourse.setsemesterOffered(n[3]);

                    ArrayList<Course> preReqList = new ArrayList<>();
                    if(n.length==5){
                      if(n[4].contains(":")){
                      String[] splitC;
                      splitC = n[4].split(":");
                      for (String s : splitC) {

                            Course preReq = new Course();
                            preReq.setCourseCode(s);
                            preReqList.add(preReq);
                          }
                        }
                        if(!n[4].contains(":")){
                          Course pre = new Course();
                          pre.setCourseCode(n[4]);
                          preReqList.add(pre);

              }
            }
                    fileCourse.setPrerequisites(preReqList);

                    this.courseCatalog.add(fileCourse);
                    index++;

              }

System.out.println("upto here");
            for (Course catalogCourse : this.courseCatalog) {
              	System.out.println("6.");
                if (!catalogCourse.getPrerequisites().isEmpty()) {
                    ArrayList<Course> cat = catalogCourse.getPrerequisites();
                    ListIterator<Course> iterPre = cat.listIterator();
                    while (iterPre.hasNext()) {
                      	System.out.println("5.");
                        Course preReq = iterPre.next();
                        for (Course containsCode : this.courseCatalog) {
                            if (containsCode.getCourseCode().equals(preReq.getCourseCode())) {
                                Course newC = new Course(containsCode);
                                iterPre.remove();
                                iterPre.add(newC);
                                break;
                            }
                        }
                    }
                    catalogCourse.setPrerequisites(cat);
                }
            }
            	System.out.println("Catalog done");
          }


}
