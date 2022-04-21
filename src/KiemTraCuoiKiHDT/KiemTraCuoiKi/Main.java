package KiemTraCuoiKi;

public class Main {
    static DanhSachHangHoa quanLiDanhSachHangHoa = new DanhSachHangHoa();
    static {
        try {
            quanLiDanhSachHangHoa.duLieuCoSan();
        } 
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args){
        menu();
    }
    static void menu() {
        System.out.println("============MENU============");
        System.out.println("1.Them hang hoa");
        System.out.println("2.Xuat hang hoa");
        System.out.println("3.Tim kiem hang hoa theo ma");
        System.out.println("4.Xoa hang hoa theo ma");
        System.out.println("5.Sua hang hoa theo ma");
        System.out.println("6.Sap xep hang hoa tang dan theo don gia");
        System.out.println("7.Sap xep hang hoa giam dan theo don gia");
        System.out.println("8.Thong ke hang hoa");
        System.out.println("9. Thoat!!!");
        System.out.println("============MENU============");
        System.out.print("Nhap so: ");
        String n = DanhSachHangHoa.chu.nextLine();
        
        switch(n) {
            case "1": themHang(); break;
            case "2": xuatHang(); break;
            case "3": timHang(); break;
            case "4": xoaHang(); break;
            case "5": sua(); break;
            case "6": sapXepTangDanTheoGia(); break;
            case "7": sapXepGiamDanTheoGia(); break;
            case "8": thongKe(); break;
            case "9": thoat(); break;
            default:{
                System.out.println("Du lieu nhap khong dung");
                nhanEnterDeTiepTuc();
                menu();
                break;
            } 
            
        }
        return;
    }
    
    //thoat
    static void thoat() {
        nhanEnterDeTiepTuc();
        return;
    }
    
    static void nhanEnterDeTiepTuc() {
        System.out.println("Nhan enter de tiep tuc");
        DanhSachHangHoa.chu.nextLine();
    }

    //Thêm hàng hóa 
    static void themHang() {
        String d = null;
        do{
            quanLiDanhSachHangHoa.them(quanLiDanhSachHangHoa.nhapHangHoaKhongCoMa(quanLiDanhSachHangHoa.nhapMaHangHoa()));
            System.out.print("Nhap tiep (y/n): ");
            d = DanhSachHangHoa.chu.nextLine();
        }while(d.equalsIgnoreCase("y"));
        nhanEnterDeTiepTuc();
        menu();
    }

    //Xuất hàng hóa 
    static void xuatHang() {
        quanLiDanhSachHangHoa.xuat();
        nhanEnterDeTiepTuc();
        menu();
    }

    //Tìm hàng hóa 
    static void timHang() {
        String maHang;
        System.out.print("Nhap ma hang can tim: ");
        maHang = DanhSachHangHoa.chu.nextLine();
        quanLiDanhSachHangHoa.traVeKetQua(quanLiDanhSachHangHoa.timHangTheoMa(maHang));
        nhanEnterDeTiepTuc();
        menu();
    }

    //Xóa hàng hóa 
    static void xoaHang() {
        System.out.print("Nhap ma hang hoa can xoa: ");
        String maHang = DanhSachHangHoa.chu.nextLine();
        quanLiDanhSachHangHoa.xoa(quanLiDanhSachHangHoa.timHangTheoMa(maHang));
        nhanEnterDeTiepTuc();
        menu();
    }

    //Sửa hàng hóa 
    static void sua() {
        System.out.print("Nhap ma hang hoa can sua: ");
        String maHang = DanhSachHangHoa.chu.nextLine();
        quanLiDanhSachHangHoa.suaHangHoa(maHang);
        nhanEnterDeTiepTuc();
        menu();
    }

    //Sắp xếp hàng hóa tăng dần theo đơn giá 
    static void sapXepTangDanTheoGia() {
        quanLiDanhSachHangHoa.sapXepTangDanTheoGia();
        nhanEnterDeTiepTuc();
        menu();
    }

    //Sắp xếp hàng hóa giảm dần theo đơn giá 
    static void sapXepGiamDanTheoGia() {
        quanLiDanhSachHangHoa.sapXepGiamDanTheoGia();
        nhanEnterDeTiepTuc();
        menu();
    }
    
    //Thống kê số lượng hàng hóa 
    static void thongKe() {
        quanLiDanhSachHangHoa.thongKe();
        nhanEnterDeTiepTuc();
        menu();
    }
}
