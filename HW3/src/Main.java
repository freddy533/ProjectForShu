import java.util.Random;

/**
 * NAME: FREDDY CRIOLLO
 * CLASS: COMPUTER ALGORITHMS
 * INSTRUCTOR: DR. SHU
 * FORDHAM UNIVERSITY
 *
 *
 * Created by Freddy Criollo on 11/3/16.
 * Final Project for Computer Algorithms R01
 * Purpose: Sort 3 arrays with, 20, 100, 200 elements.
 * Use three 4 Sorting Methods to Sort Each of the 3 arrays
 * Get the time of the sorting method.
 *
 * How:
 * I made a SortClass; Inside the class I am able to copy one of the original 3 arrays
 * From there I made 4 different methods that sort and and get the time of the array that it cloned to the object.
 * The method also prints out the sorted array and the time.
 *
 * The object of SortClass also has a time element that get the time that it took to sort the array;
 * I used this time to print out the times at the end that it took to sort each array with each sorting methods
 * This is useful to compare all the sorting methods.
 *
 * The times are in NanoSeconds.
 *
 * Software:
 * I used the IntelliJ IDE Community Version, as my IDE to write compile and run my program.
 * I used GITHUB as a version control,  to keep track of changes, I used a Laptop at school and a Desktop at home
 *
 *
 */

//This it he main class that makes the original 3 array and run the SortCLass
public class Main {
    public  static int[] Array20;
    public static int[] Array100;
    public static int[] Array200;
//A random array generator
    public static int[] RandomArrayGenerator(int size){
        int array[];
        array = new int[size];
        for(int i=0;i <size;i++) {
            array[i] = (int) (Math.random() * 10000);
        }
        return array;
    }


