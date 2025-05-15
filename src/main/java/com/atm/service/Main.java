package com.atm.service;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LoginService loginService = new LoginService();
        SaldoService saldoService = new SaldoService();
        InsättningService insättningService = new InsättningService(saldoService);
        UttagService uttagService = new UttagService(saldoService);
        LogoutService logoutService = new LogoutService();

        boolean isRunning = true;
        boolean isLoggedIn = false;

        while (isRunning) {
            if (!isLoggedIn) {
                System.out.println("Välkommen till ATM!");
                System.out.print("Ange användarnamn: ");
                String username = scanner.nextLine();
                System.out.print("Ange PIN: ");
                String pin = scanner.nextLine();

                if (loginService.login(username, pin)) {
                    isLoggedIn = true;
                    System.out.println("Inloggning lyckades!");
                } else {
                    System.out.println("Felaktiga uppgifter. Försök igen.\n");
                    continue;
                }
            }

            System.out.println("\n--- ATM Meny ---");
            System.out.println("1. Visa saldo");
            System.out.println("2. Sätt in pengar");
            System.out.println("3. Ta ut pengar");
            System.out.println("4. Logga ut");
            System.out.println("5. Avsluta");

            System.out.print("Välj ett alternativ: ");
            String input = scanner.nextLine();
            int val;
            try {
                val = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Ogiltigt val, försök igen.");
                continue;
            }

            switch (val) {
                case 1:
                    System.out.println("Ditt saldo är: " + saldoService.getSaldo() + " kr");
                    break;
                case 2:
                    System.out.print("Ange belopp att sätta in: ");
                    try {
                        double inAmount = Double.parseDouble(scanner.nextLine());
                        insättningService.sättIn(inAmount);
                    } catch (NumberFormatException e) {
                        System.out.println("Ogiltigt belopp.");
                    }
                    break;
                case 3:
                    System.out.print("Ange belopp att ta ut: ");
                    try {
                        double outAmount = Double.parseDouble(scanner.nextLine());
                        uttagService.taUt(outAmount);
                    } catch (NumberFormatException e) {
                        System.out.println("Ogiltigt belopp.");
                    }
                    break;
                case 4:
                    logoutService.logout();
                    isLoggedIn = false;
                    System.out.println("Du är nu utloggad.\n");
                    break;
                case 5:
                    isRunning = false;
                    System.out.println("Programmet avslutas.");
                    break;
                default:
                    System.out.println("Ogiltigt val, försök igen.");
            }
        }
        scanner.close();
    }
}
