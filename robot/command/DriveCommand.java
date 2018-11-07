package frc.team2974.robot.command;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.team2974.robot.OI;
import frc.team2974.robot.Robot;
import frc.team2974.robot.subsystem.Drivetrain;

import static frc.team2974.robot.Config.THRESHOLD;
import static frc.team2974.robot.OI.shiftDownButton;
import static frc.team2974.robot.OI.shiftUpButton;
import static frc.team2974.robot.Robot.drivetrain;

public class DriveCommand extends Command {
    public DriveCommand (){
        requires(drivetrain);
    }

    @Override
    protected void execute() {
        super.execute();

        double left = getLeftThrottle();
        double right = getRightThrottle();

        drivetrain.setSpeeds(left, -right);
        if (shiftUpButton.get()){
            drivetrain.shiftUp();
        }

        if (shiftDownButton.get()){
            drivetrain.shiftDown();
        }
    }
    @Override
    protected boolean isFinished() {
        return false;
    }
    public double getRightThrottle(){
        double yValue = OI.rightStick.getY();
        if (yValue < THRESHOLD && yValue > -THRESHOLD){
            yValue = 0;
        }
        return yValue;
    }
    public double getLeftThrottle(){
        double yValue = OI.leftStick.getY();
        if (yValue < THRESHOLD && yValue > -THRESHOLD){
            yValue = 0;
        }
        return yValue;
    }
}
