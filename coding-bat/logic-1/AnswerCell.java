class AnswerCell {

  public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
    if (isAsleep) return false;
    if (!isAsleep) {
      if (isMorning && isMom) return true;
      if (!isMorning && isMom) return true;
      if (!isMorning && !isMom) return true;
    }
    return false;
  }

}
