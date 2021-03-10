package week4;

import acm.program.ConsoleProgram;
import java.util.*;
import acm.program.*;

public class NameCounts extends ConsoleProgram {
	
public void run() {
		HashMap<String,Integer> nameMap = new HashMap<String,Integer>();
		readNames(nameMap);
		printMap(nameMap);

	}

private void readNames(HashMap<String, Integer> nameMap) {
		// TODO Auto-generated method stub
		while(true) {
			String name = readLine("Enter name: ");
		if(name.equals("")) break;
			Integer count = map.get(name);
		if(count == null) {
			count = newInteger(1);
	}  else{
		count = newInteger(count + 1);
		}
			map.put(name, count);
	}
  }
private void printMap(Map<String,Integer> map) {
		Iterator<String> it = map.keySet().iterator();
	while(it.hasNext()) {String key = it.next();
		intcount = map.get(key);
		println("Entry [" + key + "] has count " + count);
	  }
    }
  }

