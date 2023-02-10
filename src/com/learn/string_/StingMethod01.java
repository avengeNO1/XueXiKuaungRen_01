package com.learn.string_;

/**
 * @author HuAng
 */
public class StingMethod01 {
    public static void main(String[] args) {
        String s1 = "name";
        String s2 = "hello";
        System.out.println(s1.equals(s2));

        s2 = "Mary";
        System.out.println(s1.equalsIgnoreCase(s2));

        System.out.println(s1.length());
        String s3 = "qwed&123&((";
        System.out.println(s3.indexOf("&"));

        System.out.println(s3.lastIndexOf("&"));

        System.out.println(s3.substring(1));
        System.out.println(s3.substring(2,5));//ed&

        System.out.println(s3.charAt(1));

        System.out.println(s1.toUpperCase());

        System.out.println(s2.toLowerCase());

        String s = "";
        System.out.println(s.concat(s1.concat(s2).concat(s3)));

        String s4 = "ha java PHP c++";
        System.out.println(s4.replace("PHP","JavaScript"));

        String s5 = "床前明月光,疑似地上霜,举头望明月,低头思故乡";
        String []s6 = s5.split(",");
        for (int i = 0; i < s6.length; i++){
            System.out.println(s6[i]);
        }

        s1 = "qwa123";
        s3 = "qwa1";
        System.out.println(s1.compareTo(s3));

        System.out.println("============");
        char[] ch = s1.toCharArray();
        for (int i = 0; i < ch.length; i++){
            System.out.println(ch[i]);
        }


    }
}

   