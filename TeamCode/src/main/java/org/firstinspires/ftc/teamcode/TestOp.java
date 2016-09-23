package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

/**
 * Created by pranavb on 9/23/16.
 */

@TeleOp(name = "TestOp", group = "TeleOp")
public class TestOp extends LinearOpMode{
    DcMotor motor1 = null;
    DcMotor motor2 = null;

    public void runOpMode() throws InterruptedException{
        motor1 = hardwareMap.dcMotor.get("motor1");
        motor2 = hardwareMap.dcMotor.get("motor2");

        waitForStart();
        while(opModeIsActive()){
            if(gamepad1.a){
                motor1.setPower(1);
            } else if(gamepad1.y){
                motor1.setPower(-1);
            } else if(gamepad1.x){
                motor2.setPower(-1);
            } else if(gamepad1.b){
                motor2.setPower(1);
            }

            idle();
        }
    }
}
