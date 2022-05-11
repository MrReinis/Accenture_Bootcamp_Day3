class task2 {

    public static void main(String[] args) {

        int [] arr = new int[4];
        for (int i = 0 ; i < 4; i++){

            arr[i] = i+1;
        }

        int [] copyOfArray = new int [arr.length];

        for (int i = 0; i < 4 ; i++){
            copyOfArray[i] = arr[i];

        }
        System.out.println(arr.length);

        System.out.println("Array1= " + arr);
        System.out.println("CopyOfArray= "+ copyOfArray);


    }
}