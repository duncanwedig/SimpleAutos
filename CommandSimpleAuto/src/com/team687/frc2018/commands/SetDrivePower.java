package com.team687.frc2018.commands;

import com.team687.frc2018.Robot;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class SetDrivePower extends Command {

	public double m_power;
	public double m_time;
	public double m_startTime;
	
    public SetDrivePower(double power, double time) {
    	m_power = power;
        requires(Robot.drive);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	m_startTime = Timer.getFPGATimestamp();
    	Robot.drive.setPower(0);
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.drive.setPower(m_power);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return Timer.getFPGATimestamp() - m_startTime >= m_time;
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.drive.setPower(0);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
