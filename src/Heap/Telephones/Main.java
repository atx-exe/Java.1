package Heap.Telephones;

import Heap.Telephones.Device.Phone;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rnd = new Random();
        Phone[] groupPhones = {new Phone("Phone 1"), new Phone("Phone 2"), new Phone("Phone 3")};
        long[] referenceNumbers = {89991001010l, 89991001011l, 89991001012l, 89991001013l, 89991001014l, 89991001020l,
                89991001021l, 89991001023l, 89991001110l, 89991001111l, 89991001112l, 89991001120l, 89991002010l,
                89991002011l, 89991002030l, 89991011010l, 89991011010l, 89991011010l, 89991011040l, 89991021042l,
                89991021243l, 89991021314l, 89991021310l, 89991021315l, 89991021317l, 89991021410l, 89991031412l,
                89991031510l, 89991031514l, 89991031610l, 89991031613l, 89991031614l, 89991031650l, 89991031710l,
                89991031712l, 89991031714l, 89991031715l, 89991041010l, 89991041313l, 89991041510l
        };
        int idReferenceNumbers = 0;

        for (int i = 0; i < 100; i++) {
            switch (rnd.nextInt(3)) {
                case (0):
                    for (int j = 0; j < groupPhones.length; j++) {
                        int randonPhone = rnd.nextInt(groupPhones.length - j);
                        if (!groupPhones[randonPhone].isBusy()) {
                            groupPhones[randonPhone].incomingCall(89800000000l + i);
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
                    for (int j = 0; j < groupPhones.length; j++) {
                        if (groupPhones[j].isBusy()) {
                            groupPhones[j].endCall();
                            groupPhones[j].setBusy(false);
                            break;
                        }
                    }
            }
            System.out.println(i + ". " + groupPhones[0].toString() + "; " + groupPhones[1].toString() + "; " + groupPhones[2].toString());
        }
        System.out.println("Осталось обзвонить " + (referenceNumbers.length - idReferenceNumbers) + " номеров");
    }
}
