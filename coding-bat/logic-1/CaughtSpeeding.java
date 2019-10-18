class CaughtSpeeding {

  public int caughtSpeeding(int speed, boolean isBirthday) {
    int ticket = 0;
          
    if (isBirthday) {
      if (speed <= 65) ticket = 0;
      if (speed >= 66 && speed <= 85) ticket = 1;
      if (speed > 85) ticket = 2;
    } else {
      if (speed <= 60) ticket = 0;
      if (speed >= 61 && speed <= 80) ticket = 1;
      if (speed > 80) ticket = 2;
    }

    return ticket;
  }

}
