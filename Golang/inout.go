package main

import (
	"bufio"
	"fmt"
	"os"
	"strings"
)

func main() {
	fmt.Print("Please enter your name: ")
	
	reader := bufio.NewReader(os.Stdin)
	name, _ := reader.ReadString('\n')
	
	// Trim newline character
	name = strings.TrimSpace(name)
	
	fmt.Printf("Hello, %s\n", name)
}