package school;

public class Student {
    String name;
    int g1, g2, g3;
    public Student(String name, int g1, int g2, int g3) {
        this.name = name;
        this.g1 = g1;
        this.g2 = g2;
        this.g3 = g3;
    }   public double getAverage() {
        return (g1 + g2 + g3) / 3.0;
    }   public String getRemarks() {
        if (getAverage() >= 75) {
            return "PASSED";
        } else {
            return "FAILED";
        }
    }
}