package org.alura.literatura.Literatura_Challenge.PRINCIPAL;

import org.alura.literatura.Literatura_Challenge.SERVICE.MenuService;
import org.alura.literatura.Literatura_Challenge.UI.Menu;
import org.springframework.beans.factory.annotation.Autowired;

import java.awt.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {

    private final MenuService menuService;

    @Autowired
    public Principal(MenuService menuService) {
        this.menuService = menuService;
    }

    public void EjecutarAplicacion() {
        Menu menu = new Menu();
        Scanner teclado = new Scanner(System.in);
        System.out.println(menu.getBienvenida());
        int opcion;
        do {
            try {
                System.out.print(menu.getMenu() + " ");
                opcion = teclado.nextInt();
                teclado.nextLine();
                switch (opcion) {
                    case 1:
                        menuService.guardarLibro();
                        break;
                    case 2:
                        menuService.listarLibrosRegistrados();
                        break;
                    case 3:
                        menuService.listarAutoresRegistrados();
                        break;
                    case 4:
                        menuService.listarAutoresVivosEnAnio();
                        break;
                    case 5:
                        menuService.listarLibrosPorIdioma();
                        break;
                    case 0:
                        System.out.println("Saliendo de la aplicacion...");
                        break;
                    default:
                        System.out.println("Opción inválida");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Ingrese un número");
                opcion = -1;
                teclado.nextLine();
            }
        } while (opcion != 0);
        teclado.close();
    }
}