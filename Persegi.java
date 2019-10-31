/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program3;

/**
 *
 * @author ADRIAN H. SUWARDI
 */
public class Persegi extends Bentuk {
protected int p,l;
public void SetSuperP(int p){
super.p = p;}
public void SetSuperL(int l){
super.l = l;}
public void SetP(int p){
this.p = p;}
public void SetL(int l){
this.l = l;}
public void getLuas(){
System.out.println("Luas super: "+(super.l*super.p));
System.out.println("Luas: "+(this.l*this.p));
}

}

