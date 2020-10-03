package Heap.Telephones.Device;

public class Phone {
    private String name;
    private boolean keyboard;
    private boolean monitor;
    private boolean cpu;
    private boolean mobileModul;
    private boolean isBusy;

    public Phone(String name) {
        this.name = name;
    }

    public void incomingCall(long number) {
        if (!isBusy) {
            System.out.println(number + " звонит на " + name);
            isBusy = true;
        } else System.out.println(name + " занят");
    }

    public void outgoingCall(long number) {
        if (!isBusy) {
            System.out.println(name + " звонит на " + number);
            isBusy = true;
        } else System.out.println(name + " занят");
    }

    public void endCall() {
        if (isBusy) isBusy = false;
        System.out.println(name + " завершил звонок");
    }

    public void setBusy(boolean busy) {
        isBusy = busy;
    }

    public boolean isBusy() {
        return isBusy;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "name='" + name + '\'' +
                ", isBusy=" + isBusy +
                '}';
    }
}
