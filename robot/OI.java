package frc.team2974.robot;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

public class OI {
    public static final Joystick rightStick = new Joystick(0);
    public static final Joystick leftStick = new Joystick(1);
    public static final JoystickButton shiftUpButton = new JoystickButton(leftStick, 0);
    public static final JoystickButton shiftDownButton = new JoystickButton(leftStick, 1);
}
