package KiemTraCuoiKi;

public class HangDienMay extends HangHoa{
    private int tGBaoHanh;
    private double congSuatKW;
 
    public HangDienMay(){}
    public HangDienMay(String tenHang, String loaiHang, String maHang, int soLuongTonKho, double donGia, int tGBaoHanh, double congSuatKW) {
        super(tenHang, loaiHang, maHang, soLuongTonKho, donGia);
        this.tGBaoHanh = tGBaoHanh;
        this.congSuatKW = congSuatKW;
    }
 
    public double getCongSuatKW() {
        return congSuatKW;
    }

    public int gettGBaoHanh() {
        return tGBaoHanh;
    }

    @Override
    public double getThue() {
        return getDonGia()*0.1;
    }

    @Override
    public String getDanhGia() {
        String d = "khong co";
        if(getSoLuongTonkho() < 3)
        {
            d = "ban duoc";
        }
        return d;
    }
 
    @Override
    public String toString() {
        return super.toString()+ "Thoi gian bao hanh (thang): " +gettGBaoHanh()+ "Cong suat KW: " +getCongSuatKW()+"Thue: "+getThue()+ "Danh gia hang dien may: " +getDanhGia();
    }
}
