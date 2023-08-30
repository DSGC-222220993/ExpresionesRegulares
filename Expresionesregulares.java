import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Expresionesregulares {
    public static void main(String[] args) {
        if (args.length !=1){
            System.out.println("Por favor, ingresa tu estacion favorita del año como argumento.");
            return;
        }

        String registro=args[0];
        String regex="(?i)\\b(Invierno|Primavera|Verano|Otono)\\b";

        Pattern patron =Pattern.compile(regex);
        Matcher busqueda= patron.matcher(registro);

        if(busqueda.find()){
            System.out.println("La cadena es valida, ingresaste la estacion "+registro+".");
        }else{
            System.out.println("La cadena no es válida, recuerda escribir una estacion del año.");
        }
    }
}
