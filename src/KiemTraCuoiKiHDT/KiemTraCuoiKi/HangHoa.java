package KiemTraCuoiKi;

public abstract class HangHoa {
    private String tenHang;
    private String loaiHang;
    private String maHang;
    private int soLuongTonkho;
    private double donGia;
 
    public HangHoa(){}
    public HangHoa(String tenHang, String loaiHang, String maHang, int soLuongTon, double donGia) 
    {
        this.tenHang = tenHang;
        this.loaiHang = loaiHang;
        this.maHang = maHang;
        this.soLuongTonkho = soLuongTon;
        this.donGia = donGia;
    }
 
    public String getTenHang() 
    {
        return tenHang;
    }
    public String getLoaiHang() 
    {
        return loaiHang;
    }
    public String getMaHang() 
    {
        return maHang;
    }
    public int getSoLuongTonkho() 
    {
        return soLuongTonkho;
    }
    public double getDonGia() 
    {
        return donGia;
    }
    public abstract double getThue();
    public abstract String getDanhGia();
 
    @Override
    public String toString() {
        return "Tên hàng: " +getTenHang()+ "Loại hàng: " +getLoaiHang()+ "Mã hàng: " +getMaHang()+ "Số lượng tồn: " +getSoLuongTonkho()+ "Đơn giá: " +getDonGia();
    }

}
