package com.jslhrd.ccc;

public class MathProData implements MathPro {

	@Override
	public int sum(int n, int m) {
		int result = 0;
		
		for (int i = n; i <= m; i++) {
			result += i;
		}
		
		return result;
	}

	@Override
	public String binaryStr(int num) {
		String result = "";
		
		while(num != 0) {
			int na = num % 2;
			result = na + result;
			num = num / 2;
		}
		
		return result;
	}

	@Override
	public int[] binaryArr(int num) {
		int[] result = new int[10];
		int cnt = 9;
		
		while(num != 0) {
			int na = num % 2;
			result[cnt] = na;
			num = num / 2;
			cnt--;
		}
		return result;
	}
	
	@Override
	public void priNumber(int n) {
		System.out.print("priNumber = ");
		
	    for (int i = 2; i <= n; i++) {
	        for (int j = 2; j <= i; j++) {
	            if (i != j && i % j == 0) {
	                break;
	            }
	            
	            if (i == j) {
	            	System.out.print(i + " ");
	            }
	        }
	    }
	    System.out.println();
	}
	
	@Override
	public void numberScore(int... n) {
		int max = n[0];
		int min = n[0];
		int tot = 0;
		
		for (int i = 0; i < n.length; i++) {
			if (max < n[i]) {
				max = n[i];
			} else if (min > n[i]) {
				min = n[i];
			}
			
			tot += n[i];
		}
		
		System.out.printf("최대 = %d, 최소 = %d, 합계 = %d", max, min, tot);
	}
}
