public int dogWalkShift(int startHour, int endHour) {
  int money = 0;
  for(int i = startHour; i<endHour; i++){
    money += (walkDogs(i) * 5);
    if(walkDogs(i) == maxDogs || (i >= 9 && i <= 17)) {
      money += 3;
    }
  }
  return money;
}
