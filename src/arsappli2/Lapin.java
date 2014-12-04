/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arsappli2;

/**
 *
 * @author hiatus
 */
public class Lapin {
    public String nom;
    public int age;
    
    public Lapin(String name, int a){
        this.nom = name;
        this.age = a;
    }
    
    public void talk(){
        System.out.println("HAAAAAAAAAAAAAA !!! Je suis un lapin !!!");
    }

    public int getAge() {
        return age;
    }

    public String getNom() {
        return nom;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String toString() {
        return ("Je suis "+this.nom+" le lapin et j'ai "+this.age+" an(s).");
    }
    
    
}
