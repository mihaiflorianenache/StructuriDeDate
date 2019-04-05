package org.fasttrackit;

import java.util.ArrayList;
import java.util.Collection;

public class MyArrayList {

    ArrayList myArrayList=new ArrayList ();
    Collection collection=new ArrayList ();

    public void addElement(int i)
    {
        myArrayList.add (i,i);
    }

    public ArrayList displayArrayList()
    {
        return myArrayList;
    }

    public void clearArrayList()
    {
        myArrayList.clear ();
    }

    public void addElementsInColection(int i)
    {
        collection.add (i+100);
    }

    public void addCollectionAtList()
    {
        myArrayList.addAll (collection);
    }

}

