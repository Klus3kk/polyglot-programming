#include <stdio.h>

int main() {
    char name[50];
    
    printf("Please enter your name: ");
    
    // Read input from user
    fgets(name, 50, stdin);
    
    // Print the input back to the user
    printf("Hello, %s", name);
    
    return 0;
}