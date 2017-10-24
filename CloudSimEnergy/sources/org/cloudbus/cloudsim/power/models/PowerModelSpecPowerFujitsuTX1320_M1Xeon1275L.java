package org.cloudbus.cloudsim.power.models;

/**
 * The power model of an FUJITSU Server PRIMERGY TX1330 M3 (1 x [Intel Xeon E3-1230 v6, 2.7 GHz, 4 cores], 8GB).
 * https://www.spec.org/power_ssj2008/results/res2015q1/power_ssj2008-20150116-00684.txt
 * 
 * If you are using any algorithms, policies or workload included in the power package, please cite
 * the following paper:
 * 
 
 * 
 * @author Rahul Yadav
 * @since CloudSim Toolkit 3.0
 */

public class PowerModelSpecPowerFujitsuTX1320_M1Xeon1275L  extends PowerModelSpecPower {
	/** The power. */
	private final double[] power = { 13.3, 18.3, 21.1, 23.4, 26.5, 29.6, 34.7, 40.7, 46.8, 57.4, 60 };

	/*
	 * (non-Javadoc)
	 * @see org.cloudbus.cloudsim.power.models.PowerModelSpecPower#getPowerData(int)
	 */
	@Override
	protected double getPowerData(int index) {
		return power[index];
	}

}
