package GameTests;

import static org.junit.Assert.*;

import org.junit.Test;

import Game.Die;

public class DiceTests {

	@Test
	public void test() {
		Die dice = new Die();
		int i;
		double roll1;
		double roll2;
		double sum;
		
		double add2 = 0;
		double add3 = 0;
		double add4 = 0;
		double add5 = 0;
		double add6 = 0;
		double add7 = 0;
		double add8 = 0;
		double add9 = 0;
		double add10 = 0;
		double add11 = 0;
		double add12 = 0;
		double equal = 0;
		
		for(i=0; i<5000; i++){
			
			dice.roll();
			roll1 = dice.getDice1();
			roll2 = dice.getDice2();
			sum = dice.getDiceSum();
			
			if(sum == 2){
				
				add2 += 1;
				}

				else if(sum == 3){
					
					add3 += 1;
					}
				
				else if(sum == 4){
					
					add4 += 1;
					}
				
				else if(sum == 5){
					
					add5 += 1;
					}
				
				else if(sum == 6){
					
					add6 += 1;
					}
				
				else if(sum == 7){
					
					add7 += 1;
					}
				
				else if(sum == 8){
					
					add8 += 1;
					}
				
				else if(sum == 9){
					
					add9 += 1;
					}
				
				else if(sum == 10){
					
					add10 += 1;
					}
				
				else if(sum == 11){
					
					add11 += 1;
					}
				
				else if(sum == 12){
					
					add12 += 1;
					}
				if (roll1 == roll2){
					
					equal+=1;
				}
		}
		
//		Outcome	Probability
//		2	 1/36 = 2.78%
//		3	 2/36 = 5.56%
//		4	 3/36 = 8.33%
//		5	 4/36 = 11.11%
//		6	 5/36 = 13.89%
//		7	 6/36 = 16.67%
//		8	 5/36 = 13.89%
//		9	 4/36 = 11.11%
//		10 3/36 = 8.33%
//		11 2/36 = 5.56%
//		12 1/36 = 2.78%
//		2 ens 6/36 = 16.67%

		
			assertTrue(2.5 > Math.abs((add2/5000*100)-2.78));
			assertTrue(2.5 > Math.abs((add3/5000*100)-5.56));
			assertTrue(2.5 > Math.abs((add4/5000*100)-8.33));
			assertTrue(2.5 > Math.abs((add5/5000*100)-11.11));
			assertTrue(2.5 > Math.abs((add6/5000*100)-13.89));
			assertTrue(2.5 > Math.abs((add7/5000*100)-16.67));
			assertTrue(2.5 > Math.abs((add8/5000*100)-13.89));
			assertTrue(2.5 > Math.abs((add9/5000*100)-11.11));
			assertTrue(2.5 > Math.abs((add10/5000*100)-8.33));
			assertTrue(2.5 > Math.abs((add11/5000*100)-5.56));
			assertTrue(2.5 > Math.abs((add12/5000*100)-2.79));
			assertTrue(2.5 > Math.abs((equal/5000*100)-16.67));
		}	
}
