import java.awt.Color;

public class Activity5 {
	/**
	 * Clear the lower (Rightmost) two bits in a pixel
	 * @param Pixel p
	 */
	public static void clearLow(Pixel p,int numbits) {
		int val = (int) Math.pow(2,numbits);
		p.setRed((p.getRed()/val)*val);
		p.setGreen((p.getGreen()/val)*val);
		p.setBlue((p.getBlue()/val)*val);
	}
	public static void setLow(Pixel p, Color c) {
		int v = 4;
		int val1 = (int) Math.pow(2, v);
		int val2 = (int) Math.pow(2,8-v);
		p.setRed((p.getRed()/val1)*val1 + (c.getRed()/val2));
		p.setGreen((p.getGreen()/val1)*val1 + (c.getGreen()/val2));
		p.setBlue((p.getBlue()/val1)*val1 + (c.getBlue()/val2));
		/*
		p.setRed((p.getRed()/4)*4 + (c.getRed()/64));
		p.setGreen((p.getGreen()/4)*4 + (c.getGreen()/64));
		p.setBlue((p.getBlue()/4)*4 + (c.getBlue()/64));
		*/
	}
	public static void setPix(Pixel sP,Pixel hP) {
		int v = 4;
		int val1 = (int) Math.pow(2, v);
		int val2 = (int) Math.pow(2,8-v);
		sP.setRed((sP.getRed()/val1)*val1 + (hP.getRed()/val2));
		sP.setGreen((sP.getGreen()/val1)*val1 + (hP.getGreen()/val2));
		sP.setBlue((sP.getBlue()/val1)*val1 + (hP.getBlue()/val2));
	}
	
	public static Picture revealPicture(Picture hidden) {
		int v = 2;
		int val1 = (int) Math.pow(2, v);
		int val2 = (int) Math.pow(2,8-v);
		Pixel[][]img = hidden.getPixels2D();
		int Width = img.length;
		int Height = img[0].length;
		
		for (int i=0; i<Width; i++) {
			for (int j=0; j<Height; j++) {
				System.out.println("Running pixel " + i + "," + j + " of total " + img.length + "," + img[0].length);
				Pixel p = img[i][j];
				
				p.setRed((p.getRed()-(p.getRed()/val1)*val1)*val2);
				p.setGreen((p.getGreen()-(p.getGreen()/val1)*val1)*val2);
				p.setBlue((p.getBlue()-(p.getBlue()/val1)*val1)*val2);
			}
		}
		return hidden;
	}
	public static boolean canHide(Picture source, Picture secret) {
		Pixel[][] sourceIMG = source.getPixels2D();
		Pixel[][] secretIMG = secret.getPixels2D();
		int sourceHeight = sourceIMG.length;
		int sourceWidth = sourceIMG[0].length;
		int secretHeight = secretIMG.length;
		int secretWidth = secretIMG[0].length;
		
		if ((secretHeight <= sourceHeight) && (secretWidth <= sourceWidth)) {
			return true;
		}
		return false;
	}
	public static Picture hidePicture(Picture source, Picture secret) {
		if (canHide(source,secret) == false) return secret;
		Pixel[][] sourceIMG = source.getPixels2D();
		Pixel[][] secretIMG = secret.getPixels2D();
		int sourceHeight = sourceIMG.length;
		int sourceWidth = sourceIMG[0].length;
		int secretHeight = secretIMG.length;
		int secretWidth = secretIMG[0].length;
		for (int i=0; i<secretHeight; i++) {
			for (int j=0; j<secretWidth; j++) {
				Pixel secretP = secretIMG[i][j];
				Pixel sourceP = sourceIMG[i][j];
				setPix(sourceP,secretP);
			}
		}
		return source;
	}
	public static void main(String[] args) {
		Picture flower = new Picture("whiteFlower.jpg");
		Picture moon = new Picture("moon-surface.jpg");
		//flower.explore();
		
		///moon.explore();
		hidePicture(flower,moon);
		flower.explore();
		revealPicture(flower).explore();
		
	}
}
