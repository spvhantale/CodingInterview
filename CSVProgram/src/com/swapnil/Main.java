package com.swapnil;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;


public class Main {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub

		
		try {
			BufferedReader br = new BufferedReader(new FileReader(".csv"));
			while(br.readLine()!=null) {
				
				String[] str=br.readLine().split(",");
				
				HashMap<String,String> hmap=new HashMap<>();
				for(String s:str) {
					String[] st=s.split(":");
					hmap.put(st[0], st[1]);
				}
				
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  catch(IOException e) {
			e.printStackTrace();
		}

	}

}
