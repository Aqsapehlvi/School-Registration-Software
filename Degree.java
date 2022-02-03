import Univ.*;
import java.util.*;


import java.io.FileWriter;
import java.util.ArrayList;

public abstract class Degree {
    String title;
    ArrayList<Course> listOfRequiredCourseCodes;  //this should probably be an ArrayList<Course>

    public Degree() {
        this.title = null;
        this.listOfRequiredCourseCodes = new ArrayList<>();
    }


    public void setDegreeTitle(String title) {
        if (title != null && !title.isEmpty())
            this.title = title;
    }
    public String getDegreeTitle() { return this.title; }

    public void setRequiredCourses(ArrayList<Course> listOfRequiredCourseCodes) {
        if (listOfRequiredCourseCodes != null && !listOfRequiredCourseCodes.isEmpty())
            this.listOfRequiredCourseCodes = listOfRequiredCourseCodes;
    }


     public ArrayList<Course> getRequiredCourses()
        {
 //needs to be implemented.
        	/***algorithm
				for each course code in listOfRequiredCourseCodes:
				     find the course in the course catalog
				     add the found course to an arraylist
			     return the arraylist

        	**/

            return new ArrayList<Course>();
        }


    @Override
    public abstract String toString();
    @Override
    public abstract boolean equals(Object o);
    @Override
    public abstract int hashCode();

}
