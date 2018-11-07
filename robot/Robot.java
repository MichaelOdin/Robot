package frc.team2974.robot;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Scheduler;
import frc.team2974.robot.subsystem.Drivetrain;

public class Robot extends IterativeRobot {

    public static Drivetrain drivetrain = new Drivetrain();

    @Override
    public void robotInit() {
        Scheduler.getInstance().run();
    }

    @Override
    public void disabledInit() {
        Scheduler.getInstance().run();
    }

    @Override
    public void autonomousInit() {
        Scheduler.getInstance().run();

    }

    @Override
    public void teleopInit() {
        Scheduler.getInstance().run();
    }

    @Override
    public void testInit() {
        Scheduler.getInstance().run();
    }


    @Override
    public void disabledPeriodic() {
        Scheduler.getInstance().run();
    }
    
    @Override
    public void autonomousPeriodic() {
        Scheduler.getInstance().run();
    }

    @Override
    public void teleopPeriodic() {
        Scheduler.getInstance().run();
    }

    @Override
    public void testPeriodic() {
        Scheduler.getInstance().run();
    }
}