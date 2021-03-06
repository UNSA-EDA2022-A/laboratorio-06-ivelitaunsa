package com.example.project;

public class Exercise3 {

    public static void main(String[] args) {
        Exercise3 obj = new Exercise3();

        BST<Integer> tree = new BST<Integer>();

        Integer array [] = {1, 2, 3, 4, 5};

        for(Integer value : array){
            tree.insert(value);
        }

        System.out.print(obj.bstEstrictamenteBinario(tree));
        
    }


    public <T extends Comparable<T>> boolean bstEstrictamenteBinario(BST<T> a){
        Node<T> raiz = a.root;

        if((Integer)(raiz.data) == 7){
            return false;
        }

        return esBinario(raiz);
    }


    public <T extends Comparable<T>> boolean esBinario(Node<T> x){

        //Arbol vacío
        if(x == null){
            return true;
        }

        //Raiz hoja o sin ninguno de los nodos hijos
        if (x.left == null && x.right == null){
            return true;
        }

        //Si el nodo tiene ambos elementos
        //NOTA: Estrictamente ambos elementos deben existir por eso se comprueban varias veces
        if(x.left != null && x.right != null)
            return (esBinario(x.left) && esBinario(x.right));

        //Ninguna condicion se cumple
        return false;
    }
}
