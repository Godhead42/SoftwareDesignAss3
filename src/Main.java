import Adapters.ComputerGameAdapter;
import Adapters.MobileGameAdapter;
import Adapters.PlayStationAdapter;
import Controllers.ComputerGameController;
import Controllers.MobileGameController;
import Controllers.PlayStationGameController;
import interfaces.IController;

public class Main {
    public static void main(String[] args) {

        MobileGameController mobileController = new MobileGameController();
        IController mobileEmulator = new Emulator(new MobileGameAdapter(mobileController));

        PlayStationGameController playStationGameController = new PlayStationGameController();
        IController playStationEmulator = new Emulator(new PlayStationAdapter(playStationGameController));

        ComputerGameController computerGameController = new ComputerGameController();
        IController computerEmulator = new Emulator(new ComputerGameAdapter(computerGameController));

        TestEmulator testMobileEmulator = new TestEmulator(mobileEmulator);
        TestEmulator testPlayStationEmulator = new TestEmulator(playStationEmulator);
        TestEmulator testComputerEmulator = new TestEmulator(computerEmulator);

        System.out.println("Mobile Test: ");
        testMobileEmulator.testEverything();
        System.out.println();
        System.out.println("PlayStation Test: ");
        testPlayStationEmulator.testEverything();
        System.out.println();
        System.out.println("Computer Test: ");
        testComputerEmulator.testEverything();
    }
}