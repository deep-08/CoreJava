package dataAbstraction;

import java.util.logging.MemoryHandler;

interface loose{
		void paithyam(); // It will take defaultly  public access specifier method.
		int a = 1; // it become static 
	}
		
	public class DataAbrastraction implements loose{
		public void paithyam() {
			System.out.println("My friends are paithyam");
			}	
		public int memory() {
			return 10;
		}
				
		public static void main(String args[]) {
			DataAbrastraction shAbrastraction = new DataAbrastraction();
			
			shAbrastraction.paithyam();
		}
   }	

