public class Course{
  private int courseNum;
  private String courseName;
  private String teacherName;

  public Course(){
    courseNum = 0;
    courseName = "";
    teacherName = "";
  }
  public Course(int Course){
    courseNum = Course;
    courseName = "";
    teacherName = "";
  }
  public Course(int Course, String courseName){
    this.courseNum = Course;
    this.courseName = courseName;
    teacherName = "";
  }
  public Course(String teacherName){
    courseNum = 0;
    courseName = "";
    this.teacherName = teacherName;
  }
  public Course(int courseNum, String teacherName, String courseName){
    this.courseNum = courseNum;
    this.courseName = courseName;
    this.teacherName = teacherName;
  }
}
