package com.dykim.machinelearning;

import org.junit.Test;

import Jama.Matrix;

public class LinearRegressionTest {

	@Test
	public void linearExpressionUsingMatrix() {
		// Given
		int n = 3;
		Matrix x = new Matrix(n + 1, 1);
		Matrix theta = new Matrix(n + 1, 1);

		// When
		Matrix hTheta = theta.transpose().times(x);

		// Then
		// System.out.println(hTheta);
	}

	@Test
	public void template() {
		// Given
		// When
		// Then
	}
}
