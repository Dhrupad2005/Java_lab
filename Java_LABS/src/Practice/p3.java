package Practice;

import java.sql.SQLOutput;

public class p3 {
    public static void main(String[] args){
        String name= "Dhrupad";
        int length=name.length();
        System.out.println(length);
        String low= name.toLowerCase();
        System.out.println(low);
        String high=name.toUpperCase();
        System.out.println(high);
        System.out.println(name);
        //substring(start index,endindex)->start index is included but endindex is excluded
        System.out.println(name.substring(0,3));
        System.out.println(name.replace('D','C'));
        System.out.println(name.startsWith("nn"));
        System.out.println(name.endsWith("ad"));
        System.out.println(name.charAt(4));
        System.out.println(name.indexOf("pa"));
        System.out.println(name.indexOf("D",2));

    }
}
