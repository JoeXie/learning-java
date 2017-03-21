package com.iostream;

import java.io.File;

/**
 * Created by Xie on 2017.3.21.
 */
public class FileDemo {
    public static void main(String[] args) {
        File file = new File("./");
        File[] files = null;
        if (file != null && file.exists()) {
            files = file.listFiles();
        }

        for (File f : files) {
            if (f.isFile())
                System.out.println(f.getName());
        }

        for (File f : files) {
            if (f.isDirectory())
                System.out.println(f.getName());
        }
    }
}
