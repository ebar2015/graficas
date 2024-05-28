/**
 * 
 */
package com.viscaya.bean;

import java.util.List;

/**
 * @author joseviscaya
 *
 */
public class Grafico {
	
	private List<Series> series;
	private List<Long> categories;
	/**
	 * @return the series
	 */
	public List<Series> getSeries() {
		return series;
	}
	/**
	 * @param series the series to set
	 */
	public void setSeries(List<Series> series) {
		this.series = series;
	}
	/**
	 * @return the categories
	 */
	public List<Long> getCategories() {
		return categories;
	}
	/**
	 * @param categories the categories to set
	 */
	public void setCategories(List<Long> categories) {
		this.categories = categories;
	}

}
