package kiemtragiuaky;

import java.util.Scanner;

public class GiaoDichNha extends GiaoDichNhaDat{
    private String loaiNha;
    Boolean loaiCaoCap, loaiThuong;
    protected Double donGia, thanhTien, dienTich;

    Scanner in = new Scanner(System.in);

    protected GiaoDichNha(){
        super();
        this.loaiNha = "";
    }

    public GiaoDichNha(int ma, String l, String ngay, Double don, Double ttien, Double dt){
        super();
        this.loaiNha = null;
    }

    public String getLoaiNha() {
        return loaiNha;
    }

    public void setLoaiNha(String loaiNha) {
        this.loaiNha = loaiNha;
    }

    public void nhap(){
        super.nhap();
        System.out.println("Loai Nha: ");
        loaiNha = in.next();
        System.out.println("Dien tich: ");
        dienTich = in.nextDouble();
    }

    public double ttien(){
    if(loaiCaoCap){
        return this.thanhTien = this.dienTich*this.donGia;
    }else{
        return this.thanhTien = this.dienTich*this.donGia* 0.9;
         }
    }

    public String toString(){
        return "Giao Dich Nha: " + super.toString() + ", loai nha: " + loaiNha + ", Thanh tien: " + ttien() + "]";
    }
    @Override
    protected void danhSachGiaoDich() {
        // TODO Auto-generated method stub
        
    }
    
}
