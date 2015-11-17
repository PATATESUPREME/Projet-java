package bourse;

import java.util.ArrayList;
import java.util.List;

/**
 * @author DESSIMOULIE Kévin
 * @author BOISMORAND Baptiste
 *
 * @class Filter.java
 */
public class Filter<T> {

	public List<T> filter(List<T> traders, Predicat<T> predicat) {
		List<T> result = new ArrayList<T>();
		for(final T t : traders) {
			if(predicat.test(t)) {
				result.add(t);
			}
		}
		return result;
	}
}
