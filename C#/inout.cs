using System;

class InputOutput
{
    static void Main()
    {
        Console.Write("Please enter your name: ");
        
        string name = Console.ReadLine();
        
        Console.WriteLine("Hello, " + name);
    }
}