package com.company;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;


class Main {
    public static void main(String[] args) throws IOException {

        List<List<Integer>> tri =  new ArrayList<>();


        Scanner scanner = new Scanner(System.in);

        try{

            while (scanner.hasNextLine()) {
                List<String> tokens = new ArrayList<>();
                Scanner lineScanner = new Scanner(scanner.nextLine());
                List<Integer> listInteger = new ArrayList<>();

                while (lineScanner.hasNext()) {
                    tokens.add(lineScanner.next());
                    listInteger= tokens.stream().map(Integer::parseInt)
                            .collect(Collectors.toList());
                }

                //System.out.println(tokens);
                tri.add(listInteger);
                lineScanner.close();
                if(!scanner.hasNextInt()){
                    throw lineScanner.ioException();
                }
            }



        }catch (Exception e) {
            System.out.println(tri);
        }

        MinTrianglePath(tri);

        scanner.close();

    }

    public static void MinTrianglePath(List<List<Integer>> triangle) {


        int[] lastArray = new int[triangle.size()+1];

        // inital the lastArray[] array
        for(int i=0; i<triangle.size(); i++) {
            lastArray[i] += triangle.get(triangle.size()-1).get(i);
        }

        // from bottom to up
        for(int i=triangle.size()-2; i>=0; i--) {
            int min = 0;
            int location = 0;
            // each num in current list
            for(int j=0; j<i+1; j++) {
               min = Math.min(lastArray[j], lastArray[j + 1]);
                location =triangle.get(i).get(j);
                lastArray[j] =location  + min;


            }


        }
        System.out.println("Minimum Triangle Path: " + lastArray[0]);

    }

}
