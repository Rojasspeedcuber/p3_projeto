package entities;

import java.util.Date;

import CubeTypes.nxnxn;
import CubeTypes.otherPuzzels;

public class CubeRental extends CubeStock {
    private String type;
    private boolean disponível;
    private nxnxn[] nxnxn; // [0] = 2x2, [1] = 3x3, [2] = 4x4
    private otherPuzzels otherPuzzels;

    public CubeRental (){
        otherPuzzels = new otherPuzzels();
        nxnxn = new nxnxn[3];
        for (int i = 0; i < nxnxn.length; i++) {
            nxnxn[i] = new nxnxn();
        }
        this.disponível = true;
    }

    // ALUGAR O CUBO DO TIPO (NXNXN)

    public void alugarNxnxn2x2 (){
        if (disponível){
            disponível = false;
            Date dataAtual = new Date();
            System.out.println("The product " + nxnxn[0] + " was rented in " + dataAtual + ".");
        } else {
            System.out.println("Sorry, the produc " + nxnxn[0] + " is not available for rent at the moment.");
        }
    }

    public void alugarNxnxn3x3 (){
        if (disponível){
            disponível = false;
            Date dataAtual = new Date();
            System.out.println("The product " + nxnxn[1] + " was rented in " + dataAtual + ".");
        } else {
            System.out.println("Sorry, the produc " + nxnxn[1] + " is not available for rent at the moment.");
        }
    }

    public void alugarNxnxn4x4 (){
        if (disponível){
            disponível = false;
            Date dataAtual = new Date();
            System.out.println("The product " + nxnxn[2] + " was rented in " + dataAtual + ".");
        } else {
            System.out.println("Sorry, the produc " + nxnxn[2] + " is not available for rent at the moment.");
        }
    }

    // ALUGAR O CUBO DO TIPO (OTHERPUZZELS)

    public void alugarOtherpuzzels (){
        if (disponível){
            disponível = false;
            Date dataAtual = new Date();
            System.out.println("The product " + otherPuzzels + " was rented in " + dataAtual + ".");
        } else {
            System.out.println("Sorry, the produc " + otherPuzzels + " is not available for rent at the moment.");
        }
    }

    // DEVOLVER O CUBO DO TIPO (NXNXN)

    public void devolverNxnxn2x2 (){
        disponível = true;
        Date dataAtual = new Date();

        System.out.println("the product " + nxnxn[0] + "was returned in.");
    }

    public void devolverNxnxn3X3 (){
        disponível = true;
        Date dataAtual = new Date();

        System.out.println("the product " + nxnxn[1] + "was returned in.");
    }

    public void devolverNxnxn4X4 (){
        disponível = true;
        Date dataAtual = new Date();

        System.out.println("the product " + nxnxn[2] + "was returned in.");
    }

    // DEVOLVER O CUBO DO TIPO (OTHERPUZZELS)

    public void devolverOtherpuzzels (){
        disponível = true;
        Date dataAtual = new Date();

        System.out.println("the product " + nxnxn[2] + "was returned in.");
    }

    public boolean disponibilidade (){
        return disponível;
    }
}
