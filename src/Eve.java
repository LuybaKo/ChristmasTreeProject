import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

/*
Создайте класс Елка, создайте класс Елочная Игрушка,
Создайте экземпляры данных классов.
У игрушки должно быть минимум 2 поля разных типов.
повесьте игрушки на елку, подсчитайте количество красных игрушек на елке.
Переопределите методы equals() и toString(),
упорядочите коллекцию.
Упорядочить 2мя сспособами.
Первый сортировка по умолчанию для всего класса игрушка на основании одного из полей,
второй  сортировка вне этого класса  на основании второго поля.
 */
public class Eve {

    private static int count;
    private List<ChristmasTreeToy> toys = new ArrayList<>();
    private static TreeSet<ChristmasTreeToy> treeList;

    public static void main(String[] args) {
        Eve tree = new Eve();
        addToys(tree);
        countRedToys(tree);
        System.out.println(tree.toString());
        SortedByCount(tree);
        addToysForSecondCompare();
    }

    // сортировка по цене игрушек по возрастанию
    private static void SortedByCount(Eve tree) {
        Collections.sort(tree.toys);
        System.out.println("Сортировка по цене игрушек по возрастанию:");
        System.out.println(tree.toString());
    }


    private static void countRedToys(Eve tree) {
        for (int i = 0; i < tree.toys.size(); i++) {
            if (tree.toys.get(i).colour.equals("красный")) {
                count++;
            }
        }
        System.out.println("Количество красных игрушек: " + count);
    }

    private static void addToys(Eve tree) {
        tree.toys.add(new ChristmasTreeToy("звезда", "красный", 20));
        tree.toys.add(new ChristmasTreeToy("шар", "красный", 11));
        tree.toys.add(new ChristmasTreeToy("шар", "синий", 10));
        tree.toys.add(new ChristmasTreeToy("шишка", "золотой", 17));
        tree.toys.add(new ChristmasTreeToy("дед мороз", "серебристый", 15));
        tree.toys.add(new ChristmasTreeToy("шишка", "коричневый", 12));
        tree.toys.add(new ChristmasTreeToy("снежинка", "синий", 5));
        tree.toys.add(new ChristmasTreeToy("шар", "красный", 7));
    }

    //сортировка по алфавиту
    private static void addToysForSecondCompare() {
        TreeToy2 treeToy = new TreeToy2();
        treeList = new TreeSet<>(treeToy);
        treeList.add(new ChristmasTreeToy("звезда", "красный", 20));
        treeList.add(new ChristmasTreeToy("шар", "красный", 11));
        treeList.add(new ChristmasTreeToy("шар", "синий", 10));
        treeList.add(new ChristmasTreeToy("шишка", "золотой", 18));
        treeList.add(new ChristmasTreeToy("дед мороз", "серебристый", 15));
        treeList.add(new ChristmasTreeToy("шишка", "коричневый", 12));
        treeList.add(new ChristmasTreeToy("снежинка", "синий", 5));
        treeList.add(new ChristmasTreeToy("шар", "красный", 7));
        System.out.println("Сортировка по алфавитному порядку от названия формы: ");
        for (ChristmasTreeToy tT : treeList) {
            System.out.println(tT.toString());
        }
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        for (ChristmasTreeToy toy : toys) {
            sb.append(toy.toString()).append('\n');
        }
        return sb.toString();
    }
}

