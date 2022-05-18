/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.quangvan037.ll_sll_demo02;

/**
 *
 * @author QUANG VAN
 */
public class DLL_FlowerTest {

    public static void main(String[] args) {
        DLL_FlowerList list = new DLL_FlowerList();
        list.addFirst("Hung. Rose", "Hungary", 20);
        list.addFirst("Dalat Rose", "Viet Nam", 2);
        list.addFirst("White Tulip", "Hungary", 10);
        list.addFirst("Orchid", "French", 30);
        list.addFirst("Gladiolus", "Viet Nam", 1);
        
        System.out.println("\nFlowers in the list:");
        list.printAll();
        System.out.println("\nFlowers in the list, Reverse order:");
        list.printALL_reverse();
        System.out.println("Flowers From Hungary:");
        list.printALL_Org("Hungary");
        System.out.println();
        
        String name ="Tigon";
        DLL_Node result = list.search(name);
        if(result == null) System.out.println("Search " + name + ": Not found!");
        else System.out.println("Search: " + result.flower);
        name ="Orchid";
        result = list.search(name);
        if(result == null) System.out.println("Search " + name + ": Not found!");
        else System.out.println("Search: " + result.flower);
        
        System.out.println("\nRemove first operation:");
        list.removeFirst();
        System.out.println("\nFlowers in the list:");
        list.printAll();
        System.out.println("\nRemove last operation:");
        list.removeLast();
        System.out.println("\nFlowers in the list:");
        list.printAll();
        System.out.println("\nSearch and remove:");
        name = "tigon";
        Flower f = list.remove(name);
        if(f==null) System.out.println("Remove failed! " + name);
        else System.out.println("Remove Successfully: " + f);
        name = "White Tulip";
        f= list.remove(name);
        if(result==null) System.out.println("Remove failed! " + name);
        else System.out.println("Remove Successfully: " + f);
        System.out.println("\n Flowers in the list:");
        list.printAll();
    }
}
