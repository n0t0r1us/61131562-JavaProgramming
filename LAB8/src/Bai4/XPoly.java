package Bai4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class XPoly {
    public static final double sum(double...x) {
        double t = 0;
        for (double a: x) {
            t += a;
        }
        return t;
    }
    public static final double min(double...x){
        double m = x[0];
        for (double a : x) {
            if (m>a)
            	m = a;
        }
        return m;
    }
      public static final double max(double ... x){
        List<Double> ls = new ArrayList<>();	//ls chứa danh sách tham số
        for (double a: x) {
        	ls.add(a);	//thêm tham số vào ls
        }
        Collections.sort(ls);	//sắp xếp danh sách theo thứ tự từ nhỏ đến lớn
        
        return ls.get(ls.size()-1);
    }
     
      public static String toUpperFirstChar(String s){
          String[] arrS = s.split(" ");	//cắt chuỗi theo dấu cách
          for(int i=0;i<arrS.length; i++) {
        	  arrS[i] = String.valueOf(arrS[i].charAt(0)).toUpperCase() + arrS[i].substring(1);
        	  
          }
          return String.join(" ", arrS);
      }

    
}
