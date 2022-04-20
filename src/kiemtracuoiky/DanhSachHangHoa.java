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

    public void them(HangHoa hangHoa){
        danhSach.add(hangHoa);
    }

    public void inDanhSach(){
        for (HangHoa hangHoa : danhSach) {
            System.out.println(hangHoa);
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
