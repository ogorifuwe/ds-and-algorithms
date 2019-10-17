class Student extends Person {
  
  private int[] testScores;
  /**
   * class constructor
   * @param firstName - A string denoting the Person's first name.
   * @param lastName - A string denoting the Person's last name.
   * @param id - An integer denoting the Person's ID number.
   * @param scores - An array of integers denoting the Person's test scores.
   */
  public Student(String firstName,
                 String lastName,
                 int id,
                 int[] scores) {
    super(firstName, lastName, id);
    this.testScores = scores; // come back and initialized with a size
  }

  /**
   * Method Name: calculate
   * @return A character denoting the grade
   */
  private char calculate() {
    int totalScore = 0;
    
    for (int i = 0; i < testScores.length; ++i) {
      totalScore += testScores[i];
    }

    int averageScore = totalScore/testScores.length;

    if (averageScore >= 90 && averageScore <= 100) return 'O';
    else if (averageScore >= 80) return 'E';
    else if (averageScore >= 70) return 'A';
    else if (averageScore >= 55) return 'P';
    else if (averageScore >= 40) return 'D';
    else return 'T';
  }
}
