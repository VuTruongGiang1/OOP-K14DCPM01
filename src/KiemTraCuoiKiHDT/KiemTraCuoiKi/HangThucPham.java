package KiemTraCuoiKi;

import java.util.Date;

public class HangThucPham extends HangHoa{
    private Date ngaySX;
    private Date ngayHetHan;
    private String nhaCungCap;
 
    public HangThucPham(){}
    public HangThucPham(String tenHang, String loaiHang, String maHang, int soLuongTonKho, double donGia, Date ngaySX, Date ngayHetHan, String nhaCungCap) {
        super(tenHang, loaiHang, maHang, soLuongTonKho, donGia);
        this.ngaySX = ngaySX;
        this.ngayHetHan = ngayHetHan;
        this.nhaCungCap = nhaCungCap;
    }
 
    public Date getNgaySX() {
        return ngaySX;
    }

    public Date getNgayHetHan() {
        return ngayHetHan;
    }

    public String getNhaCungCap() {
        return nhaCungCap;
    }

    @Override
    public double getThue() {
        return getDonGia() * 0.05;
    }

    @Override
    public String getDanhGia() {
        String d = "Khong co";
        if(getSoLuongTonkho() != 0 && ngayHetHan.before(new Date()))
        {
            d = "kho ban";
        }
        return d;
    }
 
    @Override
    public String toString() {
        String str1 = DanhSachHangHoa.simpleDateFormat.format(getNgaySX());
        String str2 = DanhSachHangHoa.simpleDateFormat.format(getNgayHetHan());   
        return super.toString()+"  " + "Ngay san xuat: " + str1+"  " + "Ngay het han: " +str2+"  " + "Nha cung cap: "+getNhaCungCap()+"  " +"Thue: " +getThue()+"  " + "Danh gia: " +getDanhGia();
    }
}
