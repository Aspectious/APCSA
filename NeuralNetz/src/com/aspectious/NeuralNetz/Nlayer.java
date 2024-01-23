package com.aspectious.NeuralNetz;

public class Nlayer {
	public Neuron[] neurons;
	public Nlink[] PrevHop;
	public Nlink[] nextHop;
	
	public Nlayer(int NeuronCount) {
		neurons = new Neuron[NeuronCount];
		for (Neuron n : neurons) {
			n = new Neuron();
		}
	}
	public Nlayer(int NeuronCount, float defaultBias) {
		neurons = new Neuron[NeuronCount];
		for (Neuron n : neurons) {
			n = new Neuron(defaultBias);
		}
	}
}
