package com.joysistvi.day8.userinput;
import java.util.Scanner;

public class Activity5_Cristobal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Dial *143# to access Globe Services");
        System.out.print("Enter USSD Code: ");
        String ussdCode = scanner.nextLine();

        if (!ussdCode.equals("*143#")) {
            System.out.println("Invalid USSD Code");
            return;
        }

        System.out.println("[1] Go+");
        System.out.println("[2] Go");
        System.out.println("[3] GoExtra");
        System.out.println("[4] UNLI 5G");
        System.out.println("[5] ALLNET");
        System.out.print("Enter a choice: ");
        int loadRegistration = scanner.nextInt();

        if (loadRegistration < 1 || loadRegistration > 5) {
            return;
        }
        if (loadRegistration == 1) {
            System.out.println("*** Go+ Promos ***");
            System.out.println("[1] Go+99");
            System.out.println("[2] Go+129");
            System.out.println("[3] Go+149");
            System.out.print("Enter a choice: ");
            int goPlus = scanner.nextInt();

            if (goPlus < 1 || goPlus > 3 ){
                return;
            }
            if (goPlus == 1) {
                System.out.println("*** Go+99 Promo ***");
                System.out.println("-> Get 8 GB for all sites + 8GB");
                System.out.println("[1] Subscribe");
                System.out.println("[2] Exit");
                System.out.print("Enter a choice: ");
                int go99 = scanner.nextInt();

                if (go99 <1 || go99 >2) {
                    return;
                }

                if (go99 == 1) {
                    System.out.println("You are now subscribed to Go+99");
                } else {
                    System.exit(0);
                }
            } else if (goPlus == 2) {
                System.out.println("*** Go+129 Promo ***");
                System.out.println("-> Get 11 GB for all sites + 8 GB for choice of apps + 8 GB free 5G data + Unli all-net texts for 7 days");
                System.out.println("[1] Subscribe");
                System.out.println("[2] Exit");
                System.out.print("Enter a choice: ");
                int go129 = scanner.nextInt();

                if (go129 <1 || go129 >2) {
                    return;
                }

                if (go129 == 1) {
                    System.out.println("You are now subscribed to Go+129");
                } else {
                    System.exit(0);
                }
            } else {
                System.out.println("*** Go+149 Promo ***");
                System.out.println("-> Get 13 GB for all sites + 8 GB for choice of apps + 8 GB free 5G data + Unli all-net calls & texts for 7 days");
                System.out.println("[1] Subscribe");
                System.out.println("[2] Exit");
                System.out.print("Enter a choice: ");
                int go149 = scanner.nextInt();

                if (go149 <1 || go149 >2) {
                    return;
                }

                if (go149 == 1) {
                    System.out.println("You are now subscribed to Go+149");
                } else {
                    System.exit(0);
                }
            }
        } else if (loadRegistration == 2) {
            System.out.println("*** Go Promos ***");
            System.out.println("[1] Go50");
            System.out.println("[2] Go90");
            System.out.println("[3] Go120");
            System.out.print("Enter a choice: ");
            int go = scanner.nextInt();

            if (go < 1 || go > 3 ){
                return;
            }
            if (go == 1) {
                System.out.println("*** Go50 Promo ***");
                System.out.println("-> Get 5 GB for all sites + 1 GB GoWiFi access + Unli all-net texts for 3 days");
                System.out.println("[1] Subscribe");
                System.out.println("[2] Exit");
                System.out.print("Enter a choice: ");
                int go50 = scanner.nextInt();

                if (go50 < 1 || go50 > 2) {
                    return;
                }
                if (go50 == 1) {
                    System.out.println("You are now subscribed to Go50");
                } else {
                    System.exit(0);
                }
            } else if (go == 2) {
                System.out.println("*** Go90 Promo ***");
                System.out.println("-> Get 8 GB for all sites + 1 GB GoWiFi access + Unli all-net texts for 7 days");
                System.out.println("[1] Subscribe");
                System.out.println("[2] Exit");
                System.out.print("Enter a choice: ");
                int go90 = scanner.nextInt();

                if (go90 < 1 || go90 > 2) {
                    return;
                }
                if (go90 == 1) {
                    System.out.println("You are now subscribed to Go90");
                } else {
                    System.exit(0);
                }
            } else {
                System.out.println("*** Go120 Promo ***");
                System.out.println("-> Get 10 GB for all sites + 2 GB GoWiFi access + Unli all-net texts + Unli calls to Globe/TM for 7 days");
                System.out.println("[1] Subscribe");
                System.out.println("[2] Exit");
                System.out.print("Enter a choice: ");
                int go120 = scanner.nextInt();

                if (go120 < 1 || go120 > 2) {
                    return;
                }
                if (go120 == 1) {
                    System.out.println("You are now subscribed to Go120");
                } else {
                    System.exit(0);
                }
            }

        } else if (loadRegistration == 3) {
            System.out.println("*** GoEXTRA Promos ***");
            System.out.println("[1] GoEXTRA99");
            System.out.println("[2] GoEXTRA129");
            System.out.println("[3] GoEXTRA149");
            System.out.print("Enter a choice: ");
            int goExtra = scanner.nextInt();

            if (goExtra < 1 || goExtra > 3 ){
                return;
            }
            if (goExtra == 1) {
                System.out.println("*** GoEXTRA99  Promo ***");
                System.out.println("-> Get 8 GB for all sites + 4 GB free 5G data + Unli all-net calls & texts for 7 days");
                System.out.println("[1] Subscribe");
                System.out.println("[2] Exit");
                System.out.print("Enter a choice: ");
                int goExtra99 = scanner.nextInt();

                if (goExtra99 < 1 || goExtra99 > 2) {
                    return;
                }
                if (goExtra99 == 1) {
                    System.out.println("You are now subscribed to GoEXTRA99");
                } else {
                    System.exit(0);
                }
            } else if (goExtra == 2) {
                System.out.println("*** GoEXTRA129 Promo ***");
                System.out.println("-> Get 8 GB for all sites + Unli all-net calls & texts for 10 days");
                System.out.println("[1] Subscribe");
                System.out.println("[2] Exit");
                System.out.print("Enter a choice: ");
                int goExtra129 = scanner.nextInt();

                if (goExtra129 < 1 || goExtra129 > 2) {
                    return;
                }
                if (goExtra129 == 1) {
                    System.out.println("You are now subscribed to GoEXTRA129");
                } else {
                    System.exit(0);
                }
            } else {
                System.out.println("*** GoEXTRA149 Promo ***");
                System.out.println("-> Get 13 GB for all sites + 8 GB free 5G data + Unli all-net calls & texts for 15 days");
                System.out.println("[1] Subscribe");
                System.out.println("[2] Exit");
                System.out.print("Enter a choice: ");
                int goExtra149 = scanner.nextInt();

                if (goExtra149 < 1 || goExtra149 > 2) {
                    return;
                }
                if (goExtra149 == 1) {
                    System.out.println("You are now subscribed to GoEXTRA149");
                } else {
                    System.exit(0);
                }
            }

        } else if (loadRegistration == 4) {
            System.out.println("*** Unli 5G Promos ***");
            System.out.println("[1] UNLI 5G 99");
            System.out.println("[2] UNLI 5G 149");
            System.out.println("[3] UNLI 5G 199");
            System.out.print("Enter a choice: ");
            int unli5G = scanner.nextInt();

            if (unli5G < 1 || unli5G > 3 ){
                return;
            }
            if (unli5G == 1) {
                System.out.println("*** Unli 5G 99 Promo ***");
                System.out.println("-> Unlimited 5G data + 2 GB open-access data for non-5G areas for 3 days");
                System.out.println("[1] Subscribe");
                System.out.println("[2] Exit");
                System.out.print("Enter a choice: ");
                int unli5G99 = scanner.nextInt();

                if (unli5G99 < 1 || unli5G99 > 2) {
                    return;
                }
                if (unli5G99 == 1) {
                    System.out.println("You are now subscribed to UNLI 5G 99");
                } else {
                    System.exit(0);
                }
            } else if (unli5G == 2) {
                System.out.println("*** Unli 5G 149 Promo ***");
                System.out.println("-> Unlimited 5G data + 4 GB open-access data for non-5G areas for 5 days");
                System.out.println("[1] Subscribe");
                System.out.println("[2] Exit");
                System.out.print("Enter a choice: ");
                int unli5G149 = scanner.nextInt();

                if (unli5G149 < 1 || unli5G149 > 2) {
                    return;
                }
                if (unli5G149 == 1) {
                    System.out.println("You are now subscribed to UNLI 5G 149");
                } else {
                    System.exit(0);
                }
            } else {
                System.out.println("*** Unli 5G 199 Promos ***");
                System.out.println("-> Unlimited 5G data + 5 GB open-access data for non-5G areas for 7 days");
                System.out.println("[1] Subscribe");
                System.out.println("[2] Exit");
                System.out.print("Enter a choice: ");
                int unli5G199 = scanner.nextInt();

                if (unli5G199 < 1 || unli5G199 > 2) {
                    return;
                }
                if (unli5G199 == 1) {
                    System.out.println("You are now subscribed to UNLI 5G 199");
                } else {
                    System.exit(0);
                }
            }

        } else {
            System.out.println("*** ALLNET Promos ***");
            System.out.println("[1] ALLNET99");
            System.out.println("[2] ALLNET149");
            System.out.println("[3] ALLNET199");
            System.out.print("Enter a choice: ");
            int allNet = scanner.nextInt();

            if (allNet < 1 || allNet > 3 ){
                return;
            }
            if (allNet == 1) {
                System.out.println("*** ALLNET99 Promo ***");
                System.out.println("-> Get 1 GB all-access data + Unli all-net calls & texts for 7 days");
                System.out.println("[1] Subscribe");
                System.out.println("[2] Exit");
                System.out.print("Enter a choice: ");
                int allNet99 = scanner.nextInt();

                if (allNet99 < 1 || allNet99> 2) {
                    return;
                }
                if (allNet99 == 1) {
                    System.out.println("You are now subscribed to ALLNET99");
                } else {
                    System.exit(0);
                }
            } else if (allNet == 2) {
                System.out.println("*** ALLNET149 Promo ***");
                System.out.println("-> Get 2 GB all-access data + Unli all-net calls & texts for 7 days");
                System.out.println("[1] Subscribe");
                System.out.println("[2] Exit");
                System.out.print("Enter a choice: ");
                int allNet149 = scanner.nextInt();

                if (allNet149 < 1 || allNet149 > 2) {
                    return;
                }
                if (allNet149 == 1) {
                    System.out.println("You are now subscribed to ALLNET149");
                } else {
                    System.exit(0);
                }
            } else {
                System.out.println("*** ALLNET199 Promos ***");
                System.out.println("-> Get 3 GB all-access data + Unli all-net calls & texts for 15 days");
                System.out.println("[1] Subscribe");
                System.out.println("[2] Exit");
                System.out.print("Enter a choice: ");
                int allNet199 = scanner.nextInt();

                if (allNet199 < 1 || allNet199 > 2) {
                    return;
                }
                if (allNet199 == 1) {
                    System.out.println("You are now subscribed to ALLNET199");
                } else {
                    System.exit(0);
                }
            }
        }
    }
}