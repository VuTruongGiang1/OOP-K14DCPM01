package kiemtracuoiky;

import java.util.ArrayList;
import java.util.List;

public class DanhSachHangHoa {
    private List<HangHoa> danhSach = new ArrayList<>();

    private int hangThucPham;
    private int hangDienMay;
    private int hangSanhSu;

    public int getHangThucPham() {
        return hangThucPham;
    }

    public int getHangDienMay() {
        return hangDienMay;
    }

    public int getHangSanhSu() {
        return hangSanhSu;
    }

    public void themHangHoa(HangThucPham hangThucPham, HangDienMay hangDienMay, HangSanhSu hangSanhSu){
        danhSach.add(hangThucPham);
        danhSach.add(hangDienMay);
        danhSach.add(hangSanhSu);
    }

    public void inDanhSach(){
        for (HangHoa hangThucPham : danhSach) {
            System.out.println(hangThucPham);
        }
    }

    //public void timKiemTheoMaHang(int maHang){
        //HangHoa hangHoa = null;
        //for (HangHoa mh : danhSach) {
            //if(mh.getMaHang().equalsIgnoreCase(maHang)){
             //   hangHoa = mh;
           // }
       // }
      //  return;
   // }
}
