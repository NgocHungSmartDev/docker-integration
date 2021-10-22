/**
 * HelloWorldPing.java Oct 22, 2021
 * 
 * Copyright by NgocHung.
 * 
 * Last update Oct 22, 2021
 */
package org.dcoker;

public class HelloWorldPing {

	public static void main(String args[]) throws Exception {
		for (int i = 0; i < 100; i++) {
			System.out.println("Hello World Ping " + i);
			Thread.sleep(1000);
		}
	}
}
