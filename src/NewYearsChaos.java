public class NewYearsChaos {

    int testCases = 1;
    int peopleInQueue = 5;
    int[] finalStateOfQueue = {2,1,5,3,4};

    //parameters
//    int testCases, int peopleInQueue ,int[] finalStateOfQueue

    public void findMinimumNumberOfBribes(){
        //find total number of people in queue
        //start with last index and see how far away largest number is from
        // it to find the number of bribes
        int[] array = new int[5];
        peopleInQueue = 5;
        int bribes = 0;

        for (int i=0; i < 5; i++){
            if(array[i] < array[i-1]){
                bribes += 1;
            }
        }

        //go to the second last index and see how far away the 2nd largest number
        //is from there to find number of bribes.

    }
}
