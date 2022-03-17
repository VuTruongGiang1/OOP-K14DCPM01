package baitap;

public class Student {
    //thuộc tính -data - trạng thái
    boolean gioiTinh;
    float tuoi;
    String name;
    String khoa;
    double diemTB;

    //phương pháp - functions - hành vi 
    public Student(){
        this.name = "Tuấn";
        this.tuoi = 20;
        this.khoa = "CNTT";
        this.gioiTinh = false;
        this.diemTB = 4.5;
    }

    public Student(boolean gioiTinh, String name, String khoa, double diemTB, float tuoi){
        this.name = name;
        this.tuoi = tuoi;
        this.khoa = khoa;
        this.gioiTinh = gioiTinh;
        this.diemTB = diemTB;
    }

    void hoc(){
        System.out.println("Hoc.....");
    }

    void thi(){
        System.out.println("Thi......");
    }

    void dangKyMonHoc(){
        System.out.println();
    }
}
