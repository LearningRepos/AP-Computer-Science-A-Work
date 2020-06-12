 Copyright 



Name  Mihir Achyuta
Date  121019
Purpose  to calculate values of pi by throwing darts at a dart board with object oriented programming style
import java.util.Scanner;
public class EstimatePiV12 {

	private int Throw;
	private int Count;
	private double AB;
	private double BC;
	private double R;
	private double Hit;
	private int Trial;
	private double Pi;
	private double Total;
	private double All;
	private double Dart;
		
	
	public EstimatePiV12() {}	
	
	public EstimatePiV12(int t, int c, double ab, double bc, double r, double h, int tr, double p, double to, double AL, double d) {
		Throw = t;
		Count = c;
		AB = ab;
		BC = bc;
		R =r;
		Hit = h;
		Trial = tr;
		Pi = p;
		Total = to;
		All = AL;
		Dart = d;
		
	}
	
	public int TotalHit () {
		Hit = 0;
		for(int i = 1; i Trial; i =i+1) {
			AB = (2Math.random()) -1;
			BC = (2Math.random()) -1;
			
			if((Math.pow(AB, 2) + Math.pow(BC, 2)) = (Math.pow(R,2))) {
				Hit++;
			}
		}

		return (int)Hit;
	}


	public double Pi() {
		double pi = ((4 (Dart))  Total);
		return pi;
	}
		





}