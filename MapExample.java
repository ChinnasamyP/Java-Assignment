package java8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapExample {

	public static void main(String[] args) {

		try {

			Map<String, Integer> routeFareMap = new HashMap<>();
			routeFareMap.put("13", 10);
			routeFareMap.put("13-C", 15);
			routeFareMap.put("342-R", 10);
			routeFareMap.put("146-Q", 10);
			routeFareMap.put("27", 15);
			routeFareMap.put("29-A", 12);
			routeFareMap.put("215-U", 12);
			routeFareMap.put("27-E1", 15);
			routeFareMap.put("13J", 12);
			routeFareMap.put("SBS-D34G", 10);

			Map<Integer, List<String>> fareRouteMap = new HashMap<>();

			for (Map.Entry<String, Integer> entry : routeFareMap.entrySet()) {
				String route = entry.getKey();
				int fare = entry.getValue();

				if (fareRouteMap.containsKey(fare)) {
					fareRouteMap.get(fare).add(route);
				} else {
					List<String> routes = new ArrayList<>();
					routes.add(route);
					fareRouteMap.put(fare, routes);
				}
			}

			System.out.println("Fare\tRoute");
			for (Map.Entry<Integer, List<String>> entry : fareRouteMap.entrySet()) {
				System.out.println(entry.getKey() + "\t" + entry.getValue());
			}	
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
