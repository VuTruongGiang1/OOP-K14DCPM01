package kiemtracuoiky;

import java.util.ArrayList;

public abstract class HangHoa {
    //private static final ArrayList<HangThucPham> list = null;
    ArrayList<HangThucPham> list_Hang_Thuc_Pham = new ArrayList<HangThucPham>();
    int mh;
    int maHang_1;
    boolean maHang;
    String tenHang;
    int soLuongTon;
    int donGia;
    protected int hang_Thuc_Pham_ID;
    protected int hang_Sanh_Su_ID;
    protected int hang_Dien_May_ID;
    public HangHoa(int i, String tenHang, int soLuongTon, int donGia){
        super();
        this.mh = i;
        this.tenHang = tenHang;
        this.soLuongTon = soLuongTon;
        this.donGia = donGia;
    }
    public HangHoa() {
    }
    public boolean getMaHang() {
        return maHang;
    }

    public void setMaHang(int maHang_1) {
        this.maHang_1 = maHang_1;
    }

    public String getTenHang() {
        return tenHang;
    }

    //public void setTenHang(String tenHang) {
        //this.tenHang = tenHang;
    //}

    public int getSoLuongTon() {
        return soLuongTon;
    }

    //public void setSoLuongTon(int soLuongTon) {
        //this.soLuongTon = soLuongTon;
    //}

    public int getDonGia() {
        return donGia;
    }

    public abstract String toString();
    public abstract void inDanhSachHangHoa();

    public abstract void themHangHoa();

    public abstract void suaHangHoa();

    public abstract void xoaHagHoa();

    public abstract void timKiemTheoMaHang();

    public abstract void timKiemTheoTenHang();
	public void inDanhSach() {
	}

    //void inDanhSachHangHoa(){
        //for(int i = 0; i <= hangThucPham(list).length && hangDienMay(list).length && hangSanhSu(list).length){
            //System.out.println(HangHoa()[i]);
        //}
   // }

    //private Object hangThucPham() {
     //   return null;
   // }
    //private char[] HangHoa() {
    //    return null;
    //}
    
} 
