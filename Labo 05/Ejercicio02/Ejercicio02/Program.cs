using System;
namespace Ejercicio02{
    internal class Program
    {
        public static void Main(string[] args)
        {
            Console.WriteLine("Digite la frase que desea verificar(Por favor omita mayusculas y tildes):  ");
            string frase = Console.ReadLine();
            
            
            if (FunPalindroma(frase)) {
                Console.WriteLine("Siuuuuuuuuuu, la frase es palindroma");
            } else {
                Console.WriteLine("La frase no es plaindroma:(");
            }
        }
        static bool FunPalindroma(String frase)
        {
            string b = ""; 
            int n = frase.Length;

            int i;
            for (i = 0; i < n; ++i){
                if (!(frase.Substring(i,  1).Equals(" ")
                    || frase.Substring(i, 1).Equals(",")
                    || frase.Substring(i,  1).Equals("?")
                    || frase.Substring(i,  1).Equals(".")
                    || frase.Substring(i,  1).Equals("´")
                    || frase.Substring(i,  1).Equals("!")
                    || frase.Substring(i,  1).Equals("¡")
                    || frase.Substring(i,  1).Equals(";")
                    || frase.Substring(i,  1).Equals("¿")))
                {
                    b += frase.Substring(i,  1);
                }
            }

            n = b.Length;
            int aux = n;

            for(i = 0; i < n / 2; ++i) {
                if (!b.Substring(i, 1).Equals(b.Substring(aux - 1, 1))) {
                    return false;
                }
                aux--;
            }
            return true;
        }
        
    }
}