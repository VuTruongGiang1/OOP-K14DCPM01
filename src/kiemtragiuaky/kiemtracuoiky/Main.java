package kiemtracuoiky;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static final ArrayList<HangThucPham> hangThucPham = null;
    private static ArrayList<HangThucPham> hangThucPhams;

    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {
            int suLuaChon;
            do{
                System.out.println("==========Menu==========");
                System.out.println(">>1. Them mot hang hoa vao danh sach");
                System.out.println(">>2. Xoa hang hoa");
                System.out.println(">>3. Sua hang hoa");
                System.out.println(">>4. In toan bo danh sach hang hoa");
                System.out.println(">>5.1. Tim kiem hang hoa theo ma hang hoa");
                System.out.println(">>5.2. Tim kiem hang hoa theo ten");
                System.out.println(">>6. Thoat");
                System.out.println("==========Menu==========");

                System.out.println("Hay chon so tu 1 -> 5: ");
                suLuaChon = input.nextInt();

                switch(suLuaChon){
                    case 1: themHangHoa(); break;
                    case 2: xoaHagHoa(); break;
                    case 3: suaHangHoa(); break;
                    case 4: inDanhSachHangHoa(null, null, null); break;
                    case 5: timKiemTheoMaHang(); break;
                    case 6: timKiemTheoTenhang(); break;
                    default: System.out.println("Chon sai roi!!!!");
                }
            }while(suLuaChon >=1 && suLuaChon <=5);
        }

        return;
    }

    private static void timKiemTheoMaHang() {
    }

    private static void timKiemTheoTenhang() {
    }

    public static void inDanhSachHangHoa(HangDienMay a, HangSanhSu b, HangThucPham c) {
        // TODO Auto-generated method stub
        HangThucPham hangThucPham = new HangThucPham();
        //HangDienMay hangDienMay = new HangDienMay();
        //HangSanhSu hangSanhSu = new HangSanhSu();

        hangThucPham.inDanhSachHangHoa();

        HangSanhSu hangSanhSu = new HangSanhSu();
        hangSanhSu.inDanhSachHangHoa();
    }

    private static void suaHangHoa() {
    }

    private static void xoaHagHoa() {
        HangThucPham hangThucPham_1 = new HangThucPham();
        hangThucPham_1.xoaHagHoa();
    }

    private static void themHangHoa() {
        HangDienMay hangDienMay = new HangDienMay();
        hangDienMay.themHangHoa();
        HangThucPham hangThucPham = new HangThucPham();
        hangThucPham.themHangHoa();
        HangSanhSu hangSanhSu = new HangSanhSu();
        hangSanhSu.themHangHoa();
    }
    
}
