package Heap.Telephones;

import Heap.Telephones.Device.Phone;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rnd = new Random();
        Phone[] groupPhones = {new Phone("Phone 1"), new Phone("Phone 2"), new Phone("Phone 3")};
        long[] referenceNumbers = {
                89991001010L, 89991001011L, 89991001012L, 89991001013L, 89991001014L, 89991001020L, 89991001021L,
                89991001023L, 89991001110L, 89991001111L, 89991001112L, 89991001120L, 89991002010L, 89991002011L,
                89991002030L, 89991011010L, 89991011010L, 89991011010L, 89991011040L, 89991021042L, 89991021243L,
                89991021314L, 89991021310L, 89991021315L, 89991021317L, 89991021410L, 89991031412L, 89991031510L,
                89991031514L, 89991031610L, 89991031613L, 89991031614L, 89991031650L, 89991031710L, 89991031712L,
                89991031714L, 89991031715L, 89991041010L, 89991041313L, 89991041510L, 89991050012L, 89991050045L
        };
        int idReferenceNumbers = 0;

        for (int i = 0; i < 100; i++) {
            switch (rnd.nextInt(4)) {
                case (0):
                    boolean allPhonesAreBusy = true;
                    for (Phone phone : groupPhones) {
                        if (!phone.isBusy()) {
                            allPhonesAreBusy = false;
                            break;
                        }
                    }
                    while (!allPhonesAreBusy) {
                        int randomPhone = rnd.nextInt(groupPhones.length);
                        if (!groupPhones[randomPhone].isBusy()) {
                            groupPhones[randomPhone].incomingCall(89800000000L + i);
                            break;
                        }
                    }
                    break;
                case (1):
                    for (Phone phone : groupPhones) {
                        if (!phone.isBusy()) {
                            phone.outgoingCall(referenceNumbers[idReferenceNumbers]);
                            idReferenceNumbers += 1;
                        }
                        break;
                    }
                    break;
                default:
                    for (Phone groupPhone : groupPhones) {
                        if (groupPhone.isBusy()) {
                            groupPhone.endCall();
                            groupPhone.setBusy(false);
                            break;
                        }
                    }
            }
            System.out.println(i + ". " + groupPhones[0].toString() + "; " + groupPhones[1].toString() + "; " + groupPhones[2].toString());
        }
        System.out.println("Осталось обзвонить " + (referenceNumbers.length - idReferenceNumbers) + " номеров");
    }
}
