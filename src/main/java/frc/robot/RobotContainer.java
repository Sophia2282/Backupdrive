// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import frc.robot.subsystems.DriveTrain;
//import frc.robot.Constants.OperatorConstants;
import frc.robot.commands.tankDrive;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.XboxController;
//import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.RunCommand;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.Subsystem;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import edu.wpi.first.wpilibj2.command.button.Trigger;

/**
 * This class is where the bulk of the robot should be declared. Since
 * Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in
 * the {@link Robot}
 * periodic methods (other than the scheduler calls). Instead, the structure of
 * the robot (including
 * subsystems, commands, and trigger mappings) should be declared here.
 */
public class RobotContainer {
  public static XboxController driverController = new XboxController(Constants.OperatorConstants.kDriverControllerPort);
  public static Joystick subsystemController = new Joystick(Constants.OperatorConstants.kJoystickPort);
  private final DriveTrain m_Drive = new DriveTrain();

  /**
   * The container for the robot. Contains subsystems, OI devices, and commands.
   */
  public RobotContainer() {
    // Configure the trigger bindings
    configureBindings();
  }

  private void configureBindings() {
  }

  public void DriveTrain() {
    m_Drive.setDefaultCommand(new tankDrive(m_Drive,
        () -> -driverController.getLeftY(),
        () -> driverController.getRightX()));

  }
}