    public static void main(String args[]) {

//Fills the 3 arrays with randoms numbers acording to size
        Array20 = RandomArrayGenerator(20);
        Array100 = RandomArrayGenerator(100);
        Array200 = RandomArrayGenerator(200);


//Sorts the Arrays and prints the arrays.
        System.out.println(" ");
        System.out.println("--------------------20 ELEMENTS----------------------");
        //INSERTION SORT ARRAY 20
        System.out.println("THIS IS THE ARRAYS SORTED AND TIMES FOR THE ARRAY OF 20 ELEMENTS");
            //THIS IS THE INSERTION SORT OF THE 20 ELEMENT ARRAY
        SortClass insertionArray20 = new SortClass(Array20, 20);
        insertionArray20.insertionSortandTimer();
        System.out.println(" ");
        System.out.println(" ");
            //THIS IS THE SELECTION SORT OF THE 20 ELEMENT ARRAY
        SortClass selectionArray20 = new SortClass(Array20, 20);
        selectionArray20.selectionSortandTimer();
        System.out.println(" ");
        System.out.println(" ");
            //THIS IS THE MERGE SORT OF THE 20 ELEMENTS ARRAY
        SortClass mergeArray20 = new SortClass(Array20, 20);
        mergeArray20.mergeSortandTimer();
        System.out.println(" ");
        System.out.println(" ");
            //THIS IS THE QUICK SORT OF THE 20 ELEMENTS ARRAY
        SortClass quickArray20 = new SortClass(Array20, 20);
        quickArray20.quickSortandTimer();



        System.out.println(" ");
        System.out.println("--------------------100 ELEMENTS----------------------");
        System.out.println(" ");
        System.out.println("THIS IS THE ARRAYS SORTED AND TIMES FOR THE ARRAY OF 100 ELEMNTS");
            //THIS IS THE INSERTION SORT OF THE 100 ELEMENT ARRAY
        SortClass insertionArray100 = new SortClass(Array100,100);
        insertionArray100.insertionSortandTimer();
        System.out.println(" ");
        System.out.println(" ");
        //THIS IS THE SELECTION SORT OF THE 100 ELEMENT ARRAY
        SortClass selectioArray100 = new SortClass(Array100,100);
        selectioArray100.selectionSortandTimer();
        System.out.println(" ");
        System.out.println(" ");

        //THIS IS THE MERGE SORT OF THE 100 ELEMENTS ARRAY
        SortClass mergeArray100 = new SortClass(Array100,100);
        mergeArray100.mergeSortandTimer();
        System.out.println(" ");
        System.out.println(" ");
        //THIS IS THE QUICK SORT OF THE 100 ELEMENTS ARRAY
        SortClass quickArray100 = new SortClass(Array100, 100);
        quickArray100.quickSortandTimer();




        System.out.println(" ");
        System.out.println("----------------------200 ELEMNTS--------------------");
        System.out.println(" ");
        System.out.println("THIS IS THE ARRAYS SORTED AND TIMES FOR THE ARRAY OF 200 ELEMNTS");
        //THIS IS THE INSERTION SORT OF THE 200 ELEMENT ARRAY
        SortClass insertionArray200 = new SortClass(Array200,200);
        insertionArray200.insertionSortandTimer();
        System.out.println(" ");
        System.out.println(" ");
        //THIS IS THE SELECTION SORT OF THE 200 ELEMENT ARRAY
        SortClass selectioArray200 = new SortClass(Array200,200);
        selectioArray200.selectionSortandTimer();
        System.out.println(" ");
        System.out.println(" ");
        //THIS IS THE MERGE SORT OF THE 200 ELEMENTS ARRAY
        SortClass mergeArray200 = new SortClass(Array200,200);
        mergeArray200.mergeSortandTimer();
        System.out.println(" ");
        System.out.println(" ");
        //THIS IS THE QUICK SORT OF THE 200 ELEMENTS ARRAY
       SortClass quickArray200 = new SortClass(Array200,200);
        quickArray200.quickSortandTimer();
        System.out.println(" ");



//Comparison Table.

        System.out.println("****************** ");

        //COMPARISON TIME
        System.out.println("Times of the Sorting Methods");
        System.out.println("*** 20 Element sorting times***");
        System.out.println("Selection Sort "+selectionArray20.time);
        System.out.println("Insertion Sort "+insertionArray20.time);
        System.out.println("Merge Sort "+mergeArray20.time);
        System.out.println("Quick Sort "+quickArray20.time);

        System.out.println("Times of the Sorting Methods");
        System.out.println("*** 100 Element sorting times***");
        System.out.println("Selection Sort "+selectioArray100.time);
        System.out.println("Insertion Sort "+insertionArray100.time);
        System.out.println("Merge Sort "+mergeArray100.time);
        System.out.println("Quick Sort "+quickArray100.time);

        System.out.println("Times of the Sorting Methods");
        System.out.println("*** 200 Element sorting times***");
        System.out.println("Selection Sort "+selectioArray200.time);
        System.out.println("Insertion Sort "+insertionArray200.time);
        System.out.println("Merge Sort "+mergeArray200.time);
        System.out.println("Quick Sort "+quickArray200.time);

        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Table for Times of Sorting Methods in Nano Seconds.");
        System.out.println("Array: |20 Elements|  |100 Elements|  |200 Elements|  ");
        System.out.println("Times: |"+selectionArray20.time+"       |  |"+selectioArray100.time+"       |  |"+selectioArray200.time+"      |       ");
        System.out.println("Times: |"+insertionArray20.time+"       |  |"+insertionArray100.time+"       |  |"+insertionArray200.time+"      |       ");
        System.out.println("Times: |"+mergeArray20.time+"       |  |"+mergeArray100.time+"       |  |"+mergeArray200.time+"      |       ");
        System.out.println("Times: |"+quickArray20.time+"       |  |"+quickArray100.time+"       |  |"+quickArray200.time+"       |       ");
    }


    }





class SortClass{

        int [] Mainarray;
        int size;
         long time;
        int [] temparray;
        public SortClass(int array[],int size1){
                size = size1;
            Mainarray= array.clone();
                time  = 0;
            temparray = new int[size1];
        }

    void insertionSort() {

        for (int i=0; i<size;i++) {
            int key = Mainarray[i];
            int j = i - 1;

            while (j > -1 && (Mainarray[j] > key)) {
                Mainarray[j + 1] = Mainarray[j];
                j--;
            }
            Mainarray[j + 1] = key;
        }

    }

    void insertionSortandTimer(){
        final long starttime = System.nanoTime();
        insertionSort();
        final long endtime = System.nanoTime();
        final long totaltime = (endtime - starttime);
        System.out.println("**Insertion Sort for Array with "+Mainarray.length+" elements **");
        System.out.println("This is the start time = "+ starttime+ " This is the end time = "+ endtime);
        System.out.println("This is the time elapsed from start to finished = "+ totaltime);
        time = totaltime;
        print();
    }

