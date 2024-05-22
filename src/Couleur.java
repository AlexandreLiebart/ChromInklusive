import java.awt.Color;
public class Couleur extends Color{

	double luminance;
	
	public Couleur (int rouge, int vert, int bleu){
		super(rouge,vert,bleu);
		luminance = 0.2126 * rouge + 0.7152 * vert + 0.0722 * bleu;
	}
	
	public int getLuminance(){
		return (int) luminance;
	}
}
