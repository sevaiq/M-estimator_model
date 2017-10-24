package org.cloudbus.cloudsim.examples.power.planetlab;




import java.io.IOException;

public class MeMc {


	/**
	 * The main method.
	 * 
	 * @param args the arguments
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	public static void main(String[] args) throws IOException {
		boolean enableOutput = true;
		boolean outputToFile = false;
		String inputFolder = MeMc.class.getClassLoader().getResource("workload/planetlab").getPath();
		String outputFolder = "output";
		String workload = "20110303"; // PlanetLab workload
		String vmAllocationPolicy = "me"; // Local Regression (LR) VM allocation policy
		String vmSelectionPolicy = "mu"; // Maximum Correlation (MC) VM selection policy
		String parameter = "1"; // the safety parameter of the LR policy

		new PlanetLabRunner(
				enableOutput,
				outputToFile,
				inputFolder,
				outputFolder,
				workload,
				vmAllocationPolicy,
				vmSelectionPolicy,
				parameter);
	}

}
