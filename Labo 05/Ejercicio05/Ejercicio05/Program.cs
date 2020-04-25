using System;
using System.Collections.Generic;

namespace Ejercicio05
{
    internal class Program
    {
        public static void Main(string[] args)
        {
            List<char> listado = new List<char>();

            char v = ' ';
            Console.WriteLine("---Este programa almacena las vocales mayusculas y minusculas---");
            Console.WriteLine("Presione 0 para finalizar.");
           
            do
            {
                Console.WriteLine("Digite la letra que desea agregar al listado: ");
                v = Convert.ToChar(Console.ReadLine());
              
                if ((v == 'A') || (v == 'A') || (v == 'a')
                               || (v == 'E') || (v == 'e')
                               || (v == 'I') || (v == 'i')
                               || (v == 'O') || (v == 'o')
                               || (v == 'U') || (v == 'u'))
                {
                    listado.Add(v); 
                }
            } while (v != '0');
            Console.WriteLine("---Mostrando listado---");
            foreach (var p in listado )
            {
                Console.WriteLine(p);
            }
        }
        }
    }
