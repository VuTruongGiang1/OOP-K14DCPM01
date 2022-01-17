package baitap;

public class ShapeMain {
    public static void main(String[] args) {
        HinhVuong sq = new HinhVuong();
        sq.xoayHV();
        sq.showHV();

        HinhTamGiac cir = new HinhTamGiac();
        cir.xoayHTG();
        cir.showHTG();

        HinhTron tri = new HinhTron();
        tri.xoayHT();
        tri.showHT();
    }
}
