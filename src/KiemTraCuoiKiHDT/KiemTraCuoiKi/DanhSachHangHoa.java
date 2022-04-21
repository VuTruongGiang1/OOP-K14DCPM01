package KiemTraCuoiKi;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class DanhSachHangHoa {
    private List<HangHoa> list = new ArrayList<>();
    public static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
    public static Scanner so = new Scanner(System.in);
    public static Scanner chu = new Scanner(System.in);
 
    public void duLieuCoSan() throws ParseException {
        list.add(new HangThucPham("Thit", "Thuc pham", "001", 10, 25.000, simpleDateFormat.parse("3/7/2020"), simpleDateFormat.parse("5/5/2022"), "Big C"));

        list.add(new HangThucPham("Ca", "Thuc pham", "002", 20, 20.000, simpleDateFormat.parse("16/4/2020"), simpleDateFormat.parse("8/4/2022"), "Big C"));

        list.add(new HangThucPham("Rau", "Thuc pham", "003", 20, 5.000, simpleDateFormat.parse("1/5/2020"), simpleDateFormat.parse("12/8/2022"), "Big C"));
        
        list.add(new HangThucPham("Cu cai", "Thuc pham", "004", 50, 6.000, simpleDateFormat.parse("30/4/2020"), simpleDateFormat.parse("30/3/2022"), "Big C"));
        
        list.add(new HangDienMay("Dien thoai", "Dien may", "005", 70, 500.000, 12, 100.000));
        
        list.add(new HangDienMay("Laptop", "Dien may", "006", 120, 600.000, 32, 150.000));
        
        list.add(new HangDienMay("Tivi", "Dien may", "007", 150, 4000.000, 32, 170.000));
        
        list.add(new HangSanhSu("Binh", "Sanh su", "008", 300, 50.000, "Gom xa nha", simpleDateFormat.parse("9/9/2022")));
        
        list.add(new HangSanhSu("Ly", "Sanh su", "009", 200, 25.000, "Gom gan nha", simpleDateFormat.parse("27/3/2022")));
        
        list.add(new HangSanhSu("To", "Sanh su", "010", 200, 20.000, "Gom tai nha", simpleDateFormat.parse("4/7/2022")));

        list.add(new HangSanhSu("Chen", "Sanh su", "011", 300, 15.000, "Gom bay nha", simpleDateFormat.parse("1/1/2022")));
    }
 
    public HangHoa nhapHangHoaKhongCoMa(String maHang){
        HangHoa hangHoa = null;
        try {
            String tenHang=null; 
            do{
                System.out.print("Ten hang: ");
                tenHang = chu.nextLine();
                if(tenHang.equalsIgnoreCase("")){
                    System.out.println("Ten hang khong duoc de trong");
                }
            }while(tenHang.equalsIgnoreCase(""));
            int soLuongTonKho=0; 
            do{
                System.out.print("So luong ton: ");
                soLuongTonKho = so.nextInt();
                if(soLuongTonKho<0){
                    System.out.println("So luong ton kho phai >=0");
                }
            }while(soLuongTonKho<0);
            
            
            double donGia=0.0; 
            do{
                System.out.print("Don gia: ");
                donGia = so.nextDouble();
                if(donGia<=0){
                    System.out.println("Don gia phai > 0");
                }
            }while(donGia<=0);
            int number=0; 
            do{
                System.out.print("Loai hang: 1.(Thuc pham) | 2.(Dien may) | 3.(Sanh su) : ");
                number = so.nextInt();
                if(number!=1 && number!=2 && number!=3){
                    System.out.println("Thong tin nhap khong phu hop, vui long nhap lai!!!");
                }
            }while(number!=1 && number!=2 && number!=3);
            
            if(number==1) 
            {
                String loaiHang="Thuc pham";
                Date ngaySX=null;
                Date ngayHetHan=null;
                do{
                    System.out.print("Ngay san xuat (dd/mm/yyyy): ");
                    ngaySX = simpleDateFormat.parse(chu.nextLine());
                    System.out.print("Ngay het han (dd/mm/yyyy): ");
                    ngayHetHan = simpleDateFormat.parse(chu.nextLine());
                    if(ngayHetHan.before(ngaySX)){
                        System.out.println("Ngay het han phai sau ngay hoac là ngay san xuat");
                    }
                }while(ngayHetHan.before(ngaySX));
                System.out.print("Nha cung cap: ");
                String nhaCungCap = chu.nextLine();
                hangHoa = new HangThucPham(tenHang, loaiHang, maHang, soLuongTonKho, donGia, ngaySX, ngayHetHan, nhaCungCap);
            }
            else if(number==2) 
            {
                String loaiHang="Dien may";
                int tGBaoHanh;
                do{
                    System.out.print("Thoi gian bao hanh (thang): ");
                    tGBaoHanh = so.nextInt();
                    if(tGBaoHanh<0){
                        System.out.println("Thoi gian bao hanh phai >=0");
                    }
                }while(tGBaoHanh<0);
                double congSuatKW;
                do{
                    System.out.print("Cong suat(KW): ");
                    congSuatKW = so.nextDouble();
                    if(congSuatKW<=0){
                        System.out.println("Cong suat phai >0");
                    }
                }while(congSuatKW<=0);
                hangHoa = new HangDienMay(tenHang, loaiHang, maHang, soLuongTonKho, donGia, tGBaoHanh, congSuatKW);
            }
            else
            {
                String loaiHang="Sanh su";
                System.out.print("Nha san xuat: ");
                String nhaSanXuat = chu.nextLine();
                System.out.print("Ngay nhap kho (dd/mm/yyyy): ");
                Date ngayNhapKho = simpleDateFormat.parse(chu.nextLine());
                hangHoa = new HangSanhSu(tenHang, loaiHang, maHang, soLuongTonKho, donGia, nhaSanXuat, ngayNhapKho);
            
            }
        } catch (Exception e) {
            so = new Scanner(System.in);
            System.out.println("Chuong trinh bi loi do ban nhap chu vao phan so, vui long thu lai!!!");
            e.printStackTrace();
        }
        return hangHoa;
    }

    //Thêm 
    public void them(HangHoa hangHoa) {
        if(hangHoa!=null){
            this.list.add(hangHoa);
        }
    }

    //Kiểm tra 
    public boolean kiemTraMaHangTrung(String maHang){
        boolean kt = false;
        for (HangHoa hangHoa : list) {
            if( hangHoa.getMaHang().equals(maHang)){
                kt=true;
            }
        }
        return kt;
    }
    
    //Xuất 
    public void xuat() {
        for(HangHoa hangHoa : list) {
            System.out.println(hangHoa);
            System.out.println();
        }
    }
    
    //Tìm hàng theo mã hàng 
    public HangHoa timHangTheoMa(String maHang) {
        HangHoa hangHoa = null;
        for(HangHoa hangHoa2 : list) {
            if(hangHoa2.getMaHang().toString().equalsIgnoreCase(maHang)) {
                hangHoa = hangHoa2;
            }
        }
        if(hangHoa==null) {
            System.out.println("Khong tim thay hang hoa");
        }
        return hangHoa;
    }

    //Trả về kết quả 
    public void traVeKetQua(HangHoa hangHoa) {
        if(hangHoa!=null) {
            System.out.println(hangHoa);
        }
    }
    
    //Xóa 
    public void xoa(HangHoa hangHoa) {
        if(hangHoa!=null) {
            System.out.println("Da xoa hang khoi kho!");
        }
        this.list.remove(hangHoa);
    }

    //Nhập mã hàng 
    public String nhapMaHangHoa() {
        String maHang=null; 
        boolean kiemTraMa=true;
        do{
            try {
                System.out.print("Ma hang: ");
                maHang = chu.nextLine();
                kiemTraMa = kiemTraMaHangTrung(maHang);
                if(maHang.equalsIgnoreCase("")){
                System.out.println("Ma hang khong duoc de trong");
                }
                else if(kiemTraMa == true){
                    System.out.println("Ma hang nay da ton tai, hay nhap ma hang khac");
                }
            }catch (Exception e) {
                e.printStackTrace();
            }
        }while(maHang.equalsIgnoreCase("") || kiemTraMa==true);
        return maHang;
    }

    //Tìm vị trí 
    public int timViTriHangHoa(HangHoa hangHoa) {
        int viTri = -1;
        viTri = this.list.indexOf(hangHoa);
        return viTri;
    }

    //Sửa hàng theo vị trí đã tìm 
    public void suaHangHoa(String maHang) {
        int viTri = timViTriHangHoa(timHangTheoMa(maHang));
        if(viTri == -1) {
            System.out.println(" Khong tim thay hang ");
        }
        else
        {
            HangHoa hangHoa = nhapHangHoaKhongCoMa(maHang);
            if(hangHoa!=null) {
                this.list.set(viTri, hangHoa);
                System.out.println("Da sua hang thanh cong");
            }
        }
    }
    
    //Sắp xếp 
    public void sapXepTangDanTheoGia() { 
        Comparator<HangHoa> comp = new Comparator<HangHoa>() {
            public int compare(HangHoa o1, HangHoa o2) {
                return Double.compare(o1.getDonGia(), o2.getDonGia());
            }
        };
        Collections.sort(list, comp);
        System.out.println("Da sap xep");
    }

    //Sắp xếp 
    public void sapXepGiamDanTheoGia() {
        sapXepTangDanTheoGia();
        Collections.reverse(list);
    }
 
    //Thống kê hàng 
    public void thongKe(){
        int matHangThucPham = 0;
        int matHangDienMay = 0;
        int matHangSanhSu = 0;
        double giaTriHangThucPham = 0;
        double giaTriHangDienMay = 0;
        double giaTriHangSanhSu = 0;
        int tonHangThucPham = 0;
        int tonHangDienMay = 0;
        int tonHangSanhSu = 0;
        int danhGiaHangThucPham = 0;
        int danhGiaHangDienMay = 0;
        int danhGiaHangSanhSu = 0;


        for(HangHoa hangHoa : list) {
            if(hangHoa instanceof HangDienMay) {
                matHangDienMay += 1;
                giaTriHangDienMay += hangHoa.getDonGia()*hangHoa.getSoLuongTonkho()*1.1;
                tonHangDienMay += hangHoa.getSoLuongTonkho();
                if(!hangHoa.getDanhGia().equalsIgnoreCase("khong co")) {
                    danhGiaHangDienMay +=1;
                }
            }
            else if(hangHoa instanceof HangSanhSu) {
                matHangSanhSu += 1;
                giaTriHangSanhSu += hangHoa.getDonGia()*hangHoa.getSoLuongTonkho()*1.1;
                tonHangSanhSu += hangHoa.getSoLuongTonkho();
                if(!hangHoa.getDanhGia().equalsIgnoreCase("khong co")) {
                    danhGiaHangSanhSu +=1;
                }
            }
            else{
                matHangThucPham += 1;
                giaTriHangThucPham += hangHoa.getDonGia()*hangHoa.getSoLuongTonkho()*1.05;
                tonHangThucPham += hangHoa.getSoLuongTonkho();
                if(!hangHoa.getDanhGia().equalsIgnoreCase("khong co")){
                    danhGiaHangThucPham +=1;
                }
            }
        }


        System.out.println("===== Hang thuc pham =====");
        System.out.println("Tong so luong hang trong kho: "+matHangThucPham);
        System.out.println("Tong gia tri hang trong kho: "+giaTriHangThucPham);
        System.out.println("Tong so luong hang ton trong kho: "+tonHangThucPham);
        System.out.println("Tong so luong hang danh gia kho ban: "+danhGiaHangThucPham);
        System.out.println("===== Hang dien may =====");
        System.out.println("Tong so luong hang trong kho: "+matHangDienMay);
        System.out.println("Tong gia tri hang trong kho: "+giaTriHangDienMay);
        System.out.println("Tong so luong hang ton kho: "+tonHangDienMay);
        System.out.println("Tong so luong hang danh gia ban duoc: "+danhGiaHangDienMay);
        System.out.println("===== Hang sanh su =====");
        System.out.println("Tong so luong hang trong kho: "+matHangSanhSu);
        System.out.println("Tong gia tri hang trong kho: "+giaTriHangSanhSu);
        System.out.println("Tong so luong hang ton kho: "+tonHangSanhSu);
        System.out.println("Tong so luong hang danh gia ban cham: "+danhGiaHangSanhSu);
    }
}
