package com.team687.frc2018.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.command.Subsystem;
/**
 *
 */
public class Drive extends Subsystem {
	
//	controllers 1, 2, 3, are left, 4, 5, 6, are right
	
//	public static VictorSP m_motorController1;
//	public static VictorSP m_motorController2;
//	public static VictorSP m_motorController3;
//	public static VictorSP m_motorController4;
//	public static VictorSP m_motorController5;
//	public static VictorSP m_motorController6;
	
//	public static VictorSPX m_motorController1;
//	public static VictorSPX m_motorController2;
//	public static VictorSPX m_motorController3;
//	public static VictorSPX m_motorController4;
//	public static VictorSPX m_motorController5;
//	public static VictorSPX m_motorController6;
	
	
//	PWM Talons
	public static Talon m_motorController1;
	public static Talon m_motorController2;
	public static Talon m_motorController3;
	public static Talon m_motorController4;
	public static Talon m_motorController5;
	public static Talon m_motorController6;
	
//	CAN Talons
//	public static TalonSRX m_motorController1;
//	public static TalonSRX m_motorController2;
//	public static TalonSRX m_motorController3;
//	public static TalonSRX m_motorController4;
//	public static TalonSRX m_motorController5;
//	public static TalonSRX m_motorController6;
	
//	public static Spark m_motorController1;
//	public static Spark m_motorController2;
//	public static Spark m_motorController3;
//	public static Spark m_motorController4;
//	public static Spark m_motorController5;
//	public static Spark m_motorController6;

		
	public Drive() {
//		m_motorController1 = new VictorSP(0);
//		m_motorController2 = new VictorSP(1);
//		m_motorController3 = new VictorSP(2);
//		m_motorController4 = new VictorSP(3);
//		m_motorController5 = new VictorSP(4);
//		m_motorController6 = new VictorSP(5);
		
//		m_motorController1 = new VictorSPX(0);
//		m_motorController2 = new VictorSPX(1);
//		m_motorController3 = new VictorSPX(2);
//		m_motorController4 = new VictorSPX(3);
//		m_motorController5 = new VictorSPX(4);
//		m_motorController6 = new VictorSPX(5);
		
//		m_motorController1 = new Talon(0);
//		m_motorController2 = new Talon(1);
//		m_motorController3 = new Talon(2);
//		m_motorController4 = new Talon(3);
//		m_motorController5 = new Talon(4);
//		m_motorController6 = new Talon(5);
		
//		m_motorController1 = new TalonSRX(0);
//		m_motorController2 = new TalonSRX(1);
//		m_motorController3 = new TalonSRX(2);
//		m_motorController4 = new TalonSRX(3);
//		m_motorController5 = new TalonSRX(4);
//		m_motorController6 = new TalonSRX(5);
		
//		m_motorController1 = new Spark(0);
//		m_motorController2 = new Spark(1);
//		m_motorController3 = new Spark(2);
//		m_motorController4 = new Spark(3);
//		m_motorController5 = new Spark(4);
//		m_motorController6 = new Spark(5);
		}

	public void setPower(double power) {
//		PWM Talons, Victors, Sparks
		m_motorController1.set(power);
		m_motorController2.set(power);
		m_motorController3.set(power);
		m_motorController4.set(-power);
		m_motorController5.set(-power);
		m_motorController6.set(-power);
		
//		CAN Victors, Talons
//		m_motorController1.set(ControlMode.PercentOutput, power);
//		m_motorController2.set(ControlMode.PercentOutput, power);
//		m_motorController3.set(ControlMode.PercentOutput, power);
//		m_motorController4.set(ControlMode.PercentOutput, -power);
//		m_motorController5.set(ControlMode.PercentOutput, -power);
//		m_motorController6.set(ControlMode.PercentOutput, -power);
		
	}
	
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

