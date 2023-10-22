package Adapters;

import Controllers.MobileGameController;
import interfaces.IController;

public class MobileGameAdapter implements IController {
    MobileGameController mobileGameController;

    public MobileGameAdapter(MobileGameController mobileGameController) {
        this.mobileGameController = mobileGameController;
    }

    @Override
    public void walkForward() {
        mobileGameController.touchArrowUp();
    }

    @Override
    public void jump() {
        mobileGameController.touchJump();
    }

    @Override
    public void shoot() {
        mobileGameController.touchShoot();
    }
}