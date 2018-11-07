package frc.team2974.robot;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.Talon;

import static frc.team2974.robot.Config.Encoder.*;
import static frc.team2974.robot.Config.Motor.LEFT_MOTOR_PORT;
import static frc.team2974.robot.Config.Motor.RIGHT_MOTOR_PORT;
import static frc.team2974.robot.Config.Motor.SOLENOID_PORT;
public final class RobotMap {
    public static final Talon rightMotor = new Talon(RIGHT_MOTOR_PORT);
    public static final Talon leftMotor = new Talon(LEFT_MOTOR_PORT);

    public static final Encoder rightEncoder = new Encoder(RIGHT_ENCODER_CHANNEL_A, RIGHT_ENCODER_CHANNEL_B);
    public static final Encoder leftEncoder = new Encoder(LEFT_ENCODER_CHANNEL_A,LEFT_ENCODER_CHANNEL_B);

    public static final Solenoid solenoid = new Solenoid(SOLENOID_PORT);
}
