package com.feuji.feb10th;

public interface FeujiCompany {
      default void train() {
    	  System.out.println("trained the trainee");
      }
           static void recruit() {
        	   System.out.println("recruit 40 members");
           }
           void project();
}
