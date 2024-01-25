package com.aspectious.NeuralNetz.network;

import java.util;

public class NetworkMGR {
	private Nlayer inputs;
	private Nlayer[] hidden;
	private Nlayer outputs;
	
	public NetworkMGR(Nlayer INPUTS, Nlayer[] HIDDEN, Nlayer OUTPUTS) {
		this.inputs = INPUTS;
		this.hidden  = HIDDEN;
		this.outputs = OUTPUTS;
		this.initialize();
	}
	
	private void initialize() {
		// Initialize all connections between INPUT layer and HIDDEN layer 1;
		ArrayList<Nlink> layer1_2 = new ArrayList<Nlink>(); 
		// Initialize all connections between all HIDDEN layers;
		
		// Initialize all connections between last HIDDEN layer and OUTPUT layer;
	}
	
	private float sigmoid(float value) {
		return (float) (1.0f/(1 + Math.pow(Math.E,(double)(value * -1.0f))));
	}
}
