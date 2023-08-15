package practice;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class Pr1 {

	public static void main(String[] args) {
		Map <String, String> _kuksmap = new HashMap <String, String>();
		
		List <String> _listDd = new ArrayList<String>();
		_listDd.add("20230101");
		_listDd.add("20230815");
		
		List <String> _listId = new ArrayList<String>();
		_listId.add("9611091");
		_listId.add("0002114");
		
		for (int i=0; i<_listDd.size(); i++) {
			_kuksmap.put(_listDd.get(i), _listId.get(i));
			System.out.println((i+1) + ". _kuksmap: " + _kuksmap.get(_listDd.get(i)));
		}		
	}

}
