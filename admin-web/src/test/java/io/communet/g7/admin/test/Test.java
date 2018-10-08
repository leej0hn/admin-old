package io.communet.admin.test;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		list.add("6");
		list.add("7");
		list.add("8");
		list.add("9");
		list.add("10");
		int pageSize = 3 ;
		int pageNum  ;
		int index  ;
		int endIndex = 0;
		if( list.size() > pageSize ){
			pageNum = list.size() / pageSize ;
			if( pageNum * pageSize < list.size() ){
				pageNum ++ ;
			}
			for (int i = 0; i < pageNum; i++) {
				index = endIndex;
				endIndex = index + pageSize;
				if( endIndex > list.size() ){
					endIndex = list.size();
				}
				List<String> list1 = list.subList(index, endIndex);
				System.out.println(list1);
			}
		}

	}
}
