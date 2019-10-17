class Solution {

  static void solve(double mealCost, int tipPercent, int taxPrecent) {
    
    double totalCost = mealCost +
                        (double)(mealCost * tipPercent/100) +
                        (double)(mealCost * taxPrecent/100);

    System.out.print(Math.round(totalCost));
  }
}
