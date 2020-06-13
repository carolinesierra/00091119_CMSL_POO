namespace Laboratorio10
 {
     public class CuentaBancaria
     {
         public  string name;
         public  double currentBalance;
         
         public CuentaBancaria(string name = "unnamed", double currentBalance = 0)
         {
             this.name = name;
             this.currentBalance = currentBalance;
         }
     }
 }