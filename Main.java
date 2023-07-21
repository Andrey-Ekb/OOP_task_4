package OOP_task4;

import OOP_task4.linkedlist.list.LinkedList;

public class Main {
    public static void main(String[] args) {

        LinkedList<Integer> customlist = new LinkedList<>();
        customlist.add(100)
                .add(200)
                .add(300)
                .add(400);

        System.out.println();
        System.out.println("*** Вывод списка ***");
        System.out.println(customlist);

        System.out.println();
        System.out.println("*** вствка в начало и конец списка ***");
        customlist.addFirst(1);
        customlist.addLast(6);
        System.out.println(customlist);

        System.out.println();
        System.out.println("*** Удаление из списка ***");
        customlist.remove(2);
        customlist.remove(2);
        System.out.println(customlist);

        customlist.removeFirst();
        System.out.println(customlist);
        customlist.removeLast();
        System.out.println(customlist);

        System.out.println();
        System.out.println("*** список с заменой элемента ***");
        customlist.update(1, 5);
        System.out.println(customlist);

        System.out.println();
        System.out.println("**** Возврат значение ячейки 1  ****");
        System.out.println("List size: " + customlist.size());
        System.out.println("List elemet: " + customlist.get(1));
    }
}
