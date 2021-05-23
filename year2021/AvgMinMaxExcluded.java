class Solution {
  
    
    public double average(int[] salary) {
        int highest = salary[0];
        int lowest = salary[0];
        int runningSum = 0;
        for(int i = 0; i < salary.length; i ++) {
            highest = Math.max(highest, salary[i]);
            lowest = Math.min(lowest, salary[i]);
            runningSum += salary[i];
        }
        
        return (runningSum - highest - lowest) / (1.0 * (salary.length - 2));
    }
    
}
