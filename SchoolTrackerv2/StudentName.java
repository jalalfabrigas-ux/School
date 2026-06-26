package SchoolTrackerv2;

public class StudentName{
    private String studentName;

    public StudentName(String studentName){
        this.studentName=studentName;
    }   public String getName(){
        return studentName;
    }   public void setName(String studentName){
        this.studentName=studentName;
    }
}