package java10M.week1.day5.collection;

import java.util.List;

public class ListPracticeMain {
    public static void main(String[] args) {
        LikeLion2th ll2th = new LikeLion2th();
        List<String> students = ll2th.getStudentList();

        for(String student :students){  // for each 문 iter로 바로 생성 가능
            System.out.println(student);
        }
        System.out.println(students.size());

    }
}
