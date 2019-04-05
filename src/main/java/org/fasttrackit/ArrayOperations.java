package org.fasttrackit;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class ArrayOperations {
    public static int[] tabInt=new int[10];

    public static void main(String[] args)
    {
        int i=0;
        Arrays.fill(tabInt,0,2,5);//indicii [0,2) primesc valoarea 5
        Arrays.fill(tabInt,2,5,1);//indicii [2,5) primesc valoarea 1
        Arrays.fill(tabInt,4,8,3);//indicii [4,8) primesc valoarea 3
        Arrays.fill(tabInt,8,10,2);//indicii [8,10) primesc valoarea 2
        for(i=0;i<10;i++) {
            System.out.println("tabInt[" + i + "]= " + Array.getInt(tabInt, i));//se afiseaza sirul nesortat
        }

        Arrays.sort(tabInt,0,10);
        System.out.println("Tabelul cu datele sortate este:");
        for(i=0;i<10;i++)
        {
            System.out.println("tabInt["+i+"]= "+Array.getInt(tabInt,i));//se afiseaza sirul sortat
        }

        System.out.println("Lungimea tabloului array este "+Array.getLength(tabInt));

        Collection collection=new ArrayList();
        for(i=0;i<10;i++) {
            collection.add(i);
        }

        //afisarea elementelor colectiei caracter cu caracter
        System.out.print("Colectia cuprinde elementele (caracter cu caracter) : ");
        for(i=0;i<10;i++) {
            if(i!=9) System.out.print(((ArrayList) collection).get(i)+", ");
            else System.out.print(((ArrayList) collection).get(i)+"\n");
        }

        //afisarea intregii colectii
        System.out.print("Colectia intreaga cuprinde elementele "+collection+"\n");

        //in colectie adaug o alta coletie
        Collection collection2=new ArrayList();
        for(i=(int)'a';i<(int)'z';i++) {
            collection2.add(i);
        }
        collection.addAll(collection2);
        System.out.print("Colectia2 intreaga cuprinde elementele "+collection);
    }
}

