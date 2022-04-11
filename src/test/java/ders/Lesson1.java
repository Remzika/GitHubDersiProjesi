package ders;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Lesson1 {


    public static void main (String[] args) {

        //type safe
        //wrapper class
        //primitive-non primitive

        List<String> myList = new LinkedList();
        myList.add("ali");
        myList.add("yunus");

        //map olustururken key ve value degerlerinin tipini belirterek map.imizi type safe yapmaliyiz

        //Map<Integer, String>myMap = new HashMap<>();
        Map<Long, String> calisanlar = new HashMap<>();
        Map<Long, String> calisanlar2 = new HashMap<>();

      ////////////

        ///////////////

        calisanlar.put(101L,"ali");
        calisanlar.put(101L,"veli");
        //map.e baska map ekleme
        calisanlar.putAll(calisanlar2);

        //butun keyleri bana set olarak ver.
        calisanlar.keySet();
        //butun value.leri bana collection olarak ver
        calisanlar.values();

        //System.out.println(calisanlar.get(101).substring(1)); type safe degil..!  objeckt aliyorlar..
        //System.out.println(calisanlar.containsKey(101));//false
        //System.out.println(calisanlar.containsKey(101L));//true
        calisanlar.containsValue("gul");
        calisanlar.equals(calisanlar2);

    }
}
