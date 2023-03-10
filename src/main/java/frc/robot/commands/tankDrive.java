package frc.robot.commands;

import frc.robot.subsystems.DriveTrain;
import frc.robot.RobotContainer;
import java.util.function.DoubleSupplier;
import edu.wpi.first.wpilibj2.command.CommandBase;

public class tankDrive extends CommandBase {
  /** Creates a new ArcadeDrive. */
  private final DriveTrain m_Drive;
  private final DoubleSupplier m_forward;
  private final DoubleSupplier m_turn;

  public tankDrive(DriveTrain m_driveTrain, DoubleSupplier forward, DoubleSupplier turn) {
    m_Drive = m_driveTrain;
    m_forward = forward;
    m_turn = turn;
    addRequirements(m_Drive);
  }

  @Override
  public void execute() {
    m_Drive.tankDrive(m_forward.getAsDouble(), m_turn.getAsDouble());

  }
}
