// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.commands.UltrasonicMotorCommand;
import edu.wpi.first.wpilibj.AnalogInput;



public class Motor extends SubsystemBase {
  /** Creates a new Motor. */

  WPI_TalonSRX motor1 = new WPI_TalonSRX(0);
  public final AnalogInput ultrasonic = new AnalogInput(0);

  public Motor() {
    setDefaultCommand(new UltrasonicMotorCommand(this));
  }

  public void startMotor() {
    motor1.set(0.5);
  }

  public void stopMotor() {
    motor1.set(0);
  }

  public void reverseMotor() {
    motor1.set(-0.5);
  }

  

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
    
  }
}
