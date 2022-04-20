package kiemtracuoiky;

import java.util.ArrayList;

public abstract class HangHoa {
    //private static final ArrayList<HangThucPham> list = null;
    int mh;
    boolean maHang;
    String tenHang;
    int soLuongTon;
    int donGia;
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

    public void setMaHang(boolean maHang) {
        this.maHang = maHang;
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

    public void hangThucPham(){};
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

    public void hangSanhSu(ArrayList<HangSanhSu> hangSanhSus){
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
    public abstract void inDanhSachHangHoa();

    public abstract void themHangHoa();

    public abstract void suaHangHoa();

    public abstract void xoaHagHoa();

    public abstract void timKiemTheoMaHang();

    public abstract void timKiemTheoTenHang();

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
