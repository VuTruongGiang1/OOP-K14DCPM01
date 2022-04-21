package kiemtracuoiky;

import java.util.ArrayList;
import java.util.Scanner;

public class HangSanhSu extends HangHoa{
    private static final String HangSanhSu = null;
    Scanner input = new Scanner(System.in);
    private String nhaSanXuat;
    private String ngayNhapKho;
    //private HangThucPham[] list_Hang_Sanh_Su;
    ArrayList<HangSanhSu> list_Hang_Sanh_Su = new ArrayList<HangSanhSu>();

    public HangSanhSu(int i, String tenHang, int soLuongTon, int donGia, String nhaSanXuat, String ngayNhapKho){
        super(i, tenHang, soLuongTon, donGia);//cha
        if(soLuongTon > 50){
            System.out.println("Ban cham");
        }
        this.nhaSanXuat = nhaSanXuat;//con
        this.ngayNhapKho = ngayNhapKho;//con
    }

    public HangSanhSu() {
	}
    public void hangSanhSu(ArrayList<HangSanhSu> list){
        HangSanhSu ss1 = new HangSanhSu(121,"To",120,300000,"CTY Gom Su","12/2/2022");
        list.add(ss1);
        HangSanhSu ss2 = new HangSanhSu(122,"Chen",130,100000,"CTY Gom Su","23/1/2022");
        list.add(ss2);
        HangSanhSu ss3 = new HangSanhSu(123,"Dia",210,100000,"CTY Gom Su","30/3/2022");
        list.add(ss3);
        HangSanhSu ss4 = new HangSanhSu(124,"Ly",31,100000,"CTY Gom Su","24/6/2021");
        list.add(ss4);
        HangSanhSu ss5 = new HangSanhSu(125,"Am tra",140,200000,"CTY Gom Su","10/2/2022");
        list.add(ss5);
        HangSanhSu ss6 = new HangSanhSu(126,"Binh bong",410,400000,"CTY Gom Su","15/3/2022");
        list.add(ss6);
        HangSanhSu ss7 = new HangSanhSu(127,"Chau cay",230,500000,"CTY Gom Su","19/4/2021");
        list.add(ss7);
        HangSanhSu ss8 = new HangSanhSu(128,"Lu huong",12,500000,"CTY Gom Su","30/8/2021");
        list.add(ss8);
        HangSanhSu ss9 = new HangSanhSu(129,"Binh dung ruou",20,600000,"CTY Gom Su","29/7/2021");
        list.add(ss9);
        HangSanhSu ss10 = new HangSanhSu(130,"Noi su",10,150000,"CTY Gom Su","23/5/2021");
        list.add(ss10);
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
        System.out.printf("Thong tin hang hoa: ", HangSanhSu);
    }

    @Override
    public void themHangHoa() {
        // TODO Auto-generated method stub
        System.out.printf(" Them mot hang sanh su vao danh sach: ");
        tenHang = input.nextLine();
        System.out.println("               ");
    }

    @Override
    public void suaHangHoa() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void xoaHagHoa() {
        // TODO Auto-generated method stub
        System.out.println("=========xoa========");
        int id = IntInput("id hang hoa");
        int index;
        for (HangSanhSu i : list_Hang_Sanh_Su) {
            if(i.hang_Sanh_Su_ID == id){
                index = list_Hang_Sanh_Su.indexOf(i);
                list_Hang_Sanh_Su.remove(index);
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
        System.out.println("Nhap ma hang can tim: ");
       
        
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
