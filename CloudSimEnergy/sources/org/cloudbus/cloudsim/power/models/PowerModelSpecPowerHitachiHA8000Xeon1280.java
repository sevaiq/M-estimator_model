package org.cloudbus.cloudsim.power.models;


/**
 * The power model of an Hitachi HA8000 Xeon 1280 (1 x [Intel Xeon E3-1280v2, 3.6 GHz, 4 cores], 4GB).
 * https://www.spec.org/power_ssj2008/results/res2013q1/power_ssj2008-20130304-00599.txt
 * 
 * If you are using any algorithms, policies or workload included in the power package, please cite
 * the following paper:
 * 
 
 * 
 * @author Rahul Yadav
 * @since CloudSim Toolkit 3.0
 */

public class PowerModelSpecPowerHitachiHA8000Xeon1280 extends PowerModelSpecPower {
	/** The power. */
	private final double[] power = { 37.2, 39.9, 43.2, 45.5, 48.8, 52.8, 57.8, 65.1, 73.8, 80.8, 85.2 };

	/*
	 * (non-Javadoc)
	 * @see org.cloudbus.cloudsim.power.models.PowerModelSpecPower#getPowerData(int)
	 */
	@Override
	protected double getPowerData(int index) {
		return power[index];
	}

}
