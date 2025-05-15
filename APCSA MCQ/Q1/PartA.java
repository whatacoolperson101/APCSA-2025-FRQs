
public int walkDogs(int hour) {
int numDogs = company.numAvailableDogs(hour);
  if(numDogs >= maxDogs) {
  company.updateDog(hour, numDogs);
    return numDogs;
  }
  company.updateDog(hour, maxDogs);
return maxDogs;
}
