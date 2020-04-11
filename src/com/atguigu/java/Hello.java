package com.atguigu.java;

import java.util.ArrayList;

/**
 * @author shkstart
 * @create 2020/4/10 - 17:52
 */
public class Hello {

    public static final int num = 2;
    
    //prsf
    private static final int A = 0;

    //psf
    public static final int B = 1;

    //psfi
    public static final int C = 2;

    //psfs
    public static final String NAT = "sad";

    //1.psvm
    public static void main(String[] args) {

        //2.sout
        System.out.println();

        //soutp/soutm/soutv/xxx.sout
        int b = 2;

        //xxx.sout
        System.out.println(b);

        //soutv
        System.out.println("b = " + b);

        //3.fori
        String[] strings = {"Tom", "Jerry", "Hanmeimei", "Lilei"};
        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i]);
        }

        //变形.iter增强for循环
        for (String string : strings) {
            System.out.println(string);
        }

        //itar
        for (int i = 0; i < strings.length; i++) {
            String string = strings[i];
            System.out.println(string);
        }


        ArrayList<Object> list = new ArrayList<>();
        list.add(123);
        list.add(345);
        list.add(5967);

        //list.for
        for (Object o : list) {

        }

        //list.fori
        for (int i = 0; i < list.size(); i++) {

        }
        
        //list.forr逆序
        for (int i = list.size() - 1; i >= 0; i--) {
            
        }

        ArrayList<Object> list = new ArrayList<>();
        list.add(123);
        list.add(345);
        list.add(5967);

        //ifn
        if (list == null) {

        }
        //inn
        if (list != null) {
            
        }

    }

    
}
