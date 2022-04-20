package oo.tuan05.buoi10;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import oo.tuan04.buoi8.HangThucPham;

public class WritingObject {
    public static void main(String[] args) throws IOException{
        //1.
        FileOutputStream outFile = new FileOutputStream("data.dat");

        //2.
        ObjectOutputStream objOut = new ObjectOutputStream(outFile);

        //HangThucPham
        HangThucPham htp = new HangThucPham();

        //3.
        objOut.writeObject(htp);

        System.out.println(htp);

        //4.
        objOut.close();
    }
}
