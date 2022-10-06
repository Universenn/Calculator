package java10M.week1.day5.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileTest {
    public ReadFileTest() {
    }

    public void printFile(){
        // 현재 디렉토리에 첫번째 파일 읽기

        File dir = new File("./");
        File files[] = dir.listFiles();
        System.out.println(files[0]);

        for (File file : files) {
            System.out.println(file);
        }
    }
    public char readAChar(String filename) throws IOException {
        FileReader fileReader = new FileReader("./a_file.txt");
        return (char) fileReader.read();// .read 한글자씩 읽어오기 (char)이기때문에 변환해서 글자 생성
    }

    public String read2AChar(String filename) throws IOException {
        FileReader fileReader = new FileReader("./a_file.txt");
        String str = "";
        str += (char) fileReader.read();
        str += (char) fileReader.read();
        return str;// .read 한글자씩 읽어오기 (char)이기때문에 변환해서 글자 생성
    }
    public String readNAChar(int N) throws IOException {
        FileReader fileReader = new FileReader("./a_file.txt");
        String str = "";
        for (int i = 0; i<N; i++) {
            int asciiCd = fileReader.read();
            if (asciiCd == -1) {
                return str;
            }
            str += (char) asciiCd;
        }
        return str;// .read 한글자씩 읽어오기 (char)이기때문에 변환해서 글자 생성
    }

    public static void main(String[] args) throws IOException { // throws FileNotFoundException // 파일이 없을 시 예외처리
        //      ./ : 현재 디랙토리
        //  프로젝트 루트 : 인텔리제이 가장 상단에 있는 디렉토리 java

        // 한글자 읽기
        ReadFileTest readFileTest = new ReadFileTest();
        char c = readFileTest.readAChar("./a_file.txt");
        System.out.println(c);

        // 두글자 읽기
        ReadFileTest read2FileTest = new ReadFileTest();
        String str = read2FileTest.read2AChar("./a_file.txt");
        System.out.println(str);

        // N글자씩 읽기
        ReadFileTest readNFileTest = new ReadFileTest();
        String str2 = read2FileTest.readNAChar(5);
        System.out.println(str2);
    }
}
