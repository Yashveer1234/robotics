package frc.robot.commands;

import frc.robot.subsystems.ArmSubSystem;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;


public class JoystickCommand extends Command
{
    @SuppressWarnings({"PMD.UnusedPrivateField", "PMD.SingularField"})
    private final ArmSubSystem m_subsystem;
  
    public JoystickCommand(ArmSubSystem armsubsystem) {
        m_subsystem = armsubsystem;
        // Use addRequirements() here to declare command dependencies.
        addRequirements(armsubsystem);
      }


 // Called when the command is initially scheduled.
 @Override
 public void initialize() {}

 // Called every time the scheduler runs while the command is scheduled.
 @Override
 public void execute() {

     Joystick joystick = new Joystick(0);
     if (joystick.getRawButton(0)) {
       
     } else {
        
     }

 }

 // Called once the command ends or is interrupted.
 @Override
 public void end(boolean interrupted) {}

 // Returns true when the command should end.
 @Override
 public boolean isFinished() {
   return false;
 }   


}
