package kiemtracuoiky;

import java.util.ArrayList;
import java.util.List;

public class HangThucPham extends HangHoa{
    //private static final int hangThucPham = 0;
    private String ngaySanXuat;
    private String ngayHetHan;
    private String nhaCungCap;
    //private static HangThucPham[] hangThucPham;
    //private int HangThucPham;
    private ArrayList<HangThucPham> hangThucPhams;

    //public String kiemTraSoLuong(){
    //int soLuongTon;
    //if(soLuongTon > 0 ){
    //System.out.println("Kho ban");
    //}
    //return ngayHetHan;
    //}
    public HangThucPham(int i, String tenHang, int soLuongTon, int donGia, String ngaySanXuat, String ngayHetHan, String nhaCungCap){
        super(i, tenHang, soLuongTon, donGia);
        this.ngaySanXuat = ngaySanXuat;
        this.ngayHetHan = ngayHetHan;
        this.nhaCungCap = nhaCungCap;
    }

    public HangThucPham() {
    }

    public String getNgaySanXuat() {
        return ngaySanXuat;
    }

    public void setNgaySanXuat(String ngaySanXuat) {
        this.ngaySanXuat = ngaySanXuat;
    }

    public String getNgayHetHan() {
        return ngayHetHan;
    }

    public void setNgayHetHan(String ngayHetHan) {
        this.ngayHetHan = ngayHetHan;
    }

    public String getNhaCungCap() {
        return nhaCungCap;
    }

    public void setNhaCungCap(String nhaCungCap) {
        this.nhaCungCap = nhaCungCap;
    }

    //public void inDanhSachHangThucPham(ArrayList<HangThucPham> hangThucPham){
        //for (HangHoa inDanhSach : hangThucPham) {
            //System.out.println(inDanhSach);
            //System.out.println("                  ");
        //}
    //}
    @Override
    public void inDanhSachHangHoa() {
        // TODO Auto-generated method stub
        hangThucPham(hangThucPhams);
    }

    @Override
    public void themHangHoa() {
        // TODO Auto-generated method stub
        
        
    }

    @Override
    public void suaHangHoa() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void xoaHagHoa() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void timKiemTheoMaHang() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void timKiemTheoTenHang() {
        // TODO Auto-generated method stub
        
    }
    
}
