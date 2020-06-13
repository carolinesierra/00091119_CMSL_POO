using System;

namespace Laboratorio10
{
    public class EmptyException : Exception
    {
        public EmptyException(String message) : base(message){}
    }
}