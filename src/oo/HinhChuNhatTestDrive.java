package oo;

public class HinhChuNhatTestDrive {
    public static void main(String[] args) {
        HinhChuNhat hinhChuNhat = new HinhChuNhat();
        hinhChuNhat.setChieuDai(10);
        hinhChuNhat.setChieuRong(15);
        System.out.println("Dien tich: "+hinhChuNhat.tinhDienTich());
        System.out.println("Chu vi: "+hinhChuNhat.tinhChuVi());
    }
}
