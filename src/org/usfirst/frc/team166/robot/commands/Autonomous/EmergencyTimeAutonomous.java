package org.usfirst.frc.team166.robot.commands.Autonomous;

import edu.wpi.first.wpilibj.command.CommandGroup;
import edu.wpi.first.wpilibj.command.WaitCommand;

import org.usfirst.frc.team166.robot.commands.DriveTime;
import org.usfirst.frc.team166.robot.commands.TurnAngle;
import org.usfirst.frc.team166.robot.commands.GearManipulator.CloseManipulator;
import org.usfirst.frc.team166.robot.commands.GearManipulator.OpenManipulator;

/**
 * USE ONLY IN THE CASE OF THERE NOT BEING ENCODERS ON THE ROBOT
 */
public class EmergencyTimeAutonomous extends CommandGroup {

	public EmergencyTimeAutonomous() {
		addSequential(new DriveTime(.386, 1.0));
		addSequential(new WaitCommand(1));
		addSequential(new OpenManipulator());
		addSequential(new WaitCommand(1));
		addSequential(new DriveTime(.294, -1.0));
		addSequential(new CloseManipulator());
		addSequential(new WaitCommand(1));
		addSequential(new TurnAngle(90));
		addSequential(new DriveTime(1, 1.0));
		addSequential(new TurnAngle(-90));
		addSequential(new DriveTime(.3, 1.0));
	}
}
