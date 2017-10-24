package org.cloudbus.cloudsim.examples.power;

import org.cloudbus.cloudsim.power.models.PowerModel;
import org.cloudbus.cloudsim.power.models.PowerModelSpecPowerFujitsuTX1320_M1Xeon1275L;
import org.cloudbus.cloudsim.power.models.PowerModelSpecPowerFujitsuTX1330_M3Xeon1230;
import org.cloudbus.cloudsim.power.models.PowerModelSpecPowerHitachiHA8000Ss10Xeon1220;
import org.cloudbus.cloudsim.power.models.PowerModelSpecPowerHitachiHA8000Xeon1280;
//import org.cloudbus.cloudsim.power.models.PowerModelSpecPowerHpProLiantMl110G4Xeon3040;
//import org.cloudbus.cloudsim.power.models.PowerModelSpecPowerHpProLiantMl110G5Xeon3075;
//import org.cloudbus.cloudsim.power.models.PowerModelSpecPowerIbmX3550XeonX5675;

/**
 * If you are using any algorithms, policies or workload included in the power package, please cite
 * the following paper:
 *
 * Anton Beloglazov, and Rajkumar Buyya, "Optimal Online Deterministic Algorithms and Adaptive
 * Heuristics for Energy and Performance Efficient Dynamic Consolidation of Virtual Machines in
 * Cloud Data Centers", Concurrency and Computation: Practice and Experience (CCPE), Volume 24,
 * Issue 13, Pages: 1397-1420, John Wiley & Sons, Ltd, New York, USA, 2012
 *
 * @author Anton Beloglazov
 * @since Jan 6, 2012
 */
public class Constants {

	public final static boolean ENABLE_OUTPUT = true;
	public final static boolean OUTPUT_CSV    = false;

	public final static double SCHEDULING_INTERVAL = 300;
	public final static double SIMULATION_LIMIT = 24 * 60 * 60;

	public final static int CLOUDLET_LENGTH	= 2500 * (int) SIMULATION_LIMIT;
	public final static int CLOUDLET_PES	= 1;

	/*
	 * VM instance types:
	 *   High-Memory Extra Large Instance: 3.25 EC2 Compute Units, 8.55 GB // too much MIPS
	 *   High-CPU Medium Instance: 2.5 EC2 Compute Units, 0.85 GB
	 *   Extra Large Instance: 2 EC2 Compute Units, 3.75 GB
	 *   Small Instance: 1 EC2 Compute Unit, 1.7 GB
	 *   Micro Instance: 0.5 EC2 Compute Unit, 0.633 GB
	 *   We decrease the memory size two times to enable oversubscription
	 *
	 */
	public final static int VM_TYPES	= 4;
	public final static int[] VM_MIPS	= { 2500, 2000, 1000, 500 };
	public final static int[] VM_PES	= { 1, 1, 1, 1 };
	public final static int[] VM_RAM	= { 870,  1740, 1740, 613 };
	public final static int VM_BW		= 100000; // 100 Mbit/s
	public final static int VM_SIZE		= 2500; // 2.5 GB

	/*
	 * Host types:
	 *   Fujitsu Server PRIMERGY TX1320 M1  (1 x [Xeon E3-1275Lv3 2.7GHz, 4 cores], 8GB)
	 *   Fujitsu Server PRIMERGY TX1320 M1  (1 x [Xeon E3-1275Lv3 2.7GHz, 4 cores], 8GB)
	 *   Hitachi  HA8000/SS10 (1 x [Xeon E3-1220v2 3.1GHz, 4 cores], 4GB)
	 *   Hitachi  HA8000/TS10 (1 x [Xeon E3-1280v2 3.6GHz, 4 cores], 4GB)
	 *   We increase the memory size to enable over-subscription (x4)
	 */
	public final static int HOST_TYPES	 = 4;
	public final static int[] HOST_MIPS	 = { 2700, 3560, 3100,3600 };
	public final static int[] HOST_PES	 = { 4, 4, 4, 4 };
	public final static int[] HOST_RAM	 = { 8192, 8192,4096,4096 };
	public final static int HOST_BW		 = 1000000; // 1 Gbit/s
	public final static int HOST_STORAGE = 1000000; // 1 GB

	public final static PowerModel[] HOST_POWER = {
		new PowerModelSpecPowerHitachiHA8000Ss10Xeon1220(),
		new PowerModelSpecPowerHitachiHA8000Xeon1280(),
		new PowerModelSpecPowerFujitsuTX1330_M3Xeon1230(), 
		new PowerModelSpecPowerFujitsuTX1320_M1Xeon1275L()
	};

}