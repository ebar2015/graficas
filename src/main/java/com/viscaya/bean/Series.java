/**
 * 
 */
package com.viscaya.bean;

import java.util.List;

/**
 * @author joseviscaya
 *
 */
public class Series implements Cloneable{
	
	private String name;
	private List<Long> data;
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the data
	 */
	public List<Long> getData() {
		return data;
	}
	/**
	 * @param data the data to set
	 */
	public void setData(List<Long> data) {
		this.data = data;
	}
	
	@Override
    public Series clone() {
        try {
            return (Series) super.clone();
        } catch (CloneNotSupportedException e) {
            return new Series();
        }
    }

}
