package org.firstinspires.ftc.imposteen750.common.commandbase.auto;

import com.arcrobotics.ftclib.command.InstantCommand;
import com.arcrobotics.ftclib.command.SequentialCommandGroup;

import org.firstinspires.ftc.imposteen750.common.commandbase.subsystem.IntakeSubsystem;
import org.firstinspires.ftc.imposteen750.common.hardware.Robot;

public class TeleopIntakeCommand extends SequentialCommandGroup {
    public TeleopIntakeCommand(Robot robot) {
        super(
                new InstantCommand(() -> robot.intake.update(IntakeSubsystem.ClawState.OPEN)),
                new InstantCommand(() -> robot.intake.setFourbar(IntakeSubsystem.fourbar_extended)),
                new InstantCommand(() -> robot.intake.update(IntakeSubsystem.PivotState.FLAT)),
                new InstantCommand(() -> robot.intake.update(IntakeSubsystem.TurretState.INTAKE))
        );
    }
}
