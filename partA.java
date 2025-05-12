public int walkDogs(int hour) {
int numDogs = numAvailableDogs(hour);
  if(numDogs>=maxDogs) {
  numDogs = maxDogs;
  }
  this.updateDogs(hour, numDogs);
return numDogs;
}
