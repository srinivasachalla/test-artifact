package org.simple.math.test;

import org.apache.commons.math3.stat.descriptive.DescriptiveStatistics;

public class ApacheMathTest {

	public static void main(String[] args) {
		
		double[] values = new double[] {10,10,20,20};
		DescriptiveStatistics ds = new DescriptiveStatistics();
		for (double v : values) {
			ds.addValue(v);
		}
		double mean = ds.getMean();
		System.out.println(mean);

	}

}
