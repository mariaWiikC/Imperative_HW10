package com.company;

public class Main
{

    public static void main(String[] args)
    {
        int a = 10, b = 4;
        int r = a % b;

        while (r != 0)
        {
            a = b;
            b = r;
            r = a % b;
        }
        System.out.println(b);

    }
}
