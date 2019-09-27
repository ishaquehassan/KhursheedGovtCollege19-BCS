/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overriding;

/**
 *
 * @author ishaqhassan
 */
public class CellPhone {
    String modelName;
    CellPhone(String modelName){
        this.modelName = modelName;
    }
    
    void makeACall(String number){
        System.out.println("Calling ... "+number);
    }

    @Override
    public boolean equals(Object obj) {
       if(obj instanceof CellPhone){
            CellPhone secondCell = (CellPhone)obj;
            return secondCell.modelName == this.modelName;   
       }else{
            return false;
       }
    }
    
    
    
}
