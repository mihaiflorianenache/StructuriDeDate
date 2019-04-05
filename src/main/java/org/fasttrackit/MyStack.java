package org.fasttrackit;

import java.util.Stack;
import java.util.Vector;

public class MyStack {
    public Stack<Integer> stack = new Stack ();

    public void adaugaElement()
    {//elements are added in stack
        stack.addElement (1);
        stack.addElement (2);
        stack.addElement (3);
        stack.addElement (4);
        stack.addElement (5);
        stack.addElement (6);
        stack.addElement (7);
        stack.addElement (8);
        stack.addElement (9);
        stack.addElement (10);
    }

    public int peekStack()
    {
        return stack.peek ();
    }

    public Stack popElements()
    {
        stack.pop ();
        return stack;
    }

    public boolean isStackEmpty()
    {
        return stack.empty ();
    }

    public void pushObject(int i)
    {
        stack.push (i);
    }

    public void insertOtherElement()
    {
        stack.insertElementAt (34,3);
        stack.insertElementAt (35,4);
        stack.insertElementAt (36,5);
    }

    public void addElementPeekStack(int i)
    {//stack has dynamic size therefore everytime we will put a element at stack.size() position because size is change dynamically
        stack.insertElementAt (40+i,stack.size ());
    }
}

