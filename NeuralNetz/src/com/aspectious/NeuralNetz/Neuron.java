package com.aspectious.NeuralNetz;

public class Neuron {
	private float bias;
	
	public Neuron() {
		bias = (float) Math.random();
	}
	public Neuron(float bias) {
		this.bias = bias;
	}
	
	public float getBias() { return this.bias;}
	public void setBias(float bias) { this.bias = bias; }
}
