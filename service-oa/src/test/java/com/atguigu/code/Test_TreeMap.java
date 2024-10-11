package com.atguigu.code;

import java.util.Comparator;
import java.util.TreeMap;

public class Test_TreeMap {
    private Integer age;

    public Test_TreeMap(Integer age){
        this.age = age;
    }

    public Integer getAge() {
        return age;
    }

    public static void main(String[] args) {
        TreeMap<Test_TreeMap, String> treeMap = new TreeMap<>(new Comparator<Test_TreeMap>() {
            @Override
            public int compare(Test_TreeMap o1, Test_TreeMap o2) {
                int num = o1.getAge() - o2.getAge();

                return Integer.compare(num,0);
            }
        });

        treeMap.put(new Test_TreeMap(3), "person1");
        treeMap.put(new Test_TreeMap(18), "person2");
        treeMap.put(new Test_TreeMap(35), "person3");
        treeMap.put(new Test_TreeMap(35), "person4");

        treeMap.entrySet().stream().forEach(person -> {
            System.out.println(person.getValue());
        });

    }
}
