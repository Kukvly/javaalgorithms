package datastructurepr;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Dspr1_2 {
	static int list[];
	static int n;
	static BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input =br.readLine();
		n=Integer.parseInt(input);
		input=br.readLine();
		String[] strList = input.split(" ");
		list=new int[n];
		for (int i=0; i<n ; i++){
			list[i]=Integer.parseInt(strList[i]);
		}
		Arrays.sort(list);
		
		input=br.readLine();
		int m=Integer.parseInt(input);
		input=br.readLine();
		strList= input.split(" ");
		int index=0;
		while (m!=0){
			int search = Integer.parseInt(strList[index]);
			searchNum(search,0,n-1);
			index++;
			m--;
		}
		bw.flush();

	}

	private static void searchNum(int search, int s_index, int e_index) throws IOException{
		int median=(s_index+e_index)/2;
		
		if (s_index<=e_index){
			if (list[median]==search){
				bw.append(1+" ");
			} else if (list[median]>search ){
				searchNum(search, s_index, median-1);
			} else if (list[median]<search ){
				searchNum(search, median+1, e_index);
			}
		} else {
			bw.append(0+" ");
		}
	}

}
