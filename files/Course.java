package files;

import java.util.ArrayList;

/**
 * Course Class
 * @see Comparable
 * @author Rıfat Arifoğlu
 */

public class Course implements Comparable<Course>{
    
    //Variables
    private int courseID;
    private String courseName;
    private ArrayList<Student> enrolledStudents;

    /**
     * Constructor
     * @param courseID   ID of the course
     * @param courseName Name of the course
     */
    public Course(int courseID, String courseName){
        setCourseID(courseID);
        setCourseName(courseName);
        enrolledStudents = new ArrayList<>();
    }

    /**
     * Compare to interface
     * @param o Course who is going compared
     * @return  Difference of two courses' IDs
     */
    @Override
    public int compareTo(Course o) {
        return this.getCourseID() - o.getCourseID();
    }

    /**
     * To String method
     * @return String version of this object
     */
    @Override
    public String toString() {
        String output = "";
        output += "ID: " + this.getCourseID() + "\n";
        output += "Name: " + this.getCourseName();

        if(!this.getEnrolledStudents().isEmpty()){
            output += "\nStudents:";
            for (Student student : this.getEnrolledStudents()) {
                output += "\n" + student;
            }
        }

        return output;
    }

    /**
     * Default Constructor
     */
    public Course(){
        setCourseID(0);
        setCourseName("");
    }

    /**
     * @return ID of the course
     */
    public int getCourseID() {
        return courseID;
    }

    /**
     * @return Name of the course
     */
    public String getCourseName() {
        return courseName;
    }

    /**
     * @return {@code ArrayList} of the enrolled students
     */
    public ArrayList<Student> getEnrolledStudents() {
        return enrolledStudents;
    }

    /**
     * @param courseID ID of the course
     */
    public void setCourseID(int courseID) {
        this.courseID = courseID;
    }

    /**
     * @param courseName Name of the course
     */
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
}
