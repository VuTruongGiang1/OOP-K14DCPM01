package oo.tuan05.buoi10;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WritingObject {
    public static void main(String[] args) throws IOException{
        //1.
        FileOutputStream outFile = new FileOutputStream("data.dat");

        //2.
        ObjectOutputStream objOut = new ObjectOutputStream(outFile);

        //HangThucPham
        HangThucPham htp = new HangThucPham("HTP01", "Mi Hao Hao", 3_500, new Date(), new Date());

        //3.
        objOut.writeObject(htp);

        System.out.println(htp);

        //4.
        objOut.close();
    }
}
