package com.company;

import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        long startTime, endTime,timeElapsed;
	// write your code here
        // length =  150 sorted
        int x1[] = {3, 10, 28, 32, 39, 42, 47, 50, 54, 56, 57, 78, 96, 99, 101, 111, 113, 133, 139, 145, 159, 167, 182, 185, 189, 200, 208, 210, 213, 216, 218, 219,
                221, 229, 235, 240, 244, 246, 247, 256, 264, 269, 270, 275, 277, 281, 285, 291, 293, 298, 301, 315, 321, 335, 353, 363, 364, 371, 386, 394, 407, 409,
                420, 424, 426, 433, 443, 449, 453, 459, 473, 487, 488, 495, 499, 504, 511, 513, 516, 533, 547, 552, 553, 571, 576, 579, 583, 586, 590, 592, 600, 636,
                643, 644, 646, 648, 658, 660, 663, 671, 675, 676, 679, 682, 689, 700, 709, 722, 728, 733, 734, 739, 744, 757, 758, 761, 764, 785, 793, 798, 823, 826,
                831, 835, 848, 852, 859, 877, 894, 900, 901, 902, 908, 911, 914, 917, 919, 923, 926, 931, 934, 938, 948, 968, 969, 971, 977, 983, 986, 992};

//
        int x2[] = {118, 57, 754, 438, 331, 955, 38, 564, 673, 201, 727, 199, 596, 697, 135, 389, 707, 991, 665, 969, 390, 360, 133, 275, 906, 190, 623, 801,
                574, 965, 224, 537, 45, 127, 222, 87, 720, 47, 886, 440, 510, 48, 348, 441, 594, 321, 559, 417, 131, 984, 737, 458, 443, 145, 388, 786, 730,
                455, 231, 839, 279, 940, 19, 290, 89, 282, 884, 722, 119, 445};


        int x3[] = {5,3,19,8,2,4,7};
        int x4[] = {1,2,3,4,5,6,7};

        startTime = System.nanoTime();
        QuickSort.quickSort(x3,0,x3.length-1);
        endTime = System.nanoTime();
        timeElapsed = endTime - startTime;
        QuickSort.printArray(x3);
        System.out.println("Time to Run : " + timeElapsed);
        System.out.println("====================================================================");
        TimeUnit.SECONDS.sleep(3);


        startTime = System.nanoTime();
        QuickSort.quickSort(x2,0,x2.length-1);
        endTime = System.nanoTime();
        timeElapsed = endTime - startTime;
        QuickSort.printArray(x2);
        System.out.println("Time to Run : " + timeElapsed);
        System.out.println("====================================================================");
        TimeUnit.SECONDS.sleep(3);



        startTime = System.nanoTime();
        QuickSort.quickSort(x3,0,x3.length-1);
        endTime = System.nanoTime();
        timeElapsed = endTime - startTime;
        QuickSort.printArray(x3);
        System.out.println("Time to Run : " + timeElapsed);
        System.out.println("====================================================================");
        TimeUnit.SECONDS.sleep(3);



        startTime = System.nanoTime();
        QuickSort.quickSort(x4,0,x4.length-1);
        endTime = System.nanoTime();
        timeElapsed = endTime - startTime;
        QuickSort.printArray(x4);
        System.out.println("Time to Run : " + timeElapsed);
        System.out.println("====================================================================");

    }
}
