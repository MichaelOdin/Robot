package frc.team2974.robot.subsystem;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.team2974.robot.RobotMap;
import frc.team2974.robot.command.DriveCommand;

import static frc.team2974.robot.RobotMap.solenoid;
public class Drivetrain extends Subsystem {
    @Override
    protected void initDefaultCommand() {
        setDefaultCommand(new DriveCommand());
    }

    public void setSpeeds(double rightSpeed, double leftSpeed){
        RobotMap.rightMotor.set(rightSpeed);
        RobotMap.leftMotor.set(leftSpeed);
    }
    public void shiftUp(){
        solenoid.set(true);
    }
    public void shiftDown(){
        solenoid.set(false);
    }
}
