package com.example.day05;

// Exception (checked Exception)
// RuntimeException (unchecked Exception)

public class 잔액부족예외상황 extends Exception{
    
    public 잔액부족예외상황() {
        super("잔액부족예외상황");
    }
}
