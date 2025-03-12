use std::io::{self, Write};

fn main() {
    print!("Please enter your name: ");
    // Flush to ensure the text is displayed before reading input
    io::stdout().flush().unwrap();
    
    let mut name = String::new();
    
    io::stdin()
        .read_line(&mut name)
        .expect("Failed to read line");
    
    // Remove newline character
    let name = name.trim();
    
    println!("Hello, {}", name);
}