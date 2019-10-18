class AlarmClock {

  public String alarmClock(int day, boolean vacation) {
    String alarm = "";
    if (!vacation) {
    if (day == 1 || day == 2 || day == 3 || day == 4 || day == 5) {
        alarm = "7:00";
    } else if (day == 6 || day == 0) { 
        alarm = "10:00"; }
    } else {
        if (day == 1 || day == 2 || day == 3 || day == 4 || day == 5) {
          alarm = "10:00";
        } else if (day == 0 || day == 6) {
            alarm = "off";
        }
    }
          
    return alarm;
  }

}
