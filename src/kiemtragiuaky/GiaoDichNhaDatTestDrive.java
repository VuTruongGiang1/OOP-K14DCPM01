package kiemtragiuaky;

public class GiaoDichNhaDatTestDrive{
    public static void main(String[] args) {
        GiaoDichDat giaoDichDat = new GiaoDichDat();
        giaoDichDat.nhap();
        giaoDichDat.toString();
        giaoDichDat.ttien();

        GiaoDichNha giaoDichNha = new GiaoDichNha();
        giaoDichNha.nhap();
        giaoDichNha.ttien();
    }
}
