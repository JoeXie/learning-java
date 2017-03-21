package com.iostream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by Xie on 2017.3.21.
 */
public class FileInputOutputDemo {
    public static void main(String[] args) {
        try {
            FileCopyUtil.copyFile("./in.txt", "out.txt");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

class FileCopyUtil {
    public static void copyFile(String src, String dst) throws IOException {

        FileInputStream fin = new FileInputStream(src);
        FileOutputStream fout = new FileOutputStream(dst);
        int data = 0;
        while ((data = fin.read()) != -1) {
            fout.write(data);
            System.out.print((char) data);

        }
        fin.close();
        fout.close();


    }
}