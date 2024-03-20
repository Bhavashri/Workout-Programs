package mapPro;
import java.util.HashMap;
import java.util.Map;
public class StlMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> map=new HashMap<String, String>();
		map.put("name", "Bhavas");
		map.put("age", "21");
		map.put("gender", "female");
		
		System.out.println(map.get("name"));
		System.out.println(map.get("age"));
		System.out.println(map.get("gender"));
		
		Map<String, Integer>map1=new HashMap<String, Integer>();
		map1.put("Age", 23);
		map1.put("pincode", 687493);
		System.out.println(map1.get("Age"));
		System.out.println(map1.get("pincode"));
		
		Map<Integer, Double>map2=new HashMap<Integer, Double>();
		map2.put(0,22.3);
		map2.put(1,24.98);
		map2.put(2,54.86);
		System.out.println(map2.get(2));
		
		map.keySet();
	}
}
