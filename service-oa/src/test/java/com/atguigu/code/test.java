package com.atguigu.code;

import org.junit.jupiter.api.Test;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.*;


public class test implements Cloneable{
    public static void main(String[] args) {

        HashSet<Integer>  hashSet = new HashSet<>();
        for (int i = 1; i < 150000; i++) {
            int i1 = new Object().hashCode();
            if(!hashSet.contains(i1)){
                hashSet.add(i1);
            }else{
                System.out.println(i + "次发生了hash冲突");
            }
        }


    }

    @Test
    public void test_Bigdecimal(){
        double a1 = 0.03;
        double a2 = 0.02;
        System.out.println(a1 - a2);
    }
    @Test
    public void test_B(){
        BigDecimal bigDecimal = new BigDecimal("0.01");
        System.out.println(bigDecimal);
    }

    @Test
    public void test_chufa(){
        BigDecimal bigDecimal = new BigDecimal("2.0");
        BigDecimal bigDecimal1 = new BigDecimal("3.0");

        System.out.println(bigDecimal.divide(bigDecimal1,3, RoundingMode.HALF_UP));
    }


    @Test
    public void test_count(){
        int a = 10;

        System.out.println(a--);
    }

    //测试堆排序
    @Test
    public static void sortByHeap(){
        PriorityQueue<Object> objects = new PriorityQueue<>();
    }


    @Test
    public void delete_repeatElment(){
        List<Integer> el = Arrays.asList(1, 1, 3, 3, 3, 4, 4, 4, 5, 5, 6, 7, 7);
        List<Integer> integers = new ArrayList<>(el);
        List<Integer> copy = new ArrayList<>(el);
        for (Integer element : integers) {
                if (copy.indexOf(element) != copy.lastIndexOf(element)){
                    copy.remove(copy.lastIndexOf(element));
                }
        }
        copy.forEach(s -> System.out.println(s + " "));

        String s = new String("abc");
        s.hashCode();

    }



    @Test
    public void test_InputStream(){
        try {
            int content;
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream("./input.txt"));
            long skip = bufferedInputStream.skip(2);
            while((content=bufferedInputStream.read())!= -1){
                System.out.println((char)content);
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}


