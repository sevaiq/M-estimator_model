package org.cloudbus.cloudsim.power.models;


/**
 * The power model of an FUJITSU Server PRIMERGY TX1330 M3 (1 x [Intel Xeon E3-1230 v6, 3.5 GHz, 4 cores], 8GB).
 * https://www.spec.org/power_ssj2008/results/res2017q2/power_ssj2008-20170315-00746.txt
 * 
 * If you are using any algorithms, policies or workload included in the power package, please cite
 * the following paper:
 * 
 
 * 
 * @author Rahul Yadav
 * @since CloudSim Toolkit 3.0
 */
public class PowerModelSpecPowerFujitsuTX1330_M3Xeon1230 extends PowerModelSpecPower{
	/** The power. */
	private final double[] power = { 12.4, 16.7, 19.4, 21.4, 23.4, 26.1, 29.7, 34.8, 41, 47.1, 51.2 };

	/*
	 * (non-Javadoc)
	 * @see org.cloudbus.cloudsim.power.models.PowerModelSpecPower#getPowerData(int)
	 */
	@Override
	protected double getPowerData(int index) {
		return power[index];
	}

}
