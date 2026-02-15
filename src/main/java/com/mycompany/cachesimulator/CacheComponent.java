/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cachesimulator;

/**
 *
 * @author Admin
 */
public class CacheComponent {
    private String tag;
    private String data;
    
    public CacheComponent(){
        tag = "";
        data = "";
    }
    
    public CacheComponent(String t, String d){
        tag = t;
        data = d;
    }
    
    public CacheComponent(int t, String d){
        String[] binary = {
            "0000","0001","0010","0011","0100","0101","0110","0111",
            "1000","1001","1010","1011","1100","1101","1110","1111"};      
        tag = binary[t];
        data = d;
    }
    
    public String getTag(){
        return tag;
    }
    
    public String getData(){
        return data;
    }
    
    public void setTag(String str){
        tag = str;
    }
    
    public void setData(String str){
        data = str;
    }
    
    public boolean equals(CacheComponent a){
        return tag.equals(a.tag) && data.equals(a.data);
    }
}
