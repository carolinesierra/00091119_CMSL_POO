using System;
namespace Ejercicio01
{
    internal class Program
    {
        public static void Main(string[] args)
        {
            int a = 1, b = 0, c = 1;

            Console.WriteLine("Digite la cantidad de números que desea de la serie Fibonacci: ");
            int numero = Convert.ToInt32(Console.ReadLine());

            Console.WriteLine("----Mostrando serie----");

            Console.WriteLine(a + " ");

            for (var i = 1; i < numero; i++)
            {
                a = b + c;
                Console.WriteLine(a + " ");
                b = c;
                c = a;
            }
        }
    }
}
