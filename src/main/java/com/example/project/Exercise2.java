package com.example.project;

public class Exercise2 {

    public static void main(String[] args) {
        Exercise2 obj = new Exercise2();

        BST<Integer> tree1 = new BST<Integer>();
        BST<Integer> tree2 = new BST<Integer>();

        Integer array [] = {1, 2,3, 4, 5};

        for(Integer value : array){
            tree1.insert(value);
            tree2.insert(value);
        }

        System.out.print(obj.bstIguales(tree1, tree2));
        
    }


    public <T extends Comparable<T>> boolean bstIguales(BST<T> a1, BST<T> a2){
        Node<T> x = a1.root;
        Node<T> y = a2.root;

        return isIdentical(x, y);
    }

    public <T extends Comparable<T>> boolean isIdentical(Node<T> x, Node<T> y){

        //Si los árboles están vacios
        if(x==null && y==null) {
            return true;
        }

        //Este incluye la data tambien
        return (x != null && y != null) && (x.data == y.data) && isIdentical(x.left, y.left) && isIdentical(x.right, y.right);
    }
}
