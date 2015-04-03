package org.anicloud.exception;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by zhaoyu on 15-4-1.
 */
public class Java7NewFileMethod {

    public static void main(String[] args) {

        Path path = Paths.get("/home/zhaoyu/a.txt");
        System.out.println(path.getFileName());
        System.out.println(path.toString());

    }

}
