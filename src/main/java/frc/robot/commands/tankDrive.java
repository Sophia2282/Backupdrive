package frc.robot.commands;

import frc.robot.subsystems.DriveTrain;
import frc.robot.Constants;
import frc.robot.Robot;

import frc.robot.RobotContainer;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj2.command.Subsystem;

public class tankDrive extends CommandBase {

  /** Creates a new ArcadeDrive. */
  public tankDrive() {
    addRequirements(DriveTrain);
  }

  package frc.robot.commands;

import frc.robot.subsystems.DriveTrain;
import frc.robot.Constants;
import frc.robot.Robot;

import frc.robot.RobotContainer;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj2.command.Subsystem;

public class tankDrive extends CommandBase {

  /** Creates a new ArcadeDrive. */
  public tankDrive() {
    addRequirements(DriveTrain);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    /*
     * RobotContainer.DriveTrain.setSpeed(-driverController.getRawAxis(1),
     * driverController.getRawAxis(4));
     * double moveSpeed = -RobotContainer.driverController.getRawAxis(1);
     * double rotateSpeed = RobotContainer.driverController.getRawAxis(4);
     */

  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {

  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
