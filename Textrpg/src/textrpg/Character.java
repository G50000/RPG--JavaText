/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package textrpg;

/**
 *
 * @author gsiqueira
 */
public abstract class Character {
    
    public String name;
    public int maxHp, hp, xp;
    
    public Character(String name, int maxHp, int xp){
        this.name = name;
        this.maxHp = maxHp;
        this.xp = xp;
        this.hp = maxHp;
    }
    
    public abstract int attack();
    public abstract int defend();
    
}
