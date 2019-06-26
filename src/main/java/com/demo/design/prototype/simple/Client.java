package com.demo.design.prototype.simple;

/**
 * Created by Tom.
 */
public class Client {

	private Prototype prototype;

	public Client(Prototype prototype) {
		this.prototype = prototype;
	}

	public Prototype startClone(Prototype prototype) {
		try {
			prototype = (Prototype) prototype.clone();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return prototype;
	}

}
