package java10M.week1.day5.file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
    private String filename;

    public ReadFile(String filename) {
        this.filename = filename;
    }

    public char readAByte() throws IOException {
        FileReader fr = new FileReader(filename);
        BufferedReader br = new BufferedReader(fr);
        return (char)br.read();
    }
}
