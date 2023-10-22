import interfaces.IController;

public class TestEmulator {
    IController emulator;

    public TestEmulator(IController emulator) {
        this.emulator = emulator;
    }

    public void testEverything() {
        emulator.walkForward();
        emulator.jump();
        emulator.shoot();
    }
}