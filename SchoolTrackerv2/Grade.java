package SchoolTrackerv2;

public class Grade extends StudentName{
    private double grade;
    public Grade(String studentName,double grade){
        super(studentName);
        this.grade=grade;
    }   public double getGrade(){
        return grade;
    }   public void setGrade(double grade){
        this.grade=grade;
    }

    
}
