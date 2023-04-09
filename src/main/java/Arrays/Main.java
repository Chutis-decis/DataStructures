package Arrays;

public class Main {
    public static void main(String[] args) {
        Unidimentionals valores = new Unidimentionals(5);
        System.out.println(valores.Insrtar(3));
        System.out.println(valores.Insrtar(56));
        System.out.println(valores.Insrtar(36));
        System.out.println(valores.Insrtar(86));
        System.out.println(valores.Insrtar(82));

        System.out.println("\n" + valores.Eliminar(82));

        System.out.println(valores.Mostrar());

        System.out.println(valores.Ordenar() + " " + valores.Mostrar());

        System.out.println(valores.ObtenerMayor());
    }
}
