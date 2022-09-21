package CRUD;

import java.time.LocalDateTime;
import java.util.Scanner;

public class EntradaSalida {
    public static void salidaString(String msj){
        System.out.println(msj);
    }
    public static String entradaString(){
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }
    public static String entradaString(String msj){
        Scanner input = new Scanner(System.in);
        System.out.println(msj);
        return input.nextLine();
    }
    public static int entradaInt(){
        Scanner input = new Scanner(System.in);
        return Integer.parseInt(input.nextLine());
    }
    public static int entradaInt(String msj){
        Scanner input = new Scanner(System.in);
        System.out.println(msj);
        int i;
        try {
                i = Integer.parseInt(input.nextLine());

            } catch (IllegalArgumentException NumberFormatException) {
            System.out.println("\nIngrese un valor numerico ");
            i = Integer.parseInt(input.nextLine());
        }
        return i;
    }
    public static double entradaDouble(){
        Scanner input = new Scanner(System.in);
        return Integer.parseInt(input.nextLine());
    }
    public static double entradaDouble(String msj){
        Scanner input = new Scanner(System.in);
        System.out.println(msj);
        return Integer.parseInt(input.nextLine());
    }

    public static LocalDateTime entradaFechaHora(String s) {
        System.out.println(s);
        int anio = EntradaSalida.entradaInt("\nIngrese el anio: ");
        String mes = EntradaSalida.entradaString("\nIngrese el mes: ");
        String dia = EntradaSalida.entradaString("\nIngrese el dia: ");
        String hora = EntradaSalida.entradaString("\nIngresa la hora: ");
        String min = EntradaSalida.entradaString("\nIngresa los minutos: ");
        LocalDateTime fechaHora = LocalDateTime.parse(anio+"-"+mes+"-"+dia+"T"+hora+":"+min);
        return fechaHora;
    }
}
