package org.usfirst.frc.team5495.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class AutoCenterPeelLeft extends CommandGroup {

    public AutoCenterPeelLeft() {
        // Add Commands here:
        // e.g. addSequential(new Command1());
        //      addSequential(new Command2());
        // these will run in order.

        // To run multiple commands at the same time,
        // use addParallel()
        // e.g. addParallel(new Command1());
        //      addSequential(new Command2());
        // Command1 and Command2 will run in parallel.

    	addSequential(new ForwardByDistanceCommand((-70.39 / 12) - 3));
    	addSequential(new WaitCommand(3));
    	addSequential(new PeelAwayCommand(120, true));
    	//addParallel(new ResetGyroCommand());
    	addSequential(new ForwardByDistanceCommand(3));
    	
        // A command group will require all of the subsystems that each member
        // would require.
        // e.g. if Command1 requires chassis, and Command2 requires arm,
        // a CommandGroup containing them would require both the chassis and the
        // arm.
    }
}
