/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listpractice;

import java.util.*;

/**
 *
 * @author mrasouly
 */
public class Listpractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<String> stringlist = new ArrayList<String>();

        stringlist.add("moe");
        stringlist.add("larry");
        stringlist.add("curly");

        System.out.println(stringlist.size());
        System.out.println(stringlist.get(0));
        System.out.println(stringlist.get(1));

        stringlist.set(0, "joe");
        stringlist.remove(1);

        for (int i = 0; i < stringlist.size(); i++) {
            System.out.println(stringlist.get(i));
        }

        for (String name : stringlist) {
            System.out.println(name);

        }//PRINT THIS LIST IN TWO OTHER WAYS
    }
}
