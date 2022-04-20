package kiemtragiuaky;

import java.util.Scanner;

public class GiaoDichDat extends GiaoDichNhaDat{
    private String loaiDat;
    boolean loaiB, loaiC, loaiA;
    protected Double donGia, thanhTien, dienTich;

    Scanner in = new Scanner(System.in);
    
    protected GiaoDichDat(){
        super();
        this.loaiDat="";
    }

    public GiaoDichDat(int ma, String l, String ngay, Double don, Double ttien, Double dt){
        super();
        this.loaiDat = null;
    }

    public String getLoaiDat() {
        return loaiDat;
    }

    public void setLoaiDat(String loaiDat) {
        this.loaiDat = loaiDat;
    }

    public void nhap(){
        super.nhap();
        System.out.println("Loai Dat: ");
        loaiDat = in.next();
        System.out.println("Dien tich: ");
        dienTich = in.nextDouble();
    }

    public Double ttien(){
    if(loaiB || loaiC){
        return this.thanhTien = this.dienTich*this.donGia;
    }else{
        return this.thanhTien = this.dienTich*this.donGia*1.5;
         }
    }

    public String toString(){
        return "Giao Dich Dat: " + super.toString() + ", loai dat: " + loaiDat + ", Thanh tien: " + ttien() + "]";
    }
    @Override
    protected void danhSachGiaoDich() {
        // TODO Auto-generated method stub
        
    }
}
