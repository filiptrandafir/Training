package com.endava.flow_control;

public class FinallyDemo {
	

	static int method1() {
        try {
            return 2;
        } finally {
            System.out.println("Executing finally block in method1()");
        }
    }

    static void method2() {
        try {
            throw new RuntimeException("Unchecked error");
        } finally {
            System.out.println("Executing finally block in method2()");
        }
    }
    
    static int method3(){
    	try {
            return 1;
        } finally {
            return 2;
        }

    }
}