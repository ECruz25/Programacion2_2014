package Repaso;


import java.util.ArrayList;


public class TestArrayList {
    public static void main(String[] args) {
        //String arr[] = new String[longitud];
        ArrayList<String> cadena = new ArrayList<>();
        //arr[posicion]=valor;
        cadena.add("Edwin");
        cadena.add("Mario");
        cadena.add("Jose");
        cadena.add("Carlos");
        System.out.println(cadena.get(0));
        //arr.length;
        System.out.println("Tamaño: " + cadena.size());
        //remover
        System.out.println(cadena.get(1));
        for(int i = 0; i<cadena.size();i++)
            System.out.println("posicion : " + i + " " + cadena.get(i));
        
        for (String c : cadena)
            System.out.println(c);
        
        cadena.remove(1);
        /*System.out.println(cadena.get(1));
        for(int i = 0; i<cadena.size();i++){
            System.out.println("posicion : " + i + "  "+cadena.get(i));
        }*/
        if(cadena.contains("Mario"))
            System.out.println("Esta!");
        else
            System.out.println("no esta");
    }
}
