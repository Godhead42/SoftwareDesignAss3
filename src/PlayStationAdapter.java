package Adapters;

import Controllers.PlayStationGameController;
import interfaces.IController;

public class PlayStationAdapter implements IController {
    PlayStationGameController playStationGameController;

    public PlayStationAdapter(PlayStationGameController playStationGameController) {
        this.playStationGameController = playStationGameController;
    }

    @Override
    public void walkForward() {
        playStationGameController.leftStickUp();
    }

    @Override
    public void jump() {
        playStationGameController.pressXButton();
    }

    @Override
    public void shoot() {
        playStationGameController.pressL2();
    }
}