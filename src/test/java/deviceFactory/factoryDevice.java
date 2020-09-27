package deviceFactory;

public class factoryDevice {
    public static Idevice make(String type) {
        Idevice device;

        switch (type) {
            case "android":
                device = new Android();
                break;

            case "ios":
                device = new Ios();
                break;
            default:
                device = new Android();
                break;

        }
        return device;
    }
}
