package org.fasttrackit;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Vector;

public class MyVector {

    private Vector<Integer> vector = new Vector ();

    public void adaugaElement()
    {//elements are added
        vector.addElement (1);
        vector.addElement (2);
        vector.addElement (3);
        vector.addElement (4);
        vector.addElement (5);
        vector.addElement (6);
        vector.addElement (7);
        vector.addElement (8);
        vector.addElement (9);
        vector.addElement (10);
    }

    public int dimensiuneVector()
    {
        return vector.size ();
    }

    public int getFirstElement()
    {
        return vector.firstElement ();
    }

    public void insert()
    {//elements are added at specified positions
        vector.insertElementAt (30,5);
        vector.insertElementAt (31,6);
        vector.insertElementAt (32,7);
        vector.insertElementAt (33,8);
        vector.insertElementAt (34,9);
    }

    public void elementsVector()
    {//show the elements from vector
        int i;
        for(i=0;i<vector.size ();i++)
        {
            if(i!=vector.size ()-1) System.out.print (vector.elementAt (i)+", ");
            else System.out.print (vector.elementAt (i)+"\n");
        }
    }

    private int choiceNumber()
    {
        System.out.println ("Enter a number for who you want to know if the vector contains this or not");
        try{
            Scanner scanner=new Scanner (System.in);
            int number=scanner.nextInt ();
            return number;
        }catch(InputMismatchException exception)
        {
            System.out.println ("You didn't enter a valid number");
            return choiceNumber();
        }
    }

    public void containsNumber()
    {//check if a number is part of vector or not
        int contains=choiceNumber();
        if(vector.contains (contains)) System.out.println ("Vector contains element "+contains);
        else System.out.println ("Vector doesn't contain element "+contains);
    }
}

