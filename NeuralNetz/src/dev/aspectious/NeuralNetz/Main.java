package dev.aspectious.NeuralNetz;

import java.awt.image.BufferedImage;
import java.io.*;
import javax.imageio.ImageIO;

public class Main {
	public static NetworkMGR Network;
	
	public static void main(String[] args) {
		System.out.println("[INFO] Starting Application...");
		double[] values = readImage("./ref/eight-1.png");
		setup();
		cli.attachScannerToSTIN();
		double[] out = Network.runCycle(values);
	}
	
	
	private static String[] refs = {
		"zero-1.png","zero-2.png","zero-3.png",
		"one-1.png","one-2.png","one-3.png",
		"two-1.png","two-2.png","two-3.png",
		"three-1.png","three-2.png","three-3.png",
		"four-1.png","four-2.png","four-3.png",
		"five-1.png","five-2.png","five-3.png",
		"six-1.png","six-2.png","six-3.png",
		"seven-1.png","seven-2.png","seven-3.png",
		"eight-1.png","eight-2.png","eight-3.png",
		"nine-1.png","nine-2.png","nine-3.png"};
	
	private static float[] targets = {
			0,0,0,
			1,1,1,
			2,2,2,
			3,3,3,
			4,4,4,
			5,5,5,
			6,6,6,
			7,7,7,
			8,8,8,
			9,9,9
			};
	
	
	public static double[] readImage(String path) {
		BufferedImage img = null;
		double[] values = new double[1024];
		
		try {
			img = ImageIO.read(new File(path));
		} catch (IOException e) {
			return values;
		}
		int pos = 0;
		for (int i=0; i<32; i++) {
			String buffer ="";
			for (int j=0;j<32;j++) {
				int pixel = img.getRGB(j,i);
				int B = pixel & 0xff;
				int G = (pixel & 0xff00) >> 8;
				int R = (pixel & 0xff0000) >> 16;
				//buffer += "(" + R + "," + G + "," + B + ")";
				double avgPCT = Math.round(100*((((float)R+(float)B+(float)G)/3)/255d))/100d;
				values[pos] = avgPCT;
				pos++;
			}
		}
	
		return values;
	}
	public static void setup() {
		Nlayer[] layers;
		Nlayer inputLayer, hiddenLayer1, hiddenLayer2, outputLayer;
		try {
			layers = Storage.loadFile("dev.nnet");
			inputLayer = layers[0];
			hiddenLayer1 = layers[1];
			hiddenLayer2 = layers[2];
			outputLayer = new Nlayer(10);
			Network = new NetworkMGR(inputLayer, new Nlayer[] {hiddenLayer1, hiddenLayer2}, outputLayer, true);
		} catch (Exception e) {
			throw e;
			/*
			inputLayer = new Nlayer(1024);
			hiddenLayer1 = new Nlayer(32);
			hiddenLayer2 = new Nlayer(16);
			outputLayer = new Nlayer(10);
			Network = new NetworkMGR(inputLayer, new Nlayer[] {hiddenLayer1, hiddenLayer2}, outputLayer, false);
			*/
		}
		
		
		
	}
}
