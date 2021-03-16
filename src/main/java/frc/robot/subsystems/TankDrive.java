// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class TankDrive extends SubsystemBase {
  /** Creates a new TankDrive. */

  WPI_TalonSRX motor1 = new WPI_TalonSRX(1);
  WPI_TalonSRX motor2 = new WPI_TalonSRX(2);
  WPI_TalonSRX motor3 = new WPI_TalonSRX(3);

  SpeedControllerGroup leftDrive = new SpeedControllerGroup(motor1, motor2, motor3);

  WPI_TalonSRX motor4 = new WPI_TalonSRX(4);
  WPI_TalonSRX motor5 = new WPI_TalonSRX(5);
  WPI_TalonSRX motor6 = new WPI_TalonSRX(6);

  SpeedControllerGroup rightDrive = new SpeedControllerGroup(motor4, motor5, motor6);

  DifferentialDrive drive = new DifferentialDrive(leftDrive, rightDrive);

  public TankDrive() {}

  public void driveForward() {
    drive.tankDrive(0.5, 0.5);
  }

  

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
