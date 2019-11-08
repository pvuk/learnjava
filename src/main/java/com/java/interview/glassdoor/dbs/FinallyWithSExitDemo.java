package com.java.interview.glassdoor.dbs;

public class FinallyWithSExitDemo {

    public static void main(String[] args) {
        // TO DO Auto-generated method stub
        try{
            System.exit(0);
        }finally{
            System.out.println("Hi i am in finally block");
        }
    }

}