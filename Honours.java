import java.util.*;
import Univ.*;

       public abstract class Honours extends Degree{
             protected static final double rqrdNumberOfCredits = 20.00;

          public Honours(){
            super();
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


           public ArrayList<Course> getRequiredCourses(ArrayList<Course> listOfRequiredCourseCodes)
              {

                   ArrayList <Course> required = new ArrayList<>();
       //needs to be implemented.
              	/***algorithm
      				for each course code in listOfRequiredCourseCodes:
      				     find the course in the course catalog
      				     add the found course to an arraylist
      			     return the arraylist

              	**/

                  return required;
              }


      public void meetsRequirements(){

      }


          public String toString(){
              String ret = null;
            return ret;
          }
          @Override
          public boolean equals(Object o){

              boolean ret = true;

              return ret;
          }

          @Override
          public int hashCode(){

               int ret= 0;

               return ret;
          }
       }
