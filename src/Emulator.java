import interfaces.IController;

public class Emulator implements IController {
    IController controller;

    public Emulator(IController controller) {
        this.controller = controller;
    }

    @Override
    public void walkForward() {
        controller.walkForward();
    }

    @Override
    public void jump() {
        controller.jump();
    }

    @Override
    public void shoot() {
        controller.shoot();
    }
}