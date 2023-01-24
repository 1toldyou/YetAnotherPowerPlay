package org.firstinspires.ftc.imposteen750.common.drive.localizer;

import org.firstinspires.ftc.imposteen750.common.drive.geometry.Pose;

public interface Localizer {

    void periodic();

    Pose getPos();

    void setPos(Pose pose);
}
