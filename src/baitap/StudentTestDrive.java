package baitap;

public class StudentTestDrive {
    public static void main(String[] args) {
        Student tuanStudent = new Student();
        tuanStudent.hoc();

        Student giangStudent = new Student();
        giangStudent.thi();

        Student xyzStudent = new Student();
        xyzStudent.dangKyMonHoc();

        Student minhStudent = new Student(false, "Lý Tiểu Minh", "CNTT", 5.0, 20);
        
    }
}
