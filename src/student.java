public class student {
    private int studentNum;
    private String studentName;
    private String address;

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public int getStudentNum() {
        return studentNum;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentNum(int studentNum) {
        this.studentNum = studentNum;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public student(int studentNum, String studentName) {
        this.studentNum = studentNum;
    }

    public student(String studentName) {
        this.studentName = studentName;
    }

    public static void main(String[] args) {
        student s1 = new student(1, "hafsa");
        student s2 = new student(2, "saim");
        student s3 = new student(3, "xyz");

        student[] studentList = new student[3];
        studentList[0] = s1;
        studentList[1] = s1;
        studentList[2] = s3;

        System.out.println(studentList[0].getStudentNum());
        System.out.println(studentList[1].getStudentName());

    }
}
