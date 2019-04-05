package org.fasttrackit;

public class MyString {
    public static void main(String[] args){
        String s="  ana  y y u i  ";
        StringBuilder sb=new StringBuilder();
        StringBuffer sbuf=new StringBuffer();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)!=' ') {
                sb.append(s.charAt(i));
                sbuf.append(s.charAt(i));
            }
        }
        System.out.println("sb= "+sb);
        System.out.println("sbuf= "+sbuf);
    }
}


