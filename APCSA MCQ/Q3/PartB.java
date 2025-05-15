public ArrayList<Match> buildMatches(){
    int num = 0;
    ArrayList<Match> result = new ArrayList<Match>();
    int size = competitorList.size();
    if(size%2==1){
        num=1;
    }
    for(int i = 0;(i < size) && ((i+num)<(size - 1));i++){
        result.add(competitorList.get(i+num),competitorList.get(size-1));
    }
    return result;
}
