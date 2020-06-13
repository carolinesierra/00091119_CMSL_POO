using System;

namespace Laboratorio10
{
    public class ExistingAccountException : Exception
    {
        public ExistingAccountException(String message): base(message){}
    }
}