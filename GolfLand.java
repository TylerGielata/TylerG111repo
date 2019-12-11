/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objects;

import java.util.Scanner;

/**
 *
 * @author tyler.gielata
 */
public class GolfLand {
    public static void main(String[] gang){
       //variables for factors
        Golf driverShot;
        driverShot = new Golf();
        driverShot.club = "Driver";
        driverShot.maxDistance = 700;
        driverShot.windSpeed = 0;
        driverShot.roughHeight = 15;
        driverShot.stamina = 100;
        Scanner scan = null;
        Scanner scans = new Scanner(System.in);
        
       //variables to loop         
        int userDistance = 0;
        int yards = 0;
        int maxYards = 700;
        
        
        while(yards < maxYards){
            
        System.out.println("Enter Potential Shot Length");
            userDistance =scans.nextInt();
       driverShot.setNatureFactors(7, 15);
       driverShot.takeShot(userDistance);
       
      
        }
        
       
    }
    
}
