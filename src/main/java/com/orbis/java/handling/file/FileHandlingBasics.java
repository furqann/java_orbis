package com.orbis.java.handling.file;

import java.io.File;
import java.io.IOException;

public class FileHandlingBasics {
    public static void main(String[] args){

        File file = new File("info.txt");
        System.out.println("File exists: " + file.exists());
        try {
            System.out.println("File created: " + file.createNewFile());
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("After creation exists: " + file.exists());
        System.out.println("Absolute Path: " + file.getAbsolutePath());
        System.out.println("Filename: " + file.getName());
        System.out.println("Path: " + file.getPath());
        System.out.println("Deleting File" + file.delete());
        System.out.println("After deleting file" + file.exists());

    }
}
