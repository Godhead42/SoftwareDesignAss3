package Adapters;

import Controllers.ComputerGameController;
import interfaces.IController;

public class ComputerGameAdapter implements IController {
    ComputerGameController computerGameController;

    public ComputerGameAdapter(ComputerGameController computerGameController) {
        this.computerGameController = computerGameController;
    }

    @Override
    public void walkForward() {
        computerGameController.pressWButton();
    }

    @Override
    public void jump() {
        computerGameController.pressSpaceButton();
    }

    @Override
    public void shoot() {
        computerGameController.pressLMButton();
    }
}