package kiemtracuoiky;

import java.util.ArrayList;
import java.util.Scanner;

public class HangThucPham extends HangHoa{
    Scanner input = new Scanner(System.in);
    //private static final int hangThucPham = 0;
    private String ngaySanXuat;
    private String ngayHetHan;
    private String nhaCungCap;
    //private static HangThucPham[] hangThucPham;
    //private int HangThucPham;
    ArrayList<HangThucPham> list_Hang_Thuc_Pham = new ArrayList<HangThucPham>();
    //HangThucPham(list_Hang_Thuc_Pham);
    //private int hang_Thuc_Pham_ID;

    //public String kiemTraSoLuong(){
    //int soLuongTon;
    //if(soLuongTon > 0 ){
    //System.out.println("Kho ban");
    //}
    //return ngayHetHan;
    //}
    public void hangThucPham(ArrayList<HangThucPham> hangThucPhams){
        HangThucPham new_1 = new HangThucPham(101,"Snack khoai tay",0,5000,"20/4/2019","20/4/2022","CTY An Toan Thuc Pham");
        hangThucPhams.add(new_1);
        HangThucPham new_2 = new HangThucPham(102,"Banh dau xanh",0,20000,"15/3/2019","15/3/2022","CTY An Toan Thuc Pham");
        hangThucPhams.add(new_2);
        HangThucPham new_3 = new HangThucPham(103,"Pizza",33,100000,"25/11/2019","17/4/2020","CTY CEDV");
        hangThucPhams.add(new_3);
        HangThucPham new_4 = new HangThucPham(104,"Com cuon",44,120000,"04/04/2018","04/05/2018","CTY CEDV");
        hangThucPhams.add(new_4);
        HangThucPham new_5 = new HangThucPham(105,"Xuc Xich",0,13000,"09/08/2018","09/08/2021","CTY An Toan Thuc Pham");
        hangThucPhams.add(new_5);
        HangThucPham new_6 = new HangThucPham(106,"Rau",12,15000,"12/2/2022","13/2/2022","Rau nha trong");
        hangThucPhams.add(new_6);
        HangThucPham new_7 = new HangThucPham(107,"Ca dong hop",36,12000,"16/4/2018","16/4/2022","CTY An Toan Thuc Pham");
        hangThucPhams.add(new_7);
        HangThucPham new_8 = new HangThucPham(108,"Choocopie",57,18000,"19/6/2018","19/6/2022","CTY An Toan Thuc Pham");
        hangThucPhams.add(new_8);
        HangThucPham new_9 = new HangThucPham(109,"Banh trang",10,10000,"27/8/2018","27/8/2022","CTY An Toan Thuc Pham");
        hangThucPhams.add(new_9);
        HangThucPham new_10 = new HangThucPham(110,"Ca vien chien",20,20000,"02/09/2018","02/09/2022","CTY An Toan Thuc Pham");
        hangThucPhams.add(new_10);
    }
    public HangThucPham(int i, String tenHang, int soLuongTon, int donGia, String ngaySanXuat, String ngayHetHan, String nhaCungCap){
        super(i, tenHang, soLuongTon, donGia);
        this.ngaySanXuat = ngaySanXuat;
        this.ngayHetHan = ngayHetHan;
        this.nhaCungCap = nhaCungCap;
    }

    //public HangThucPham() {
    //}

    public HangThucPham() {
    }
    public String getNgaySanXuat() {
        return ngaySanXuat;
    }

    public void setNgaySanXuat(String ngaySanXuat) {
        this.ngaySanXuat = ngaySanXuat;
    }

    public String getNgayHetHan() {
        return ngayHetHan;
    }

    public void setNgayHetHan(String ngayHetHan) {
        this.ngayHetHan = ngayHetHan;
    }

    public String getNhaCungCap() {
        return nhaCungCap;
    }

    public void setNhaCungCap(String nhaCungCap) {
        this.nhaCungCap = nhaCungCap;
    }

    //public void inDanhSachHangThucPham(ArrayList<HangThucPham> hangThucPham){
        //for (HangHoa inDanhSach : hangThucPham) {
            //System.out.println(inDanhSach);
            //System.out.println("                  ");
        //}
    //}
    @Override
    public void inDanhSachHangHoa() {
        // TODO Auto-generated method stub
        for ( HangThucPham i : list_Hang_Thuc_Pham) {
            //HangHoa hangHoa = new HangThucPham();
            inDanhSach(i);
        }
    }

    private void inDanhSach(HangThucPham i) {
    }
    @Override
    public void themHangHoa() {
        // TODO Auto-generated method stub
        System.out.printf(" Them mot hang thuc pham vao danh sach: ");
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
        for (HangThucPham i : list_Hang_Thuc_Pham) {
            if(i.hang_Thuc_Pham_ID == id){
                index = list_Hang_Thuc_Pham.indexOf(i);
                list_Hang_Thuc_Pham.remove(index);
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
