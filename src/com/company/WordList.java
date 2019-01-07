package com.company;
import java.util.ArrayList;

public class WordList
{
    private ArrayList<String> myList;

    public WordList(ArrayList animalArr)
    {
        myList = animalArr;
    }

    public int numWordsOfLength(int len)
    {
        int count = 0;
        for (String words : myList)
        {
            if (words.length() == len)
                count++;
        }
        return count;
    }

    public void removeWordsOfLength(int len)
    {
        for (int i = myList.size() - 1; i >= 0; i--)
        {
            if (myList.get(i).length() == len)
                myList.remove(i);
        }
    }

    public String toString()
    {
        String str = "";
        for (int i = 0; i < myList.size(); i++)
        {
            str = str + myList.get(i) + " ";
        }
        return str;
    }
}