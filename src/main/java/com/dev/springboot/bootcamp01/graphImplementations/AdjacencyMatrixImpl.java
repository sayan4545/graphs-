package com.dev.springboot.bootcamp01.graphImplementations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class AdjacencyMatrixImpl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of nodes: ");
        int nodes = sc.nextInt();
        //ArrayList<ArrayList<Integer>> adjMatrix = new ArrayList<>();
        int[][] adjMatrix = new int[nodes][nodes];
        System.out.println("Enter the number of edges:");
        int edges = sc.nextInt();
        for(int i =0;i<edges;i++){
            int u,v;
            u = sc.nextInt();
            v = sc.nextInt();
            adjMatrix[u][v] = 1;

        }
        //System.out.println(Arrays.toString(adjMatrix));
        for(int[] i : adjMatrix){
            System.out.println(Arrays.toString(i));
        }
    }
}
