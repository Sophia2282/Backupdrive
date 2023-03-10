// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
//import com.ctre.phoenixpro.signals.InvertedValue;

//import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
//import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.commands.tankDrive;
//import frc.robot.RobotContainer;
import frc.robot.Constants;

public class DriveTrain extends SubsystemBase {
  WPI_TalonSRX leftA = new WPI_TalonSRX(Constants.MotorConstants.LEFTA);
  WPI_TalonSRX leftB = new WPI_TalonSRX(Constants.MotorConstants.LEFTB);
  WPI_TalonSRX rightA = new WPI_TalonSRX(Constants.MotorConstants.RIGHTA);
  WPI_TalonSRX rightB = new WPI_TalonSRX(Constants.MotorConstants.RIGHTB);

  MotorControllerGroup leftMotors = new MotorControllerGroup(leftA, leftB);
  MotorControllerGroup rightMotors = new MotorControllerGroup(rightA, rightB);
  DifferentialDrive m_drive = new DifferentialDrive(leftMotors, rightMotors);

  public DriveTrain() {
    m_drive.setMaxOutput(0.67);
    rightMotors.setInverted(true);
  }

  public void tankDrive(double forward, double turn) {
    m_drive.tankDrive(forward, turn);
  }

  // public void TankDrive(double, double) {
  // diffDrive.TankDrive(double, double);

  @Override
  public void periodic() {

  }
}
