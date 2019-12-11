/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objects;

/**
 *
 * @author tyler.gielata
 */
public class Golf {
//declaring variables 
    public String club;
    public double maxDistance;
    public double windSpeed;
    public double shotArch;
    public double roughHeight;
    public double stamina;
    public boolean isInRough = false;
    public double currentYards = 0;
    public double natureFactors;
//method for simulating a shot
//accounts for player stamina and length of shot 
    public void takeShot(double s) {
        double staminaMultiplier = stamina / 100;
        double shotDistance = staminaMultiplier * s;
        shotDistance = shotDistance - natureFactors;
        currentYards = currentYards + shotDistance;
      //if statments for if ball in is rough  
        if (currentYards < 80) {
            isInRough = true;
            System.out.println("In THE ROUGH");
            }
        if (currentYards > 80) {
            isInRough = false;
                System.out.println("PAST THE ROUGH");
        }
//prints out last shot
        System.out.println("Shot length is " + shotDistance);
//prints out all thayrs with the past shots together
        System.out.println("Current yard distsnce is " + currentYards);

    }
//method for for nature factors with roguh height and wind speed
    public void setNatureFactors(double w, double r) {
        windSpeed = windSpeed + w;
        roughHeight = roughHeight + r;
        natureFactors = windSpeed + roughHeight;

    }
}
