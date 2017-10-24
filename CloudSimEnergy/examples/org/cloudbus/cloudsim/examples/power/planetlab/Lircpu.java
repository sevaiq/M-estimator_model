package org.cloudbus.cloudsim.examples.power.planetlab;






import java.io.IOException;
	/**
	 * The method 

	 * A simulation of a heterogeneous power aware data center that applies the  Least Median of Square 
	 * Regression(LMS) VM allocation policy and Maximum Correlation (MC) VM selection policy.
	 * This example uses a real PlanetLab workload: 20110303.
	 * The remaining configuration parameters are in the Constants and PlanetLabConstants classes.
	 * @author Chenhuang
	 */
public class Lircpu {

	/**
	 * The main method.
	 * 
	 * @param args the arguments
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	public static void main(String[] args) throws IOException {
		boolean enableOutput = true;
		boolean outputToFile = false;
		String inputFolder = LmsMc.class.getClassLoader().getResource("workload/planetlab").getPath();
		String outputFolder = "output";
		String workload = "20110309"; // PlanetLab workload
		String vmAllocationPolicy = "lircpu"; // the  Least Median of Square Regression(LMS) VM allocation policy
		String vmSelectionPolicy = "mc"; // Maximum Correlation (MC) VM selection policy
		String parameter = ""; // the safety parameter of the MAD policy

		System.out.println(inputFolder);
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

