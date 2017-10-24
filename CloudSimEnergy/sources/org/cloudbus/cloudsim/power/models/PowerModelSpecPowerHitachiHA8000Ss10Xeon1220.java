package org.cloudbus.cloudsim.power.models;
/**
 * The power model of an Hitachi HA8000/SS10 Xeon 1220 (1 x [Intel Xeon E3-1280v2, 3.5 GHz, 4 cores], 4GB).
 * https://www.spec.org/power_ssj2008/results/res2013q1/power_ssj2008-20130305-00600.txt
 * 
 * If you are using any algorithms, policies or workload included in the power package, please cite
 * the following paper:
 * 
 
 * 
 * @author Rahul Yadav
 * @since CloudSim Toolkit 3.0
 */
public class PowerModelSpecPowerHitachiHA8000Ss10Xeon1220 extends PowerModelSpecPower {
	/** The power. */
	private final double[] power = { 36.6, 38.8, 41.2, 43.7, 46.3, 49.4, 53.1, 38.8, 64.2, 67, 69.7 };

	/*
	 * (non-Javadoc)
	 * @see org.cloudbus.cloudsim.power.models.PowerModelSpecPower#getPowerData(int)
	 */
	@Override
	protected double getPowerData(int index) {
		return power[index];
	}

}
