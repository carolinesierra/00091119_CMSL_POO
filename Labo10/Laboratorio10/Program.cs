using System;
using System.Collections.Generic;


namespace Laboratorio10
{
   public class Program
    {
        static List<CuentaBancaria> person = new List<CuentaBancaria>();
        private delegate void MyDelegate(List<CuentaBancaria> c);
        static MyDelegate _md;

        public static void Main(string[] args)
        {
            string nombres;
            double money;
            int op = 0;
            do
            {
                Fmenu();
                try
                {
                    op = Convert.ToInt32(Console.ReadLine());
                    switch (op)
                    {
                        case 1:
                            Console.WriteLine("-------Agregando Cuenta-------");
                            Console.Write("Nombre: ");
                            nombres = Console.ReadLine();
                            if (nombres != null && nombres.Length == 0)
                                throw new EmptyException("El nombre está vacío.");
                            if (ExisteCuenta(nombres))
                                throw new ExistingAccountException("La cuenta ya existe.");

                            Console.Write("Cantidad de dinero a depositar: ");
                            money = Convert.ToDouble(Console.ReadLine());
                            if (money < 0)
                            {
                                Console.WriteLine("Error, tiene que ser mayor o igual que 0.");
                            }
                            else
                            {
                                person.Add(new CuentaBancaria(nombres, money));
                            }
                            break;
                        case 2:
                            MostrandoCuentas();
                            break;
                        case 3:
                            _md = VerDatos;
                            _md += TotalCuentas;
                            _md.Invoke(person);
                            break;
                        case 4:
                            Action<List<CuentaBancaria>> action = (p) =>
                            {
                                p.ForEach((people) =>
                                {
                                    Console.WriteLine(
                                        $"Nombre: {people.name}, Saldo actual: ${people.currentBalance}");
                                });
                            };

                            action += (pp) =>
                            {
                                double salarios = 0;

                                pp.ForEach(element => { salarios += element.currentBalance; });

                                Console.WriteLine($"Suma de salarios: ${salarios}");
                            };
                            action.Invoke(person);

                            action = (ppp) =>
                            {
                                ppp.ForEach((vocal) =>
                                {
                                    if (vocal.name.StartsWith("A") || vocal.name.StartsWith("a") ||
                                        vocal.name.StartsWith("E") || vocal.name.StartsWith("e") ||
                                        vocal.name.StartsWith("I") || vocal.name.StartsWith("i") ||
                                        vocal.name.StartsWith("O") || vocal.name.StartsWith("o") ||
                                        vocal.name.StartsWith("U") || vocal.name.StartsWith("u"))
                                        Console.WriteLine("-------Mostrando cuentas que inician con vocal-------");
                                    Console.WriteLine("Nombre: " + vocal.name);
                                    Console.WriteLine("Saldo actual:  $" + vocal.currentBalance);
                                });
                            };
                            action.Invoke(person);
                            break; 
                    }
                }
                catch (FormatException e)
                {
                    Console.WriteLine(e.Message);
                    op = 99;
                }
                catch (EmptyException e)
                {
                    Console.WriteLine(e.Message);
                }
                catch (ExistingAccountException e)
                {
                    Console.WriteLine(e.Message);
                }
            } while (op !=0);
            Console.WriteLine("\nGracias por preferirnos, que tenga un buen día:)!");
        }
        private static void Fmenu()
       {
           Console.WriteLine("-----Presione el número de su opción deseada----");
           Console.WriteLine("1.Agregar Cuenta");
           Console.WriteLine("2.Ver Cuentas");
           Console.WriteLine("3.Total de cuentas y mostrar cuentas.");
           Console.WriteLine("4.Ver cuentas, total de cuentas, cunetas de " +
                             "las personas que su nombre inicia con vocal.");
           Console.WriteLine("0.Salir. ");
           Console.WriteLine("Su opción elegida es: ");
       }
       private static void MostrandoCuentas()
       {
           foreach (var p in person)
           {
               Console.WriteLine("-------Mostrando Cuentas-------");
               Console.WriteLine("Nombre: " + p.name);
               Console.WriteLine("Saldo actual:  " + p.currentBalance);
           }
       }
       public static void VerDatos(List<CuentaBancaria> pp)
       {
           pp.ForEach((element) =>
           {
               Console.WriteLine($"Nombre: {element.name}, Saldo Actual: ${element.currentBalance}");
           });
       }
       public static void TotalCuentas(List<CuentaBancaria> po)
       {
           double salarios = 0;
           po.ForEach(element =>
           {
               salarios += element.currentBalance;
           });
           Console.WriteLine($"Suma de salarios:  ${salarios}");
       }
       public static bool ExisteCuenta(string nombre)
       {
           foreach (var element in person)
           {
               if (element.name.Equals(nombre))
               {
                   return true;
               }
           }
           return false;
       }
    }
}