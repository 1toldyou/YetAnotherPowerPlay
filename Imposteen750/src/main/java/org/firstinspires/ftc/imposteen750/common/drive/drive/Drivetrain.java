package org.firstinspires.ftc.imposteen750.common.drive.drive;

import org.firstinspires.ftc.imposteen750.common.drive.geometry.Pose;

public interface Drivetrain {

    void set(Pose pose);

    void set(Pose pose, double maxPower);
}
