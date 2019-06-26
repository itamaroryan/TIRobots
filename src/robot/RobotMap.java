package robot;

import robot.hardware.motors.RobotMotor;
import robot.hardware.sensors.RobotSensor;

/**
 * Utility for handling the robot's components
 * @author John
 *
 */
public class RobotMap {

	private static RobotSensor[] sensors = new RobotSensor[4];
	private static RobotMotor[] motors = new RobotMotor[4];

	/**
	 * Adds a motor to the motor array, in order of ports
	 * If value is invalid, throws arrayOutOfBounds
	 * TODO: normal error handling
	 * @param sensor
	 */
	public static void addSensor(RobotSensor sensor) {
		int idx = sensor.getPort();
		sensors[idx] = sensor;
	}

	/**
	 * Adds a motor to the motor array, in order of ports
	 * If value is invalid, throws arrayOutOfBounds
	 * TODO: normal error handling
	 * @param motor
	 */
	public static void addMotor(RobotMotor motor) {
		int idx = numberMotorPort(motor.getPort());
		motors[idx] = motor;
	}

	/**
	 * Converts motor port to number for internal use
	 * Returns -1 if invalid
	 * TODO: normal error handling
	 * @param port
	 * @return
	 */
	private static int numberMotorPort(String port) {
		switch (port) {
		case "A":
			return 0;
		case "B":
			return 1;
		case "C":
			return 2;
		case "D":
			return 3;
		}
		return -1;
	}
	
	public static RobotMotor[] getMotors() {
		return motors;
	}
	
	public static RobotSensor[] getSensors() {
		return sensors;
	}
}
