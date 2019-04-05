package org.fasttrackit;

public class MyException extends Exception {

    String sentence;
    MyException(String sentence)
    {
        this.sentence=sentence;
    }

    public String toString()
    {
        return sentence;
    }
}
