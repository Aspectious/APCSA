package com.aspectious.NeuralNetz;

public class Nlink {
	private float weight;
	private Neuron bck;
	private Neuron fwd;
	
	private Nlink(Neuron from, Neuron to) {
		bck = from;
		fwd = to;
		weight = (float)Math.random();
	}
}
