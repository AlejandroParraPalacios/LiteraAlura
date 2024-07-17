package org.alura.literatura.Literatura_Challenge.MODEL;

public enum Idioma {
    ESPANOL("Español"),
    INGLES("Inglés"),
    FRANCES("Francés"),
    PORTUGUES("Portugués"),
    NO_DISPONIBLE("No disponible");

    private final String idiomaCompleto;

    // Constructor privado para el enum
    private Idioma(String idiomaCompleto) {
        this.idiomaCompleto = idiomaCompleto;
    }

    // Método para convertir un String a un valor del enum
    public static Idioma stringToEnum(String idioma) {
        for (Idioma item : Idioma.values()) {
            if (item.name().equalsIgnoreCase(idioma)) {
                return item;
            }
        }
        return NO_DISPONIBLE;
    }

    // Método para listar todos los idiomas disponibles
    public static void listarIdiomas() {
        for (Idioma idioma : Idioma.values()) {
            System.out.println(idioma.name() + " - " + idioma.getIdiomaCompleto());
        }
    }

    // Getter para idiomaCompleto
    public String getIdiomaCompleto() {
        return idiomaCompleto;
    }
}