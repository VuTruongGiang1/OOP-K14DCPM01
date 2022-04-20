package kiemtracuoiky;

public class HangSanhSu extends HangHoa{
    private String nhaSanXuat;
    private String ngayNhapKho;

    public HangSanhSu(int i, String tenHang, int soLuongTon, int donGia, String nhaSanXuat, String ngayNhapKho){
        super(i, tenHang, soLuongTon, donGia);//cha
        if(soLuongTon > 50){
            System.out.println("Ban cham");
        }
        this.nhaSanXuat = nhaSanXuat;//con
        this.ngayNhapKho = ngayNhapKho;//con
    }

    public String getNgayNhapKho() {
        return ngayNhapKho;
    }

    public String getNhaSanXuat() {
        return nhaSanXuat;
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
