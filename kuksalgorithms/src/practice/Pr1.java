package practice;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class Pr1 {



	int printType(Integer x) {
		System.out.println(x + " is an int");
		return x;
	}


	double printType(Double x) {
		System.out.println(x + " is an double");
		return x;
	}

	
	public static void main(String[] args) {
//		Map <String, String> _kuksmap = new HashMap <String, String>();
//		
//		List <String> _listDd = new ArrayList<String>();
//		_listDd.add("20230101");
//		_listDd.add("20230815");
//		
//		List <String> _listId = new ArrayList<String>();
//		_listId.add("9611091");
//		_listId.add("0002114");
//		
//		for (int i=0; i<_listDd.size(); i++) {
//			_kuksmap.put(_listDd.get(i), _listId.get(i));
//			System.out.println((i+1) + ". _kuksmap: " + _kuksmap.get(_listDd.get(i)));
//		}		

		int n=13;
		int l=3;
		Integer q = 1;
		Double xx = 1.0;
		
		double nTemp = n;
		double lTemp = l;
		
		Double x = nTemp%lTemp;
		
		double zz = (double)n + (double)l;
		
		if (x.getClass().getName()=="double") {
			System.out.println("궁금해: " + x.getClass().getName());
		}
		
		if(x==1) {
			System.out.println("yunx: " + x);
		} else {
			System.out.println("kukx: " + x);
		}

		
		
		System.out.println("int->double: " + nTemp%lTemp);
		System.out.println("int->double: " + nTemp/lTemp);
		
		double zzzz = 44;
		double ggg = 14;
		
		System.out.println("rtn/: " + zzzz/ggg);
		System.out.println("rtn%: " + zzzz%ggg);
		
	}

}