    void print() {
        for(int i =0;i<Mainarray.length;i++){
            System.out.print("Mainarray ["+(i+1)+"]"+Mainarray[i] +"    ");
        }
    }

    void merge(){

    }


    void selectionsort(){
        for(int i = 0;i<Mainarray.length;i++)
        {

            int min = i;
            for(int j = i + 1;j<Mainarray.length;j++)
            {
                if(Mainarray[j] < Mainarray[min]) { min = j;}
            }
            int temp = Mainarray[i];
            Mainarray[i] = Mainarray[min];
            Mainarray[min] = temp;

        }


    }

    void selectionSortandTimer(){
        final long starttime = System.nanoTime();
        selectionsort();
        final long endtime = System.nanoTime();
        final long totaltime = (endtime - starttime);
        System.out.println("**Selection Sort for Array with "+Mainarray.length+" elements **");
        System.out.println("This is the start time = "+ starttime+" This is the end time = "+ endtime);
        System.out.println("This is the time elapsed from start to finished = "+ totaltime);
        time = totaltime;

        print();
    }

    //*** Merge sort and quick sort

    private void mergesort(int lowerIndex, int higherIndex){
        if (lowerIndex < higherIndex){
            int middle = lowerIndex + (higherIndex - lowerIndex) / 2;
            // Below step sorts the left side of the array
            mergesort(lowerIndex, middle);
            // Below step sorts the right side of the array
            mergesort(middle + 1, higherIndex);
            // Now merge both sides
            mergeParts(lowerIndex, middle, higherIndex);
        }
    }

    void mergeParts(int lowerIndex, int middle, int higherIndex){
        for (int i = lowerIndex; i <= higherIndex; i++){
            temparray[i] = Mainarray[i];
        }
        int i = lowerIndex;
        int j = middle + 1;
        int k = lowerIndex;
        while (i <= middle && j <= higherIndex){
            if (temparray[i] <= temparray[j]){
                Mainarray[k] = temparray[i];
                i++;
            }
            else{
                Mainarray[k] = temparray[j];
                j++;
            }
            k++;
        }
        while (i <= middle){
            Mainarray[k] = temparray[i];
            k++;
            i++;
        }
    }

    void mergeSortandTimer(){
        final long starttime = System.nanoTime();
        mergesort(0,Mainarray.length-1);
        final long endtime = System.nanoTime();
        final long totaltime = (endtime - starttime);
        System.out.println("**Merge Sort for Array with "+Mainarray.length+" elements **");
        System.out.println("This is the start time = "+ starttime+" This is the end time = "+ endtime);
        System.out.println("This is the time elapsed from start to finished = "+ totaltime);
        time = totaltime;
        print();
    }

    void quicksort(int lowerIndex, int higherIndex){
        int i = lowerIndex;
        int j = higherIndex;
        // calculate pivot number, I am taking pivot as middle index number
        int pivot = Mainarray[lowerIndex+(higherIndex-lowerIndex)/2];
        // Divide into two arrays
        while (i <= j){
            while (Mainarray[i] < pivot){
                i++;
            }
            while (Mainarray[j] > pivot){
                j--;
            }
            if (i <= j){
                exchangeNumbers(i, j);
                i++;
                j--;
            }
        }
        if (lowerIndex < j)
            quicksort(lowerIndex, j);
        if (i < higherIndex)
            quicksort(i, higherIndex);
    }

    private void exchangeNumbers(int i, int j){
        int temp = Mainarray[i];
        Mainarray[i] = Mainarray[j];
        Mainarray[j] = temp;
    }

    void quickSortandTimer(){
        final long starttime = System.nanoTime();
        quicksort(0,Mainarray.length-1);
        final long endtime = System.nanoTime();
        final long totaltime = (endtime - starttime);
        System.out.println("**Quick Sort for Array with "+Mainarray.length+" elements **");
        System.out.println("This is the start time = "+ starttime+" This is the end time = "+ endtime);
        System.out.println("This is the time elapsed from start to finished = "+ totaltime);
        time = totaltime;
        print();
    }



//This is a not a test a



//Final Commit








}






