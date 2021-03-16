// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.RobotContainer;
import frc.robot.commands.TankDriveCommand;

public class TankDrive extends SubsystemBase {
  /** Creates a new TankDrive. */
  public TankDrive() {
    setDefaultCommand(new TankDriveCommand(this));
  }

  public void driveWithJoystick() {
    double forward = RobotContainer.stick.getY() * 0.8;
    double turn = RobotContainer.stick.getZ() * 0.7;
    RobotContainer.diffDrive.arcadeDrive(forward, -turn);
  }  

  public void stop() {
    RobotContainer.diffDrive.arcadeDrive(0, 0);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
