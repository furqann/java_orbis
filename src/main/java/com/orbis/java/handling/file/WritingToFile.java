package com.orbis.java.handling.file;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WritingToFile {
    public static void main(String[] args) throws IOException {
        //Simple Writing
        File file = new File("simple_write_file.txt");
        if(!file.exists()){
            file.createNewFile();
        }
        FileWriter writer = new FileWriter(file,true);
        writer.write("This is the first line\n");
        writer.write("This is the Second line\n");
        writer.write("This is the third line");
        writer.close();

        //Append at the end of file
        File appendFile = new File("append_write_file.txt");
        if(!appendFile.exists()){
            file.createNewFile();
        }
        FileWriter append_writer = new FileWriter(appendFile,true);
        append_writer.write("This is the first line\n");
        append_writer.write("This is the Second line\n");
        append_writer.write("This is the third line");
        append_writer.close();
    }
}
