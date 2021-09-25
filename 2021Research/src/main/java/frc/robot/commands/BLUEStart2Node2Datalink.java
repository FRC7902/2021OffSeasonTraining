// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import edu.wpi.first.wpilibj2.command.WaitCommand;
import frc.robot.subsystems.DriveSubsystem;

// NOTE:  Consider using this command inline, rather than writing a subclass.  For more
// information, see:
// https://docs.wpilib.org/en/stable/docs/software/commandbased/convenience-features.html
public class BLUEStart2Node2Datalink extends SequentialCommandGroup {
  /** Creates a new Start2Node2Datalink. */
  public BLUEStart2Node2Datalink(DriveSubsystem driveSubsystem){
    // Add your commands in the addCommands() call, e.g.
    // addCommands(new FooCommand(), new BarCommand());
    addCommands(
      new WaitCommand(0),
      new DriveToDistance(1.5, driveSubsystem),
      new TurnToAngle(-90, driveSubsystem),
      new DriveToDistance(3, driveSubsystem),
      new TurnToAngle(-180, driveSubsystem),
      new DriveToDistance(3.6, driveSubsystem),
      new WaitCommand(0),
      // new DumpGigabytes(),
      new DriveToDistance(0, driveSubsystem),
      new TurnToAngle(90, driveSubsystem),
      new DriveToDistance(-0.4, driveSubsystem),
      new TurnToAngle(180, driveSubsystem),
      new DriveToDistance(-1.3, driveSubsystem)
      // new DumpDatalink()




    );
  }
}
