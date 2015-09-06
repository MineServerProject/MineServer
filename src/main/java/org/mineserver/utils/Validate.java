package org.mineserver.utils;
/*
 * A snippet from the Apache Commons Lang3 Library
 * This file contains the Validate.notNull(); method
 * @author Apache 
 */
public class Validate {
	
	public static void notNull(Object object, String message) {
		if(object == null){
			throw new IllegalArgumentException(message);
		}
	}
	
}