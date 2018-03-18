package com.team687.frc2018;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;
import com.ctre.phoenix.motorcontrol.ControlMode;



/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the build.properties file in the
 * project.
 */
public class Robot extends IterativeRobot {

	public double startTime;
	public double currentTime;
	
	// The length of time to apply autoPower for during the autonomous period.
	public final double timeout = 5;
	
	// The voltage applied to each motor during auto, as a value between -1 and 1. 
	// 1 indicates max forward velocity, and -1 indicates max backwards velocity. 
	// Use either positive or negative values, depending on drivetrain direction and starting robot direction.
	public final double autoPower = 0.3;
	
	/** These are various types of motor controllers. Uncomment the motor controllers you are using, in the
	quantities you use them in. For instance, if you're using 6 PWM Talons, uncomment the  first 3 lMotors
	and the first 3 rMotors with "Talon" preceding them. Then, uncomment the Talons in robotInit(), and 
	uncomment the appropriate section in autonomousPeriodic(). Then, your straight line timed auto should be ready!
	*/
	
//	public Talon lMotor1;
//	public Talon lMotor2;
//	public Talon lMotor3;
//	public Talon lMotor4;
//	
//	public Talon rMotor1;
//	public Talon rMotor2;
//	public Talon rMotor3;
//	public Talon rMotor4;
	
//	public Spark lMotor1;
//	public Spark lMotor2;
//	public Spark lMotor3;
//	public Spark lMotor4;
//	
//	public Spark rMotor1;
//	public Spark rMotor2;
//	public Spark rMotor3;
//	public Spark rMotor4;
	
//	public VictorSP lMotor1;
//	public VictorSP lMotor2;
//	public VictorSP lMotor3;
//	public VictorSP lMotor4;
//	
//	public VictorSP rMotor1;
//	public VictorSP rMotor2;
//	public VictorSP rMotor3;
//	public VictorSP rMotor4;
	
//	public Victor lMotor1;
//	public Victor lMotor2;
//	public Victor lMotor3;
//	public Victor lMotor4;
//	
//	public Victor rMotor1;
//	public Victor rMotor2;
//	public Victor rMotor3;
//	public Victor rMotor4;
	
//	public VictorSPX lMotor1;
//	public VictorSPX lMotor2;
//	public VictorSPX lMotor3;
//	public VictorSPX lMotor4;
//	
//	public VictorSPX rMotor1;
//	public VictorSPX rMotor2;
//	public VictorSPX rMotor3;
//	public VictorSPX rMotor4;
	
//	public TalonSRX lMotor1;
//	public TalonSRX lMotor2;
//	public TalonSRX lMotor3;
//	public TalonSRX lMotor4;
//	
//	public TalonSRX rMotor1;
//	public TalonSRX rMotor2;
//	public TalonSRX rMotor3;
//	public TalonSRX rMotor4;
	
	
	
	@Override
	public void robotInit() {

//		lMotor1 = new Talon(0);
//		rMotor1 = new Talon(1);
//		lMotor2 = new Talon(2);
//		rMotor2 = new Talon(3);
//		lMotor3 = new Talon(4);
//		rMotor3 = new Talon(5);
//		lMotor4 = new Talon(6);
//		rMotor4 = new Talon(7);
		
//		lMotor1 = new Spark(0);
//		rMotor1 = new Spark(1);
//		lMotor2 = new Spark(2);
//		rMotor2 = new Spark(3);
//		lMotor3 = new Spark(4);
//		rMotor3 = new Spark(5);
//		lMotor4 = new Spark(6);
//		rMotor4 = new Spark(7);
		
//		lMotor1 = new VictorSP(0);
//		rMotor1 = new VictorSP(1);
//		lMotor2 = new VictorSP(2);
//		rMotor2 = new VictorSP(3);
//		lMotor3 = new VictorSP(4);
//		rMotor3 = new VictorSP(5);
//		lMotor4 = new VictorSP(6);
//		rMotor4 = new VictorSP(7);
		
//		lMotor1 = new Victor(0);
//		rMotor1 = new Victor(1);
//		lMotor2 = new Victor(2);
//		rMotor2 = new Victor(3);
//		lMotor3 = new Victor(4);
//		rMotor3 = new Victor(5);
//		lMotor4 = new Victor(6);
//		rMotor4 = new Victor(7);
		
//		lMotor1 = new VictorSPX(0);
//		rMotor1 = new VictorSPX(1);
//		lMotor2 = new VictorSPX(2);
//		rMotor2 = new VictorSPX(3);
//		lMotor3 = new VictorSPX(4);
//		rMotor3 = new VictorSPX(5);
//		lMotor4 = new VictorSPX(6);
//		rMotor4 = new VictorSPX(7);
		
//		lMotor1 = new TalonSRX(0);
//		rMotor1 = new TalonSRX(1);
//		lMotor2 = new TalonSRX(2);
//		rMotor2 = new TalonSRX(3);
//		lMotor3 = new TalonSRX(4);
//		rMotor3 = new TalonSRX(5);
//		lMotor4 = new TalonSRX(6);
//		rMotor4 = new TalonSRX(7);
	}

