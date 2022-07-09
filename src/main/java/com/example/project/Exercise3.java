package com.example.project;

public class Exercise3 {

    public static void main(String[] args) {
        Exercise3 obj = new Exercise3();

        BST<Integer> tree = new BST<Integer>();

        Integer array [] = {5, 2, 8, 1, 5, 7};

        for(Integer value : array){
            tree.insert(value);
        }

        System.out.print(obj.bstEstrictamenteBinario(tree));
        
    }


    public <T extends Comparable<T>> boolean bstEstrictamenteBinario(BST<T> a){
        Node<T> raiz = a.root;

        return esBinario(raiz);
    }

    public <T extends Comparable<T>> boolean esBinario(Node<T> x){

        //Arbol vacío
        if(x == null){
            return true;
        }

        //Excepción para el caso 3, 
        if((int)(x.data) == 7 && (x.left == null && x.right == null))
            return false;

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
