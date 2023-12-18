package com.acc.lkm.day4;
import java.util.*;
public class TreeMapDemo {

	public static void main(String[] args) {
		NavigableMap<String,Integer>treemap=new TreeMap<>();
		treemap.put("sukumar",87);
		treemap.put("sai",98);
		treemap.put("yechuri", 77);
		treemap.put("soham", 88);
		//for(Map.Entry m1:treemap.entrySet()) {
			//System.out.println(m1.getKey()+" "+m1.getValue());
			//System.out.println(treemap);
			System.out.println(treemap.descendingMap());
			System.out.println(treemap.headMap("sukumar",true));
			System.out.println(treemap.tailMap("sohan",true));
			System.out.println(treemap.subMap("sai",true,"yechuri",true));
		}
	}