	/**
	 * This autonomous (along with the chooser code above) shows how to select
	 * between different autonomous modes using the dashboard. The sendable
	 * chooser code works with the Java SmartDashboard. If you prefer the
	 * LabVIEW Dashboard, remove all of the chooser code and uncomment the
	 * getString line to get the auto name from the text box below the Gyro
	 *
	 * <p>You can add additional auto modes by adding additional comparisons to
	 * the switch structure below with additional strings. If using the
	 * SendableChooser make sure to add them to the chooser code above as well.
	 */
	@Override
	public void autonomousInit() {
		startTime = Timer.getFPGATimestamp();
		
	}

	/**
	 * This function is called periodically during autonomous.
	 */
	@Override
	public void autonomousPeriodic() {
		
		currentTime = Timer.getFPGATimestamp();
		
		if (currentTime - startTime >= timeout) {
			
			//Use this if not using TalonSRX or VictorSPX for drivetrain
			
//			lMotor1.set(autoPower);
//			rMotor1.set(-autoPower);
//			lMotor2.set(autoPower);
//			rMotor2.set(-autoPower);
//			lMotor3.set(autoPower);
//			rMotor3.set(-autoPower);
//			lMotor4.set(autoPower);
//			rMotor4.set(-autoPower);
			
			//Use this if using TalonSRX or VictorSPX for drivetrain
			
//			lMotor1.set(ControlMode.PercentOutput, autoPower);
//			rMotor1.set(ControlMode.PercentOutput, -autoPower);
//			lMotor2.set(ControlMode.PercentOutput, autoPower);
//			rMotor2.set(ControlMode.PercentOutput, -autoPower);
//			lMotor3.set(ControlMode.PercentOutput, autoPower);
//			rMotor3.set(ControlMode.PercentOutput, -autoPower);
//			lMotor4.set(ControlMode.PercentOutput, autoPower);
//			rMotor4.set(ControlMode.PercentOutput, -autoPower);
			
		} else {
			
			//Use this if not using TalonSRX or VictorSPX for drivetrain
			
//			lMotor1.set(0);
//			rMotor1.set(0);
//			lMotor2.set(0);
//			rMotor2.set(0);
//			lMotor3.set(0);
//			rMotor3.set(0);
//			lMotor4.set(0);
//			rMotor4.set(0);
			
			//Use this if using TalonSRX or VictorSPX for drivetrain
			
//			lMotor1.set(ControlMode.PercentOutput, 0);
//			rMotor1.set(ControlMode.PercentOutput, 0);
//			lMotor2.set(ControlMode.PercentOutput, 0);
//			rMotor2.set(ControlMode.PercentOutput, 0);
//			lMotor3.set(ControlMode.PercentOutput, 0);
//			rMotor3.set(ControlMode.PercentOutput, 0);
//			lMotor4.set(ControlMode.PercentOutput, 0);
//			rMotor4.set(ControlMode.PercentOutput, 0);
			
		}
		
	}

	/**
	 * This function is called periodically during operator control.
	 */
	@Override
	public void teleopPeriodic() {
	}

	/**
	 * This function is called periodically during test mode.
	 */
	@Override
	public void testPeriodic() {
	}
}
