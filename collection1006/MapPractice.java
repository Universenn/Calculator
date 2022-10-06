package java10M.week1.day5.collection1006;

import java.util.HashMap;

public class MapPractice {
    public static void main(String[] args) {

        HashMap<String, String> map = new HashMap<>();
        // map 선언시 제네릭이 두개 들어감.
        // 첫 번째 제네릭은 Key의 타입
        // 두 번째 제네릭은 Value의 타입
        map.put("우주완", "dnwndhks");
        map.put("황민우", "ghkdalsdn");
        // map.put("전수진", true);
        // map 선언시 제넥릭 설정과 다르면 추가할 수 없음.
        map.put("서태건", "tjxorjs");
        System.out.println(map);
        System.out.println(map.get("우주완"));
        // map에 있는 value를 가져오는 방법 : get(Key)


    }
}
