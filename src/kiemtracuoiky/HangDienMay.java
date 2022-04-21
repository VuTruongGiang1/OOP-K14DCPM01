package kiemtracuoiky;

import java.util.ArrayList;
import java.util.Scanner;

public class HangDienMay extends HangHoa{
    Scanner input = new Scanner(System.in);
    private int thoiGianBaoHanh;
    private int congSuat;
    ArrayList<HangDienMay> list_Hang_Dien_May = new ArrayList<HangDienMay>();

    public HangDienMay(int i, String tenHang, int soLuongTon, int donGia, int thoiGianBaoHanh, int congSuat){
        super(i, tenHang, soLuongTon, donGia);
        if(soLuongTon < 3){
            System.out.println("Ban duoc");
        }
        this.thoiGianBaoHanh = thoiGianBaoHanh;
        this.congSuat = congSuat;
    }

    public HangDienMay() {
	}

	static void soLuongTon(){
        System.out.println();
    }
    public void hangDienMay(ArrayList<HangDienMay> hangDienMays){
        HangDienMay s1 = new HangDienMay(111,"Tu lanh",100, 10000000,24,100);
        list.add(s1);
        HangDienMay s2 = new HangDienMay(112,"May giat",200,20000000,12,200);
        list.add(s2);
        HangDienMay s3 = new HangDienMay(113,"Binh dun nuoc",3,100000,6,60);
        list.add(s3);
        HangDienMay s4 = new HangDienMay(114,"Bep dien",2,200000,6,60);
        list.add(s4);
        HangDienMay s5 = new HangDienMay(115,"May tinh",1,30000000,24,100);
        list.add(s5);
        HangDienMay s6 = new HangDienMay(116,"Dien thoai",300,7000000,6,60);
        list.add(s6);
        HangDienMay s7 = new HangDienMay(117,"Noi chien",7,2000000,6,50);
        list.add(s7);
        HangDienMay s8 = new HangDienMay(118,"Ban phim",2,500000,3,12);
        list.add(s8);
        HangDienMay s9 = new HangDienMay(119,"Ti vi",200,50000000,12,100);
        list.add(s9);
        HangDienMay s10 = new HangDienMay(120,"May lanh",50,20000000,24,200);
        list.add(s10);
    }
    public int getThoiGianBaoHanh() {
        return thoiGianBaoHanh;
    }

    public int getCongSuat() {
        return congSuat;
    }

    @Override
    public void inDanhSachHangHoa() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void themHangHoa() {
        // TODO Auto-generated method stub
        System.out.printf(" Them mot hang dien may vao danh sach: ");
        tenHang = input.nextLine();
        System.out.println("                   ");
    }

    @Override
    public void suaHangHoa() {
        // TODO Auto-generated method stub
        System.out.println("========Sua========");
        int id = IntInput("id hang hoa");
        for (HangDienMay hangDienMay : list_Hang_Dien_May) {
            if(hangDienMay.hang_Dien_May_ID == id){
                XuatThongTinHangDienMay(hangDienMay);

                System.out.println("Nhap loai hang moi: ");
                //String new_Type;
                String new_name = StringInput("Nhap ten hang moi: ");
                int new_price = IntInput("gia tien moi: ");
                int new_soLuongTon = IntInput("So luong moi: ");
                int new_maHang = IntInput("Ma hang moi: ");
                hangDienMay.setTenHang(new_name);
                //hangDienMay.setType(new_Type);
                hangDienMay.setPrice(new_price);
                hangDienMay.setSoLuongTon(new_soLuongTon);
                hangDienMay.setMaHang(new_maHang);

            }
        }
    }

    private void setPrice(int new_price) {
    }

    //private void setType(String new_type) {
    //}

    private void setSoLuongTon(int new_soLuongTon) {
    }

    private void setTenHang(String new_name) {
    }

    private String StringInput(String string) {
        return null;
    }

    private void XuatThongTinHangDienMay(HangDienMay hangDienMay) {
    }

    @Override
    public void xoaHagHoa() {
        // TODO Auto-generated method stub
        System.out.println("=========xoa========");
        int id = IntInput("id hang hoa");
        int index;
        for (HangDienMay i : list_Hang_Dien_May) {
            if(i.hang_Dien_May_ID == id){
                index = list_Hang_Dien_May.indexOf(i);
                list_Hang_Dien_May.remove(index);
                System.out.println("Xoa thanh cong");
                break;
            }
        }
    }

    private int IntInput(String string) {
        return 0;
    }

    @Override
    public void timKiemTheoMaHang() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void timKiemTheoTenHang() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return null;
    }
    
}
