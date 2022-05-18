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
public class DLL_Node {
    Flower flower;
    DLL_Node next;
    DLL_Node previous;
    public DLL_Node(Flower f) {
        this.flower = f;
        next = previous = null;
    }
    public DLL_Node(String name, String original, int price){
        this(new Flower(name, original, price));
    }
}
