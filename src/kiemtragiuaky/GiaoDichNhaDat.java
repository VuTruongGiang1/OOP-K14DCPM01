package kiemtragiuaky;

import java.util.Scanner;

public abstract class GiaoDichNhaDat {
    private int maGiaoDich;
    private String ngayGiaoDich;
    private Double donGia;
    private String loai;
    private Double dienTich, thanhTien;

    Scanner in = new Scanner(System.in);

    protected abstract void danhSachGiaoDich();

    protected void GiaoDich(){
        this.maGiaoDich = 0;
        this.ngayGiaoDich = "";
        this.donGia = (double) 0;
        this.loai = "";
        this.dienTich = (double) 0;
        this.thanhTien = (double) 0;
    }

    protected void GiaoDich(int ma, String ngay, Double don, String l, Double dt,Double ttien){
        this.maGiaoDich = ma;
        this.ngayGiaoDich = ngay;
        this.donGia = don;
        this.loai = l;
        this.dienTich = dt;
        this.thanhTien = ttien;
    }

    public int getMaGiaoDich() {
        return maGiaoDich;
    }

    public void setMaGiaoDich(int maGiaoDich) {
        this.maGiaoDich = maGiaoDich;
    }

    public String getLoai() {
        return loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }

    public String getNgayGiaoDich() {
        return ngayGiaoDich;
    }

    public void setNgayGiaoDich(String ngayGiaoDich) {
        this.ngayGiaoDich = ngayGiaoDich;
    }

    public Double getDonGia() {
        return donGia;
    }

    public void setDonGia(Double donGia) {
        this.donGia = donGia;
    }

    public Double getThanhTien() {
        return thanhTien;
    }

    public void setThanhTien(Double thanhTien) {
        this.thanhTien = thanhTien;
    }

    void nhap(){
        System.out.println("Ma Giao Dich: ");
        maGiaoDich = in.nextInt();
        System.out.println("Ngay Giao Dich: ");
        ngayGiaoDich = in.next();
        System.out.println("Don Gia: ");
        donGia = in.nextDouble();
        System.out.println("Loai: ");
        loai = in.next();
    }

    public String toString(){
        return " [maGiaoDich=" + maGiaoDich + ", loai= " + loai + ", ngayGiaoDich=" + ngayGiaoDich + ", Don Gia=" + donGia;
    }
}
