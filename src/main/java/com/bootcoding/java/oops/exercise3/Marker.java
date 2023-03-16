package com.bootcoding.java.oops.exercise3;

public class Marker {
    String brand;
    String color;
    String type;

    public void print(Marker[] markers){
        for(int i = 0; i< markers.length;i++){
            Marker m = markers[i];
            System.out.println(m.color);
            System.out.println(m.brand);
    }
}
}
