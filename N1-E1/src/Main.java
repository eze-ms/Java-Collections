import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Month> monthList = Month.createMonthList();

        try (Scanner consola = new Scanner(System.in)) {
            boolean exit = false;

            while (!exit) {
                showMenu();
                int option = getOption(consola);

                try {
                    exit = executeOption(option, monthList);
                } catch (InvalidOptionException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
        System.out.println("Gracias por usar el programa.");
    }

    public static void showMenu() {
        System.out.println("""
        =============================
        ** Month List **
        =============================
        1. List
        2. Insert "Agost"
        3. Convert to HashSet
        4. Exit
        =============================
        """);
        System.out.print("Choose an option: ");
    }

    private static int getOption(Scanner consola) {
        try {
            return Integer.parseInt(consola.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Error: Introduce un número válido.");
            return -1; // Opción inválida
        }
    }

    private static boolean executeOption(int option, List<Month> monthList) throws InvalidOptionException {
        if (option < 1 || option > 4) {
            throw new InvalidOptionException("La opción seleccionada no es válida. Introduce un número entre 1 y 4.");
        }

        switch (option) {
            case 1 -> MonthService.listMonths(monthList);
            case 2 -> MonthService.insertAugust(monthList);
            case 3 -> MonthService.convertToHashSet(monthList);
            case 4 -> {
                System.out.println("¡Hasta pronto!");
                return true; // Finaliza el programa
            }
        }
        return false; // Continúa en el bucle
    }
}
