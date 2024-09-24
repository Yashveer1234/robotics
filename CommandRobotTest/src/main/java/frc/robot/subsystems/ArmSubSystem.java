package frc.robot.subsystems;


import java.lang.reflect.Method;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj.motorcontrol.MotorController;
import edu.wpi.first.wpilibj.motorcontrol.PWMVictorSPX;


public class ArmSubSystem extends SubsystemBase {

    public ArmSubSystem() {}


    public void runarm() {
       PWMVictorSPX motor = new PWMVictorSPX(4);
        addChild("motor",motor);
        motor.setInverted(false);
        
    }


    public void coast(){

    }

    public void breaking(){}
    
}
