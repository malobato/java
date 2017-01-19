package com.coderszone;


public class MotionMessage {

	private float alpha;
	private float beta;
	private float gamma;


	public MotionMessage() {

		alpha = 0;
		beta = 0;
		gamma = 0;
	}


	public MotionMessage( float alpha, float beta, float gamma ) {

		this.alpha = alpha;
		this.beta = beta;
		this.gamma = gamma;
	}


	public float getAlpha() {

		return alpha;
	}


	public void setAlpha( float alpha ) {

		this.alpha = alpha;
	}


	public float getBeta() {

		return beta;
	}


	public void setBeta( float beta ) {

		this.beta = beta;
	}


	public float getGamma() {

		return gamma;
	}


	public void setGamma( float gamma ) {

		this.gamma = gamma;
	}

}
