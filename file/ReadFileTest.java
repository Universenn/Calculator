package java10M.week1.day5.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileTest {
    public static void main(String[] args) throws FileNotFoundException { // throws FileNotFoundException // 파일이 없을 시 예외처리
        //      ./ : 현재 디랙토리
        //  프로젝트 루트 : 인텔리제이 가장 상단에 있는 디렉토리 java

        // 현재 디렉토리에 첫번째 파일 읽기
        FileReader fileReader =new FileReader("./a_file.txt");
        File dir = new File("./");
        File files[] = dir.listFiles();
        System.out.println(files[0]);
        for (File file : files) {
            System.out.println(file);
        }
        /*.\.idea
          .\.idea
          .\a_file.txt
          .\Java.iml
          .\out
           .\src
*/
    }
}
