package frc.robot.commands;

import frc.robot.subsystems.DriveTrain;
import frc.robot.Constants;
import frc.robot.Robot;
//import frc.robot.Constants;
import frc.robot.RobotContainer;
//import frc.robot.subsystems.*;
//import frc.robot.subsystems.drivetrain;
//import frc.robot.*;
import edu.wpi.first.wpilibj.XboxController;

//import java.util.function.DoubleSupplier;

//import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.CommandBase;
//import edu.wpi.first.wpilibj2.command.Subsystem;

public class tankDrive extends CommandBase {

  XboxController driverController = new XboxController(0);
  
  /** Creates a new ArcadeDrive. */
  public tankDrive() {
    addRequirements(RobotContainer.DriveTrain);
  }


// Called when the command is initially scheduled.
  @Override
  public void initialize() {
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    RobotContainer.DriveTrain.setSpeed(-driverController.getRawAxis(1), driverController.getRawAxis(4));
    double moveSpeed = -RobotContainer.driverController.getRawAxis(1);
    double rotateSpeed = RobotContainer.driverController.getRawAxis(4);
    diff.tankDrive(moveSpeed, rotateSpeed);
  }
  
  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    diff.tankDrive(0,0);
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
