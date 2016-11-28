import java.util.Random;

/**
 * Created by alchemist on 11/3/16.
 */
public class Main {
    public  static int[] Array20;
    public static int[] Array100;
    public static int[] Array200;

    public static int[] RandomArrayGenerator(int size){
        int array[];
        array = new int[size];
        for(int i=0;i <size;i++) {
            array[i] = (int) (Math.random() * 10000);
        }
        return array;
    }


    public static void main(String args[]) {


        Array20 = RandomArrayGenerator(20);
        Array100 = RandomArrayGenerator(100);
        Array200 = RandomArrayGenerator(200);
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


        //**************************NEED TO BE FINISHED
            //THIS IS THE MERGE SORT OF THE 20 ELEMENTS ARRAY
        System.out.println(" ");
        System.out.println(" ");
            //THIS IS THE QUICK SORT OF THE 20 ELEMENTS ARRAY
        //**************************

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


        //**************************NEED TO BE FINISHED
        //THIS IS THE MERGE SORT OF THE 100 ELEMENTS ARRAY
        System.out.println(" ");
        System.out.println(" ");
        //THIS IS THE QUICK SORT OF THE 100 ELEMENTS ARRAY
        //**************************



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



        //**************************NEED TO BE FINISHED
        //THIS IS THE MERGE SORT OF THE 200 ELEMENTS ARRAY
        System.out.println(" ");
        System.out.println(" ");
        //THIS IS THE QUICK SORT OF THE 200 ELEMENTS ARRAY
        //**************************


        //COMPARISON TIME
        System.out.println("Times of the Sorting Methods");
        System.out.println("*** 20 Element sorting times***");
        System.out.println("Insertion Sort "+insertionArray20.time);
        System.out.println("Selection Sort "+selectionArray20.time);
        System.out.println("Merge Sort ");
        System.out.println("Quick Sort ");

        System.out.println("Times of the Sorting Methods");
        System.out.println("*** 100 Element sorting times***");
        System.out.println("Insertion Sort "+insertionArray100.time);
        System.out.println("Selection Sort "+selectioArray100.time);
        System.out.println("Merge Sort ");
        System.out.println("Quick Sort ");

        System.out.println("Times of the Sorting Methods");
        System.out.println("*** 200 Element sorting times***");
        System.out.println("Insertion Sort "+insertionArray200.time);
        System.out.println("Selection Sort "+selectioArray200.time);
        System.out.println("Merge Sort ");
        System.out.println("Quick Sort ");
    }


    }





class SortClass{

        int [] Mainarray;
        int size;
         long time;

        public SortClass(int array[],int size1){
                size = size1;
            Mainarray= array.clone();
                time  = 0;
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






//












}






