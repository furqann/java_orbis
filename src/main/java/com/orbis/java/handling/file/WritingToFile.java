package com.orbis.java.handling.file;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WritingToFile {
    public static void main(String[] args) throws IOException {
        File file = new File("write_file.txt");
        FileWriter writer = new FileWriter(file);
        writer.write("This is the first line");
    }
}
