package kiemtracuoiky;

public class HangDienMay extends HangHoa{
    private int thoiGianBaoHanh;
    private int congSuat;

    public HangDienMay(int i, String tenHang, int soLuongTon, int donGia, int thoiGianBaoHanh, int congSuat){
        super(i, tenHang, soLuongTon, donGia);
        if(soLuongTon < 3){
            System.out.println("Ban duoc");
        }
        this.thoiGianBaoHanh = thoiGianBaoHanh;
        this.congSuat = congSuat;
    }

    static void soLuongTon(){
        System.out.println();
    }

    @Override
    public void inDanhSachHangHoa() {
        // TODO Auto-generated method stub
        
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
