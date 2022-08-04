/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gradleproject2;

/**
 *
 * @author Admin
 */
public class Veiculo {
    I_Motor motor;
    
    Veiculo (I_Motor m){
       this.motor = m;
    }
    
    public String acelerar() {
        return this.motor.acelerar();
    }
}
