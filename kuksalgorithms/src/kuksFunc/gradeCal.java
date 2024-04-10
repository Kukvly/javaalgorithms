package kuksFunc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class gradeCal {
   
      public static void main(String[] args) throws IOException{
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         int classNum = Integer.parseInt(br.readLine());
         double arr[] = new double[classNum];
         
         double sum = 0;
         for(int i=0; i<arr.length; i++) {
            arr[i] = Double.parseDouble(br.readLine());
            sum += arr[i];
         }
         double total = sum/(arr.length);
         System.out.println(total);
         
      }

   }