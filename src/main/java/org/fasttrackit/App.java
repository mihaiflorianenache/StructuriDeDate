package org.fasttrackit;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App
{
    static int addDynamicElementInStack()
    {
        try {
            System.out.println ("How many elements do you want to add in stack ?");
            Scanner scanner=new Scanner (System.in);
            int numberElementsAdd=scanner.nextInt ();
            if(numberElementsAdd<0) return addDynamicElementInStack();
            else
                return numberElementsAdd;
        }catch(InputMismatchException exception)
        {
            return addDynamicElementInStack();
        }
    }

    public static void main( String[] args )
    {
        //Vector
       /* MyVector myVector=new MyVector();
        myVector.adaugaElement ();

        //insert other elements beside elements who are now in vector (this data structure has dynamic size)
        myVector.insert ();
        System.out.println ("First element from vector is "+myVector.getFirstElement ());
        System.out.println ("Vector contains "+myVector.dimensiuneVector ()+" elements");
        System.out.println ("Elements from vector are ");
        myVector.elementsVector ();
        myVector.containsNumber();

       /******************************************************************************************************************/

        //Stack
       /* MyStack myStack=new MyStack();
        myStack.adaugaElement ();
        System.out.println ("The element from the peek of stack is "+myStack.peekStack ());
        System.out.println ("After removing the element form the peek of stack it contains follow elements "+myStack.popElements ());
        int i;
        int j=myStack.stack.size ();
        for(i=0;i<j;i++)
        {//all elements from stack are removed
            myStack.popElements ();
        }

        //check is the stack is empty
        System.out.println ("Is stack empty ? "+myStack.isStackEmpty ());

        //se adauga obiecte in stiva
        for(i=1;i<=10;i++) {
            myStack.pushObject (i);
        }

        //add some elements beside the elements who was before (stack has dynamic size)
        myStack.insertOtherElement ();

        //objects after the stack was fill again is
        j=myStack.stack.size ();
        System.out.print ("The stack contains ");
        for(i=0;i<j;i++)
        {
            if(i!=j-1) System.out.print (myStack.stack.elementAt (i)+", ");
            else System.out.println (myStack.stack.elementAt (i));
        }

        int addNewElements=addDynamicElementInStack();
        for(i=0;i<addNewElements;i++)
        {
            myStack.addElementPeekStack(i);
        }

        System.out.println ("Peek of stack has value "+myStack.stack.peek ());

        System.out.print ("The stack contains ");
        j=myStack.stack.size ();
        for(i=0;i<myStack.stack.size ();i++)
        {
            if(i!=myStack.stack.size ()-1) System.out.print (myStack.stack.elementAt (i)+", ");
            else System.out.println (myStack.stack.elementAt (i));
        }
        */
        /*******************************************************************************************************************/

        MyArrayList myArrayList=new MyArrayList ();
        int i;
        for(i=0;i<10;i++) {
            myArrayList.addElement (i);
        }
        System.out.println ("Array list contains "+myArrayList.displayArrayList ());

        myArrayList.myArrayList.clear ();

        System.out.println ("Is list empty ? "+myArrayList.myArrayList.isEmpty ());

        //elements who are add in a collection
        for(i=0;i<10;i++)
        {
            myArrayList.addElementsInColection (i);
        }
        myArrayList.addCollectionAtList ();
        System.out.println ("Array list contains "+myArrayList.displayArrayList ());
    }
}
