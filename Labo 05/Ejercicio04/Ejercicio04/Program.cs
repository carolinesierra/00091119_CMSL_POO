using System;
namespace Ejercicio04
{
    internal class Program
    {
        public static void Main(string[] args)
        {
            
            Console.WriteLine("Ingrese una cadena de texto: ");
            String cadena = Console.ReadLine();;


            Console.WriteLine("El programa cambio las letras 'a' por la letra 'b' de su cadena ingresada.");
            Console.WriteLine("Su nueva cadena es:D  :");

            String cambio = cadena.Replace('a','b'); //Metodo para cambiar caracteres. oldChar:Caracter a sustituir y newChar:caracter que reemplaza al viejo caracter.
            Console.WriteLine(cambio);
        }
    }
}

