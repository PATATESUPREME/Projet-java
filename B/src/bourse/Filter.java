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

	/**
	 * Méthode filtrant une liste
	 * @param traders
	 * @param predicat
	 * @return List<T>
	 */
	public List<T> filter(List<T> liste, Predicat<T> predicat) {
		List<T> result = new ArrayList<T>();
		for(final T t : liste) {
			if(predicat.test(t)) {
				result.add(t);
			}
		}
		return result;
	}
}
