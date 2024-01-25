package com.aspectious.NeuralNetz.network;

public class Nlayer {
	public Neuron[] neurons;
	public Nlink[] PrevHop;
	public Nlink[] nextHop;
	public boolean isOutputLayer = false;
	public double bias;
	
	public Nlayer(int NeuronCount) {
		this.bias = 0.0d;
		neurons = new Neuron[NeuronCount];
		for (Neuron n : neurons) {
			n = new Neuron();
		}
	}
	public Nlayer(int NeuronCount, boolean isOutput) {
		this.bias = 0.0d;
		neurons = new Neuron[NeuronCount];
		for (Neuron n : neurons) {
			n = new Neuron();
		}
	}
}
