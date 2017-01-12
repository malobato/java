package com.coderszone;


public class MotionMessage {

	private int alpha;
	private int beta;
	private int gamma;


	public MotionMessage() {

		alpha = 0;
		beta = 0;
		gamma = 0;
	}


	public MotionMessage( int alpha, int beta, int gamma ) {

		this.alpha = alpha;
		this.beta = beta;
		this.gamma = gamma;
	}


	public int getAlpha() {

		return alpha;
	}


	public void setAlpha( int alpha ) {

		this.alpha = alpha;
	}


	public int getBeta() {

		return beta;
	}


	public void setBeta( int beta ) {

		this.beta = beta;
	}


	public int getGamma() {

		return gamma;
	}


	public void setGamma( int gamma ) {

		this.gamma = gamma;
	}

}
