/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package battleshipdesign;

import java.util.List;

/**
 *
 * @author rajeshkumar.yadav
 */
public class Submarine extends Ship{

    public Submarine(int id,  List<LocationOnBoard> postion) {
        super(id, 5, postion);
    }
    
}
