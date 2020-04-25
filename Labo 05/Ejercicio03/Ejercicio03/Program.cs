using System;
using static System.Convert;

namespace Ejercicio03
{
    internal class Program
    {
        private static int _numero;
        public static void Main(string[] args){

            Console.WriteLine("Sabiendo esto, por favor ingrese un número:  ");
            _numero = ToInt32(Console.ReadLine());
            
            Console.WriteLine("Su lista es:  ");
            Secuencia(1);
            
        }
        static void Secuencia(int a) {
            Console.WriteLine( a + " ");
            
            if (a != _numero)
            {
                Secuencia(a +1);
                Console.WriteLine( a + " ");
            }

        }
    }
}