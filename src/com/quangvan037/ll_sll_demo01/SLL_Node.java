/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.quangvan037.ll_sll_demo01;

/**
 *
 * @author QUANG VAN
 */
public class SLL_Node {
    SoftDrink data;
    SLL_Node next;
    public SLL_Node(SoftDrink aSD) {
        this.data = aSD;
        next = null;
    }
    
    public SLL_Node(String productLine, String company, int volume, int price){
        SoftDrink aSD = new SoftDrink(company, company, volume, price);
        this.data = aSD;
        next = null;
    }
}
