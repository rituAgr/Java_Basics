package Generics;

import java.util.ArrayList;

/**
 * Created by Ritu on 11/4/16.
 */
public class Intro {
    public static void main(String args[]) {
    ArrayList<String> l=new ArrayList<String>();
        l.add("RITU");
       // l.add(3);
        System.out.println(l.toString());
    }
}
/*class generic<String>
{
    String data;
    generic (String s)
    {
        data=s;
    }
}*/
